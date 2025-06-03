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

public class SwiftRawValueStyleEnumCaseClauseImplGen extends ASTWrapperPsiElement implements SwiftRawValueStyleEnumCaseClause {

  public SwiftRawValueStyleEnumCaseClauseImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitRawValueStyleEnumCaseClause(this);
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
  public SwiftRawValueStyleEnumCaseList getRawValueStyleEnumCaseList() {
    return findNotNullChildByClass(SwiftRawValueStyleEnumCaseList.class);
  }

  @Override
  @NotNull
  public PsiElement getKwCase() {
    return findNotNullChildByType(KW_CASE);
  }

}
