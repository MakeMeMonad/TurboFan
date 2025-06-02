// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftPattern extends PsiElement {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @Nullable
  SwiftEnumCaseName getEnumCaseName();

  @Nullable
  SwiftExpression getExpression();

  @Nullable
  SwiftIdentifierPattern getIdentifierPattern();

  @Nullable
  SwiftPattern getPattern();

  @Nullable
  SwiftTuplePattern getTuplePattern();

  @NotNull
  List<SwiftType> getTypeList();

  @Nullable
  SwiftTypeIdentifier getTypeIdentifier();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getDot();

  @Nullable
  PsiElement getKwInout();

  @Nullable
  PsiElement getKwLet();

  @Nullable
  PsiElement getKwUnderscore();

  @Nullable
  PsiElement getKwVar();

  @Nullable
  PsiElement getOpQuestion();

  @Nullable
  PsiElement getOpTypeCast();

  @Nullable
  PsiElement getOpTypeCheck();

  //WARNING: collectNames(...) is skipped
  //matching collectNames(SwiftPattern, ...)
  //methods are not found in SwiftPsiImplUtil

}
