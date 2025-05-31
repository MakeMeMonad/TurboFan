package com.makememonad.turbofan.language.swift.references;

import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiReferenceContributor;
import com.intellij.psi.PsiReferenceRegistrar;
import com.makememonad.turbofan.language.swift.psi.SwiftTypeName;
import org.jetbrains.annotations.NotNull;

    // TODO: Add more providers for other kinds of usage patterns

public final class SwiftReferenceContributor extends PsiReferenceContributor {
    @Override
    public void registerReferenceProviders(@NotNull PsiReferenceRegistrar registrar) {
        registrar.registerReferenceProvider(
                PlatformPatterns.psiElement(SwiftTypeName.class),
                new SwiftTypeReferenceProvider()
        );
    }
}