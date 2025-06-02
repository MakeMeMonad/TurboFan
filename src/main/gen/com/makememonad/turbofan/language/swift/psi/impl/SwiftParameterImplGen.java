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

public class SwiftParameterImplGen extends ASTWrapperPsiElement implements SwiftParameter {

  public SwiftParameterImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitParameter(this);
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
  public SwiftExpression getExpression() {
    return findChildByClass(SwiftExpression.class);
  }

  @Override
  @Nullable
  public SwiftExternalParameterNameHolder getExternalParameterNameHolder() {
    return findChildByClass(SwiftExternalParameterNameHolder.class);
  }

  @Override
  @NotNull
  public SwiftInternalParameterNameHolder getInternalParameterNameHolder() {
    return findNotNullChildByClass(SwiftInternalParameterNameHolder.class);
  }

  @Override
  @NotNull
  public SwiftType getType() {
    return findNotNullChildByClass(SwiftType.class);
  }

  @Override
  @NotNull
  public PsiElement getColon() {
    return findNotNullChildByType(COLON);
  }

  @Override
  @Nullable
  public PsiElement getKwBorrowing() {
    return findChildByType(KW_BORROWING);
  }

  @Override
  @Nullable
  public PsiElement getKwConsuming() {
    return findChildByType(KW_CONSUMING);
  }

  @Override
  @Nullable
  public PsiElement getKwEllipsis() {
    return findChildByType(KW_ELLIPSIS);
  }

  @Override
  @Nullable
  public PsiElement getKwInout() {
    return findChildByType(KW_INOUT);
  }

  @Override
  @Nullable
  public PsiElement getOpAssignment() {
    return findChildByType(OP_ASSIGNMENT);
  }

}
