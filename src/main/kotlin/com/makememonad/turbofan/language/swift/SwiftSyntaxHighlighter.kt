package com.makememonad.turbofan.language.swift

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import com.makememonad.turbofan.language.swift.SwiftTokenType.SwiftTokenTypes
import com.makememonad.turbofan.language.swift.lexer.SwiftLexerAdapter

class SwiftSyntaxHighlighter: SyntaxHighlighterBase() {
	companion object {
		val SINGLELINE_COMMENT_KEYS =arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_SINGLELINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT))
		val MULTILINE_COMMENT_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey())
		val SINGLELINE_STRING_KEYS = TextAttributesKey.createTextAttributesKey("SWIFT_STRING", DefaultLanguageHighlighterColors.STRING)
		val MULTILINE_STRING_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey())
		// ...repeat for COMMENT, KEYWORD, IDENTIFIER, OPERATOR, NUMBER...
		val EMPTY_KEYS = emptyArray<TextAttributesKey>()
	}
	override fun getHighlightingLexer(): Lexer = SwiftLexerAdapter()
	override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> = when {
		tokenType == SwiftTokenTypes.SINGLELINE_COMMENT -> SINGLELINE_COMMENT_KEYS
		tokenType == SwiftTokenTypes.IDENTIFIER -> IDENTIFIER_KEYS
		tokenType == SwiftTokenTypes.OPERATOR -> OPERATOR_KEYS

		SwiftTokenSets.SINGLELINE_STRINGS.contains(tokenType) -> SINGLELINE_STRING_KEYS
		SwiftTokenSets.MULTILINE_STRINGS.contains(tokenType) -> MULTILINE_STRING_KEYS
		SwiftTokenSets.MULTILINE_COMMENTS.contains(tokenType) -> MULTILINE_COMMENT_KEYS
		SwiftTokenSets.ALL_KEYWORDS.contains(tokenType) -> KEYWORD_KEYS
		SwiftTokenSets.NUMBERS.contains(tokenType) -> NUMBER_KEYS
		else -> EMPTY_KEYS
	}

}