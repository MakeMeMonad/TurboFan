// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftUnionStyleEnum extends PsiElement {

  @NotNull
  SwiftEnumDeclarationName getEnumDeclarationName();

  @Nullable
  SwiftGenericParameterClause getGenericParameterClause();

  @NotNull
  List<SwiftProtocolCompositionType> getProtocolCompositionTypeList();

  @NotNull
  List<SwiftType> getTypeList();

  @NotNull
  List<SwiftTypeIdentifier> getTypeIdentifierList();

  @Nullable
  SwiftTypeInheritanceClause getTypeInheritanceClause();

  @Nullable
  SwiftUnionStyleEnumMembers getUnionStyleEnumMembers();

  @NotNull
  PsiElement getKwEnum();

  @Nullable
  PsiElement getKwIndirect();

  @Nullable
  PsiElement getKwWhere();

  @NotNull
  PsiElement getLbrace();

  @NotNull
  PsiElement getRbrace();

}
