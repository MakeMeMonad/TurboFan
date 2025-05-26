package com.makememonad.turbofan.language.swift.symbols

import com.intellij.model.Pointer
import com.intellij.model.Symbol
import com.intellij.navigation.ItemPresentation
import com.intellij.platform.backend.documentation.DocumentationTarget

interface SwiftSymbol: Symbol {
	val name: String
	val documentation: DocumentationTarget?
	fun getPresentation(): ItemPresentation?
	// Implementation of getPointer for PSI-backed symbols
	fun getPointer(): Pointer<out Symbol>
}