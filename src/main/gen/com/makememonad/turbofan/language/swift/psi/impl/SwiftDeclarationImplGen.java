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

public class SwiftDeclarationImplGen extends ASTWrapperPsiElement implements SwiftDeclaration {

  public SwiftDeclarationImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SwiftVisitor visitor) {
    visitor.visitDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SwiftVisitor) accept((SwiftVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SwiftActorDeclaration getActorDeclaration() {
    return findChildByClass(SwiftActorDeclaration.class);
  }

  @Override
  @Nullable
  public SwiftClassDeclaration getClassDeclaration() {
    return findChildByClass(SwiftClassDeclaration.class);
  }

  @Override
  @Nullable
  public SwiftConstantDeclaration getConstantDeclaration() {
    return findChildByClass(SwiftConstantDeclaration.class);
  }

  @Override
  @Nullable
  public SwiftDeinitializerDeclaration getDeinitializerDeclaration() {
    return findChildByClass(SwiftDeinitializerDeclaration.class);
  }

  @Override
  @Nullable
  public SwiftEnumDeclaration getEnumDeclaration() {
    return findChildByClass(SwiftEnumDeclaration.class);
  }

  @Override
  @Nullable
  public SwiftExtensionDeclaration getExtensionDeclaration() {
    return findChildByClass(SwiftExtensionDeclaration.class);
  }

  @Override
  @Nullable
  public SwiftFunctionDeclaration getFunctionDeclaration() {
    return findChildByClass(SwiftFunctionDeclaration.class);
  }

  @Override
  @Nullable
  public SwiftImportDeclaration getImportDeclaration() {
    return findChildByClass(SwiftImportDeclaration.class);
  }

  @Override
  @Nullable
  public SwiftInitializerDeclaration getInitializerDeclaration() {
    return findChildByClass(SwiftInitializerDeclaration.class);
  }

  @Override
  @Nullable
  public SwiftOperatorDeclaration getOperatorDeclaration() {
    return findChildByClass(SwiftOperatorDeclaration.class);
  }

  @Override
  @Nullable
  public SwiftPrecedenceGroupDeclaration getPrecedenceGroupDeclaration() {
    return findChildByClass(SwiftPrecedenceGroupDeclaration.class);
  }

  @Override
  @Nullable
  public SwiftProtocolDeclaration getProtocolDeclaration() {
    return findChildByClass(SwiftProtocolDeclaration.class);
  }

  @Override
  @Nullable
  public SwiftStructDeclaration getStructDeclaration() {
    return findChildByClass(SwiftStructDeclaration.class);
  }

  @Override
  @Nullable
  public SwiftSubscriptDeclaration getSubscriptDeclaration() {
    return findChildByClass(SwiftSubscriptDeclaration.class);
  }

  @Override
  @Nullable
  public SwiftTypealiasDeclaration getTypealiasDeclaration() {
    return findChildByClass(SwiftTypealiasDeclaration.class);
  }

  @Override
  @Nullable
  public SwiftVariableDeclaration getVariableDeclaration() {
    return findChildByClass(SwiftVariableDeclaration.class);
  }

}
