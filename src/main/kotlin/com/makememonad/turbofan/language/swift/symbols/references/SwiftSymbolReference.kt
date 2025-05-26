package com.makememonad.turbofan.language.swift.symbols.references

import com.intellij.model.psi.PsiSymbolReference
import com.intellij.psi.PsiElement

abstract class SwiftSymbolReference(element: PsiElement) : PsiSymbolReference {
	override fun getElement(): PsiElement = element
	abstract fun resolve(): PsiElement?
}