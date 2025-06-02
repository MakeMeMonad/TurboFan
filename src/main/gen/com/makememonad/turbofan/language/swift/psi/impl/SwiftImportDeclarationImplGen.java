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

public class SwiftImportDeclarationImplGen extends ASTWrapperPsiElement implements SwiftImportDeclaration {

  public SwiftImportDeclarationImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitImportDeclaration(this);
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
  public SwiftImportKind getImportKind() {
    return findChildByClass(SwiftImportKind.class);
  }

  @Override
  @NotNull
  public SwiftImportPath getImportPath() {
    return findNotNullChildByClass(SwiftImportPath.class);
  }

  @Override
  @NotNull
  public PsiElement getKwImport() {
    return findNotNullChildByType(KW_IMPORT);
  }

  @Override
  public @Nullable String getName() {
    return SwiftPsiImplUtil.getName(this);
  }

  @Override
  public @Nullable PsiElement getNameIdentifier() {
    return SwiftPsiImplUtil.getNameIdentifier(this);
  }

}
