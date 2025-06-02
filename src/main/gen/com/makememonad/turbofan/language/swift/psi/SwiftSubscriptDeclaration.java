// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftSubscriptDeclaration extends PsiElement {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @Nullable
  SwiftCodeBlock getCodeBlock();

  @Nullable
  SwiftDeclarationModifiers getDeclarationModifiers();

  @Nullable
  SwiftGenericParameterClause getGenericParameterClause();

  @Nullable
  SwiftGetterSetterBlock getGetterSetterBlock();

  @Nullable
  SwiftGetterSetterKeywordBlock getGetterSetterKeywordBlock();

  @NotNull
  SwiftParameterClause getParameterClause();

  @NotNull
  List<SwiftProtocolCompositionType> getProtocolCompositionTypeList();

  @NotNull
  List<SwiftType> getTypeList();

  @NotNull
  List<SwiftTypeIdentifier> getTypeIdentifierList();

  @NotNull
  PsiElement getKwFwdArrow();

  @NotNull
  PsiElement getKwSubscript();

  @Nullable
  PsiElement getKwWhere();

}
