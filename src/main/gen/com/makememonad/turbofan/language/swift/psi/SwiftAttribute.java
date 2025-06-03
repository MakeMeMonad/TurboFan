// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftAttribute extends SwiftTypeDeclaration {

  @NotNull
  SwiftAttributeName getAttributeName();

  @NotNull
  List<SwiftLiteral> getLiteralList();

  @NotNull
  PsiElement getOpAt();

  @Nullable String getName();

  @Nullable PsiElement getNameIdentifier();

  @NotNull PsiElement setName(@NotNull String newName);

  //WARNING: getPresentation(...) is skipped
  //matching getPresentation(SwiftAttribute, ...)
  //methods are not found in SwiftPsiImplUtil

}
