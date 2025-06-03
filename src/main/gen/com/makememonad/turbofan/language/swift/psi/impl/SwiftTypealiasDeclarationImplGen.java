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

public class SwiftTypealiasDeclarationImplGen extends ASTWrapperPsiElement implements SwiftTypealiasDeclaration {

  public SwiftTypealiasDeclarationImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitTypealiasDeclaration(this);
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
  public SwiftGenericParameterClause getGenericParameterClause() {
    return findChildByClass(SwiftGenericParameterClause.class);
  }

  @Override
  @NotNull
  public SwiftTypealiasAssignment getTypealiasAssignment() {
    return findNotNullChildByClass(SwiftTypealiasAssignment.class);
  }

  @Override
  @NotNull
  public SwiftTypealiasName getTypealiasName() {
    return findNotNullChildByClass(SwiftTypealiasName.class);
  }

  @Override
  @Nullable
  public PsiElement getKwFileprivate() {
    return findChildByType(KW_FILEPRIVATE);
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
  @NotNull
  public PsiElement getKwTypealias() {
    return findNotNullChildByType(KW_TYPEALIAS);
  }

  @Override
  @Nullable
  public PsiElement getLparen() {
    return findChildByType(LPAREN);
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
