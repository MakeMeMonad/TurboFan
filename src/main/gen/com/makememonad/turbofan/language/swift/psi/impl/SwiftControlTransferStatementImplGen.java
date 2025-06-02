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

public class SwiftControlTransferStatementImplGen extends ASTWrapperPsiElement implements SwiftControlTransferStatement {

  public SwiftControlTransferStatementImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitControlTransferStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SwiftVisitor) accept((SwiftVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SwiftExpression getExpression() {
    return findChildByClass(SwiftExpression.class);
  }

  @Override
  @Nullable
  public SwiftLabelName getLabelName() {
    return findChildByClass(SwiftLabelName.class);
  }

  @Override
  @Nullable
  public PsiElement getKwBreak() {
    return findChildByType(KW_BREAK);
  }

  @Override
  @Nullable
  public PsiElement getKwContinue() {
    return findChildByType(KW_CONTINUE);
  }

  @Override
  @Nullable
  public PsiElement getKwFallthrough() {
    return findChildByType(KW_FALLTHROUGH);
  }

  @Override
  @Nullable
  public PsiElement getReturn() {
    return findChildByType(RETURN);
  }

  @Override
  @Nullable
  public PsiElement getThrow() {
    return findChildByType(THROW);
  }

}
