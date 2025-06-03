// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftConditionalCompilationBlock extends PsiElement {

  @NotNull
  List<SwiftImportPath> getImportPathList();

  @NotNull
  List<SwiftStatements> getStatementsList();

  @Nullable
  PsiElement getKwPndElse();

  @NotNull
  PsiElement getKwPndEndif();

  @NotNull
  PsiElement getKwPndIf();

}
