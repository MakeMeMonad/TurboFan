package com.makememonad.turbofan.language.swift

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import com.makememonad.turbofan.language.swift.lexer.SwiftLexerAdapter

class SwiftSyntaxHighlighter: SyntaxHighlighterBase() {
	companion object {
		val ALL_KEYWORD_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD))
		val ALL_IDENTIFIER_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER))
		val NUMBER_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_NUMBER", DefaultLanguageHighlighterColors.NUMBER))
		val SINGLELINE_STRING_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_SINGLELINE_STRING", DefaultLanguageHighlighterColors.STRING))
		val MULTILINE_STRING_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_MULTILINE_STRING", DefaultLanguageHighlighterColors.STRING))
		val ALL_OPERATOR_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN))
		val SINGLELINE_COMMENT_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_SINGLELINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT))
		val MULTILINE_COMMENT_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_MULTILINE_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT))
		// ...repeat for COMMENT, KEYWORD, IDENTIFIER, OPERATOR, NUMBER...
		val EMPTY_KEYS = emptyArray<TextAttributesKey>()
	}
	override fun getHighlightingLexer(): Lexer = SwiftLexerAdapter()
	override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> = when {
		SwiftTokenSets.ALL_KEYWORDS.contains(tokenType) -> ALL_KEYWORD_KEYS
		SwiftTokenSets.ALL_IDENTIFIERS.contains(tokenType) -> ALL_IDENTIFIER_KEYS
		SwiftTokenSets.NUMBERS.contains(tokenType) -> NUMBER_KEYS
		SwiftTokenSets.SINGLELINE_STRINGS.contains(tokenType) -> SINGLELINE_STRING_KEYS
		SwiftTokenSets.MULTILINE_STRINGS.contains(tokenType) -> MULTILINE_STRING_KEYS
		SwiftTokenSets.ALL_OPERATORS.contains(tokenType) -> ALL_OPERATOR_KEYS
		SwiftTokenSets.SINGLELINE_COMMENTS.contains(tokenType) -> SINGLELINE_COMMENT_KEYS
		SwiftTokenSets.MULTILINE_COMMENTS.contains(tokenType) -> MULTILINE_COMMENT_KEYS
		else -> EMPTY_KEYS
	}

}