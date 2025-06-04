package com.makememonad.turbofan.language.swift.lsp

import com.intellij.execution.ExecutionException
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor
import com.intellij.platform.lsp.api.customization.LspSemanticTokensSupport
import com.intellij.util.concurrency.annotations.RequiresBackgroundThread
import org.eclipse.lsp4j.*
import org.eclipse.lsp4j.jsonrpc.messages.Either

// TODO: Learn LSP Spec more in depth, particularly 2.0+
// TODO: Dig through the rest of the classes used to build ClientCapabilities,
//  and map those to the things I need from the LSP spec while the Psi implementations are in progress...

class SwiftLspServerDescriptor(
	    project: Project, presentableName: String, private val lspBinaryPath: String, vararg roots: VirtualFile,
			      ): ProjectWideLspServerDescriptor(project, presentableName) {
	
	override fun isSupportedFile(file: VirtualFile): Boolean = file.extension == "swift"
	
	// TODO: Check this override vs the API, update to match the actual API
	@RequiresBackgroundThread @Throws(ExecutionException::class) override fun createCommandLine(): GeneralCommandLine {
		return GeneralCommandLine(/* ...command = */ lspBinaryPath)
	}
	
	override val clientCapabilities: ClientCapabilities
		get() = ClientCapabilities().apply { ->
			this.workspace = WorkspaceClientCapabilities().apply { ->
				this.applyEdit = true
				this.workspaceFolders = true
				this.workspaceEdit = WorkspaceEditCapabilities().apply { ->
					this.documentChanges = true
					this.resourceOperations = listOf(ResourceOperationKind.Create)
					this.failureHandling = FailureHandlingKind.Abort
					this.normalizesLineEndings = true
				}
				this.didChangeWatchedFiles = DidChangeWatchedFilesCapabilities(/* dynamicRegistration = */ true).apply { ->
					this.relativePatternSupport = true
				}
				this.executeCommand = ExecuteCommandCapabilities(/* dynamicRegistration = */ false)
				// semanticTokens = SemanticTokensWorkspaceCapabilities().apply { refreshSupport = true }
			}
			textDocument = TextDocumentClientCapabilities().apply { ->
				synchronization = SynchronizationCapabilities().apply { ->
					dynamicRegistration = false
					willSave = false
					willSaveWaitUntil = false
					didSave = true
				}
				definition = DefinitionCapabilities().apply { ->
					linkSupport = true
				}
				typeDefinition = TypeDefinitionCapabilities().apply { ->
					linkSupport = true
				}
				completion = CompletionCapabilities().apply { ->
					completionItem = CompletionItemCapabilities().apply { ->
						documentationFormat = listOf(MarkupKind.MARKDOWN, MarkupKind.PLAINTEXT)
						deprecatedSupport = true
						tagSupport =
							    CompletionItemTagSupportCapabilities(/* valueSet = */ listOf<CompletionItemTag>(element = CompletionItemTag.Deprecated))
						insertReplaceSupport = true
						labelDetailsSupport = true
						snippetSupport = true
						resolveSupport = CompletionItemResolveSupportCapabilities().apply { ->
							properties = listOf("documentation")
						}
					}
					completionItemKind = CompletionItemKindCapabilities().apply { ->
						valueSet = CompletionItemKind.entries
					}
					completionList = CompletionListCapabilities().apply { ->
						itemDefaults = listOf("commitCharacters", "editRange", "insertTextFormat", "insertTextMode", "data")
					}
				}
				
				hover = HoverCapabilities().apply { ->
					contentFormat = listOf(MarkupKind.MARKDOWN, MarkupKind.PLAINTEXT)
				}
				publishDiagnostics = PublishDiagnosticsCapabilities().apply { ->
					versionSupport = true
					tagSupport = Either.forRight(/* right = */ DiagnosticsTagSupport(/* valueSet = */ listOf(
						    DiagnosticTag.Unnecessary, DiagnosticTag.Deprecated)))
				}
				codeAction = CodeActionCapabilities().apply { ->
					codeActionLiteralSupport = CodeActionLiteralSupportCapabilities().apply { ->
						codeActionKind = CodeActionKindCapabilities(/* valueSet = */ listOf<String>(
							    CodeActionKind.QuickFix,
							    CodeActionKind.Empty,
							    CodeActionKind.Source,
							    CodeActionKind.Refactor,
															   ))
					}
					disabledSupport = true
					dataSupport = true
					resolveSupport = CodeActionResolveSupportCapabilities().apply { ->
						properties = listOf("edit")
					}
				}
				this.formatting = FormattingCapabilities(/* dynamicRegistration = */ true)
				this.references = ReferencesCapabilities(/* dynamicRegistration = */ true)
			}
			this.notebookDocument = null
			this.window = WindowClientCapabilities().apply { ->
				this.showMessage = WindowShowMessageRequestCapabilities()
				this.showDocument = ShowDocumentCapabilities(/* support = */ true)
			}
			this.general = GeneralClientCapabilities().apply { ->
				this.staleRequestSupport = StaleRequestCapabilities().apply { ->
					this.isCancel = true
				}
			}
			this.experimental = null
		}
	
	override val lspSemanticTokensSupport: LspSemanticTokensSupport? = null
	// TODO: After IntelliJ 'Workspace API' stability and implementation,
	//  consider need for Overriding WorkspaceClientCapabilities and/or getWorkspaceConfiguration
}