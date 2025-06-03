// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftProtocolVariableDeclaration extends SwiftTypeDeclaration {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @NotNull
  SwiftGetterSetterKeywordBlock getGetterSetterKeywordBlock();

  @NotNull
  SwiftType getType();

  @NotNull
  SwiftVariableDeclarationHead getVariableDeclarationHead();

  @NotNull
  SwiftVariableName getVariableName();

  @NotNull
  PsiElement getColon();

  @Nullable
  PsiElement getKwInout();

  @Nullable String getName();

  @Nullable PsiElement getNameIdentifier();

  @NotNull PsiElement setName(@NotNull String newName);

}
