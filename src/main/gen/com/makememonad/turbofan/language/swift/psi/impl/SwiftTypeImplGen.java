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

public class SwiftTypeImplGen extends ASTWrapperPsiElement implements SwiftType {

  public SwiftTypeImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitType(this);
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
  public SwiftFunctionType getFunctionType() {
    return findChildByClass(SwiftFunctionType.class);
  }

  @Override
  @Nullable
  public SwiftOpaqueType getOpaqueType() {
    return findChildByClass(SwiftOpaqueType.class);
  }

  @Override
  @Nullable
  public SwiftProtocolCompositionType getProtocolCompositionType() {
    return findChildByClass(SwiftProtocolCompositionType.class);
  }

  @Override
  @Nullable
  public SwiftType getType() {
    return findChildByClass(SwiftType.class);
  }

  @Override
  @Nullable
  public SwiftTypeIdentifier getTypeIdentifier() {
    return findChildByClass(SwiftTypeIdentifier.class);
  }

  @Override
  @Nullable
  public PsiElement getColon() {
    return findChildByType(COLON);
  }

  @Override
  @Nullable
  public PsiElement getDot() {
    return findChildByType(DOT);
  }

  @Override
  @Nullable
  public PsiElement getKwUpperAny() {
    return findChildByType(KW_UPPER_ANY);
  }

  @Override
  @Nullable
  public PsiElement getKwUpperProtocol() {
    return findChildByType(KW_UPPER_PROTOCOL);
  }

  @Override
  @Nullable
  public PsiElement getKwUpperSelf() {
    return findChildByType(KW_UPPER_SELF);
  }

  @Override
  @Nullable
  public PsiElement getKwUpperType() {
    return findChildByType(KW_UPPER_TYPE);
  }

  @Override
  @Nullable
  public PsiElement getLbracket() {
    return findChildByType(LBRACKET);
  }

  @Override
  @Nullable
  public PsiElement getOpNot() {
    return findChildByType(OP_NOT);
  }

  @Override
  @Nullable
  public PsiElement getOpQuestion() {
    return findChildByType(OP_QUESTION);
  }

  @Override
  @Nullable
  public PsiElement getRbracket() {
    return findChildByType(RBRACKET);
  }

}
