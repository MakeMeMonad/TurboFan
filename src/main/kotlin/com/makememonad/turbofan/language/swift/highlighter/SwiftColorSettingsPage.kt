package com.makememonad.turbofan.language.swift.highlighter

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import com.makememonad.turbofan.language.swift.SwiftIcons

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
		AttributesDescriptor("Keywords//All", SwiftSyntaxHighlighter.ALL_KEYWORD_KEYS[0]),
		AttributesDescriptor("Identifiers//All", SwiftSyntaxHighlighter.ALL_IDENTIFIER_KEYS[0]),
		AttributesDescriptor("Numbers//All", SwiftSyntaxHighlighter.NUMBER_KEYS[0]),
		AttributesDescriptor("Strings//Single-line", SwiftSyntaxHighlighter.SINGLELINE_STRING_KEYS[0]),
		AttributesDescriptor("Strings//Multi-line", SwiftSyntaxHighlighter.MULTILINE_STRING_KEYS[0]),
		AttributesDescriptor("Operators", SwiftSyntaxHighlighter.ALL_OPERATOR_KEYS[0]),
		AttributesDescriptor("Comments//Single-line", SwiftSyntaxHighlighter.SINGLELINE_COMMENT_KEYS[0]),
		AttributesDescriptor("Comments//Multi-line", SwiftSyntaxHighlighter.MULTILINE_COMMENT_KEYS[0]),
	)
	override fun getColorDescriptors(): Array<ColorDescriptor> = arrayOf()

}