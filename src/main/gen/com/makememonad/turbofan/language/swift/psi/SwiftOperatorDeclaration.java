// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftOperatorDeclaration extends PsiElement {

  @Nullable
  SwiftPrecedenceGroupName getPrecedenceGroupName();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getKwInfix();

  @NotNull
  PsiElement getKwOperator();

  @Nullable
  PsiElement getKwPostfix();

  @Nullable
  PsiElement getKwPrefix();

  @NotNull
  PsiElement getOperator();

}
