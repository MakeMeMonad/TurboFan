// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftConditionList extends PsiElement {

  @NotNull
  List<SwiftExpression> getExpressionList();

  @NotNull
  List<SwiftPattern> getPatternList();

}
