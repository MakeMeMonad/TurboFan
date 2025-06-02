// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftFunctionDeclaration extends SwiftTypeDeclaration {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @Nullable
  SwiftCodeBlock getCodeBlock();

  @Nullable
  SwiftDeclarationModifiers getDeclarationModifiers();

  @NotNull
  SwiftFunctionDeclarationName getFunctionDeclarationName();

  @Nullable
  SwiftGenericParameterClause getGenericParameterClause();

  @NotNull
  SwiftParameterClause getParameterClause();

  @NotNull
  List<SwiftProtocolCompositionType> getProtocolCompositionTypeList();

  @NotNull
  List<SwiftType> getTypeList();

  @NotNull
  List<SwiftTypeIdentifier> getTypeIdentifierList();

  @Nullable
  PsiElement getKwAsync();

  @NotNull
  PsiElement getKwFunc();

  @Nullable
  PsiElement getKwFwdArrow();

  @Nullable
  PsiElement getKwRethrows();

  @Nullable
  PsiElement getKwThrows();

  @Nullable
  PsiElement getKwWhere();

  @Nullable
  PsiElement getLparen();

  @Nullable
  PsiElement getRparen();

  @Nullable String getName();

  @Nullable PsiElement getNameIdentifier();

  @NotNull PsiElement setName(@NotNull String newName);

  //WARNING: getPresentation(...) is skipped
  //matching getPresentation(SwiftFunctionDeclaration, ...)
  //methods are not found in SwiftPsiImplUtil

}
