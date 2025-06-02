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

public class SwiftProtocolVariableDeclarationImplGen extends ASTWrapperPsiElement implements SwiftProtocolVariableDeclaration {

  public SwiftProtocolVariableDeclarationImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitProtocolVariableDeclaration(this);
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
  public SwiftGetterSetterKeywordBlock getGetterSetterKeywordBlock() {
    return findNotNullChildByClass(SwiftGetterSetterKeywordBlock.class);
  }

  @Override
  @NotNull
  public SwiftType getType() {
    return findNotNullChildByClass(SwiftType.class);
  }

  @Override
  @NotNull
  public SwiftVariableDeclarationHead getVariableDeclarationHead() {
    return findNotNullChildByClass(SwiftVariableDeclarationHead.class);
  }

  @Override
  @NotNull
  public SwiftVariableName getVariableName() {
    return findNotNullChildByClass(SwiftVariableName.class);
  }

  @Override
  @NotNull
  public PsiElement getColon() {
    return findNotNullChildByType(COLON);
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
