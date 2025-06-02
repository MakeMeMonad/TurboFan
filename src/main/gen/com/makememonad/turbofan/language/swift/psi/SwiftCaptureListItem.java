// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftCaptureListItem extends SwiftTypeDeclaration {

  @Nullable
  SwiftCaptureListItemName getCaptureListItemName();

  @Nullable
  SwiftExpression getExpression();

  @NotNull
  List<SwiftFunctionCallArgument> getFunctionCallArgumentList();

  @Nullable
  PsiElement getDot();

  @Nullable
  PsiElement getIdentifier();

  @Nullable
  PsiElement getKwInit();

  @Nullable
  PsiElement getKwLowerSelf();

  @Nullable
  PsiElement getKwSafe();

  @Nullable
  PsiElement getKwUnowned();

  @Nullable
  PsiElement getKwUnsafe();

  @Nullable
  PsiElement getKwWeak();

  @Nullable
  PsiElement getLbracket();

  @Nullable
  PsiElement getLparen();

  @Nullable
  PsiElement getOpAssignment();

  @Nullable
  PsiElement getRbracket();

  @Nullable
  PsiElement getRparen();

  @Nullable String getName();

  @Nullable PsiElement getNameIdentifier();

  @NotNull PsiElement setName(@NotNull String newName);

}
