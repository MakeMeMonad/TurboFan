// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftExpression extends PsiElement {

  @NotNull
  List<SwiftAttribute> getAttributeList();

  @NotNull
  List<SwiftCaptureListItem> getCaptureListItemList();

  @NotNull
  List<SwiftClosureParameter> getClosureParameterList();

  @NotNull
  List<SwiftConditionalCompilationBlock> getConditionalCompilationBlockList();

  @NotNull
  List<SwiftConditionalExpression> getConditionalExpressionList();

  @NotNull
  List<SwiftExpression> getExpressionList();

  @NotNull
  List<SwiftFunctionCallArgument> getFunctionCallArgumentList();

  @NotNull
  List<SwiftIdentifierList> getIdentifierListList();

  @NotNull
  List<SwiftLiteral> getLiteralList();

  @NotNull
  List<SwiftMacroExpansionExpression> getMacroExpansionExpressionList();

  @NotNull
  List<SwiftMiscWrappedIdentifierToken> getMiscWrappedIdentifierTokenList();

  @NotNull
  List<SwiftStatements> getStatementsList();

  @NotNull
  List<SwiftSuperclassMethodExpression> getSuperclassMethodExpressionList();

  @NotNull
  List<SwiftType> getTypeList();

}
