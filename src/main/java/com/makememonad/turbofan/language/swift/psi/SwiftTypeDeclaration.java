package com.makememonad.turbofan.language.swift.psi;

import com.intellij.psi.PsiNameIdentifierOwner;

    // This interface exists to be implemented by generated PSI classes that model type declaration statements in a Swift source file.
    // The usefulness of having those PSI classes implement *this* interface,
    // instead of the parent interface PsiNameIdentifier,
    // is that we can use this more specific interface to easily type-pattern-match against them vs. similar elements and filter them out.
    // An example of this is in SwiftTypeReference.java which shows exactly this usage in action.

public interface SwiftTypeDeclaration extends PsiNameIdentifierOwner {
}