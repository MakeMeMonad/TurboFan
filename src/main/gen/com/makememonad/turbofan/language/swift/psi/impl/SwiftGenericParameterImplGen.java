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

public class SwiftGenericParameterImplGen extends ASTWrapperPsiElement implements SwiftGenericParameter {

  public SwiftGenericParameterImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitGenericParameter(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SwiftVisitor) accept((SwiftVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SwiftGenericParameterTypeName getGenericParameterTypeName() {
    return findNotNullChildByClass(SwiftGenericParameterTypeName.class);
  }

  @Override
  @Nullable
  public SwiftProtocolCompositionType getProtocolCompositionType() {
    return findChildByClass(SwiftProtocolCompositionType.class);
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
