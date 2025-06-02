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

public class SwiftClassMembersImplGen extends ASTWrapperPsiElement implements SwiftClassMembers {

  public SwiftClassMembersImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitClassMembers(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SwiftVisitor) accept((SwiftVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SwiftCompilerControlStatement> getCompilerControlStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftCompilerControlStatement.class);
  }

  @Override
  @NotNull
  public List<SwiftDeclaration> getDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SwiftDeclaration.class);
  }

}
