package com.makememonad.turbofan.language.swift

import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import org.jetbrains.annotations.NonNls

class SwiftColorSettingsPage: ColorSettingsPage {
	override fun getDisplayName() = "Swift"
	override fun getIcon() = SwiftIcons.SwiftFileIcon
	override fun getHighlighter() = SwiftSyntaxHighlighter()
	override fun getDemoText(): @NonNls String {
			TODO("Not yet implemented")
		}
	override fun getAdditionalHighlightingTagToDescriptorMap() = null
	override fun getAttributeDescriptors() = arrayOf(
		AttributesDescriptor("String", SwiftSyntaxHighlighter.STRING),
		AttributesDescriptor("Comment", SwiftSyntaxHighlighter.COMMENT),
		AttributesDescriptor("Identifier", SwiftSyntaxHighlighter.IDENTIFIER),
		AttributesDescriptor("Operator", SwiftSyntaxHighlighter.OPERATOR),
		AttributesDescriptor("Keyword", SwiftSyntaxHighlighter.KEYWORD),
		AttributesDescriptor("Number", SwiftSyntaxHighlighter.NUMBER),
	)
	override fun getColorDescriptors(): Array<out ColorDescriptor?> {
			TODO("Not yet implemented")
	}

}