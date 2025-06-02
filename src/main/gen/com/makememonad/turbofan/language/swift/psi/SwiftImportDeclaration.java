// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftImportDeclaration extends PsiElement {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @Nullable
  SwiftImportKind getImportKind();

  @NotNull
  SwiftImportPath getImportPath();

  @NotNull
  PsiElement getKwImport();

  @Nullable String getName();

  @Nullable PsiElement getNameIdentifier();

  //WARNING: getReference(...) is skipped
  //matching getReference(SwiftImportDeclaration, ...)
  //methods are not found in SwiftPsiImplUtil

  //WARNING: getPresentation(...) is skipped
  //matching getPresentation(SwiftImportDeclaration, ...)
  //methods are not found in SwiftPsiImplUtil

  //WARNING: getDocumentationTarget(...) is skipped
  //matching getDocumentationTarget(SwiftImportDeclaration, ...)
  //methods are not found in SwiftPsiImplUtil

}
