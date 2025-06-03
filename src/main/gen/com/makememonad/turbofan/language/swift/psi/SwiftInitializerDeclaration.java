// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftInitializerDeclaration extends PsiElement {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @NotNull
  SwiftCodeBlock getCodeBlock();

  @Nullable
  SwiftDeclarationModifiers getDeclarationModifiers();

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
  PsiElement getKwInit();

  @Nullable
  PsiElement getKwRethrows();

  @Nullable
  PsiElement getKwThrows();

  @Nullable
  PsiElement getKwWhere();

  @Nullable
  PsiElement getLparen();

  @Nullable
  PsiElement getOpNot();

  @Nullable
  PsiElement getOpQuestion();

  @Nullable
  PsiElement getRparen();

  //WARNING: getPresentation(...) is skipped
  //matching getPresentation(SwiftInitializerDeclaration, ...)
  //methods are not found in SwiftPsiImplUtil

  //WARNING: getDocumentationTarget(...) is skipped
  //matching getDocumentationTarget(SwiftInitializerDeclaration, ...)
  //methods are not found in SwiftPsiImplUtil

}
