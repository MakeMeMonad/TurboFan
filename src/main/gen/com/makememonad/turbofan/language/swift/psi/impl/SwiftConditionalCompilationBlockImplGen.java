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

public class SwiftConditionalCompilationBlockImplGen extends ASTWrapperPsiElement implements SwiftConditionalCompilationBlock {

  public SwiftConditionalCompilationBlockImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitConditionalCompilationBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SwiftVisitor) accept((SwiftVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SwiftImportPath> getImportPathList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftImportPath.class);
  }

  @Override
  @NotNull
  public List<SwiftStatements> getStatementsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftStatements.class);
  }

  @Override
  @Nullable
  public PsiElement getKwPndElse() {
    return findChildByType(KW_PND_ELSE);
  }

  @Override
  @NotNull
  public PsiElement getKwPndEndif() {
    return findNotNullChildByType(KW_PND_ENDIF);
  }

  @Override
  @NotNull
  public PsiElement getKwPndIf() {
    return findNotNullChildByType(KW_PND_IF);
  }

}
