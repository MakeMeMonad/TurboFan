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

public class SwiftInitializerDeclarationImplGen extends ASTWrapperPsiElement implements SwiftInitializerDeclaration {

  public SwiftInitializerDeclarationImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitInitializerDeclaration(this);
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
  public SwiftDeclarationModifiers getDeclarationModifiers() {
    return findChildByClass(SwiftDeclarationModifiers.class);
  }

  @Override
  @Nullable
  public SwiftGenericParameterClause getGenericParameterClause() {
    return findChildByClass(SwiftGenericParameterClause.class);
  }

  @Override
  @NotNull
  public SwiftParameterClause getParameterClause() {
    return findNotNullChildByClass(SwiftParameterClause.class);
  }

  @Override
  @NotNull
  public List<SwiftProtocolCompositionType> getProtocolCompositionTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftProtocolCompositionType.class);
  }

  @Override
  @NotNull
  public List<SwiftType> getTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftType.class);
  }

  @Override
  @NotNull
  public List<SwiftTypeIdentifier> getTypeIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftTypeIdentifier.class);
  }

  @Override
  @Nullable
  public PsiElement getKwAsync() {
    return findChildByType(KW_ASYNC);
  }

  @Override
  @NotNull
  public PsiElement getKwInit() {
    return findNotNullChildByType(KW_INIT);
  }

  @Override
  @Nullable
  public PsiElement getKwRethrows() {
    return findChildByType(KW_RETHROWS);
  }

  @Override
  @Nullable
  public PsiElement getKwThrows() {
    return findChildByType(KW_THROWS);
  }

  @Override
  @Nullable
  public PsiElement getKwWhere() {
    return findChildByType(KW_WHERE);
  }

  @Override
  @Nullable
  public PsiElement getLparen() {
    return findChildByType(LPAREN);
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
  public PsiElement getRparen() {
    return findChildByType(RPAREN);
  }

}
