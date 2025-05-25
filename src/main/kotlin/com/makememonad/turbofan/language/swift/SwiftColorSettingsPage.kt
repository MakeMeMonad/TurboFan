package com.makememonad.turbofan.language.swift

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage

class SwiftColorSettingsPage: ColorSettingsPage {
	override fun getDisplayName() = "Swift"
	override fun getIcon() = SwiftIcons.SwiftFileIcon
	override fun getHighlighter() = SwiftSyntaxHighlighter()
	override fun getDemoText(): String = """
        // Single-line comment
        /* Multiline
           comment */
        let name = "Swift"
        let number = 123
        let result = a + b * 2
        func myFunc(param: Int) -> String { return "\(param)" }
        struct Person { let id: Int }
    """.trimIndent()
	override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String, TextAttributesKey>? = null
	override fun getAttributeDescriptors(): Array<AttributesDescriptor> = arrayOf(
		AttributesDescriptor("Keywords", SwiftSyntaxHighlighter.ALL_KEYWORD_KEYS[0]),
		AttributesDescriptor("Identifiers", SwiftSyntaxHighlighter.IDENTIFIER_KEYS[0]),
		AttributesDescriptor("Numbers", SwiftSyntaxHighlighter.NUMBER_KEYS[0]),
		AttributesDescriptor("Single-line Strings", SwiftSyntaxHighlighter.SINGLELINE_STRING_KEYS[0]),
		AttributesDescriptor("Multi-line Strings", SwiftSyntaxHighlighter.MULTILINE_STRING_KEYS[0]),
		AttributesDescriptor("Operators", SwiftSyntaxHighlighter.ALL_OPERATOR_KEYS[0]),
		AttributesDescriptor("Single-line Comments", SwiftSyntaxHighlighter.SINGLELINE_COMMENT_KEYS[0]),
		AttributesDescriptor("Multi-line Comments", SwiftSyntaxHighlighter.MULTILINE_COMMENT_KEYS[0]),
	)
	override fun getColorDescriptors(): Array<ColorDescriptor> = arrayOf()

}