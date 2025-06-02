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

public class SwiftGenericParameterClauseImplGen extends ASTWrapperPsiElement implements SwiftGenericParameterClause {

  public SwiftGenericParameterClauseImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitGenericParameterClause(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SwiftVisitor) accept((SwiftVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SwiftGenericParameterList getGenericParameterList() {
    return findNotNullChildByClass(SwiftGenericParameterList.class);
  }

  @Override
  @NotNull
  public PsiElement getOpLangle() {
    return findNotNullChildByType(OP_LANGLE);
  }

  @Override
  @NotNull
  public PsiElement getOpRangle() {
    return findNotNullChildByType(OP_RANGLE);
  }

}
