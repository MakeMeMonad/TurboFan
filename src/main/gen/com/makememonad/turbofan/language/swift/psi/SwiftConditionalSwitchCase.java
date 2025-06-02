// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftConditionalSwitchCase extends PsiElement {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @NotNull
  List<SwiftConditionalSwitchCase> getConditionalSwitchCaseList();

  @NotNull
  List<SwiftExpression> getExpressionList();

  @NotNull
  List<SwiftImportPath> getImportPathList();

  @NotNull
  List<SwiftPattern> getPatternList();

  @NotNull
  List<SwiftStatements> getStatementsList();

  @Nullable
  PsiElement getKwPndElse();

  @NotNull
  PsiElement getKwPndEndif();

  @NotNull
  PsiElement getKwPndIf();

}
