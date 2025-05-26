package com.makememonad.turbofan.language.swift.symbols.declarations

import com.intellij.model.Pointer
import com.intellij.model.Symbol
import com.intellij.navigation.ItemPresentation
import com.intellij.platform.backend.documentation.DocumentationTarget
import com.intellij.psi.PsiElement
import com.makememonad.turbofan.language.swift.SwiftIcons
import com.makememonad.turbofan.language.swift.symbols.SwiftSymbol

class SwiftActorSymbolImpl(private val psiElement: PsiElement, private val symbolName: String) : SwiftSymbol {
	override val name: String = symbolName
	override fun getPointer(): Pointer<out SwiftSymbol> {
		// Implement pointer creation (often based on PSI)
		return Pointer.createPsiPointer(psiElement) as Pointer<out SwiftSymbol> // Cast is needed
	}
	override fun getPresentation(): ItemPresentation? {
		return object : ItemPresentation {
			override fun getPresentableText(): String? = name
			override fun getIcon(unused: Boolean): javax.swing.Icon? = SwiftIcons.CLASS_ICON // Use your icon
			override fun getLocationString(): String? = psiElement.containingFile.name // Optional: file name
		}
	}
	override val documentation: DocumentationTarget?
		get() = TODO("Not yet implemented")

	// Implement other Symbol methods as needed
	fun getSymbol(): Symbol = this
	override fun createPointer(): Pointer<out Symbol?> {
		TODO("Not yet implemented")
	}

}