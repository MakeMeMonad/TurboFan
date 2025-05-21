package com.makememonad.turbofan.language.swift.parser

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import com.jetbrains.rd.util.threading.coroutines.RdCoroutineScope.Companion.override
import com.makememonad.turbofan.language.swift.SwiftFile
import com.makememonad.turbofan.language.swift.SwiftLanguage
import com.makememonad.turbofan.language.swift.lexer.SwiftLexerAdapter
import com.makememonad.turbofan.language.swift.psi.SwiftType
import com.makememonad.turbofan.language.swift.psi.SwiftTypes
import com.makememonad.turbofan.language.swift.psi.lexer.SwiftLexer

class SwiftParserDefinition: ParserDefinition {
    override fun createLexer(p0: Project?): Lexer = SwiftLexerAdapter()

    override fun createParser(p0: Project?): PsiParser = SwiftParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun getCommentTokens(): TokenSet {
        TODO("Not yet implemented")
    }

    override fun getStringLiteralElements(): TokenSet {
        TODO("Not yet implemented")
    }

    override fun createElement(p0: ASTNode?): PsiElement = SwiftTypes.Factory.createElement(node)

    override fun createFile(p0: FileViewProvider): PsiFile = SwiftFile(viewProvider)

    companion object {
        val FILE = IFileElementType(SwiftLanguage)
    }

}