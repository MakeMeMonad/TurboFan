package com.makememonad.turbofan.language.swift

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFileFactory
import com.makememonad.turbofan.language.swift.psi.SwiftFunctionDeclaration

object SwiftElementFactory {
    fun createIdentifier(project: Project, name: String): PsiElement? {
val dummyCode = "func $name() {}"
        val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
        val funcDecl = (file.firstChild as? SwiftFunctionDeclaration) ?: return null
        return funcDecl.getNameIdentifier
    }
}