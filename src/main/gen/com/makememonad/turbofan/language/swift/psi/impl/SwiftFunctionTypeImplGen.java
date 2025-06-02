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

public class SwiftFunctionTypeImplGen extends ASTWrapperPsiElement implements SwiftFunctionType {

  public SwiftFunctionTypeImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitFunctionType(this);
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
  public SwiftFunctionTypeArgumentsList getFunctionTypeArgumentsList() {
    return findChildByClass(SwiftFunctionTypeArgumentsList.class);
  }

  @Override
  @NotNull
  public List<SwiftType> getTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftType.class);
  }

  @Override
  @Nullable
  public PsiElement getKwAsync() {
    return findChildByType(KW_ASYNC);
  }

  @Override
  @Nullable
  public PsiElement getKwEllipsis() {
    return findChildByType(KW_ELLIPSIS);
  }

  @Override
  @NotNull
  public PsiElement getKwFwdArrow() {
    return findNotNullChildByType(KW_FWD_ARROW);
  }

  @Override
  @Nullable
  public PsiElement getKwThrows() {
    return findChildByType(KW_THROWS);
  }

}
