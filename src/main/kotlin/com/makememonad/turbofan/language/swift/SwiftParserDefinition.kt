package com.makememonad.turbofan.language.swift

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
import com.makememonad.turbofan.language.swift.lexer.SwiftLexerAdapter
import com.makememonad.turbofan.language.swift.parser.SwiftParser
import com.makememonad.turbofan.language.swift.psi.SwiftFile
import com.makememonad.turbofan.language.swift.psi.SwiftTypes

class SwiftParserDefinition: ParserDefinition {
    override fun createLexer(p0: Project?): Lexer = SwiftLexerAdapter()

    override fun createParser(p0: Project?): PsiParser = SwiftParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun getCommentTokens(): TokenSet = SwiftTokenSets.COMMENTS

    override fun getStringLiteralElements(): TokenSet = SwiftTokenSets.STRINGS

    override fun createElement(node: ASTNode): PsiElement = SwiftTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = SwiftFile(viewProvider)

    companion object {
        val FILE = IFileElementType(SwiftLanguage)
    }

}