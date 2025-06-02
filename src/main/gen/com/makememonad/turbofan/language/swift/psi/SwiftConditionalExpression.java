// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftConditionalExpression extends PsiElement {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @NotNull
  List<SwiftConditionList> getConditionListList();

  @NotNull
  List<SwiftExpression> getExpressionList();

  @NotNull
  List<SwiftPattern> getPatternList();

  @NotNull
  List<SwiftStatement> getStatementList();

  @Nullable
  PsiElement getKwElse();

  @Nullable
  PsiElement getKwSwitch();

}
