package com.makememonad.turbofan.language.swift

import com.intellij.psi.tree.IElementType

class SwiftTokenType(debugName: String) : IElementType(debugName, SwiftLanguage) {

	object SwiftTokenTypes {
		@JvmField val IDENTIFIER = SwiftTokenType("IDENTIFIER")
	}

}