// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftProtocolMemberDeclaration extends PsiElement {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @Nullable
  SwiftDeclarationModifiers getDeclarationModifiers();

  @Nullable
  SwiftFunctionDeclarationName getFunctionDeclarationName();

  @Nullable
  SwiftGenericParameterClause getGenericParameterClause();

  @Nullable
  SwiftGetterSetterKeywordBlock getGetterSetterKeywordBlock();

  @Nullable
  SwiftParameterClause getParameterClause();

  @Nullable
  SwiftProtocolAssociatedTypeDeclaration getProtocolAssociatedTypeDeclaration();

  @NotNull
  List<SwiftProtocolCompositionType> getProtocolCompositionTypeList();

  @Nullable
  SwiftProtocolVariableDeclaration getProtocolVariableDeclaration();

  @NotNull
  List<SwiftType> getTypeList();

  @NotNull
  List<SwiftTypeIdentifier> getTypeIdentifierList();

  @Nullable
  SwiftTypealiasDeclaration getTypealiasDeclaration();

  @Nullable
  PsiElement getKwAsync();

  @Nullable
  PsiElement getKwFunc();

  @Nullable
  PsiElement getKwFwdArrow();

  @Nullable
  PsiElement getKwInit();

  @Nullable
  PsiElement getKwRethrows();

  @Nullable
  PsiElement getKwSubscript();

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

}
