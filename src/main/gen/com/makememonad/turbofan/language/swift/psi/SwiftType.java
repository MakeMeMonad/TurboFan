// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftType extends PsiElement {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @Nullable
  SwiftFunctionType getFunctionType();

  @Nullable
  SwiftOpaqueType getOpaqueType();

  @Nullable
  SwiftProtocolCompositionType getProtocolCompositionType();

  @Nullable
  SwiftType getType();

  @Nullable
  SwiftTypeIdentifier getTypeIdentifier();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getDot();

  @Nullable
  PsiElement getKwUpperAny();

  @Nullable
  PsiElement getKwUpperProtocol();

  @Nullable
  PsiElement getKwUpperSelf();

  @Nullable
  PsiElement getKwUpperType();

  @Nullable
  PsiElement getLbracket();

  @Nullable
  PsiElement getOpNot();

  @Nullable
  PsiElement getOpQuestion();

  @Nullable
  PsiElement getRbracket();

}
