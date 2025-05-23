package com.makememonad.turbofan.language.swift

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFileFactory
import com.makememonad.turbofan.language.swift.psi.*

object SwiftElementFactory {

    fun createAttributeName(project: Project, name: String): PsiElement? {
        val dummyCode = "@$name"
        val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
        val attrDecl = (file.firstChild as? SwiftAttribute) ?: return null
        val attrName: PsiElement? = attrDecl.getNameIdentifier
        return attrName
    }
    fun createActorName(project: Project, name: String): PsiElement? {
        val dummyCode = "actor $name {}"
        val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
        val actorDecl = (file.firstChild as? SwiftActorDeclaration) ?: return null
        val actorName: PsiElement? = actorDecl.getNameIdentifier
        return actorName
    }
    fun createClassName(project: Project, name: String): PsiElement? {
        val dummyCode = "class $name {}"
        val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
        val classDecl = (file.firstChild as? SwiftClassDeclaration) ?: return null
        val className: PsiElement? = classDecl.getNameIdentifier
        return className
    }
    fun createEnumName(project: Project, name: String): PsiElement? {
        val dummyCode = "enum $name {}"
        val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
        val enumDecl = (file.firstChild as? SwiftEnumDeclaration) ?: return null
        val enumName: PsiElement? = enumDecl.getNameIdentifier
        return enumName
    }
    fun createFunctionName(project: Project, name: String): PsiElement? {
        val dummyCode = "func $name() {}"
        val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
        val funcDecl = (file.firstChild as? SwiftFunctionDeclaration) ?: return null
        val funcName: PsiElement? = funcDecl.getNameIdentifier
        return funcName
    }
    fun createMacroName(project: Project, name: String): PsiElement? {
        val dummyCode = "#macro $name {}"
        val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
        val macroDecl = (file.firstChild as? SwiftMacroDeclaration) ?: return null
        val macroName: PsiElement? = macroDecl.getNameIdentifier
        return macroName
    }
    fun  createPrecedenceGroupName(project: Project, name: String): PsiElement? {
        val dummyCode = "precedencegroup $name {}"
        val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
        val pgDecl = (file.firstChild as? SwiftPrecedenceGroupDeclaration) ?: return null
        val pgName: PsiElement? = pgDecl.getNameIdentifier
        return pgName
    }
    fun createProtocolName(project: Project, name: String): PsiElement? {
        val dummyCode = "protocol $name {}"
        val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
        val protocolDecl = (file.firstChild as? SwiftProtocolDeclaration) ?: return null
        val protocolName: PsiElement? = protocolDecl.getNameIdentifier
        return protocolName
    }
    fun createStructName(project: Project, name: String): PsiElement? {
        val dummyCode = "Struct $name {}"
        val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
        val structDecl = (file.firstChild as? SwiftStructDeclaration) ?: return null
        val structName: PsiElement? = structDecl.getNameIdentifier
        return structName
    }
    fun createTypealiasName(project: Project, name: String): PsiElement? {
        val dummyCode = "typealias $name = Int"
        val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
        val typealiasDecl = (file.firstChild as? SwiftTypealiasDeclaration) ?: return null
        val typealiasName: PsiElement? = typealiasDecl.getNameIdentifier
        return typealiasName
    }
    fun createVariableName(project: Project, name: String): PsiElement? {
        val dummyCode = "var $name: Int = 0"
        val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
        val varDecl = (file.firstChild as? SwiftVariableDeclaration) ?: return null
        val varName: PsiElement? = varDecl.getNameIdentifier
        return varName
    }


}