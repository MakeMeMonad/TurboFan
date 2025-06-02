// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftUnionStyleEnumCase extends SwiftTypeDeclaration {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @NotNull
  SwiftEnumCaseName getEnumCaseName();

  @NotNull
  List<SwiftType> getTypeList();

  @Nullable
  PsiElement getLparen();

  @Nullable
  PsiElement getRparen();

  @Nullable String getName();

  @Nullable PsiElement getNameIdentifier();

  @NotNull PsiElement setName(@NotNull String newName);

}
