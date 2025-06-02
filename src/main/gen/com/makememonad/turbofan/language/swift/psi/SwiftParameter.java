// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftParameter extends PsiElement {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @Nullable
  SwiftExpression getExpression();

  @Nullable
  SwiftExternalParameterNameHolder getExternalParameterNameHolder();

  @NotNull
  SwiftInternalParameterNameHolder getInternalParameterNameHolder();

  @NotNull
  SwiftType getType();

  @NotNull
  PsiElement getColon();

  @Nullable
  PsiElement getKwBorrowing();

  @Nullable
  PsiElement getKwConsuming();

  @Nullable
  PsiElement getKwEllipsis();

  @Nullable
  PsiElement getKwInout();

  @Nullable
  PsiElement getOpAssignment();

  //WARNING: external(...) is skipped
  //matching external(SwiftParameter, ...)
  //methods are not found in SwiftPsiImplUtil

  //WARNING: getExternalName(...) is skipped
  //matching getExternalName(SwiftParameter, ...)
  //methods are not found in SwiftPsiImplUtil

  //WARNING: external(...) is skipped
  //matching external(SwiftParameter, ...)
  //methods are not found in SwiftPsiImplUtil

  //WARNING: getInternalName(...) is skipped
  //matching getInternalName(SwiftParameter, ...)
  //methods are not found in SwiftPsiImplUtil

  //WARNING: external(...) is skipped
  //matching external(SwiftParameter, ...)
  //methods are not found in SwiftPsiImplUtil

  //WARNING: getExternalNameIdentifier(...) is skipped
  //matching getExternalNameIdentifier(SwiftParameter, ...)
  //methods are not found in SwiftPsiImplUtil

  //WARNING: external(...) is skipped
  //matching external(SwiftParameter, ...)
  //methods are not found in SwiftPsiImplUtil

  //WARNING: getInternalNameIdentifier(...) is skipped
  //matching getInternalNameIdentifier(SwiftParameter, ...)
  //methods are not found in SwiftPsiImplUtil

}
