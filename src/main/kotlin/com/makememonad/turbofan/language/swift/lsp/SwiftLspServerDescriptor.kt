package com.makememonad.turbofan.language.swift.lsp

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor

class SwiftLspServerDescriptor(
	project: Project, presentableName: String, private val lspBinaryPath: String, vararg roots: VirtualFile) :
	ProjectWideLspServerDescriptor(project, presentableName) {
	override fun isSupportedFile(file: VirtualFile): Boolean = file.extension == "swift"
	override fun createCommandLine(): GeneralCommandLine {
		return GeneralCommandLine(lspBinaryPath)
	}

	// TODO: Override clientCapabilities and/or WorkspaceClientCapabilities and/or getWorkspaceConfiguration
}