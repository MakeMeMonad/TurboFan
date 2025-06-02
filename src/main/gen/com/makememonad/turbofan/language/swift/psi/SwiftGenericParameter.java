// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftGenericParameter extends SwiftTypeDeclaration {

  @NotNull
  SwiftGenericParameterTypeName getGenericParameterTypeName();

  @Nullable
  SwiftProtocolCompositionType getProtocolCompositionType();

  @Nullable
  SwiftTypeIdentifier getTypeIdentifier();

  @Nullable
  PsiElement getColon();

  @Nullable String getName();

  @Nullable PsiElement getNameIdentifier();

  @NotNull PsiElement setName(@NotNull String newName);

}
