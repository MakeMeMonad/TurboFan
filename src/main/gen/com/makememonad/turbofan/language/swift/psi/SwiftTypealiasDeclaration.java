// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftTypealiasDeclaration extends SwiftTypeDeclaration {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @Nullable
  SwiftGenericParameterClause getGenericParameterClause();

  @NotNull
  SwiftTypealiasAssignment getTypealiasAssignment();

  @NotNull
  SwiftTypealiasName getTypealiasName();

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

  @NotNull
  PsiElement getKwTypealias();

  @Nullable
  PsiElement getLparen();

  @Nullable
  PsiElement getRparen();

  @Nullable String getName();

  @Nullable PsiElement getNameIdentifier();

  @NotNull PsiElement setName(@NotNull String newName);

  //WARNING: getPresentation(...) is skipped
  //matching getPresentation(SwiftTypealiasDeclaration, ...)
  //methods are not found in SwiftPsiImplUtil

}
