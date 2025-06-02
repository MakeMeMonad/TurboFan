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

public class SwiftSetterClauseImplGen extends ASTWrapperPsiElement implements SwiftSetterClause {

  public SwiftSetterClauseImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitSetterClause(this);
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
  public SwiftCodeBlock getCodeBlock() {
    return findNotNullChildByClass(SwiftCodeBlock.class);
  }

  @Override
  @Nullable
  public SwiftSetterName getSetterName() {
    return findChildByClass(SwiftSetterName.class);
  }

  @Override
  @Nullable
  public PsiElement getKwMutating() {
    return findChildByType(KW_MUTATING);
  }

  @Override
  @Nullable
  public PsiElement getKwNonmutating() {
    return findChildByType(KW_NONMUTATING);
  }

  @Override
  @NotNull
  public PsiElement getKwSet() {
    return findNotNullChildByType(KW_SET);
  }

}
