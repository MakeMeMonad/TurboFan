// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftProtocolAssociatedTypeDeclaration extends SwiftTypeDeclaration {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @NotNull
  List<SwiftProtocolCompositionType> getProtocolCompositionTypeList();

  @NotNull
  List<SwiftType> getTypeList();

  @NotNull
  List<SwiftTypeIdentifier> getTypeIdentifierList();

  @Nullable
  SwiftTypeInheritanceClause getTypeInheritanceClause();

  @Nullable
  SwiftTypealiasAssignment getTypealiasAssignment();

  @NotNull
  SwiftTypealiasName getTypealiasName();

  @NotNull
  PsiElement getKwAssociatedtype();

  @Nullable
  PsiElement getKwFileprivate();

  @Nullable
  PsiElement getKwInternal();

  @Nullable
  PsiElement getKwOpen();

  @Nullable
  PsiElement getKwPackage();

  @Nullable
  PsiElement getKwPrivate();

  @Nullable
  PsiElement getKwPublic();

  @Nullable
  PsiElement getKwSet();

  @Nullable
  PsiElement getKwWhere();

  @Nullable
  PsiElement getLparen();

  @Nullable
  PsiElement getRparen();

  @Nullable String getName();

  @Nullable PsiElement getNameIdentifier();

  @NotNull PsiElement setName(@NotNull String newName);

}
