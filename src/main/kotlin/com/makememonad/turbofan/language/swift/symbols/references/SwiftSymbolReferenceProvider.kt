package com.makememonad.turbofan.language.swift.symbols.references

import com.intellij.model.Symbol
import com.intellij.model.psi.PsiExternalReferenceHost
import com.intellij.model.psi.PsiSymbolReference
import com.intellij.model.psi.PsiSymbolReferenceHints
import com.intellij.model.psi.PsiSymbolReferenceProvider
import com.intellij.model.search.SearchRequest
import com.intellij.openapi.project.Project

class SwiftSymbolReferenceProvider : PsiSymbolReferenceProvider {
	override fun getReferences(p0: PsiExternalReferenceHost, p1: PsiSymbolReferenceHints): Collection<out PsiSymbolReference> {
		TODO("Not yet implemented")
	}
	override fun getSearchRequests(p0: Project, p1: Symbol): Collection<out SearchRequest> {
		TODO("Not yet implemented")
	}
}