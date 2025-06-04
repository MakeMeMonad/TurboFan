package com.makememonad.turbofan.language.swift.highlighter

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.colors.*
import com.makememonad.turbofan.language.swift.SwiftIcons
import javax.swing.Icon

class SwiftColorSettingsPage: ColorSettingsPage {
	
	override fun getDisplayName(): String = "Swift (TurboFan)"
	override fun getIcon(): Icon = SwiftIcons.SwiftFileIcon
	override fun getHighlighter(): SwiftSyntaxHighlighter = SwiftSyntaxHighlighter()
	override fun getDemoText(): String = """
        /* This is a Swift...
	Multi-line...
        comment */
	
	// This is a Swift Single-line comment
	// Here's another comment! Wow!
        let thisString = "Swift string literal"
        let thisIntegerNumber: Int = 123
	let thisDouble: Double = 3.9
        let theResultOfThisExpression = 8.5 + thisDouble * 2.7
        func withSomeName(param: Int) -> String { return "\(param)" }
        struct Person {
		let id: UUID()
	}
	
	@Model
	final class someSwiftDataStuff {
	
		init(){}
	}
    """.trimIndent()
	
	override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String, TextAttributesKey>? = null
	override fun getAttributeDescriptors(): Array<AttributesDescriptor> = arrayOf(
		    AttributesDescriptor("Keywords//All-Keywords", SwiftSyntaxHighlighter.ALL_KEYWORD_KEYS[0]),
		    AttributesDescriptor("Identifiers//All-Identifiers", SwiftSyntaxHighlighter.ALL_IDENTIFIER_KEYS[0]),
		    AttributesDescriptor("Numbers//All", SwiftSyntaxHighlighter.ALL_NUMBER_KEYS[0]),
		    AttributesDescriptor("Strings//Single-line Strings", SwiftSyntaxHighlighter.SINGLELINE_STRING_KEYS[0]),
		    AttributesDescriptor("Strings//Multi-line Strings", SwiftSyntaxHighlighter.MULTILINE_STRING_KEYS[0]),
		    AttributesDescriptor("Operator//All-Operators", SwiftSyntaxHighlighter.ALL_OPERATOR_KEYS[0]),
		    AttributesDescriptor("Comments//Line Comments", SwiftSyntaxHighlighter.SINGLELINE_COMMENT_KEYS[0]),
		    AttributesDescriptor("Comments//Block Comments", SwiftSyntaxHighlighter.MULTILINE_COMMENT_KEYS[0]),
		    AttributesDescriptor("Operator//Braces", SwiftSyntaxHighlighter.BRACES_KEYS[0]),
		    AttributesDescriptor("Operator//Dot", SwiftSyntaxHighlighter.DOT_KEYS[0]),
		    AttributesDescriptor("Operator//Semicolon", SwiftSyntaxHighlighter.SEMICOLON_KEYS[0]),
		    AttributesDescriptor("Operator//Parentheses", SwiftSyntaxHighlighter.PARENS_KEYS[0]),
		    AttributesDescriptor("Operator//Brackets", SwiftSyntaxHighlighter.BRACKETS_KEYS[0]),
		    AttributesDescriptor("Operator//Valid String Escape", SwiftSyntaxHighlighter.VALID_STRING_ESCAPE_KEYS[0]))
	
	override fun getColorDescriptors(): Array<ColorDescriptor> = arrayOf()
}