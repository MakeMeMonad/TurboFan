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

public class SwiftCompilerControlStatementImplGen extends ASTWrapperPsiElement implements SwiftCompilerControlStatement {

  public SwiftCompilerControlStatementImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitCompilerControlStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SwiftVisitor) accept((SwiftVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SwiftConditionalCompilationBlock getConditionalCompilationBlock() {
    return findChildByClass(SwiftConditionalCompilationBlock.class);
  }

  @Override
  @Nullable
  public PsiElement getComma() {
    return findChildByType(COMMA);
  }

  @Override
  @Nullable
  public PsiElement getDecimalLiteral() {
    return findChildByType(DECIMAL_LITERAL);
  }

  @Override
  @Nullable
  public PsiElement getKwPndSourcelocation() {
    return findChildByType(KW_PND_SOURCELOCATION);
  }

  @Override
  @Nullable
  public PsiElement getLparen() {
    return findChildByType(LPAREN);
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
  public PsiElement getRparen() {
    return findChildByType(RPAREN);
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

}
