// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;

public interface SwiftExternalParameterNameHolder extends PsiNameIdentifierOwner {

  @NotNull
  SwiftExternalParameterName getExternalParameterName();

  @Nullable String getName();

  @Nullable PsiElement getNameIdentifier();

  @NotNull PsiElement setName(@NotNull String newName);

}
