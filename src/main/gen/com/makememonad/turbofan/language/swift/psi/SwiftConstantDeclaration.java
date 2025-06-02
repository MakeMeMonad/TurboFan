// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftConstantDeclaration extends PsiElement {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @Nullable
  SwiftDeclarationModifiers getDeclarationModifiers();

  @NotNull
  SwiftPatternInitializerList getPatternInitializerList();

  @NotNull
  PsiElement getKwLet();

  @NotNull List<@NotNull String> getDeclaredNames();

  //WARNING: getDeclaredIdentifiers(...) is skipped
  //matching getDeclaredIdentifiers(SwiftConstantDeclaration, ...)
  //methods are not found in SwiftPsiImplUtil

  //WARNING: getPresentation(...) is skipped
  //matching getPresentation(SwiftConstantDeclaration, ...)
  //methods are not found in SwiftPsiImplUtil

  //WARNING: getDocumentationTarget(...) is skipped
  //matching getDocumentationTarget(SwiftConstantDeclaration, ...)
  //methods are not found in SwiftPsiImplUtil

}
