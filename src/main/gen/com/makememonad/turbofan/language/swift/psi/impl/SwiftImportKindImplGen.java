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

public class SwiftImportKindImplGen extends ASTWrapperPsiElement implements SwiftImportKind {

  public SwiftImportKindImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitImportKind(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SwiftVisitor) accept((SwiftVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getKwClass() {
    return findChildByType(KW_CLASS);
  }

  @Override
  @Nullable
  public PsiElement getKwEnum() {
    return findChildByType(KW_ENUM);
  }

  @Override
  @Nullable
  public PsiElement getKwFunc() {
    return findChildByType(KW_FUNC);
  }

  @Override
  @Nullable
  public PsiElement getKwLet() {
    return findChildByType(KW_LET);
  }

  @Override
  @Nullable
  public PsiElement getKwLowerProtocolDecl() {
    return findChildByType(KW_LOWER_PROTOCOL_DECL);
  }

  @Override
  @Nullable
  public PsiElement getKwStruct() {
    return findChildByType(KW_STRUCT);
  }

  @Override
  @Nullable
  public PsiElement getKwTypealias() {
    return findChildByType(KW_TYPEALIAS);
  }

  @Override
  @Nullable
  public PsiElement getKwVar() {
    return findChildByType(KW_VAR);
  }

}
