// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftClosureParameter extends SwiftTypeDeclaration {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @NotNull
  SwiftClosureParameterName getClosureParameterName();

  @Nullable
  SwiftType getType();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getEllipsis();

  @Nullable
  PsiElement getKwInout();

  @Nullable String getName();

  @Nullable PsiElement getNameIdentifier();

  @NotNull PsiElement setName(@NotNull String newName);

  //WARNING: getPresentation(...) is skipped
  //matching getPresentation(SwiftClosureParameter, ...)
  //methods are not found in SwiftPsiImplUtil

}
