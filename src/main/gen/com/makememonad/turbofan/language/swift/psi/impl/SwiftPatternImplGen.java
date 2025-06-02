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

public class SwiftPatternImplGen extends ASTWrapperPsiElement implements SwiftPattern {

  public SwiftPatternImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitPattern(this);
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
  public SwiftEnumCaseName getEnumCaseName() {
    return findChildByClass(SwiftEnumCaseName.class);
  }

  @Override
  @Nullable
  public SwiftExpression getExpression() {
    return findChildByClass(SwiftExpression.class);
  }

  @Override
  @Nullable
  public SwiftIdentifierPattern getIdentifierPattern() {
    return findChildByClass(SwiftIdentifierPattern.class);
  }

  @Override
  @Nullable
  public SwiftPattern getPattern() {
    return findChildByClass(SwiftPattern.class);
  }

  @Override
  @Nullable
  public SwiftTuplePattern getTuplePattern() {
    return findChildByClass(SwiftTuplePattern.class);
  }

  @Override
  @NotNull
  public List<SwiftType> getTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftType.class);
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
  @Nullable
  public PsiElement getDot() {
    return findChildByType(DOT);
  }

  @Override
  @Nullable
  public PsiElement getKwInout() {
    return findChildByType(KW_INOUT);
  }

  @Override
  @Nullable
  public PsiElement getKwLet() {
    return findChildByType(KW_LET);
  }

  @Override
  @Nullable
  public PsiElement getKwUnderscore() {
    return findChildByType(KW_UNDERSCORE);
  }

  @Override
  @Nullable
  public PsiElement getKwVar() {
    return findChildByType(KW_VAR);
  }

  @Override
  @Nullable
  public PsiElement getOpQuestion() {
    return findChildByType(OP_QUESTION);
  }

  @Override
  @Nullable
  public PsiElement getOpTypeCast() {
    return findChildByType(OP_TYPE_CAST);
  }

  @Override
  @Nullable
  public PsiElement getOpTypeCheck() {
    return findChildByType(OP_TYPE_CHECK);
  }

}
