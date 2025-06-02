// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftVariableDeclaration extends SwiftTypeDeclaration {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @Nullable
  SwiftCodeBlock getCodeBlock();

  @Nullable
  SwiftExpression getExpression();

  @Nullable
  SwiftGetterSetterBlock getGetterSetterBlock();

  @Nullable
  SwiftGetterSetterKeywordBlock getGetterSetterKeywordBlock();

  @Nullable
  SwiftPatternInitializerList getPatternInitializerList();

  @Nullable
  SwiftType getType();

  @NotNull
  SwiftVariableDeclarationHead getVariableDeclarationHead();

  @Nullable
  SwiftVariableName getVariableName();

  @Nullable
  SwiftWillSetDidSetBlock getWillSetDidSetBlock();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getKwInout();

  @Nullable
  PsiElement getOpAssignment();

  @Nullable String getName();

  @Nullable PsiElement getNameIdentifier();

  @NotNull PsiElement setName(@NotNull String newName);

  //WARNING: getPresentation(...) is skipped
  //matching getPresentation(SwiftVariableDeclaration, ...)
  //methods are not found in SwiftPsiImplUtil

}
