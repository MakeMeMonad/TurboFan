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

public class SwiftClassDeclarationImplGen extends ASTWrapperPsiElement implements SwiftClassDeclaration {

  public SwiftClassDeclarationImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitClassDeclaration(this);
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
  public SwiftClassMembers getClassMembers() {
    return findChildByClass(SwiftClassMembers.class);
  }

  @Override
  @NotNull
  public SwiftClassName getClassName() {
    return findNotNullChildByClass(SwiftClassName.class);
  }

  @Override
  @Nullable
  public SwiftGenericParameterClause getGenericParameterClause() {
    return findChildByClass(SwiftGenericParameterClause.class);
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
  public SwiftTypeInheritanceClause getTypeInheritanceClause() {
    return findChildByClass(SwiftTypeInheritanceClause.class);
  }

  @Override
  @NotNull
  public PsiElement getKwClass() {
    return findNotNullChildByType(KW_CLASS);
  }

  @Override
  @Nullable
  public PsiElement getKwFileprivate() {
    return findChildByType(KW_FILEPRIVATE);
  }

  @Override
  @Nullable
  public PsiElement getKwFinal() {
    return findChildByType(KW_FINAL);
  }

  @Override
  @Nullable
  public PsiElement getKwInternal() {
    return findChildByType(KW_INTERNAL);
  }

  @Override
  @Nullable
  public PsiElement getKwOpen() {
    return findChildByType(KW_OPEN);
  }

  @Override
  @Nullable
  public PsiElement getKwPackage() {
    return findChildByType(KW_PACKAGE);
  }

  @Override
  @Nullable
  public PsiElement getKwPrivate() {
    return findChildByType(KW_PRIVATE);
  }

  @Override
  @Nullable
  public PsiElement getKwPublic() {
    return findChildByType(KW_PUBLIC);
  }

  @Override
  @Nullable
  public PsiElement getKwSet() {
    return findChildByType(KW_SET);
  }

  @Override
  @Nullable
  public PsiElement getKwWhere() {
    return findChildByType(KW_WHERE);
  }

  @Override
  @NotNull
  public PsiElement getLbrace() {
    return findNotNullChildByType(LBRACE);
  }

  @Override
  @Nullable
  public PsiElement getLparen() {
    return findChildByType(LPAREN);
  }

  @Override
  @NotNull
  public PsiElement getRbrace() {
    return findNotNullChildByType(RBRACE);
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
