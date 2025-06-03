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

public class SwiftLiteralImplGen extends ASTWrapperPsiElement implements SwiftLiteral {

  public SwiftLiteralImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitLiteral(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SwiftVisitor) accept((SwiftVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SwiftNumericLiteral getNumericLiteral() {
    return findChildByClass(SwiftNumericLiteral.class);
  }

  @Override
  @Nullable
  public SwiftRegularExpressionLiteral getRegularExpressionLiteral() {
    return findChildByClass(SwiftRegularExpressionLiteral.class);
  }

  @Override
  @Nullable
  public SwiftStringLiteral getStringLiteral() {
    return findChildByClass(SwiftStringLiteral.class);
  }

  @Override
  @Nullable
  public PsiElement getKwFalse() {
    return findChildByType(KW_FALSE);
  }

  @Override
  @Nullable
  public PsiElement getKwNil() {
    return findChildByType(KW_NIL);
  }

  @Override
  @Nullable
  public PsiElement getKwTrue() {
    return findChildByType(KW_TRUE);
  }

}
