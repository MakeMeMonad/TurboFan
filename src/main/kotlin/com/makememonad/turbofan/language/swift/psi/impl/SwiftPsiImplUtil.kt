package com.makememonad.turbofan.language.swift.psi.impl

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReference
import com.intellij.psi.util.*
import com.intellij.psi.util.PsiTreeUtil.*
import com.makememonad.turbofan.language.swift.psi.*
import com.makememonad.turbofan.language.swift.psi.SwiftEnumDeclaration
import com.makememonad.turbofan.language.swift.psi.SwiftFunctionArgument
import com.makememonad.turbofan.language.swift.psi.SwiftFunctionArgumentsList
import com.makememonad.turbofan.language.swift.psi.SwiftFunctionDeclaration
import com.makememonad.turbofan.language.swift.psi.SwiftParameter
import com.makememonad.turbofan.language.swift.psi.SwiftType
import com.makememonad.turbofan.language.swift.psi.SwiftTypes
import com.makememonad.turbofan.language.swift.psi.SwiftTypes.*
import kotlin.collections.map
import kotlin.jvm.java

object SwiftPsiImplUtil {

    // FUNCTION DECL
    @JvmStatic
    fun getName(element: SwiftFunctionDeclaration): String? {
        val idText = findChildOfType(IDENTIFIER::class.java)?.text
        return idText
    }
    @JvmStatic
    fun getNameIdentifier(element: SwiftFunctionDeclaration): PsiElement? {return findChildOfType(SwiftTypes.IDENTIFIER::class.java)}
    @JvmStatic
    fun setName(element: SwiftFunctionDeclaration, name: String): PsiElement {
        val idNode = findChildOfType(IDENTIFIER as PsiElement?, )
        val psiFactory =
        val newIdNode =
    }
    @JvmStatic
    fun getReference(element: SwiftFunctionDeclaration): PsiReference? {
        // TODO: Implement this method later for reference navigation
        return null
    }
    @JvmStatic
    fun getPresentation(element: SwiftFunctionDeclaration): ItemPresentation { /* ... */ }
    @JvmStatic
    fun getDocumentationTarget(element: SwiftFunctionDeclaration): PsiElement? {return element.nameIdentifier}
    @JvmStatic
    fun getBody(element: SwiftFunctionDeclaration): SwiftFunctionBody? {return findChildOfType(SwiftFunctionBody::class.java)}

    @JvmStatic
    fun getParameters(element: SwiftFunctionDeclaration): List<SwiftParameter> {
        val paramList = element.findChildOfType(SwiftFunctionArgumentsList::class.java)
        return paramList?.findChildrenOfType(SwiftFunctionArgument::class.java) ?: emptyList()
    }

    @JvmStatic
    fun getParameterNames(element: SwiftFunctionDeclaration): List<String> {return getParameters(element).map {it.text}}
    @JvmStatic
    fun getReturnType(element: SwiftFunctionDeclaration): SwiftType? {return findChildOfType(FUNCTION_RETURN_TYPE as PsiElement?,, )}
    @JvmStatic
    fun isAsync(element: SwiftFunctionDeclaration): Boolean {return findChildrenOfType(SwiftAsyncKeyword::class.java).isNotEmpty()}
    @JvmStatic
    fun isThrows(element: SwiftFunctionDeclaration): Boolean {return findChildrenOfType(element, SwiftTypes.THROWS_KEYWORD).isNotEmpty() }

    @JvmStatic
    fun isStatic(element: SwiftFunctionDeclaration): Boolean {return findChildrenOfType(element, SwiftTypes.STATIC_KEYWORD).isNotEmpty()}

}
    // ENUM DECL

@JvmStatic
fun getName(element: SwiftEnumDeclaration): String? {
}

    // X DECL

    // X DECL
    // X DECL
    // X DECL

    // X DECL

//class SwiftFunctionDeclarationImplExtension(node: ASTNode)
//    : SwiftFunctionDeclarationImplGen(node) {
//    // add overrides or new methods here
//}