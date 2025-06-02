// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftWillSetDidSetBlock extends PsiElement {

  @Nullable
  SwiftDidSetClause getDidSetClause();

  @Nullable
  SwiftWillSetClause getWillSetClause();

  @NotNull
  PsiElement getLbrace();

  @NotNull
  PsiElement getRbrace();

}
