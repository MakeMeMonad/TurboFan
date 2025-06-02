package com.makememonad.turbofan.language.swift.highlighter

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import com.makememonad.turbofan.language.swift.SwiftTokenSets
import com.makememonad.turbofan.language.swift.lexer.SwiftLexerAdapter

class SwiftSyntaxHighlighter: SyntaxHighlighterBase() { companion object {
	
	val ALL_KEYWORD_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD))
	val ALL_IDENTIFIER_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER))
	val ALL_NUMBER_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_NUMBER", DefaultLanguageHighlighterColors.NUMBER))
	val ALL_STRINGS_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_STRING", DefaultLanguageHighlighterColors.STRING))
	val SINGLELINE_STRING_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_SINGLELINE_STRING", DefaultLanguageHighlighterColors.STRING))
	val MULTILINE_STRING_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_MULTILINE_STRING", DefaultLanguageHighlighterColors.STRING))
	val ALL_OPERATOR_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN))
	val SINGLELINE_COMMENT_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_SINGLELINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT))
	val MULTILINE_COMMENT_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_MULTILINE_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT))
	
	// TODO: Add the rest of the categories with known default TextAttributeKeys in IntelliJ
	
	// ...repeat for COMMENT, KEYWORD, IDENTIFIER, OPERATOR, NUMBER...
	val EMPTY_KEYS = emptyArray<TextAttributesKey>()
}
	
	override fun getHighlightingLexer(): Lexer = SwiftLexerAdapter()
	override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> = when {
		SwiftTokenSets.TS_ALL_KEYWORDS.contains(tokenType)        -> ALL_KEYWORD_KEYS
		SwiftTokenSets.TS_ALL_IDENTIFIERS.contains(tokenType)     -> ALL_IDENTIFIER_KEYS
		SwiftTokenSets.TS_ALL_NUMBERS.contains(tokenType)         -> ALL_NUMBER_KEYS
		SwiftTokenSets.TS_ALL_STRINGS.contains(tokenType)         -> ALL_STRINGS_KEYS
		SwiftTokenSets.TS_SINGLELINE_STRINGS.contains(tokenType)  -> SINGLELINE_STRING_KEYS
		SwiftTokenSets.TS_MULTILINE_STRINGS.contains(tokenType)   -> MULTILINE_STRING_KEYS
		SwiftTokenSets.TS_ALL_OPERATORS.contains(tokenType)       -> ALL_OPERATOR_KEYS
		SwiftTokenSets.TS_SINGLELINE_COMMENTS.contains(tokenType) -> SINGLELINE_COMMENT_KEYS
		SwiftTokenSets.TS_MULTILINE_COMMENTS.contains(tokenType)  -> MULTILINE_COMMENT_KEYS
		else                                                      -> EMPTY_KEYS
	}
}