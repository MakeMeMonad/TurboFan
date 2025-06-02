// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftMacroExpansionExpression extends PsiElement {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @NotNull
  List<SwiftCaptureListItem> getCaptureListItemList();

  @NotNull
  List<SwiftClosureParameter> getClosureParameterList();

  @NotNull
  List<SwiftFunctionCallArgument> getFunctionCallArgumentList();

  @NotNull
  List<SwiftIdentifierList> getIdentifierListList();

  @NotNull
  SwiftMacroExpansionExpressionName getMacroExpansionExpressionName();

  @NotNull
  List<SwiftMiscWrappedIdentifierToken> getMiscWrappedIdentifierTokenList();

  @NotNull
  List<SwiftStatements> getStatementsList();

  @NotNull
  List<SwiftType> getTypeList();

  @Nullable
  PsiElement getOpLangle();

  @Nullable
  PsiElement getOpRangle();

  @NotNull
  PsiElement getPound();

  @Nullable String getName();

}
