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

public class SwiftConditionalExpressionImplGen extends ASTWrapperPsiElement implements SwiftConditionalExpression {

  public SwiftConditionalExpressionImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitConditionalExpression(this);
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
  public List<SwiftConditionList> getConditionListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftConditionList.class);
  }

  @Override
  @NotNull
  public List<SwiftExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftExpression.class);
  }

  @Override
  @NotNull
  public List<SwiftPattern> getPatternList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftPattern.class);
  }

  @Override
  @NotNull
  public List<SwiftStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftStatement.class);
  }

  @Override
  @Nullable
  public PsiElement getKwElse() {
    return findChildByType(KW_ELSE);
  }

  @Override
  @Nullable
  public PsiElement getKwSwitch() {
    return findChildByType(KW_SWITCH);
  }

}
