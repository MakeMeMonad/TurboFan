package com.makememonad.turbofan.language.swift

import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile

class SwiftSyntaxHighlighterFactory : SyntaxHighlighterFactory() {
	override fun getSyntaxHighlighter(p0: Project?, virtualFile: VirtualFile?): SyntaxHighlighter {return SwiftSyntaxHighlighter()}
}