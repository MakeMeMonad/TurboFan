// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;

public interface SwiftTuplePatternElementName extends PsiNamedElement {

  @NotNull
  SwiftPattern getPattern();

  @NotNull
  PsiElement getColon();

  @NotNull
  PsiElement getIdentifier();

  @Nullable String getName();

  @Nullable PsiElement getNameIdentifier();

  @NotNull PsiElement setName(@NotNull String newName);

}
