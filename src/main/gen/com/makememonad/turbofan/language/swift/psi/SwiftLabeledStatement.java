// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftLabeledStatement extends PsiElement {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @Nullable
  SwiftCodeBlock getCodeBlock();

  @Nullable
  SwiftConditionList getConditionList();

  @NotNull
  List<SwiftConditionalSwitchCase> getConditionalSwitchCaseList();

  @NotNull
  List<SwiftExpression> getExpressionList();

  @Nullable
  SwiftPattern getPattern();

  @NotNull
  SwiftStatementLabel getStatementLabel();

  @NotNull
  List<SwiftStatements> getStatementsList();

  @Nullable
  SwiftType getType();

  @Nullable
  PsiElement getKwCase();

  @Nullable
  PsiElement getKwDo();

  @Nullable
  PsiElement getKwElse();

  @Nullable
  PsiElement getKwFor();

  @Nullable
  PsiElement getKwIn();

  @Nullable
  PsiElement getKwRepeat();

  @Nullable
  PsiElement getKwThrows();

  @Nullable
  PsiElement getKwWhere();

  @Nullable
  PsiElement getKwWhile();

  @Nullable
  PsiElement getLbrace();

  @Nullable
  PsiElement getLparen();

  @Nullable
  PsiElement getRbrace();

  @Nullable
  PsiElement getRparen();

  @Nullable
  PsiElement getSwitch();

}
