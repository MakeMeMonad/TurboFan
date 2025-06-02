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
		return attrDecl.getNameIdentifier()
	}
	
	fun createActorName(project: Project, name: String): PsiElement? {
		val dummyCode = "actor $name {}"
		val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
		val actorDecl = (file.firstChild as? SwiftActorDeclaration) ?: return null
		return actorDecl.getNameIdentifier()
	}
	
	// TODO: Proper implementation and dummy code for this one
	fun createCaptureListItemName(project: Project, name: String): PsiElement? {
		val dummyCode = "$name "
		val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
		val captureListItem = (file.firstChild as? SwiftCaptureListItem) ?: return null
		return captureListItem.getNameIdentifier()
	}
	
	fun createClassName(project: Project, name: String): PsiElement? {
		val dummyCode = "class $name {}"
		val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
		val classDecl = (file.firstChild as? SwiftClassDeclaration) ?: return null
		return classDecl.getNameIdentifier()
	}
	
	// TODO: Properly implement this one
	fun createClosureParameterName(project: Project, name: String): PsiElement? {
		val dummyCode = "$name: Int"
		val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
		val closureParam = (file.firstChild as? SwiftClosureParameter) ?: return null
		return closureParam.getNameIdentifier()
	}
	
	fun createEnumName(project: Project, name: String): PsiElement? {
		val dummyCode = "enum $name {}"
		val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
		val enumDecl = (file.firstChild as? SwiftEnumDeclaration) ?: return null
		return enumDecl.getNameIdentifier()
	}
	
	fun createUnionStyleEnumCaseName(project: Project, name: String): PsiElement? {
		val dummyCode = "enum Foo { case $name }"
		val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
		val enumDecl = file.firstChild as? SwiftEnumDeclaration ?: return null
		val members = enumDecl.children.firstOrNull { it is SwiftUnionStyleEnumMembers } as? SwiftUnionStyleEnumMembers ?: return null
		val caseClause = members.children.firstOrNull { it is SwiftUnionStyleEnumCaseClause } as? SwiftUnionStyleEnumCaseClause ?: return null
		val caseList = caseClause.children.firstOrNull { it is SwiftUnionStyleEnumCaseList } as? SwiftUnionStyleEnumCaseList ?: return null
		val case = caseList.children.firstOrNull { it is SwiftUnionStyleEnumCase } as? SwiftUnionStyleEnumCase ?: return null
		return case.getNameIdentifier()
	}
	
	fun createRawValueStyleEnumCaseName(project: Project, name: String): PsiElement? {
		val dummyCode = "enum Foo: Int { case $name = 1 }"
		val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
		val enumDecl = file.firstChild as? SwiftEnumDeclaration ?: return null
		val members = enumDecl.children.firstOrNull { it is SwiftRawValueStyleEnumMembers } as? SwiftRawValueStyleEnumMembers ?: return null
		val caseClause = members.children.firstOrNull { it is SwiftRawValueStyleEnumCaseClause } as? SwiftRawValueStyleEnumCaseClause ?: return null
		val caseList = caseClause.children.firstOrNull { it is SwiftRawValueStyleEnumCaseList } as? SwiftRawValueStyleEnumCaseList ?: return null
		val case = caseList.children.firstOrNull { it is SwiftRawValueStyleEnumCase } as? SwiftRawValueStyleEnumCase ?: return null
		return case.getNameIdentifier()
	}
	
	fun createExternalParameterName(project: Project, name: String): PsiElement? {
		val dummyCode = "$name foo: Int"
		val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, "func f($dummyCode) {}")
		val funcDecl = file.firstChild as? SwiftFunctionDeclaration ?: return null
		val parameterClause = funcDecl.children.firstOrNull { it is SwiftParameterClause } as? SwiftParameterClause ?: return null
		val parameterList = parameterClause.children.firstOrNull { it is SwiftParameterList } as? SwiftParameterList ?: return null
		val parameter = parameterList.children.firstOrNull { it is SwiftParameter } as? SwiftParameter ?: return null
		val externalNameHolder = parameter.children.firstOrNull { it is SwiftExternalParameterNameHolder } as? SwiftExternalParameterNameHolder ?: return null
		return externalNameHolder.getNameIdentifier()
	}
	
	fun createExtensionTypeName(project: Project, name: String): PsiElement? {
		val dummyCode = "extension $name {}"
		val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
		val extDecl = file.firstChild as? SwiftExtensionDeclaration ?: return null
		return extDecl.getNameIdentifier()
	}
	
	fun createFunctionName(project: Project, name: String): PsiElement? {
		val dummyCode = "func $name() {}"
		val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
		val funcDecl = (file.firstChild as? SwiftFunctionDeclaration) ?: return null
		return funcDecl.getNameIdentifier()
	}
	
	fun createGenericParameterTypeName(project: Project, name: String): PsiElement? {
		val dummyCode = "<$name>"
		val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
		val genericParameterClause = (file.firstChild as? SwiftGenericParameterClause) ?: return null
		val genericParameterList = genericParameterClause.children.firstOrNull { it is SwiftGenericParameterList } as? SwiftGenericParameterList ?: return null
		val genericParameter = genericParameterList.children.firstOrNull { it is SwiftGenericParameter } as? SwiftGenericParameter ?: return null
		return genericParameter.getNameIdentifier()
	}
	
	fun createIdentifierPatternName(project: Project, name: String): PsiElement? {
		val dummyCode = "$name "
		val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
		val identifierPattern = (file.firstChild as? SwiftIdentifierPattern) ?: return null
		return identifierPattern.getNameIdentifier()
	}
	
	fun createInternalParameterName(project: Project, name: String): PsiElement? {
		val dummyCode = "foo $name: Int"
		val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, "func f($dummyCode) {}")
		val funcDecl = file.firstChild as? SwiftFunctionDeclaration ?: return null
		val parameterClause = funcDecl.children.firstOrNull { it is SwiftParameterClause } as? SwiftParameterClause ?: return null
		val parameterList = parameterClause.children.firstOrNull { it is SwiftParameterList } as? SwiftParameterList ?: return null
		val parameter = parameterList.children.firstOrNull { it is SwiftParameter } as? SwiftParameter ?: return null
		val internalNameHolder = parameter.children.firstOrNull { it is SwiftInternalParameterNameHolder } as? SwiftInternalParameterNameHolder ?: return null
		return internalNameHolder.getNameIdentifier()
	}
	
	fun createMacroName(project: Project, name: String): PsiElement? {
		val dummyCode = "#macro $name {}"
		val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
		val macroDecl = (file.firstChild as? SwiftMacroDeclaration) ?: return null
		return macroDecl.getNameIdentifier()
	}
	
	fun createPrecedenceGroupName(project: Project, name: String): PsiElement? {
		val dummyCode = "precedencegroup $name {}"
		val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
		val pgDecl = (file.firstChild as? SwiftPrecedenceGroupDeclaration) ?: return null
		return pgDecl.getNameIdentifier()
	}
	
	fun createProtocolName(project: Project, name: String): PsiElement? {
		val dummyCode = "protocol $name {}"
		val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
		val protocolDecl = (file.firstChild as? SwiftProtocolDeclaration) ?: return null
		return protocolDecl.getNameIdentifier()
	}
	
	fun createProtocolAssociatedTypeName(project: Project, name: String): PsiElement? {
		val dummyCode = "associatedtype $name {}"
		val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
		val protocolAssociatedTypeDecl = (file.firstChild as? SwiftProtocolAssociatedTypeDeclaration) ?: return null
		return protocolAssociatedTypeDecl.getNameIdentifier()
	}
	
	fun createProtocolVariableName(project: Project, name: String): PsiElement? {
		val dummyCode = "var $name: Int {}"
		val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
		val protocolVariableDecl = (file.firstChild as? SwiftProtocolVariableDeclaration) ?: return null
		return protocolVariableDecl.getNameIdentifier()
	}
	
	fun createStructName(project: Project, name: String): PsiElement? {
		val dummyCode = "struct $name {}"
		val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
		val structDecl = (file.firstChild as? SwiftStructDeclaration) ?: return null
		return structDecl.getNameIdentifier()
	}
	
	fun createTuplePatternElementName(project: Project, name: String): PsiElement? {
		val dummyCode = "($name: Int)"
		val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
		val tuplePattern = file.firstChild as? SwiftTuplePattern ?: return null
		val elementList = tuplePattern.children.firstOrNull { it is SwiftTuplePatternElementList } as? SwiftTuplePatternElementList ?: return null
		val element = elementList.children.firstOrNull { it is SwiftTuplePatternElement } as? SwiftTuplePatternElement ?: return null
		val namedElement = element.children.firstOrNull { it is SwiftTuplePatternElementName } as? SwiftTuplePatternElementName ?: return null
		return namedElement.getNameIdentifier()
	}
	
	fun createTypealiasName(project: Project, name: String): PsiElement? {
		val dummyCode = "typealias $name = Int"
		val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
		val typealiasDecl = (file.firstChild as? SwiftTypealiasDeclaration) ?: return null
		return typealiasDecl.getNameIdentifier()
	}
	
	fun createVariableName(project: Project, name: String): PsiElement? {
		val dummyCode = "var $name: Int = 0"
		val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.swift", SwiftFileType, dummyCode)
		val varDecl = (file.firstChild as? SwiftVariableDeclaration) ?: return null
		return varDecl.getNameIdentifier()
	}
}