package com.makememonad.turbofan.language.swift.psi.impl

import com.intellij.psi.PsiElement
import com.intellij.psi.util.PsiTreeUtil.findChildOfType
import com.intellij.psi.util.PsiTreeUtil.findChildrenOfAnyType
import com.makememonad.turbofan.language.swift.SwiftElementFactory
import com.makememonad.turbofan.language.swift.psi.*

object SwiftPsiImplUtil {
    // getName() overloads
    private fun getNameText(element: PsiElement, nodeClass: Class<out PsiElement>): String? {
        val nameElement = findChildOfType(element, nodeClass)
        return nameElement?.node?.firstChildNode?.text
    }

    @JvmStatic
    fun getName(element: SwiftAttribute) = getNameText(element, SwiftAttributeName::class.java)

    @JvmStatic
    fun getName(element: SwiftActorDeclaration) = getNameText(element, SwiftActorName::class.java)

    @JvmStatic
    fun getName(element: SwiftClassDeclaration) = getNameText(element, SwiftClassName::class.java)

    @JvmStatic
    fun getName(element: SwiftEnumDeclaration) = getNameText(element, SwiftEnumName::class.java)

    @JvmStatic
    fun getName(element: SwiftFunctionDeclaration) = getNameText(element, SwiftFunctionName::class.java)

    @JvmStatic
    fun getName(element: SwiftMacroDeclaration) = getNameText(element, SwiftMacroName::class.java)

    @JvmStatic
    fun getName(element: SwiftPrecedenceGroupDeclaration) = getNameText(element, SwiftPrecedenceGroupName::class.java)

    @JvmStatic
    fun getName(element: SwiftProtocolDeclaration) = getNameText(element, SwiftProtocolName::class.java)

    @JvmStatic
    fun getName(element: SwiftStructDeclaration) = getNameText(element, SwiftStructName::class.java)

    @JvmStatic
    fun getName(element: SwiftTypealiasDeclaration) = getNameText(element, SwiftTypealiasName::class.java)
    @JvmStatic
    fun getName(element: SwiftVariableDeclaration) = getNameText(element, SwiftVariableName::class.java)


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
    fun setName(element: SwiftClassDeclaration, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftClassName::class.java) { n ->
            SwiftElementFactory.createClassName(element.project, n)
            }
    }
    @JvmStatic
    fun setName(element: SwiftEnumDeclaration, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftEnumName::class.java) { n ->
            SwiftElementFactory.createEnumName(element.project, n)
        }
    }
    @JvmStatic
    fun setName(element: SwiftFunctionDeclaration, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftFunctionName::class.java) { n ->
            SwiftElementFactory.createFunctionName(element.project, n)
        }
    }
    @JvmStatic
    fun setName(element: SwiftMacroDeclaration, newName: String): PsiElement {
        return setNameNode(element, newName, nodeClass = SwiftMacroName::class.java) { n ->
            SwiftElementFactory.createMacroName(element.project, n)
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

    @JvmStatic
    fun getNameIdentifier(element: SwiftAttribute) = getNameToken(element, SwiftAttributeName::class.java)
    @JvmStatic
    fun getNameIdentifier(element: SwiftActorDeclaration) = getNameToken(element, SwiftActorName::class.java)
    @JvmStatic
    fun getNameIdentifier(element: SwiftClassDeclaration) = getNameToken(element, SwiftClassName::class.java)
    @JvmStatic
    fun getNameIdentifier(element: SwiftEnumDeclaration) = getNameToken(element, SwiftEnumName::class.java)
    @JvmStatic
    fun getNameIdentifier(element: SwiftFunctionDeclaration) = getNameToken(element, SwiftFunctionName::class.java)
    @JvmStatic
    fun getNameIdentifier(element: SwiftMacroDeclaration) = getNameToken(element, SwiftMacroName::class.java)
    @JvmStatic
    fun getNameIdentifier(element: SwiftPrecedenceGroupDeclaration) = getNameToken(element, SwiftPrecedenceGroupName::class.java)
    @JvmStatic
    fun getNameIdentifier(element: SwiftProtocolDeclaration) = getNameToken(element, SwiftProtocolName::class.java)
    @JvmStatic
    fun getNameIdentifier(element: SwiftStructDeclaration) = getNameToken(element, SwiftStructName::class.java)
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

    @JvmStatic
    fun getName(element: SwiftIdentifierPattern): String? {return element.firstChild?.text}
    fun getName(element: SwiftNamedTuplePatternElement): String? {return element.firstChild?.text}

    // PRECEDENCE GROUP DECL CUSTOM LOGIC
    // PROTOCOL DECL CUSTOM LOGIC
    // STRUCT DECL CUSTOM LOGIC
    // VARIABLE DECL CUSTOM LOGIC

}