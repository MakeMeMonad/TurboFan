// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftLiteral extends PsiElement {

  @Nullable
  SwiftNumericLiteral getNumericLiteral();

  @Nullable
  SwiftRegularExpressionLiteral getRegularExpressionLiteral();

  @Nullable
  SwiftStringLiteral getStringLiteral();

  @Nullable
  PsiElement getKwFalse();

  @Nullable
  PsiElement getKwNil();

  @Nullable
  PsiElement getKwTrue();

}
