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

public class SwiftCaptureListItemImplGen extends ASTWrapperPsiElement implements SwiftCaptureListItem {

  public SwiftCaptureListItemImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitCaptureListItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SwiftVisitor) accept((SwiftVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SwiftCaptureListItemName getCaptureListItemName() {
    return findChildByClass(SwiftCaptureListItemName.class);
  }

  @Override
  @Nullable
  public SwiftExpression getExpression() {
    return findChildByClass(SwiftExpression.class);
  }

  @Override
  @NotNull
  public List<SwiftFunctionCallArgument> getFunctionCallArgumentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftFunctionCallArgument.class);
  }

  @Override
  @Nullable
  public PsiElement getDot() {
    return findChildByType(DOT);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

  @Override
  @Nullable
  public PsiElement getKwInit() {
    return findChildByType(KW_INIT);
  }

  @Override
  @Nullable
  public PsiElement getKwLowerSelf() {
    return findChildByType(KW_LOWER_SELF);
  }

  @Override
  @Nullable
  public PsiElement getKwSafe() {
    return findChildByType(KW_SAFE);
  }

  @Override
  @Nullable
  public PsiElement getKwUnowned() {
    return findChildByType(KW_UNOWNED);
  }

  @Override
  @Nullable
  public PsiElement getKwUnsafe() {
    return findChildByType(KW_UNSAFE);
  }

  @Override
  @Nullable
  public PsiElement getKwWeak() {
    return findChildByType(KW_WEAK);
  }

  @Override
  @Nullable
  public PsiElement getLbracket() {
    return findChildByType(LBRACKET);
  }

  @Override
  @Nullable
  public PsiElement getLparen() {
    return findChildByType(LPAREN);
  }

  @Override
  @Nullable
  public PsiElement getOpAssignment() {
    return findChildByType(OP_ASSIGNMENT);
  }

  @Override
  @Nullable
  public PsiElement getRbracket() {
    return findChildByType(RBRACKET);
  }

  @Override
  @Nullable
  public PsiElement getRparen() {
    return findChildByType(RPAREN);
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
