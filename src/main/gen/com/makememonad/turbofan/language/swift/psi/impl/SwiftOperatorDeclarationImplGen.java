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

public class SwiftOperatorDeclarationImplGen extends ASTWrapperPsiElement implements SwiftOperatorDeclaration {

  public SwiftOperatorDeclarationImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitOperatorDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SwiftVisitor) accept((SwiftVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SwiftPrecedenceGroupName getPrecedenceGroupName() {
    return findChildByClass(SwiftPrecedenceGroupName.class);
  }

  @Override
  @Nullable
  public PsiElement getColon() {
    return findChildByType(COLON);
  }

  @Override
  @Nullable
  public PsiElement getKwInfix() {
    return findChildByType(KW_INFIX);
  }

  @Override
  @NotNull
  public PsiElement getKwOperator() {
    return findNotNullChildByType(KW_OPERATOR);
  }

  @Override
  @Nullable
  public PsiElement getKwPostfix() {
    return findChildByType(KW_POSTFIX);
  }

  @Override
  @Nullable
  public PsiElement getKwPrefix() {
    return findChildByType(KW_PREFIX);
  }

  @Override
  @NotNull
  public PsiElement getOperator() {
    return findNotNullChildByType(OPERATOR);
  }

}
