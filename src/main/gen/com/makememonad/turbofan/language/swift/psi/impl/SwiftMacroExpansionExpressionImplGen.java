// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.makememonad.turbofan.language.swift.psi.SwiftTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.makememonad.turbofan.language.swift.psi.*;

public class SwiftMacroExpansionExpressionImplGen extends ASTWrapperPsiElement implements SwiftMacroExpansionExpression {

  public SwiftMacroExpansionExpressionImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitMacroExpansionExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SwiftVisitor) accept((SwiftVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SwiftAttribute> getAttributeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftAttribute.class);
  }

  @Override
  @NotNull
  public List<SwiftCaptureListItem> getCaptureListItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftCaptureListItem.class);
  }

  @Override
  @NotNull
  public List<SwiftClosureParameter> getClosureParameterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftClosureParameter.class);
  }

  @Override
  @NotNull
  public List<SwiftFunctionCallArgument> getFunctionCallArgumentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftFunctionCallArgument.class);
  }

  @Override
  @NotNull
  public List<SwiftIdentifierList> getIdentifierListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftIdentifierList.class);
  }

  @Override
  @NotNull
  public SwiftMacroExpansionExpressionName getMacroExpansionExpressionName() {
    return findNotNullChildByClass(SwiftMacroExpansionExpressionName.class);
  }

  @Override
  @NotNull
  public List<SwiftMiscWrappedIdentifierToken> getMiscWrappedIdentifierTokenList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftMiscWrappedIdentifierToken.class);
  }

  @Override
  @NotNull
  public List<SwiftStatements> getStatementsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftStatements.class);
  }

  @Override
  @NotNull
  public List<SwiftType> getTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftType.class);
  }

  @Override
  @Nullable
  public PsiElement getOpLangle() {
    return findChildByType(OP_LANGLE);
  }

  @Override
  @Nullable
  public PsiElement getOpRangle() {
    return findChildByType(OP_RANGLE);
  }

  @Override
  @NotNull
  public PsiElement getPound() {
    return findNotNullChildByType(POUND);
  }

  @Override
  public @Nullable String getName() {
    return SwiftPsiImplUtil.getName(this);
  }

}
