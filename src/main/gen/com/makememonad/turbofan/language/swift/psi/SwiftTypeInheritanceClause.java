// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftTypeInheritanceClause extends PsiElement {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @NotNull
  List<SwiftTypeIdentifier> getTypeIdentifierList();

  @NotNull
  PsiElement getColon();

}
