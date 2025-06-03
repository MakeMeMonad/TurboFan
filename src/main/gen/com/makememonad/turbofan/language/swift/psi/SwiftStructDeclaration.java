// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftStructDeclaration extends SwiftTypeDeclaration {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @NotNull
  List<SwiftCompilerControlStatement> getCompilerControlStatementList();

  @NotNull
  List<SwiftDeclaration> getDeclarationList();

  @Nullable
  SwiftGenericParameterClause getGenericParameterClause();

  @NotNull
  List<SwiftProtocolCompositionType> getProtocolCompositionTypeList();

  @NotNull
  SwiftStructName getStructName();

  @NotNull
  List<SwiftType> getTypeList();

  @NotNull
  List<SwiftTypeIdentifier> getTypeIdentifierList();

  @Nullable
  SwiftTypeInheritanceClause getTypeInheritanceClause();

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

  @NotNull
  PsiElement getKwStruct();

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
  //matching getPresentation(SwiftStructDeclaration, ...)
  //methods are not found in SwiftPsiImplUtil

}
