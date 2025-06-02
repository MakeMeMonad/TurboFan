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

public class SwiftLabeledStatementImplGen extends ASTWrapperPsiElement implements SwiftLabeledStatement {

  public SwiftLabeledStatementImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitLabeledStatement(this);
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
  @Nullable
  public SwiftCodeBlock getCodeBlock() {
    return findChildByClass(SwiftCodeBlock.class);
  }

  @Override
  @Nullable
  public SwiftConditionList getConditionList() {
    return findChildByClass(SwiftConditionList.class);
  }

  @Override
  @NotNull
  public List<SwiftConditionalSwitchCase> getConditionalSwitchCaseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftConditionalSwitchCase.class);
  }

  @Override
  @NotNull
  public List<SwiftExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftExpression.class);
  }

  @Override
  @Nullable
  public SwiftPattern getPattern() {
    return findChildByClass(SwiftPattern.class);
  }

  @Override
  @NotNull
  public SwiftStatementLabel getStatementLabel() {
    return findNotNullChildByClass(SwiftStatementLabel.class);
  }

  @Override
  @NotNull
  public List<SwiftStatements> getStatementsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftStatements.class);
  }

  @Override
  @Nullable
  public SwiftType getType() {
    return findChildByClass(SwiftType.class);
  }

  @Override
  @Nullable
  public PsiElement getKwCase() {
    return findChildByType(KW_CASE);
  }

  @Override
  @Nullable
  public PsiElement getKwDo() {
    return findChildByType(KW_DO);
  }

  @Override
  @Nullable
  public PsiElement getKwElse() {
    return findChildByType(KW_ELSE);
  }

  @Override
  @Nullable
  public PsiElement getKwFor() {
    return findChildByType(KW_FOR);
  }

  @Override
  @Nullable
  public PsiElement getKwIn() {
    return findChildByType(KW_IN);
  }

  @Override
  @Nullable
  public PsiElement getKwRepeat() {
    return findChildByType(KW_REPEAT);
  }

  @Override
  @Nullable
  public PsiElement getKwThrows() {
    return findChildByType(KW_THROWS);
  }

  @Override
  @Nullable
  public PsiElement getKwWhere() {
    return findChildByType(KW_WHERE);
  }

  @Override
  @Nullable
  public PsiElement getKwWhile() {
    return findChildByType(KW_WHILE);
  }

  @Override
  @Nullable
  public PsiElement getLbrace() {
    return findChildByType(LBRACE);
  }

  @Override
  @Nullable
  public PsiElement getLparen() {
    return findChildByType(LPAREN);
  }

  @Override
  @Nullable
  public PsiElement getRbrace() {
    return findChildByType(RBRACE);
  }

  @Override
  @Nullable
  public PsiElement getRparen() {
    return findChildByType(RPAREN);
  }

  @Override
  @Nullable
  public PsiElement getSwitch() {
    return findChildByType(SWITCH);
  }

}
