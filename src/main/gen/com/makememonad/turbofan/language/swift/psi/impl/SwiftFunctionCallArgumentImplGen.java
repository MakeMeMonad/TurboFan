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

public class SwiftFunctionCallArgumentImplGen extends ASTWrapperPsiElement implements SwiftFunctionCallArgument {

  public SwiftFunctionCallArgumentImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitFunctionCallArgument(this);
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
  public SwiftFunctionCallArgumentLabel getFunctionCallArgumentLabel() {
    return findChildByClass(SwiftFunctionCallArgumentLabel.class);
  }

  @Override
  @Nullable
  public PsiElement getOperator() {
    return findChildByType(OPERATOR);
  }

}
