package com.makememonad.turbofan.language.swift.references;

import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReferenceBase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class SwiftActorReference extends PsiReferenceBase<PsiElement> {
    public SwiftActorReference(@NotNull PsiElement element, TextRange rangeInElement, boolean soft) {
        super(element, rangeInElement, soft);
    }

    @Override
    public @Nullable PsiElement resolve() {
        return null;
    }


}