package com.makememonad.turbofan.language.swift

import com.intellij.psi.tree.IElementType

class SwiftTokenType(debugName: String) : IElementType(debugName, SwiftLanguage) {

	object SwiftTokenTypes {
		@JvmField val SINGLELINE_STRINGS = SwiftTokenType("SINGLELINE_STRINGS")
		@JvmField val MULTILINE_STRINGS = SwiftTokenType("MULTILINE_STRINGS")
		@JvmField val SINGLELINE_COMMENT = SwiftTokenType("SINGLELINE_COMMENT")
		@JvmField val MULTILINE_COMMENT = SwiftTokenType("MULTILINE_COMMENTS")
		@JvmField val IDENTIFIER = SwiftTokenType("IDENTIFIER")
		@JvmField val OPERATOR = SwiftTokenType("OPERATOR")
		@JvmField val ALL_KEYWORDS = SwiftTokenType("KEYWORD")
		@JvmField val NUMBERS = SwiftTokenType("NUMBER")
	}


}