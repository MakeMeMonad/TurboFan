// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftPrecedenceGroupDeclaration extends SwiftTypeDeclaration {

  @NotNull
  List<SwiftPrecedenceGroupName> getPrecedenceGroupNameList();

  @NotNull
  PsiElement getKwPrecedencegroup();

  @NotNull
  PsiElement getLbrace();

  @NotNull
  PsiElement getRbrace();

  @Nullable String getName();

  @Nullable PsiElement getNameIdentifier();

  @NotNull PsiElement setName(@NotNull String newName);

  //WARNING: getPresentation(...) is skipped
  //matching getPresentation(SwiftPrecedenceGroupDeclaration, ...)
  //methods are not found in SwiftPsiImplUtil

}
