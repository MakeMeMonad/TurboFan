// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftGetterClause extends PsiElement {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @NotNull
  SwiftCodeBlock getCodeBlock();

  @NotNull
  PsiElement getKwGet();

  @Nullable
  PsiElement getKwMutating();

  @Nullable
  PsiElement getKwNonmutating();

}
