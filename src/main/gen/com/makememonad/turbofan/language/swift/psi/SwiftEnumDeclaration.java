// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftEnumDeclaration extends SwiftTypeDeclaration {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @Nullable
  SwiftRawValueStyleEnum getRawValueStyleEnum();

  @Nullable
  SwiftUnionStyleEnum getUnionStyleEnum();

  @Nullable
  PsiElement getKwFileprivate();

  @Nullable
  PsiElement getKwInternal();

  @Nullable
  PsiElement getKwOpen();

  @Nullable
  PsiElement getKwPackage();

  @Nullable
  PsiElement getKwPrivate();

  @Nullable
  PsiElement getKwPublic();

  @Nullable
  PsiElement getKwSet();

  @Nullable
  PsiElement getLparen();

  @Nullable
  PsiElement getRparen();

  @Nullable String getName();

  @Nullable PsiElement getNameIdentifier();

  @NotNull PsiElement setName(@NotNull String newName);

  //WARNING: getPresentation(...) is skipped
  //matching getPresentation(SwiftEnumDeclaration, ...)
  //methods are not found in SwiftPsiImplUtil

  //WARNING: getDocumentationTarget(...) is skipped
  //matching getDocumentationTarget(SwiftEnumDeclaration, ...)
  //methods are not found in SwiftPsiImplUtil

}
