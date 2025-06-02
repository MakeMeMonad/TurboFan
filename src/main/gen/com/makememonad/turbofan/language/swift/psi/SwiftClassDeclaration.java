// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftClassDeclaration extends SwiftTypeDeclaration {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @Nullable
  SwiftClassMembers getClassMembers();

  @NotNull
  SwiftClassName getClassName();

  @Nullable
  SwiftGenericParameterClause getGenericParameterClause();

  @NotNull
  List<SwiftProtocolCompositionType> getProtocolCompositionTypeList();

  @NotNull
  List<SwiftType> getTypeList();

  @NotNull
  List<SwiftTypeIdentifier> getTypeIdentifierList();

  @Nullable
  SwiftTypeInheritanceClause getTypeInheritanceClause();

  @NotNull
  PsiElement getKwClass();

  @Nullable
  PsiElement getKwFileprivate();

  @Nullable
  PsiElement getKwFinal();

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

  @NotNull
  PsiElement getLbrace();

  @Nullable
  PsiElement getLparen();

  @NotNull
  PsiElement getRbrace();

  @Nullable
  PsiElement getRparen();

  @Nullable String getName();

  @Nullable PsiElement getNameIdentifier();

  @NotNull PsiElement setName(@NotNull String newName);

  //WARNING: getPresentation(...) is skipped
  //matching getPresentation(SwiftClassDeclaration, ...)
  //methods are not found in SwiftPsiImplUtil

}
