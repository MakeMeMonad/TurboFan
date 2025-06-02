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

public class SwiftUnionStyleEnumImplGen extends ASTWrapperPsiElement implements SwiftUnionStyleEnum {

  public SwiftUnionStyleEnumImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitUnionStyleEnum(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SwiftVisitor) accept((SwiftVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SwiftEnumDeclarationName getEnumDeclarationName() {
    return findNotNullChildByClass(SwiftEnumDeclarationName.class);
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
  @Nullable
  public SwiftUnionStyleEnumMembers getUnionStyleEnumMembers() {
    return findChildByClass(SwiftUnionStyleEnumMembers.class);
  }

  @Override
  @NotNull
  public PsiElement getKwEnum() {
    return findNotNullChildByType(KW_ENUM);
  }

  @Override
  @Nullable
  public PsiElement getKwIndirect() {
    return findChildByType(KW_INDIRECT);
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
  @NotNull
  public PsiElement getRbrace() {
    return findNotNullChildByType(RBRACE);
  }

}
