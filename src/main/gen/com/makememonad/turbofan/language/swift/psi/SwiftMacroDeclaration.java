// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftMacroDeclaration extends SwiftTypeDeclaration {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @Nullable
  SwiftDeclarationModifiers getDeclarationModifiers();

  @Nullable
  SwiftExpression getExpression();

  @Nullable
  SwiftGenericParameterClause getGenericParameterClause();

  @NotNull
  SwiftMacroName getMacroName();

  @NotNull
  SwiftParameterClause getParameterClause();

  @NotNull
  List<SwiftProtocolCompositionType> getProtocolCompositionTypeList();

  @NotNull
  List<SwiftType> getTypeList();

  @NotNull
  List<SwiftTypeIdentifier> getTypeIdentifierList();

  @Nullable
  PsiElement getKwFwdArrow();

  @NotNull
  PsiElement getKwMacro();

  @NotNull
  PsiElement getKwWhere();

  @Nullable
  PsiElement getOpAssignment();

  @Nullable String getName();

  @Nullable PsiElement getNameIdentifier();

  @NotNull PsiElement setName(@NotNull String newName);

  //WARNING: getPresentation(...) is skipped
  //matching getPresentation(SwiftMacroDeclaration, ...)
  //methods are not found in SwiftPsiImplUtil

}
