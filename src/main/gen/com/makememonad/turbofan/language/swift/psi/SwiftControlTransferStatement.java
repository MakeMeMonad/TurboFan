// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftControlTransferStatement extends PsiElement {

  @Nullable
  SwiftExpression getExpression();

  @Nullable
  SwiftLabelName getLabelName();

  @Nullable
  PsiElement getKwBreak();

  @Nullable
  PsiElement getKwContinue();

  @Nullable
  PsiElement getKwFallthrough();

  @Nullable
  PsiElement getReturn();

  @Nullable
  PsiElement getThrow();

}
