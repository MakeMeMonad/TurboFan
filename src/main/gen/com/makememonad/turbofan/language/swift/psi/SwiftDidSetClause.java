// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftDidSetClause extends PsiElement {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @NotNull
  SwiftCodeBlock getCodeBlock();

  @Nullable
  SwiftSetterName getSetterName();

  @NotNull
  PsiElement getKwDidset();

}
