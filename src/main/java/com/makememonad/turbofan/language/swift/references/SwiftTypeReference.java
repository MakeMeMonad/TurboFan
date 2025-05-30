package com.makememonad.turbofan.language.swift.references;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReferenceBase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SwiftTypeReference extends PsiReferenceBase<PsiElement> {
    public SwiftTypeReference(@NotNull PsiElement element) {
        super(element);
    }

    @Override
    public @Nullable PsiElement resolve() {
        String typeName = getElement().getText();
        PsiElement file = getElement().getContainingFile();
        for (PsiElement child : file.getChildren()) {
            // TODO: Check if child is a declaration of typeName
            // TODO: Probably stream child nodes in and filter? basically grab the ones that are instanceOf the new interface for type declarations...


        }
        return null;
    }
}