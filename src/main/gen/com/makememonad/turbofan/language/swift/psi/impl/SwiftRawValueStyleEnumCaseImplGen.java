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

public class SwiftRawValueStyleEnumCaseImplGen extends ASTWrapperPsiElement implements SwiftRawValueStyleEnumCase {

  public SwiftRawValueStyleEnumCaseImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitRawValueStyleEnumCase(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SwiftVisitor) accept((SwiftVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SwiftEnumCaseName getEnumCaseName() {
    return findNotNullChildByClass(SwiftEnumCaseName.class);
  }

  @Override
  @Nullable
  public SwiftNumericLiteral getNumericLiteral() {
    return findChildByClass(SwiftNumericLiteral.class);
  }

  @Override
  @Nullable
  public PsiElement getKwFalse() {
    return findChildByType(KW_FALSE);
  }

  @Override
  @Nullable
  public PsiElement getKwTrue() {
    return findChildByType(KW_TRUE);
  }

  @Override
  @Nullable
  public PsiElement getMultilineStringEnd() {
    return findChildByType(MULTILINE_STRING_END);
  }

  @Override
  @Nullable
  public PsiElement getMultilineStringStart() {
    return findChildByType(MULTILINE_STRING_START);
  }

  @Override
  @Nullable
  public PsiElement getOpAssignment() {
    return findChildByType(OP_ASSIGNMENT);
  }

  @Override
  @Nullable
  public PsiElement getStringEnd() {
    return findChildByType(STRING_END);
  }

  @Override
  @Nullable
  public PsiElement getStringStart() {
    return findChildByType(STRING_START);
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
