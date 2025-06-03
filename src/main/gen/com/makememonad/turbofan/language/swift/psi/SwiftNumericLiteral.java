// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftNumericLiteral extends PsiElement {

  @Nullable
  SwiftIntegerLiteral getIntegerLiteral();

  @Nullable
  PsiElement getDecimalFloatingPointLiteral();

  @Nullable
  PsiElement getHexFloatingPointLiteral();

  @Nullable
  PsiElement getOpSub();

}
