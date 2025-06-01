package com.makememonad.turbofan.language.swift.references;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReferenceBase;
import com.makememonad.turbofan.language.swift.psi.SwiftTypeDeclaration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;

    // Starting off with a basic setup to check functionality and try out the API
    // TODO: Handle Imports/multi-file searching (likely via building out a stub index
    // TODO: Handle weird usage cases which have different elements for their name (potentially via upstream tweaks)
public class SwiftTypeReference extends PsiReferenceBase<PsiElement> {
    public SwiftTypeReference(@NotNull PsiElement element) {
        super(element);
    }

    @Override
    public @Nullable PsiElement resolve() {
        // Should pull the text from the wrapped IDENTIFIER token inside the SwiftTypeName sent in to the constructor
        String typeName = getElement().getText();
        if (typeName.isBlank()) {return null;}
        PsiElement file = getElement().getContainingFile();
        return Arrays.stream(file.getChildren())
                .filter(child -> child instanceof SwiftTypeDeclaration)
                .map(child -> (SwiftTypeDeclaration) child)
                .filter(decl -> typeName.equals(decl.getName()))
                .findFirst()
                .orElse(null);
    }
}