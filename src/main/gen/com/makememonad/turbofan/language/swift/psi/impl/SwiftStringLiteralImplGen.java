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

public class SwiftStringLiteralImplGen extends ASTWrapperPsiElement implements SwiftStringLiteral {

  public SwiftStringLiteralImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitStringLiteral(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SwiftVisitor) accept((SwiftVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SwiftExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftExpression.class);
  }

  @Override
  @Nullable
  public PsiElement getMultilineStringEnd() {
    return findChildByType(MULTILINE_STRING_END);
  }

  @Override
  @Nullable
  public PsiElement getMultilineStringStart() {
    return findChildByType(MULTILINE_STRING_START);
  }

  @Override
  @Nullable
  public PsiElement getStringEnd() {
    return findChildByType(STRING_END);
  }

  @Override
  @Nullable
  public PsiElement getStringStart() {
    return findChildByType(STRING_START);
  }

}
