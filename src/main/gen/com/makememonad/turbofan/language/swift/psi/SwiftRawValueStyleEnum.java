// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SwiftRawValueStyleEnum extends PsiElement {

  @NotNull
  SwiftEnumDeclarationName getEnumDeclarationName();

  @Nullable
  SwiftGenericParameterClause getGenericParameterClause();

  @NotNull
  List<SwiftProtocolCompositionType> getProtocolCompositionTypeList();

  @NotNull
  SwiftRawValueStyleEnumMembers getRawValueStyleEnumMembers();

  @NotNull
  List<SwiftType> getTypeList();

  @NotNull
  List<SwiftTypeIdentifier> getTypeIdentifierList();

  @NotNull
  SwiftTypeInheritanceClause getTypeInheritanceClause();

  @NotNull
  PsiElement getKwEnum();

  @Nullable
  PsiElement getKwWhere();

  @NotNull
  PsiElement getLbrace();

  @NotNull
  PsiElement getRbrace();

}
