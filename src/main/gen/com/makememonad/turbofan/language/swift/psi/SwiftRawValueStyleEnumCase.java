// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftRawValueStyleEnumCase extends SwiftTypeDeclaration {

  @NotNull
  SwiftEnumCaseName getEnumCaseName();

  @Nullable
  SwiftNumericLiteral getNumericLiteral();

  @Nullable
  PsiElement getKwFalse();

  @Nullable
  PsiElement getKwTrue();

  @Nullable
  PsiElement getMultilineStringEnd();

  @Nullable
  PsiElement getMultilineStringStart();

  @Nullable
  PsiElement getOpAssignment();

  @Nullable
  PsiElement getStringEnd();

  @Nullable
  PsiElement getStringStart();

  @Nullable String getName();

  @Nullable PsiElement getNameIdentifier();

  @NotNull PsiElement setName(@NotNull String newName);

}
