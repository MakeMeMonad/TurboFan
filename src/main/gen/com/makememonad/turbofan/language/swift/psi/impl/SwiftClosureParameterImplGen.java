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

public class SwiftClosureParameterImplGen extends ASTWrapperPsiElement implements SwiftClosureParameter {

  public SwiftClosureParameterImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitClosureParameter(this);
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
  public SwiftClosureParameterName getClosureParameterName() {
    return findNotNullChildByClass(SwiftClosureParameterName.class);
  }

  @Override
  @Nullable
  public SwiftType getType() {
    return findChildByClass(SwiftType.class);
  }

  @Override
  @Nullable
  public PsiElement getColon() {
    return findChildByType(COLON);
  }

  @Override
  @Nullable
  public PsiElement getEllipsis() {
    return findChildByType(ELLIPSIS);
  }

  @Override
  @Nullable
  public PsiElement getKwInout() {
    return findChildByType(KW_INOUT);
  }

  @Override
  public @Nullable String getName() {
    return SwiftPsiImplUtil.getName(this);
  }

  @Override
  public @Nullable PsiElement getNameIdentifier() {
    return SwiftPsiImplUtil.getNameIdentifier(this);
  }

  @Override
  public @NotNull PsiElement setName(@NotNull String newName) {
    return SwiftPsiImplUtil.setName(this, newName);
  }

}
