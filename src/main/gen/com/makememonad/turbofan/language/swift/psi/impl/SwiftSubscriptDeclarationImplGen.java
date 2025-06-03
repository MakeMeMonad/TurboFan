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

public class SwiftSubscriptDeclarationImplGen extends ASTWrapperPsiElement implements SwiftSubscriptDeclaration {

  public SwiftSubscriptDeclarationImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitSubscriptDeclaration(this);
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
  public SwiftCodeBlock getCodeBlock() {
    return findChildByClass(SwiftCodeBlock.class);
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
  @Nullable
  public SwiftGetterSetterBlock getGetterSetterBlock() {
    return findChildByClass(SwiftGetterSetterBlock.class);
  }

  @Override
  @Nullable
  public SwiftGetterSetterKeywordBlock getGetterSetterKeywordBlock() {
    return findChildByClass(SwiftGetterSetterKeywordBlock.class);
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
  @NotNull
  public PsiElement getKwFwdArrow() {
    return findNotNullChildByType(KW_FWD_ARROW);
  }

  @Override
  @NotNull
  public PsiElement getKwSubscript() {
    return findNotNullChildByType(KW_SUBSCRIPT);
  }

  @Override
  @Nullable
  public PsiElement getKwWhere() {
    return findChildByType(KW_WHERE);
  }

}
