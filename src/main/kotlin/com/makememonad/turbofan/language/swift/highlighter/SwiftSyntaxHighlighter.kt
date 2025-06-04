package com.makememonad.turbofan.language.swift.highlighter

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import com.makememonad.turbofan.language.swift.SwiftTokenSets
import com.makememonad.turbofan.language.swift.lexer.SwiftLexerAdapter

class SwiftSyntaxHighlighter: SyntaxHighlighterBase() { companion object {
	
	val ALL_KEYWORD_KEYS: Array<TextAttributesKey> = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD))
	val ALL_IDENTIFIER_KEYS: Array<TextAttributesKey> = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER))
	val ALL_NUMBER_KEYS: Array<TextAttributesKey> = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_NUMBER", DefaultLanguageHighlighterColors.NUMBER))
	val SINGLELINE_STRING_KEYS: Array<TextAttributesKey> =
		    arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_SINGLELINE_STRING", DefaultLanguageHighlighterColors.STRING))
	val MULTILINE_STRING_KEYS: Array<TextAttributesKey> = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_MULTILINE_STRING", DefaultLanguageHighlighterColors.STRING))
	val ALL_OPERATOR_KEYS: Array<TextAttributesKey> = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN))
	val SINGLELINE_COMMENT_KEYS: Array<TextAttributesKey> =
		    arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_SINGLELINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT))
	val MULTILINE_COMMENT_KEYS: Array<TextAttributesKey> =
		    arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_MULTILINE_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT))
	
	// TODO: Add the rest of the categories with known default TextAttributeKeys in IntelliJ
	val BRACES_KEYS: Array<TextAttributesKey> = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_BRACES", DefaultLanguageHighlighterColors.BRACES))
	val DOT_KEYS: Array<TextAttributesKey> = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_DOT", DefaultLanguageHighlighterColors.DOT))
	val SEMICOLON_KEYS: Array<TextAttributesKey> = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON))
	val PARENS_KEYS: Array<TextAttributesKey> = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_PARENS", DefaultLanguageHighlighterColors.PARENTHESES))
	val BRACKETS_KEYS: Array<TextAttributesKey> = arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS))
	val VALID_STRING_ESCAPE_KEYS: Array<TextAttributesKey> =
		    arrayOf(TextAttributesKey.createTextAttributesKey("SWIFT_VALID_STRING_ESCAPE", DefaultLanguageHighlighterColors.VALID_STRING_ESCAPE))
	val EMPTY_KEYS: Array<TextAttributesKey> = emptyArray<TextAttributesKey>()
}
	
	override fun getHighlightingLexer(): Lexer = SwiftLexerAdapter()
	override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> = when {
		SwiftTokenSets.TS_ALL_KEYWORDS.contains(tokenType)        -> ALL_KEYWORD_KEYS
		SwiftTokenSets.TS_ALL_IDENTIFIERS.contains(tokenType)     -> ALL_IDENTIFIER_KEYS
		SwiftTokenSets.TS_ALL_NUMBERS.contains(tokenType)         -> ALL_NUMBER_KEYS
		SwiftTokenSets.TS_SINGLELINE_STRINGS.contains(tokenType)  -> SINGLELINE_STRING_KEYS
		SwiftTokenSets.TS_MULTILINE_STRINGS.contains(tokenType)   -> MULTILINE_STRING_KEYS
		SwiftTokenSets.TS_ALL_OPERATORS.contains(tokenType)       -> ALL_OPERATOR_KEYS
		SwiftTokenSets.TS_SINGLELINE_COMMENTS.contains(tokenType) -> SINGLELINE_COMMENT_KEYS
		SwiftTokenSets.TS_MULTILINE_COMMENTS.contains(tokenType)  -> MULTILINE_COMMENT_KEYS
		SwiftTokenSets.TS_BRACES.contains(tokenType)              -> BRACES_KEYS
		SwiftTokenSets.TS_DOT.contains(tokenType)                 -> DOT_KEYS
		SwiftTokenSets.TS_SEMICOLON.contains(tokenType)           -> SEMICOLON_KEYS
		SwiftTokenSets.TS_PARENS.contains(tokenType)              -> PARENS_KEYS
		SwiftTokenSets.TS_BRACKETS.contains(tokenType)            -> BRACKETS_KEYS
		SwiftTokenSets.TS_VALID_STRING_ESCAPE.contains(tokenType) -> VALID_STRING_ESCAPE_KEYS
		else                                                      -> EMPTY_KEYS
	}
}