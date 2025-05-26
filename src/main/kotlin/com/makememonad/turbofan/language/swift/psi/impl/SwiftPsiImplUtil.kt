package com.makememonad.turbofan.language.swift.psi.impl

import com.intellij.psi.PsiElement
import com.intellij.psi.util.PsiTreeUtil.*
import com.makememonad.turbofan.language.swift.SwiftElementFactory
import com.makememonad.turbofan.language.swift.psi.*

object SwiftPsiImplUtil {
    // getName() overloads
    private fun getNameText(element: PsiElement, nodeClass: Class<out PsiElement>): String? {
        val nameElement = findChildOfType(element, nodeClass)
        return nameElement?.node?.firstChildNode?.text
    }
    private fun getQualifiedNameTextFromSeparatedList(element: PsiElement, parentNodeClass: Class<out PsiElement>, childNodeClass: Class<out PsiElement>, separator: String): String? {
        val nameElementsHolder = findChildOfType(element, parentNodeClass) ?: return null
        val nameElementsList = findChildrenOfType(nameElementsHolder, childNodeClass)
        return nameElementsList
            .mapNotNull {
                val t = it.node.firstChildNode?.text
                t?.takeIf { s -> s.isNotBlank() && s != "_" && s != separator}
            }
            .joinToString(separator)
    }
    private fun getQualifiedNameTextFromChildNodes(element: PsiElement, parentNodeClass: Class<out PsiElement>, childNodeClass: Class<out PsiElement>): String? {
        val nameElementsParentNode = findChildOfType(element, parentNodeClass) ?: return null
        val nameElementsList = findChildrenOfAnyType(nameElementsParentNode, childNodeClass)
        return nameElementsList
            .mapNotNull{
                val t = it.firstChild?.text
                t?.takeIf { s -> s.isNotBlank() && s != "_" }
            }
            .joinToString(".")
    }
    @JvmStatic
    fun getName(element: SwiftAttribute): String? = getNameText(element, SwiftAttributeName::class.java)

    @JvmStatic
    fun getName(element: SwiftActorDeclaration) = getNameText(element, SwiftActorName::class.java)
    @JvmStatic
    fun getName(element: SwiftCaptureListItem) = getNameText(element, SwiftCaptureListItemName::class.java)
    @JvmStatic
    fun getName(element: SwiftClassDeclaration) = getNameText(element, SwiftClassName::class.java)
    @JvmStatic
    fun getName(element: SwiftClosureParameter) = getNameText(element, SwiftClosureParameterName::class.java)
    @JvmStatic
    fun getName(element: SwiftEnumDeclaration) = getNameText(element, SwiftEnumName::class.java)
    @JvmStatic
    fun getName(element: SwiftExternalParameterNameHolder) = getNameText(element, SwiftExternalParameterName::class.java)
    @JvmStatic
    fun getName(element: SwiftExtensionDeclaration): String? = getQualifiedNameTextFromChildNodes(
        element, SwiftTypeIdentifier::class.java, SwiftTypeName::class.java
    )
    @JvmStatic
    fun getName(element: SwiftUnionStyleEnumCase) = getNameText(element, SwiftEnumCaseName::class.java)
    @JvmStatic
    fun getName(element: SwiftRawValueStyleEnumCase) = getNameText(element, SwiftEnumCaseName::class.java)
    @JvmStatic
    fun getName(element: SwiftFunctionDeclaration): String? = getNameText(element, SwiftFunctionName::class.java)
    @JvmStatic
    fun getName(element: SwiftGenericParameter): String? = getNameText(element, SwiftGenericParameterTypeName::class.java)
    @JvmStatic
    fun getName(element: SwiftIdentifierPattern): String? = element.firstChild?.text
    @JvmStatic
    fun getName(element: SwiftImportDeclaration): String? {
        return getQualifiedNameTextFromSeparatedList(
            element, SwiftImportPath::class.java, SwiftImportName::class.java, "."
        )
    }
    @JvmStatic
    fun getName(element: SwiftInternalParameterNameHolder): String? = getNameText(element, SwiftInternalParameterName::class.java)
    @JvmStatic
    fun getName(element: SwiftMacroDeclaration) = getNameText(element, SwiftMacroName::class.java)
    @JvmStatic
    fun getName(element: SwiftMacroExpansionExpression) = getNameText(element, SwiftMacroExpansionExpressionName::class.java)
    @JvmStatic
    fun getName(element: SwiftPrecedenceGroupDeclaration) = getNameText(element, SwiftPrecedenceGroupName::class.java)

    @JvmStatic
    fun getName(element: SwiftProtocolDeclaration) = getNameText(element, SwiftProtocolName::class.java)
    @JvmStatic
    fun getName(element: SwiftProtocolAssociatedTypeDeclaration) = getNameText(element, SwiftTypealiasName::class.java)
    @JvmStatic
    fun getName(element: SwiftProtocolVariableDeclaration) = getNameText(element, SwiftVariableName::class.java)
    @JvmStatic
    fun getName(element: SwiftStructDeclaration): String? = getNameText(element, SwiftStructName::class.java)
    @JvmStatic
    fun getName(element: SwiftTuplePatternElement): String? {
        val innerElement = element.firstChild
        if (innerElement is SwiftTuplePatternElementName) {return getNameText(innerElement, SwiftTuplePatternElementName::class.java)}
        // case where the innerElement is pattern instead of TuplePatternElementName
        else {return null}
    }
    @JvmStatic
    fun getName(element: SwiftTypealiasDeclaration): String? = getNameText(element, SwiftTypealiasName::class.java)
    @JvmStatic
    fun getName(element: SwiftVariableDeclaration): String? = getNameText(element, SwiftVariableName::class.java)


    // setName(element: T, newName: String): PsiElement overloads
    private fun setNameNode(element: PsiElement, newName: String, nodeClass: Class<out PsiElement>, createNameNode: (String) -> PsiElement?): PsiElement {
        val nameElement = findChildOfType(element, nodeClass)
        val newIdentifier = createNameNode(newName)
        if (nameElement != null && newIdentifier != null) {nameElement.replace(newIdentifier)}
        return element
    }

    @JvmStatic
    fun setName(element: SwiftAttribute, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftAttributeName::class.java) {
            n -> SwiftElementFactory.createAttributeName(element.project, n)
        }
    }
    @JvmStatic
    fun setName(element: SwiftActorDeclaration, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftActorName::class.java) { n ->
            SwiftElementFactory.createActorName(element.project, n)
        }
    }
    @JvmStatic
    fun setName(element: SwiftCaptureListItem, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftCaptureListItemName::class.java) { n ->
            SwiftElementFactory.createCaptureListItemName(element.project, n)
        }
    }
    @JvmStatic
    fun setName(element: SwiftClassDeclaration, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftClassName::class.java) { n ->
            SwiftElementFactory.createClassName(element.project, n)
            }
    }
    @JvmStatic
    fun setName(element: SwiftClosureParameter, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftClosureParameterName::class.java) { n ->
            SwiftElementFactory.createClosureParameterName(element.project, n)
        }
    }
    @JvmStatic
    fun setName(element: SwiftEnumDeclaration, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftEnumName::class.java) { n ->
            SwiftElementFactory.createEnumName(element.project, n)
        }
    }
    @JvmStatic
    fun setName(element: SwiftUnionStyleEnumCase, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftEnumCaseName::class.java) { n ->
            SwiftElementFactory.createUnionStyleEnumCaseName(element.project, n)
        }
    }
    @JvmStatic
    fun setName(element: SwiftRawValueStyleEnumCase, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftEnumCaseName::class.java) { n ->
            SwiftElementFactory.createRawValueStyleEnumCaseName(element.project, n)
        }
    }
    @JvmStatic
    fun setName(element: SwiftExternalParameterNameHolder, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftExternalParameterName::class.java) { n ->
            SwiftElementFactory.createExternalParameterName(element.project, n)
        }
    }
    @JvmStatic
    fun setName(element: SwiftFunctionDeclaration, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftFunctionName::class.java) { n ->
            SwiftElementFactory.createFunctionName(element.project, n)
        }
    }
    @JvmStatic
    fun setName(element: SwiftGenericParameter, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftGenericParameterTypeName::class.java) { n ->
            SwiftElementFactory.createGenericParameterTypeName(element.project, n)
        }
    }
    @JvmStatic
    fun setName(element: SwiftIdentifierPattern, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftIdentifierPattern::class.java) { n ->
            SwiftElementFactory.createIdentifierPatternName(element.project, n)
        }
    }
    @JvmStatic
    fun setName(element: SwiftInternalParameterNameHolder, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftInternalParameterName::class.java) { n ->
            SwiftElementFactory.createInternalParameterName(element.project, n)
        }
    }
    @JvmStatic
    fun setName(element: SwiftMacroDeclaration, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftMacroName::class.java) { n ->
            SwiftElementFactory.createMacroName(element.project, n)
        }
    }
    @JvmStatic
    fun setName(element: SwiftTuplePatternElement, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftTuplePatternElementName::class.java) { n ->
            SwiftElementFactory.createTuplePatternElementName(element.project, n)
        }
    }
    @JvmStatic
    fun setName(element: SwiftPrecedenceGroupDeclaration, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftPrecedenceGroupName::class.java) { n ->
            SwiftElementFactory.createPrecedenceGroupName(element.project, n)
        }
    }
    @JvmStatic
    fun setName(element: SwiftProtocolDeclaration, newName: String): PsiElement {
        return setNameNode(element, newName, SwiftProtocolName::class.java) { n ->
            SwiftElementFactory.createProtocolName(element.project, n)
        }
    }
    @JvmStatic
    fun setName(element: SwiftProtocolAssociatedTypeDeclaration, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftTypealiasName::class.java) { n ->
            SwiftElementFactory.createProtocolAssociatedTypeName(element.project, n)
        }
    }
    @JvmStatic
    fun setName(element: SwiftProtocolVariableDeclaration, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftVariableName::class.java) { n ->
            SwiftElementFactory.createProtocolVariableName(element.project, n)
        }
    }
    @JvmStatic
    fun setName(element: SwiftStructDeclaration, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftStructName::class.java) { n ->
            SwiftElementFactory.createStructName(element.project, n)
        }
    }
    @JvmStatic
    fun setName(element: SwiftTypealiasDeclaration, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftTypealiasName::class.java) { n ->
            SwiftElementFactory.createTypealiasName(element.project, n)
        }
    }
    @JvmStatic
    fun setName(element: SwiftVariableDeclaration, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftVariableName::class.java) { n ->
            SwiftElementFactory.createVariableName(element.project, n)
        }
    }

    // getNameIdentifier(element: T): PsiElement? overloads
    private fun getNameToken(element: PsiElement, nodeClass: Class<out PsiElement>): PsiElement? {
        val nameElement = findChildOfType(element, nodeClass)
        return nameElement?.firstChild
    }
    private fun getLastNameToken(element: PsiElement, parentListClass: Class<out PsiElement>, childListItemClass: Class<out PsiElement>): PsiElement? {
        val nameElementsParentNode = findChildOfType(element, parentListClass) ?: return null
        val nameElementsList = findChildrenOfAnyType(nameElementsParentNode, childListItemClass)
        return nameElementsList.lastOrNull()?.firstChild
    }

    @JvmStatic
    fun getNameIdentifier(element: SwiftAttribute): PsiElement? = getNameToken(element, SwiftAttributeName::class.java)
    @JvmStatic
    fun getNameIdentifier(element: SwiftActorDeclaration): PsiElement? = getNameToken(element, SwiftActorName::class.java)
    @JvmStatic
    fun getNameIdentifier(element: SwiftCaptureListItem) = getNameToken(element, SwiftCaptureListItemName::class.java)
    @JvmStatic
    fun getNameIdentifier(element: SwiftClassDeclaration) = getNameToken(element, SwiftClassName::class.java)
    @JvmStatic
    fun getNameIdentifier(element: SwiftClosureParameter) = getNameToken(element, SwiftClosureParameterName::class.java)
    @JvmStatic
    fun getNameIdentifier(element: SwiftEnumDeclaration) = getNameToken(element, SwiftEnumName::class.java)
    @JvmStatic
    fun getNameIdentifier(element: SwiftExternalParameterNameHolder): PsiElement? {
	    return getNameToken(element, SwiftExternalParameterName::class.java)
    }
    @JvmStatic
    fun getNameIdentifier (element: SwiftExtensionDeclaration): PsiElement? {
	    return getLastNameToken(
		    element, SwiftTypeIdentifier::class.java, SwiftTypeName::class.java
	    )
    }
    @JvmStatic
    fun getNameIdentifier(element: SwiftUnionStyleEnumCase): PsiElement? {
	    return getNameToken(element, SwiftEnumCaseName::class.java)
    }
    @JvmStatic
    fun getNameIdentifier(element: SwiftRawValueStyleEnumCase): PsiElement? {
	    return getNameToken(element, SwiftEnumCaseName::class.java)
    }
    @JvmStatic
    fun getNameIdentifier(element: SwiftFunctionDeclaration): PsiElement? {
	    return this.getNameToken(element, SwiftFunctionName::class.java)
    }
    @JvmStatic
    fun getNameIdentifier(element: SwiftGenericParameter): PsiElement? {
	    return getNameToken(element, SwiftGenericParameterTypeName::class.java)
    }
    @JvmStatic
    fun getNameIdentifier(element: SwiftIdentifierPattern) = getNameToken(element, SwiftIdentifierPattern::class.java)
    @JvmStatic
    fun getNameIdentifier(element: SwiftImportDeclaration): PsiElement? {
	    return this.getLastNameToken(
		    element, SwiftImportPath::class.java, SwiftImportName::class.java
	    )
    }
    @JvmStatic
    fun getNameIdentifier(element: SwiftInternalParameterNameHolder): PsiElement? {
	    return getNameToken(element, SwiftInternalParameterName::class.java)
    }
    @JvmStatic
    fun getNameIdentifier(element: SwiftMacroDeclaration) = getNameToken(element, SwiftMacroName::class.java)
    @JvmStatic
    fun getNameIdentifier(element: SwiftPrecedenceGroupDeclaration): PsiElement? {
        return getNameToken(element, SwiftPrecedenceGroupName::class.java)
    }
    @JvmStatic
    fun getNameIdentifier(element: SwiftProtocolDeclaration) = getNameToken(element, SwiftProtocolName::class.java)
    @JvmStatic
    fun getNameIdentifier(element: SwiftProtocolAssociatedTypeDeclaration): PsiElement? {
        return getNameToken(element, SwiftTypealiasName::class.java)
    }
    @JvmStatic
    fun getNameIdentifier(element: SwiftProtocolVariableDeclaration) = getNameToken(element, SwiftVariableName::class.java)
    @JvmStatic
    fun getNameIdentifier(element: SwiftStructDeclaration) = getNameToken(element, SwiftStructName::class.java)
    @JvmStatic
    fun getNameIdentifier(element: SwiftTuplePatternElement): PsiElement? {
        return getNameToken(element, SwiftTuplePatternElementName::class.java)
    }
    @JvmStatic
    fun getNameIdentifier(element: SwiftTypealiasDeclaration) = getNameToken(element, SwiftTypealiasName::class.java)
    @JvmStatic
    fun getNameIdentifier(element: SwiftVariableDeclaration) = getNameToken(element, SwiftVariableName::class.java)


    // getPresentation(element: T): ItemPresentation? overloads


    // getReference(element: T): PsiReference? overloads


    // getTextOffset(element: T): Int overloads


    // getChildren(element: T): Array<PsiElement> overloads





    // ATTRIBUTE CUSTOM LOGIC
    // ACTOR CUSTOM LOGIC
    // CONSTANTS CUSTOM LOGIC

    @JvmStatic
    fun getDeclaredNames(element: SwiftConstantDeclaration): List<String> {
        val namedPatterns= findChildrenOfAnyType(element, SwiftIdentifierPattern::class.java, SwiftNamedTuplePatternElement::class.java).toList()
        return namedPatterns.mapNotNull {collectName(it)}
    }
    fun collectName(pattern: PsiElement): String? {return pattern.firstChild?.text?.takeIf {it != "_" && it.isNotBlank()}}


    // CLASS CUSTOM LOGIC
    // ENUM CUSTOM LOGIC
    // FUNCTION DECL CUSTOM LOGIC
    // MACRO DECL CUSTOM LOGIC
    // PATTERN/identifier-pattern/named-tuple-pattern-element CUSTOM LOGIC




    // PRECEDENCE GROUP DECL CUSTOM LOGIC
    // PROTOCOL DECL CUSTOM LOGIC
    // STRUCT DECL CUSTOM LOGIC
    // VARIABLE DECL CUSTOM LOGIC

}