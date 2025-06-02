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

public class SwiftNumericLiteralImplGen extends ASTWrapperPsiElement implements SwiftNumericLiteral {

  public SwiftNumericLiteralImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitNumericLiteral(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SwiftVisitor) accept((SwiftVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SwiftIntegerLiteral getIntegerLiteral() {
    return findChildByClass(SwiftIntegerLiteral.class);
  }

  @Override
  @Nullable
  public PsiElement getDecimalFloatingPointLiteral() {
    return findChildByType(DECIMAL_FLOATING_POINT_LITERAL);
  }

  @Override
  @Nullable
  public PsiElement getHexFloatingPointLiteral() {
    return findChildByType(HEX_FLOATING_POINT_LITERAL);
  }

  @Override
  @Nullable
  public PsiElement getOpSub() {
    return findChildByType(OP_SUB);
  }

}
