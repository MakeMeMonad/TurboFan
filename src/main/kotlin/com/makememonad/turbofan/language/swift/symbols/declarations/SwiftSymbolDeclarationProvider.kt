package com.makememonad.turbofan.language.swift.symbols.declarations

import com.intellij.model.psi.PsiSymbolDeclaration
import com.intellij.model.psi.PsiSymbolDeclarationProvider
import com.intellij.psi.PsiElement

class SwiftSymbolDeclarationProvider: PsiSymbolDeclarationProvider {
	override fun getDeclarations(element: PsiElement, offsetInElement: Int): Collection<PsiSymbolDeclaration> {
		val declarations = mutableListOf<PsiSymbolDeclaration>()

		// Check if the element is a Swift class declaration PSI element
		if (element is SwiftClassDeclarationPsi) {
			// Create the SwiftClassSymbol for this declaration
			val classSymbol = SwiftClassSymbolImpl(element, element.name ?: "UnknownClass") // Assuming you have a way to get the name
			// Create a PsiSymbolDeclaration linking the PSI element and the Symbol
			declarations.add(com.intellij.model.psi.PsiSymbolDeclaration.create(classSymbol, element))
		}
		// Add checks for other Swift declaration types (functions, variables, etc.)
		else if (element is SwiftFunctionDeclarationPsi) {
			val functionSymbol = SwiftFunctionSymbolImpl(element, element.name ?: "UnknownFunction")
			declarations.add(com.intellij.model.psi.PsiSymbolDeclaration.create(functionSymbol, element))
		}

		return declarations
	}
}