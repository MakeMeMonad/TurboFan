// This is a generated file. Not intended for manual editing.
package com.makememonad.turbofan.language.swift.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.makememonad.turbofan.language.swift.psi.SwiftTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class SwiftParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return swiftFile(b, l + 1);
  }

  /* ********************************************************** */
  // KW_PRIVATE (LPAREN KW_SET RPAREN)?
  //   | KW_FILEPRIVATE (LPAREN KW_SET RPAREN)?
  //   | KW_INTERNAL (LPAREN KW_SET RPAREN)?
  //   | KW_PACKAGE (LPAREN KW_SET RPAREN)?
  //   | KW_PUBLIC (LPAREN KW_SET RPAREN)?
  //   | KW_OPEN (LPAREN KW_SET RPAREN)?
  static boolean access_level_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_level_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = access_level_modifier_0(b, l + 1);
    if (!r) r = access_level_modifier_1(b, l + 1);
    if (!r) r = access_level_modifier_2(b, l + 1);
    if (!r) r = access_level_modifier_3(b, l + 1);
    if (!r) r = access_level_modifier_4(b, l + 1);
    if (!r) r = access_level_modifier_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_PRIVATE (LPAREN KW_SET RPAREN)?
  private static boolean access_level_modifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_level_modifier_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_PRIVATE);
    r = r && access_level_modifier_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LPAREN KW_SET RPAREN)?
  private static boolean access_level_modifier_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_level_modifier_0_1")) return false;
    access_level_modifier_0_1_0(b, l + 1);
    return true;
  }

  // LPAREN KW_SET RPAREN
  private static boolean access_level_modifier_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_level_modifier_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, KW_SET, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_FILEPRIVATE (LPAREN KW_SET RPAREN)?
  private static boolean access_level_modifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_level_modifier_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FILEPRIVATE);
    r = r && access_level_modifier_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LPAREN KW_SET RPAREN)?
  private static boolean access_level_modifier_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_level_modifier_1_1")) return false;
    access_level_modifier_1_1_0(b, l + 1);
    return true;
  }

  // LPAREN KW_SET RPAREN
  private static boolean access_level_modifier_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_level_modifier_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, KW_SET, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_INTERNAL (LPAREN KW_SET RPAREN)?
  private static boolean access_level_modifier_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_level_modifier_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_INTERNAL);
    r = r && access_level_modifier_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LPAREN KW_SET RPAREN)?
  private static boolean access_level_modifier_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_level_modifier_2_1")) return false;
    access_level_modifier_2_1_0(b, l + 1);
    return true;
  }

  // LPAREN KW_SET RPAREN
  private static boolean access_level_modifier_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_level_modifier_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, KW_SET, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_PACKAGE (LPAREN KW_SET RPAREN)?
  private static boolean access_level_modifier_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_level_modifier_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_PACKAGE);
    r = r && access_level_modifier_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LPAREN KW_SET RPAREN)?
  private static boolean access_level_modifier_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_level_modifier_3_1")) return false;
    access_level_modifier_3_1_0(b, l + 1);
    return true;
  }

  // LPAREN KW_SET RPAREN
  private static boolean access_level_modifier_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_level_modifier_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, KW_SET, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_PUBLIC (LPAREN KW_SET RPAREN)?
  private static boolean access_level_modifier_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_level_modifier_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_PUBLIC);
    r = r && access_level_modifier_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LPAREN KW_SET RPAREN)?
  private static boolean access_level_modifier_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_level_modifier_4_1")) return false;
    access_level_modifier_4_1_0(b, l + 1);
    return true;
  }

  // LPAREN KW_SET RPAREN
  private static boolean access_level_modifier_4_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_level_modifier_4_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, KW_SET, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_OPEN (LPAREN KW_SET RPAREN)?
  private static boolean access_level_modifier_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_level_modifier_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_OPEN);
    r = r && access_level_modifier_5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LPAREN KW_SET RPAREN)?
  private static boolean access_level_modifier_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_level_modifier_5_1")) return false;
    access_level_modifier_5_1_0(b, l + 1);
    return true;
  }

  // LPAREN KW_SET RPAREN
  private static boolean access_level_modifier_5_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_level_modifier_5_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, KW_SET, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACE actor-members? RBRACE
  static boolean actor_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actor_body")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && actor_body_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // actor-members?
  private static boolean actor_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actor_body_1")) return false;
    actor_members(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // attributes? access-level-modifier? KW_ACTOR actor-name generic-parameter-clause? type-inheritance-clause? generic-where-clause? actor-body
  public static boolean actor_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actor_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACTOR_DECLARATION, "<actor declaration>");
    r = actor_declaration_0(b, l + 1);
    r = r && actor_declaration_1(b, l + 1);
    r = r && consumeToken(b, KW_ACTOR);
    r = r && actor_name(b, l + 1);
    r = r && actor_declaration_4(b, l + 1);
    r = r && actor_declaration_5(b, l + 1);
    r = r && actor_declaration_6(b, l + 1);
    r = r && actor_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attributes?
  private static boolean actor_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actor_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // access-level-modifier?
  private static boolean actor_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actor_declaration_1")) return false;
    access_level_modifier(b, l + 1);
    return true;
  }

  // generic-parameter-clause?
  private static boolean actor_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actor_declaration_4")) return false;
    generic_parameter_clause(b, l + 1);
    return true;
  }

  // type-inheritance-clause?
  private static boolean actor_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actor_declaration_5")) return false;
    type_inheritance_clause(b, l + 1);
    return true;
  }

  // generic-where-clause?
  private static boolean actor_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actor_declaration_6")) return false;
    generic_where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // declaration | compiler-control-statement
  static boolean actor_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actor_member")) return false;
    boolean r;
    r = declaration(b, l + 1);
    if (!r) r = compiler_control_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // actor-member (actor-member)*
  static boolean actor_members(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actor_members")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = actor_member(b, l + 1);
    r = r && actor_members_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (actor-member)*
  private static boolean actor_members_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actor_members_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!actor_members_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "actor_members_1", c)) break;
    }
    return true;
  }

  // (actor-member)
  private static boolean actor_members_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actor_members_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = actor_member(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean actor_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actor_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, ACTOR_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // KW_PND_AVAILABLE
  //   | KW_PND_COLORLITERAL
  //   | KW_PND_ELSE
  //   | KW_PND_ELSEIF
  //   | KW_PND_ENDIF
  //   | KW_PND_FILELITERAL
  //   | KW_PND_IF
  //   | KW_PND_IMAGELITERAL
  //   | KW_PND_KEYPATH
  //   | KW_PND_SELECTOR
  //   | KW_PND_SOURCELOCATION
  //   | KW_PND_UNAVAILABLE
  //   | KW_UPPER_ANY
  //   | KW_LOWER_ANY
  //   | KW_ASSOCIATEDTYPE
  //   | KW_AWAIT
  //   | KW_BORROWING
  //   | KW_BREAK
  //   | KW_CASE
  //   | KW_CLASS
  //   | KW_CONSUMING
  //   | KW_CONTINUE
  //   | KW_DEFAULT
  //   | KW_DEFER
  //   | KW_DEINIT
  //   | KW_DO
  //   | KW_ELSE
  //   | KW_ENUM
  //   | KW_EXTENSION
  //   | KW_FALLTHROUGH
  //   | KW_FALSE
  //   | KW_FILEPRIVATE
  //   | KW_FOR
  //   | KW_FUNC
  //   | KW_GUARD
  //   | KW_IF
  //   | KW_IMPORT
  //   | KW_IN
  //   | KW_INIT
  //   | KW_INOUT
  //   | KW_INTERNAL
  //   | KW_LET
  //   | KW_NIL
  //   | KW_NONISOLATED
  //   | KW_OPEN
  //   | KW_OPERATOR
  //   | KW_PRECEDENCEGROUP
  //   | KW_PRIVATE
  //   | KW_LOWER_PROTOCOL_DECL
  //   | KW_PUBLIC
  //   | KW_REPEAT
  //   | KW_RETURN
  //   | KW_LOWER_SELF
  //   | KW_UPPER_SELF
  //   | KW_STATIC
  //   | KW_STRUCT
  //   | KW_SUPER
  //   | KW_SWITCH
  //   | KW_SUBSCRIPT
  //   | KW_THROWS
  //   | KW_TRUE
  //   | KW_TRY
  //   | KW_TYPEALIAS
  //   | KW_VAR
  //   | KW_WHERE
  //   | KW_WHILE
  //   | KW_CATCH
  //   | KW_THROW
  //   | KW_RETHROWS
  //   | KW_ASSOCIATIVITY
  //   | KW_ASYNC
  //   | KW_CONVENIENCE
  //   | KW_DIDSET
  //   | KW_DYNAMIC
  //   | KW_FINAL
  //   | KW_GET
  //   | KW_INDIRECT
  //   | KW_INFIX
  //   | KW_LAZY
  //   | KW_LEFT
  //   | KW_MUTATING
  //   | KW_NONE
  //   | KW_NONMUTATING
  //   | KW_OPTIONAL
  //   | KW_OVERRIDE
  //   | KW_PACKAGE
  //   | KW_POSTFIX
  //   | KW_PRECEDENCE
  //   | KW_PREFIX
  //   | KW_UPPER_PROTOCOL
  //   | KW_REQUIRED
  //   | KW_RIGHT
  //   | KW_SET
  //   | KW_SOME
  //   | KW_UPPER_TYPE
  //   | KW_UNOWNED
  //   | KW_WEAK
  //   | KW_WILLSET
  static boolean any_keyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any_keyword")) return false;
    boolean r;
    r = consumeToken(b, KW_PND_AVAILABLE);
    if (!r) r = consumeToken(b, KW_PND_COLORLITERAL);
    if (!r) r = consumeToken(b, KW_PND_ELSE);
    if (!r) r = consumeToken(b, KW_PND_ELSEIF);
    if (!r) r = consumeToken(b, KW_PND_ENDIF);
    if (!r) r = consumeToken(b, KW_PND_FILELITERAL);
    if (!r) r = consumeToken(b, KW_PND_IF);
    if (!r) r = consumeToken(b, KW_PND_IMAGELITERAL);
    if (!r) r = consumeToken(b, KW_PND_KEYPATH);
    if (!r) r = consumeToken(b, KW_PND_SELECTOR);
    if (!r) r = consumeToken(b, KW_PND_SOURCELOCATION);
    if (!r) r = consumeToken(b, KW_PND_UNAVAILABLE);
    if (!r) r = consumeToken(b, KW_UPPER_ANY);
    if (!r) r = consumeToken(b, KW_LOWER_ANY);
    if (!r) r = consumeToken(b, KW_ASSOCIATEDTYPE);
    if (!r) r = consumeToken(b, KW_AWAIT);
    if (!r) r = consumeToken(b, KW_BORROWING);
    if (!r) r = consumeToken(b, KW_BREAK);
    if (!r) r = consumeToken(b, KW_CASE);
    if (!r) r = consumeToken(b, KW_CLASS);
    if (!r) r = consumeToken(b, KW_CONSUMING);
    if (!r) r = consumeToken(b, KW_CONTINUE);
    if (!r) r = consumeToken(b, KW_DEFAULT);
    if (!r) r = consumeToken(b, KW_DEFER);
    if (!r) r = consumeToken(b, KW_DEINIT);
    if (!r) r = consumeToken(b, KW_DO);
    if (!r) r = consumeToken(b, KW_ELSE);
    if (!r) r = consumeToken(b, KW_ENUM);
    if (!r) r = consumeToken(b, KW_EXTENSION);
    if (!r) r = consumeToken(b, KW_FALLTHROUGH);
    if (!r) r = consumeToken(b, KW_FALSE);
    if (!r) r = consumeToken(b, KW_FILEPRIVATE);
    if (!r) r = consumeToken(b, KW_FOR);
    if (!r) r = consumeToken(b, KW_FUNC);
    if (!r) r = consumeToken(b, KW_GUARD);
    if (!r) r = consumeToken(b, KW_IF);
    if (!r) r = consumeToken(b, KW_IMPORT);
    if (!r) r = consumeToken(b, KW_IN);
    if (!r) r = consumeToken(b, KW_INIT);
    if (!r) r = consumeToken(b, KW_INOUT);
    if (!r) r = consumeToken(b, KW_INTERNAL);
    if (!r) r = consumeToken(b, KW_LET);
    if (!r) r = consumeToken(b, KW_NIL);
    if (!r) r = consumeToken(b, KW_NONISOLATED);
    if (!r) r = consumeToken(b, KW_OPEN);
    if (!r) r = consumeToken(b, KW_OPERATOR);
    if (!r) r = consumeToken(b, KW_PRECEDENCEGROUP);
    if (!r) r = consumeToken(b, KW_PRIVATE);
    if (!r) r = consumeToken(b, KW_LOWER_PROTOCOL_DECL);
    if (!r) r = consumeToken(b, KW_PUBLIC);
    if (!r) r = consumeToken(b, KW_REPEAT);
    if (!r) r = consumeToken(b, KW_RETURN);
    if (!r) r = consumeToken(b, KW_LOWER_SELF);
    if (!r) r = consumeToken(b, KW_UPPER_SELF);
    if (!r) r = consumeToken(b, KW_STATIC);
    if (!r) r = consumeToken(b, KW_STRUCT);
    if (!r) r = consumeToken(b, KW_SUPER);
    if (!r) r = consumeToken(b, KW_SWITCH);
    if (!r) r = consumeToken(b, KW_SUBSCRIPT);
    if (!r) r = consumeToken(b, KW_THROWS);
    if (!r) r = consumeToken(b, KW_TRUE);
    if (!r) r = consumeToken(b, KW_TRY);
    if (!r) r = consumeToken(b, KW_TYPEALIAS);
    if (!r) r = consumeToken(b, KW_VAR);
    if (!r) r = consumeToken(b, KW_WHERE);
    if (!r) r = consumeToken(b, KW_WHILE);
    if (!r) r = consumeToken(b, KW_CATCH);
    if (!r) r = consumeToken(b, KW_THROW);
    if (!r) r = consumeToken(b, KW_RETHROWS);
    if (!r) r = consumeToken(b, KW_ASSOCIATIVITY);
    if (!r) r = consumeToken(b, KW_ASYNC);
    if (!r) r = consumeToken(b, KW_CONVENIENCE);
    if (!r) r = consumeToken(b, KW_DIDSET);
    if (!r) r = consumeToken(b, KW_DYNAMIC);
    if (!r) r = consumeToken(b, KW_FINAL);
    if (!r) r = consumeToken(b, KW_GET);
    if (!r) r = consumeToken(b, KW_INDIRECT);
    if (!r) r = consumeToken(b, KW_INFIX);
    if (!r) r = consumeToken(b, KW_LAZY);
    if (!r) r = consumeToken(b, KW_LEFT);
    if (!r) r = consumeToken(b, KW_MUTATING);
    if (!r) r = consumeToken(b, KW_NONE);
    if (!r) r = consumeToken(b, KW_NONMUTATING);
    if (!r) r = consumeToken(b, KW_OPTIONAL);
    if (!r) r = consumeToken(b, KW_OVERRIDE);
    if (!r) r = consumeToken(b, KW_PACKAGE);
    if (!r) r = consumeToken(b, KW_POSTFIX);
    if (!r) r = consumeToken(b, KW_PRECEDENCE);
    if (!r) r = consumeToken(b, KW_PREFIX);
    if (!r) r = consumeToken(b, KW_UPPER_PROTOCOL);
    if (!r) r = consumeToken(b, KW_REQUIRED);
    if (!r) r = consumeToken(b, KW_RIGHT);
    if (!r) r = consumeToken(b, KW_SET);
    if (!r) r = consumeToken(b, KW_SOME);
    if (!r) r = consumeToken(b, KW_UPPER_TYPE);
    if (!r) r = consumeToken(b, KW_UNOWNED);
    if (!r) r = consumeToken(b, KW_WEAK);
    if (!r) r = consumeToken(b, KW_WILLSET);
    return r;
  }

  /* ********************************************************** */
  // "i386" | "x86_64" | "arm" | "arm64"
  static boolean architecture(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "architecture")) return false;
    boolean r;
    r = consumeToken(b, "i386");
    if (!r) r = consumeToken(b, "x86_64");
    if (!r) r = consumeToken(b, "arm");
    if (!r) r = consumeToken(b, "arm64");
    return r;
  }

  /* ********************************************************** */
  // misc-wrapped-identifier-token COLON
  static boolean argument_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = misc_wrapped_identifier_token(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // argument-name (argument-name)*
  static boolean argument_names(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_names")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = argument_name(b, l + 1);
    r = r && argument_names_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (argument-name)*
  private static boolean argument_names_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_names_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!argument_names_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "argument_names_1", c)) break;
    }
    return true;
  }

  // (argument-name)
  private static boolean argument_names_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_names_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = argument_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET array-literal-items? COMMA? RBRACKET
  static boolean array_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_literal")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && array_literal_1(b, l + 1);
    r = r && array_literal_2(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // array-literal-items?
  private static boolean array_literal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_literal_1")) return false;
    array_literal_items(b, l + 1);
    return true;
  }

  // COMMA?
  private static boolean array_literal_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_literal_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // expression (COMMA expression)*
  static boolean array_literal_items(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_literal_items")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && array_literal_items_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA expression)*
  private static boolean array_literal_items_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_literal_items_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!array_literal_items_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "array_literal_items_1", c)) break;
    }
    return true;
  }

  // COMMA expression
  private static boolean array_literal_items_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_literal_items_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET type RBRACKET
  static boolean array_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OP_AT attribute-name attribute-argument-clause?
  public static boolean attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute")) return false;
    if (!nextTokenIs(b, OP_AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_AT);
    r = r && attribute_name(b, l + 1);
    r = r && attribute_2(b, l + 1);
    exit_section_(b, m, ATTRIBUTE, r);
    return r;
  }

  // attribute-argument-clause?
  private static boolean attribute_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_2")) return false;
    attribute_argument_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LPAREN balanced-tokens? RPAREN
  static boolean attribute_argument_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_argument_clause")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && attribute_argument_clause_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // balanced-tokens?
  private static boolean attribute_argument_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_argument_clause_1")) return false;
    balanced_tokens(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean attribute_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, ATTRIBUTE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // attribute (attribute)*
  static boolean attributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributes")) return false;
    if (!nextTokenIs(b, OP_AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attribute(b, l + 1);
    r = r && attributes_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (attribute)*
  private static boolean attributes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributes_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!attributes_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "attributes_1", c)) break;
    }
    return true;
  }

  // (attribute)
  private static boolean attributes_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributes_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // platform-name (DECIMAL_LITERAL | DECIMAL_FLOATING_POINT_LITERAL) | OP_MULT
  static boolean availability_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "availability_argument")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = availability_argument_0(b, l + 1);
    if (!r) r = consumeToken(b, OP_MULT);
    exit_section_(b, m, null, r);
    return r;
  }

  // platform-name (DECIMAL_LITERAL | DECIMAL_FLOATING_POINT_LITERAL)
  private static boolean availability_argument_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "availability_argument_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = platform_name(b, l + 1);
    r = r && availability_argument_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DECIMAL_LITERAL | DECIMAL_FLOATING_POINT_LITERAL
  private static boolean availability_argument_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "availability_argument_0_1")) return false;
    boolean r;
    r = consumeToken(b, DECIMAL_LITERAL);
    if (!r) r = consumeToken(b, DECIMAL_FLOATING_POINT_LITERAL);
    return r;
  }

  /* ********************************************************** */
  // availability-argument (COMMA availability-argument)*
  static boolean availability_arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "availability_arguments")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = availability_argument(b, l + 1);
    r = r && availability_arguments_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA availability-argument)*
  private static boolean availability_arguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "availability_arguments_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!availability_arguments_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "availability_arguments_1", c)) break;
    }
    return true;
  }

  // COMMA availability-argument
  private static boolean availability_arguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "availability_arguments_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && availability_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_PND_AVAILABLE (LPAREN availability-arguments RPAREN) | KW_PND_UNAVAILABLE (LPAREN availability-arguments RPAREN)
  static boolean availability_condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "availability_condition")) return false;
    if (!nextTokenIs(b, "", KW_PND_AVAILABLE, KW_PND_UNAVAILABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = availability_condition_0(b, l + 1);
    if (!r) r = availability_condition_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_PND_AVAILABLE (LPAREN availability-arguments RPAREN)
  private static boolean availability_condition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "availability_condition_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_PND_AVAILABLE);
    r = r && availability_condition_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN availability-arguments RPAREN
  private static boolean availability_condition_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "availability_condition_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && availability_arguments(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_PND_UNAVAILABLE (LPAREN availability-arguments RPAREN)
  private static boolean availability_condition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "availability_condition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_PND_UNAVAILABLE);
    r = r && availability_condition_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN availability-arguments RPAREN
  private static boolean availability_condition_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "availability_condition_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && availability_arguments(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // base-balanced-token | ((LPAREN | LBRACKET | LBRACE) base-balanced-token? (RPAREN | RBRACKET | RBRACE))
  static boolean balanced_token(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "balanced_token")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = base_balanced_token(b, l + 1);
    if (!r) r = balanced_token_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LPAREN | LBRACKET | LBRACE) base-balanced-token? (RPAREN | RBRACKET | RBRACE)
  private static boolean balanced_token_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "balanced_token_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = balanced_token_1_0(b, l + 1);
    r = r && balanced_token_1_1(b, l + 1);
    r = r && balanced_token_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN | LBRACKET | LBRACE
  private static boolean balanced_token_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "balanced_token_1_0")) return false;
    boolean r;
    r = consumeToken(b, LPAREN);
    if (!r) r = consumeToken(b, LBRACKET);
    if (!r) r = consumeToken(b, LBRACE);
    return r;
  }

  // base-balanced-token?
  private static boolean balanced_token_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "balanced_token_1_1")) return false;
    base_balanced_token(b, l + 1);
    return true;
  }

  // RPAREN | RBRACKET | RBRACE
  private static boolean balanced_token_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "balanced_token_1_2")) return false;
    boolean r;
    r = consumeToken(b, RPAREN);
    if (!r) r = consumeToken(b, RBRACKET);
    if (!r) r = consumeToken(b, RBRACE);
    return r;
  }

  /* ********************************************************** */
  // KW_UNDERSCORE
  //   | OP_TYPE_CAST_BANG
  //   | OP_TYPE_CAST_OPT
  //   | OP_TYPE_CAST
  //   | OP_TYPE_CHECK
  //   | OP_OVERFLOW_BITSHIFT_LEFT_AND_ASSIGNMENT
  //   | OP_OVERFLOW_BITSHIFT_RIGHT_AND_ASSIGNMENT
  //   | OP_TRIPLE_LANGLE
  //   | OP_TRIPLE_RANGLE
  //   | OP_IDENTICAL
  //   | OP_NOT_IDENTICAL
  //   | OP_BITSHIFT_LEFT_AND_ASSIGNMENT
  //   | OP_BITSHIFT_RIGHT_AND_ASSIGNMENT
  //   | OP_OVERFLOW_BITSHIFT_LEFT
  //   | OP_OVERFLOW_BITSHIFT_RIGHT
  //   | OP_HALFOPEN_RANGE
  //   | OP_CLOSED_RANGE
  //   | OP_POINTWISE_EQ
  //   | OP_POINTWISE_NOT_EQ
  //   | OP_OVERFLOW_ADD_AND_ASSIGNMENT
  //   | OP_OVERFLOW_SUB_AND_ASSIGNMENT
  //   | OP_OVERFLOW_MULT_AND_ASSIGNMENT
  //   | OP_POINTWISE_BITWISE_AND_AND_ASSIGNMENT
  //   | OP_POINTWISE_BITWISE_OR_AND_ASSIGNMENT
  //   | OP_POINTWISE_BITWISE_XOR_AND_ASSIGNMENT
  //   | OP_POINTWISE_LESS_THAN_OR_EQ
  //   | OP_POINTWISE_GREATER_THAN_OR_EQ
  //   | OP_EQ
  //   | OP_LOGICAL_AND
  //   | OP_OVERFLOW_ADD
  //   | OP_OVERFLOW_SUB
  //   | OP_OVERFLOW_MULT
  //   | OP_BITWISE_AND_ASSIGNMENT
  //   | OP_BITWISE_OR_ASSIGNMENT
  //   | OP_BITWISE_XOR_ASSIGNMENT
  //   | OP_PATTERN_MATCH
  //   | OP_NOT_EQ
  //   | OP_BITSHIFT_LEFT
  //   | OP_BITSHIFT_RIGHT
  //   | OP_LESS_THAN_OR_EQ
  //   | OP_GREATER_THAN_OR_EQ
  //   | OP_POINTWISE_LESS_THAN
  //   | OP_POINTWISE_GREATER_THAN
  //   | OP_ADD_ASSIGNMENT
  //   | OP_SUB_ASSIGNMENT
  //   | OP_MULT_ASSIGNMENT
  //   | OP_DIV_ASSIGNMENT
  //   | OP_MODULO_ASSIGNMENT
  //   | OP_LOGICAL_OR
  //   | OP_POINTWISE_BITWISE_OR
  //   | OP_POINTWISE_BITWISE_XOR
  //   | OP_POINTWISE_NOT
  //   | OP_NIL_COALESCING
  //   | OP_TERNARY_CONDITIONAL
  //   | FWD_ARROW
  //   | AT_SYMBOL
  //   | POUND
  //   | COMMA
  //   | COLON
  //   | SEMICOLON
  //   | DOT
  //   | BACKSLASH
  //   | FWDSLASH
  //   | OP_ASSIGNMENT
  //   | OP_ADD
  //   | OP_SUB
  //   | OP_MULT
  //   | OP_MODULO
  //   | OP_NOT
  //   | OP_LANGLE
  //   | OP_RANGLE
  //   | OP_BITWISE_AND
  //   | OP_BITWISE_OR
  //   | OP_BITWISE_XOR
  //   | OP_BITWISE_NOT
  //   | OP_QUESTION
  //   // LEXICAL TOKEN DEFINITIONS:
  //   // GENERAL/SHARED ACROSS STATES
  //   token QUOTED_IDENTIFIER
  //   token STRING_INTERPOLATION_START
  //   token STRING_INTERPOLATION_END
  //   token STRING_TEXT
  //   token STRING_START
  //   token STRING_END
  //   token STRING_ESCAPED_SEQUENCE
  //   token MULTILINE_STRING_TEXT
  //   token MULTILINE_STRING_START
  //   token MULTILINE_STRING_END
  //   token MULTILINE_STRING_ESCAPED_NEWLINE
  //   token MULTILINE_STRING_ESCAPED_SEQUENCE
  //   token EXTENDED_STRING_START
  //   token EXTENDED_STRING_END
  //   token EXTENDED_MULTILINE_STRING_START
  //   token EXTENDED_MULTILINE_STRING_END
  //   token SINGLELINE_COMMENT
  //   token COMMENT_TEXT
  //   token MULTILINE_COMMENT
  //   token MULTILINE_COMMENT_TEXT
  //   token MULTILINE_COMMENT_START
  //   token MULTILINE_COMMENT_END
  //   token REGEXP_LITERAL
  //   token REGEXP_LITERAL_START
  //   token REGEXP_LITERAL_END
  //   token REGEXP
  //   // KEYWORDS (Pound Sign #)
  //   token KW_PND_AVAILABLE
  //   token KW_PND_COLORLITERAL
  //   token KW_PND_ELSE
  //   token KW_PND_ELSEIF
  //   token KW_PND_ENDIF
  //   token KW_PND_FILELITERAL
  //   token KW_PND_IF
  //   token KW_PND_IMAGELITERAL
  //   token KW_PND_KEYPATH
  //   token KW_PND_SELECTOR
  //   token KW_PND_SOURCELOCATION
  //   token KW_PND_UNAVAILABLE
  //   // KEYWORDS reserved for DISTINCT USE
  //   token KW_UPPER_ANY
  //   token KW_LOWER_ANY
  //   token KW_ASSOCIATEDTYPE
  //   token KW_AWAIT
  //   token KW_BORROWING
  //   token KW_BREAK
  //   token KW_CASE
  //   token KW_CLASS
  //   token KW_CONSUMING
  //   token KW_CONTINUE
  //   token KW_DEFAULT
  //   token KW_DEFER
  //   token KW_DEINIT
  //   token KW_DO
  //   token KW_ELSE
  //   token KW_ENUM
  //   token KW_EXTENSION
  //   token KW_FALLTHROUGH
  //   token KW_FALSE
  //   token KW_FILEPRIVATE
  //   token KW_FOR
  //   token KW_FUNC
  //   token KW_GUARD
  //   token KW_IF
  //   token KW_IMPORT
  //   token KW_IN
  //   token KW_INIT
  //   token KW_INOUT
  //   token KW_INTERNAL
  //   token KW_LET
  //   token KW_NIL
  //   token KW_NONISOLATED
  //   token KW_OPEN
  //   token KW_OPERATOR
  //   token KW_PRECEDENCEGROUP
  //   token KW_PRIVATE
  //   token KW_LOWER_PROTOCOL_DECL
  //   token KW_PUBLIC
  //   token KW_REPEAT
  //   token KW_RETURN
  //   token KW_LOWER_SELF
  //   token KW_UPPER_SELF
  //   token KW_STATIC
  //   token KW_STRUCT
  //   token KW_SUPER
  //   token KW_SWITCH
  //   token KW_SUBSCRIPT
  //   token KW_THROWS
  //   token KW_TRUE
  //   token KW_TRY
  //   token KW_TYPEALIAS
  //   token KW_VAR
  //   token KW_WHERE
  //   token KW_WHILE
  //   // KEYWORDS reserved for DIFFERING USES depending on the context.
  //   token KW_CATCH
  //   token KW_THROW
  //   token KW_RETHROWS
  //   // KEYWORDS reserved ONLY IN PARTICULAR CONTEXTS. Outside the context in which they appear in the grammar, they can be used as identifiers.
  // token KW_ASSOCIATIVITY
  // token KW_ASYNC
  // token KW_CONVENIENCE
  // token KW_DIDSET
  // token KW_DYNAMIC
  // token KW_FINAL
  // token KW_GET
  // token KW_INDIRECT
  // token KW_INFIX
  // token KW_LAZY
  // token KW_LEFT
  // token KW_MUTATING
  // token KW_NONE
  // token KW_NONMUTATING
  // token KW_OPTIONAL
  // token KW_OVERRIDE
  // token KW_PACKAGE
  // token KW_POSTFIX
  // token KW_PRECEDENCE
  // token KW_PREFIX
  // token KW_UPPER_PROTOCOL
  // token KW_REQUIRED
  // token KW_RIGHT
  // token KW_SET
  // token KW_SOME
  // token KW_UPPER_TYPE
  // token KW_UNOWNED
  // token KW_WEAK
  // token KW_WILLSET
  //   // KEYWORDS reserved for PATTERNS
  //   token KW_UNDERSCORE
  //   // FLOATING POINT LITERALS
  //   token FLOATING_POINT_LITERAL
  //   token HEX_FLOATING_POINT_LITERAL
  //   token DECIMAL_FLOATING_POINT_LITERAL
  //   // INTEGER LITERALS
  //   token BINARY_LITERAL
  //   token OCTAL_LITERAL
  //   token HEX_LITERAL
  //   token DECIMAL_LITERAL
  //   // OPERATORS AND PUNCTUATION (Fixed String Literals)
  //   token OP_TYPE_CAST_BANG
  //   token OP_TYPE_CAST_OPT
  //   token OP_TYPE_CAST
  //   token OP_TYPE_CHECK
  //   token OP_OVERFLOW_BITSHIFT_LEFT_AND_ASSIGNMENT
  //   token OP_OVERFLOW_BITSHIFT_RIGHT_AND_ASSIGNMENT
  //   token OP_TRIPLE_LANGLE
  //   token OP_TRIPLE_RANGLE
  //   token OP_IDENTICAL
  //   token OP_NOT_IDENTICAL
  //   token OP_BITSHIFT_LEFT_AND_ASSIGNMENT
  //   token OP_BITSHIFT_RIGHT_AND_ASSIGNMENT
  //   token OP_OVERFLOW_BITSHIFT_LEFT
  //   token OP_OVERFLOW_BITSHIFT_RIGHT
  //   token OP_HALFOPEN_RANGE
  //   token OP_CLOSED_RANGE
  //   token OP_POINTWISE_EQ
  //   token OP_POINTWISE_NOT_EQ
  //   token OP_OVERFLOW_ADD_AND_ASSIGNMENT
  //   token OP_OVERFLOW_SUB_AND_ASSIGNMENT
  //   token OP_OVERFLOW_MULT_AND_ASSIGNMENT
  //   token OP_POINTWISE_BITWISE_AND_AND_ASSIGNMENT
  //   token OP_POINTWISE_BITWISE_OR_AND_ASSIGNMENT
  //   token OP_POINTWISE_BITWISE_XOR_AND_ASSIGNMENT
  //   token OP_POINTWISE_LESS_THAN_OR_EQ
  //   token OP_POINTWISE_GREATER_THAN_OR_EQ
  //   token OP_EQ
  //   token OP_LOGICAL_AND
  //   token OP_OVERFLOW_ADD
  //   token OP_OVERFLOW_SUB
  //   token OP_OVERFLOW_MULT
  //   token OP_BITWISE_AND_ASSIGNMENT
  //   token OP_BITWISE_OR_ASSIGNMENT
  //   token OP_BITWISE_XOR_ASSIGNMENT
  //   token OP_PATTERN_MATCH
  //   token OP_NOT_EQ
  //   token OP_BITSHIFT_LEFT
  //   token OP_BITSHIFT_RIGHT
  //   token OP_LESS_THAN_OR_EQ
  //   token OP_GREATER_THAN_OR_EQ
  //   token OP_POINTWISE_LESS_THAN
  //   token OP_POINTWISE_GREATER_THAN
  //   token OP_ADD_ASSIGNMENT
  //   token OP_SUB_ASSIGNMENT
  //   token OP_MULT_ASSIGNMENT
  //   token OP_DIV_ASSIGNMENT
  //   token OP_MODULO_ASSIGNMENT
  //   token OP_LOGICAL_OR
  //   token OP_POINTWISE_BITWISE_OR
  //   token OP_POINTWISE_BITWISE_XOR
  //   token OP_POINTWISE_NOT
  //   token OP_NIL_COALESCING
  //   token OP_TERNARY_CONDITIONAL
  //   token FWD_ARROW
  //   // SPECIAL: RPAREN
  //   token STRING_INTERPOLATION_END
  //   token RPAREN
  //   // FIXIE SINGLE-CHAR PUNCTUATION:
  //   token LPAREN
  //   token AT_SYMBOL
  //   token POUND
  //   token LBRACE
  //   token RBRACE
  //   token LBRACKET
  //   token RBRACKET
  //   token COMMA
  //   token COLON
  //   token SEMICOLON
  //   token DOT
  //   token BACKSLASH
  //   // FIXIE SINGLE-CHARs that CAN ALSO START CUSTOM OPERATORS
  //   token FWDSLASH
  //   token OP_ASSIGNMENT
  //   token OP_ADD
  //   token OP_SUB
  //   token OP_MULT
  //   token OP_MODULO
  //   token OP_NOT
  //   token OP_LANGLE
  //   token OP_RANGLE
  //   token OP_BITWISE_AND
  //   token OP_BITWISE_OR
  //   token OP_BITWISE_XOR
  //   token OP_BITWISE_NOT
  //   token OP_QUESTION
  //   // IMPLICIT PARAMETER NAMES, PROPERTY WRAPPER PROJECTIONS
  //   token IMPLICIT_PARAMETER_NAME
  //   token PROPERTY_WRAPPER_PROJECTION
  //   // CUSTOM OPERATORS
  //   token DOT_OPERATOR
  //   token OPERATOR
  //   token IDENTIFIER
  static boolean balanced_token_punctuation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "balanced_token_punctuation")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_UNDERSCORE);
    if (!r) r = consumeToken(b, OP_TYPE_CAST_BANG);
    if (!r) r = consumeToken(b, OP_TYPE_CAST_OPT);
    if (!r) r = consumeToken(b, OP_TYPE_CAST);
    if (!r) r = consumeToken(b, OP_TYPE_CHECK);
    if (!r) r = consumeToken(b, OP_OVERFLOW_BITSHIFT_LEFT_AND_ASSIGNMENT);
    if (!r) r = consumeToken(b, OP_OVERFLOW_BITSHIFT_RIGHT_AND_ASSIGNMENT);
    if (!r) r = consumeToken(b, OP_TRIPLE_LANGLE);
    if (!r) r = consumeToken(b, OP_TRIPLE_RANGLE);
    if (!r) r = consumeToken(b, OP_IDENTICAL);
    if (!r) r = consumeToken(b, OP_NOT_IDENTICAL);
    if (!r) r = consumeToken(b, OP_BITSHIFT_LEFT_AND_ASSIGNMENT);
    if (!r) r = consumeToken(b, OP_BITSHIFT_RIGHT_AND_ASSIGNMENT);
    if (!r) r = consumeToken(b, OP_OVERFLOW_BITSHIFT_LEFT);
    if (!r) r = consumeToken(b, OP_OVERFLOW_BITSHIFT_RIGHT);
    if (!r) r = consumeToken(b, OP_HALFOPEN_RANGE);
    if (!r) r = consumeToken(b, OP_CLOSED_RANGE);
    if (!r) r = consumeToken(b, OP_POINTWISE_EQ);
    if (!r) r = consumeToken(b, OP_POINTWISE_NOT_EQ);
    if (!r) r = consumeToken(b, OP_OVERFLOW_ADD_AND_ASSIGNMENT);
    if (!r) r = consumeToken(b, OP_OVERFLOW_SUB_AND_ASSIGNMENT);
    if (!r) r = consumeToken(b, OP_OVERFLOW_MULT_AND_ASSIGNMENT);
    if (!r) r = consumeToken(b, OP_POINTWISE_BITWISE_AND_AND_ASSIGNMENT);
    if (!r) r = consumeToken(b, OP_POINTWISE_BITWISE_OR_AND_ASSIGNMENT);
    if (!r) r = consumeToken(b, OP_POINTWISE_BITWISE_XOR_AND_ASSIGNMENT);
    if (!r) r = consumeToken(b, OP_POINTWISE_LESS_THAN_OR_EQ);
    if (!r) r = consumeToken(b, OP_POINTWISE_GREATER_THAN_OR_EQ);
    if (!r) r = consumeToken(b, OP_EQ);
    if (!r) r = consumeToken(b, OP_LOGICAL_AND);
    if (!r) r = consumeToken(b, OP_OVERFLOW_ADD);
    if (!r) r = consumeToken(b, OP_OVERFLOW_SUB);
    if (!r) r = consumeToken(b, OP_OVERFLOW_MULT);
    if (!r) r = consumeToken(b, OP_BITWISE_AND_ASSIGNMENT);
    if (!r) r = consumeToken(b, OP_BITWISE_OR_ASSIGNMENT);
    if (!r) r = consumeToken(b, OP_BITWISE_XOR_ASSIGNMENT);
    if (!r) r = consumeToken(b, OP_PATTERN_MATCH);
    if (!r) r = consumeToken(b, OP_NOT_EQ);
    if (!r) r = consumeToken(b, OP_BITSHIFT_LEFT);
    if (!r) r = consumeToken(b, OP_BITSHIFT_RIGHT);
    if (!r) r = consumeToken(b, OP_LESS_THAN_OR_EQ);
    if (!r) r = consumeToken(b, OP_GREATER_THAN_OR_EQ);
    if (!r) r = consumeToken(b, OP_POINTWISE_LESS_THAN);
    if (!r) r = consumeToken(b, OP_POINTWISE_GREATER_THAN);
    if (!r) r = consumeToken(b, OP_ADD_ASSIGNMENT);
    if (!r) r = consumeToken(b, OP_SUB_ASSIGNMENT);
    if (!r) r = consumeToken(b, OP_MULT_ASSIGNMENT);
    if (!r) r = consumeToken(b, OP_DIV_ASSIGNMENT);
    if (!r) r = consumeToken(b, OP_MODULO_ASSIGNMENT);
    if (!r) r = consumeToken(b, OP_LOGICAL_OR);
    if (!r) r = consumeToken(b, OP_POINTWISE_BITWISE_OR);
    if (!r) r = consumeToken(b, OP_POINTWISE_BITWISE_XOR);
    if (!r) r = consumeToken(b, OP_POINTWISE_NOT);
    if (!r) r = consumeToken(b, OP_NIL_COALESCING);
    if (!r) r = consumeToken(b, OP_TERNARY_CONDITIONAL);
    if (!r) r = consumeToken(b, FWD_ARROW);
    if (!r) r = consumeToken(b, AT_SYMBOL);
    if (!r) r = consumeToken(b, POUND);
    if (!r) r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, COLON);
    if (!r) r = consumeToken(b, SEMICOLON);
    if (!r) r = consumeToken(b, DOT);
    if (!r) r = consumeToken(b, BACKSLASH);
    if (!r) r = consumeToken(b, FWDSLASH);
    if (!r) r = consumeToken(b, OP_ASSIGNMENT);
    if (!r) r = consumeToken(b, OP_ADD);
    if (!r) r = consumeToken(b, OP_SUB);
    if (!r) r = consumeToken(b, OP_MULT);
    if (!r) r = consumeToken(b, OP_MODULO);
    if (!r) r = consumeToken(b, OP_NOT);
    if (!r) r = consumeToken(b, OP_LANGLE);
    if (!r) r = consumeToken(b, OP_RANGLE);
    if (!r) r = consumeToken(b, OP_BITWISE_AND);
    if (!r) r = consumeToken(b, OP_BITWISE_OR);
    if (!r) r = consumeToken(b, OP_BITWISE_XOR);
    if (!r) r = consumeToken(b, OP_BITWISE_NOT);
    if (!r) r = parseTokens(b, 0, OP_QUESTION, TOKEN, QUOTED_IDENTIFIER, TOKEN, STRING_INTERPOLATION_START, TOKEN, STRING_INTERPOLATION_END, TOKEN, STRING_TEXT, TOKEN, STRING_START, TOKEN, STRING_END, TOKEN, STRING_ESCAPED_SEQUENCE, TOKEN, MULTILINE_STRING_TEXT, TOKEN, MULTILINE_STRING_START, TOKEN, MULTILINE_STRING_END, TOKEN, MULTILINE_STRING_ESCAPED_NEWLINE, TOKEN, MULTILINE_STRING_ESCAPED_SEQUENCE, TOKEN, EXTENDED_STRING_START, TOKEN, EXTENDED_STRING_END, TOKEN, EXTENDED_MULTILINE_STRING_START, TOKEN, EXTENDED_MULTILINE_STRING_END, TOKEN, SINGLELINE_COMMENT, TOKEN, COMMENT_TEXT, TOKEN, MULTILINE_COMMENT, TOKEN, MULTILINE_COMMENT_TEXT, TOKEN, MULTILINE_COMMENT_START, TOKEN, MULTILINE_COMMENT_END, TOKEN, REGEXP_LITERAL, TOKEN, REGEXP_LITERAL_START, TOKEN, REGEXP_LITERAL_END, TOKEN, REGEXP, TOKEN, KW_PND_AVAILABLE, TOKEN, KW_PND_COLORLITERAL, TOKEN, KW_PND_ELSE, TOKEN, KW_PND_ELSEIF, TOKEN, KW_PND_ENDIF, TOKEN, KW_PND_FILELITERAL, TOKEN, KW_PND_IF, TOKEN, KW_PND_IMAGELITERAL, TOKEN, KW_PND_KEYPATH, TOKEN, KW_PND_SELECTOR, TOKEN, KW_PND_SOURCELOCATION, TOKEN, KW_PND_UNAVAILABLE, TOKEN, KW_UPPER_ANY, TOKEN, KW_LOWER_ANY, TOKEN, KW_ASSOCIATEDTYPE, TOKEN, KW_AWAIT, TOKEN, KW_BORROWING, TOKEN, KW_BREAK, TOKEN, KW_CASE, TOKEN, KW_CLASS, TOKEN, KW_CONSUMING, TOKEN, KW_CONTINUE, TOKEN, KW_DEFAULT, TOKEN, KW_DEFER, TOKEN, KW_DEINIT, TOKEN, KW_DO, TOKEN, KW_ELSE, TOKEN, KW_ENUM, TOKEN, KW_EXTENSION, TOKEN, KW_FALLTHROUGH, TOKEN, KW_FALSE, TOKEN, KW_FILEPRIVATE, TOKEN, KW_FOR, TOKEN, KW_FUNC, TOKEN, KW_GUARD, TOKEN, KW_IF, TOKEN, KW_IMPORT, TOKEN, KW_IN, TOKEN, KW_INIT, TOKEN, KW_INOUT, TOKEN, KW_INTERNAL, TOKEN, KW_LET, TOKEN, KW_NIL, TOKEN, KW_NONISOLATED, TOKEN, KW_OPEN, TOKEN, KW_OPERATOR, TOKEN, KW_PRECEDENCEGROUP, TOKEN, KW_PRIVATE, TOKEN, KW_LOWER_PROTOCOL_DECL, TOKEN, KW_PUBLIC, TOKEN, KW_REPEAT, TOKEN, KW_RETURN, TOKEN, KW_LOWER_SELF, TOKEN, KW_UPPER_SELF, TOKEN, KW_STATIC, TOKEN, KW_STRUCT, TOKEN, KW_SUPER, TOKEN, KW_SWITCH, TOKEN, KW_SUBSCRIPT, TOKEN, KW_THROWS, TOKEN, KW_TRUE, TOKEN, KW_TRY, TOKEN, KW_TYPEALIAS, TOKEN, KW_VAR, TOKEN, KW_WHERE, TOKEN, KW_WHILE, TOKEN, KW_CATCH, TOKEN, KW_THROW, TOKEN, KW_RETHROWS, TOKEN, KW_ASSOCIATIVITY, TOKEN, KW_ASYNC, TOKEN, KW_CONVENIENCE, TOKEN, KW_DIDSET, TOKEN, KW_DYNAMIC, TOKEN, KW_FINAL, TOKEN, KW_GET, TOKEN, KW_INDIRECT, TOKEN, KW_INFIX, TOKEN, KW_LAZY, TOKEN, KW_LEFT, TOKEN, KW_MUTATING, TOKEN, KW_NONE, TOKEN, KW_NONMUTATING, TOKEN, KW_OPTIONAL, TOKEN, KW_OVERRIDE, TOKEN, KW_PACKAGE, TOKEN, KW_POSTFIX, TOKEN, KW_PRECEDENCE, TOKEN, KW_PREFIX, TOKEN, KW_UPPER_PROTOCOL, TOKEN, KW_REQUIRED, TOKEN, KW_RIGHT, TOKEN, KW_SET, TOKEN, KW_SOME, TOKEN, KW_UPPER_TYPE, TOKEN, KW_UNOWNED, TOKEN, KW_WEAK, TOKEN, KW_WILLSET, TOKEN, KW_UNDERSCORE, TOKEN, FLOATING_POINT_LITERAL, TOKEN, HEX_FLOATING_POINT_LITERAL, TOKEN, DECIMAL_FLOATING_POINT_LITERAL, TOKEN, BINARY_LITERAL, TOKEN, OCTAL_LITERAL, TOKEN, HEX_LITERAL, TOKEN, DECIMAL_LITERAL, TOKEN, OP_TYPE_CAST_BANG, TOKEN, OP_TYPE_CAST_OPT, TOKEN, OP_TYPE_CAST, TOKEN, OP_TYPE_CHECK, TOKEN, OP_OVERFLOW_BITSHIFT_LEFT_AND_ASSIGNMENT, TOKEN, OP_OVERFLOW_BITSHIFT_RIGHT_AND_ASSIGNMENT, TOKEN, OP_TRIPLE_LANGLE, TOKEN, OP_TRIPLE_RANGLE, TOKEN, OP_IDENTICAL, TOKEN, OP_NOT_IDENTICAL, TOKEN, OP_BITSHIFT_LEFT_AND_ASSIGNMENT, TOKEN, OP_BITSHIFT_RIGHT_AND_ASSIGNMENT, TOKEN, OP_OVERFLOW_BITSHIFT_LEFT, TOKEN, OP_OVERFLOW_BITSHIFT_RIGHT, TOKEN, OP_HALFOPEN_RANGE, TOKEN, OP_CLOSED_RANGE, TOKEN, OP_POINTWISE_EQ, TOKEN, OP_POINTWISE_NOT_EQ, TOKEN, OP_OVERFLOW_ADD_AND_ASSIGNMENT, TOKEN, OP_OVERFLOW_SUB_AND_ASSIGNMENT, TOKEN, OP_OVERFLOW_MULT_AND_ASSIGNMENT, TOKEN, OP_POINTWISE_BITWISE_AND_AND_ASSIGNMENT, TOKEN, OP_POINTWISE_BITWISE_OR_AND_ASSIGNMENT, TOKEN, OP_POINTWISE_BITWISE_XOR_AND_ASSIGNMENT, TOKEN, OP_POINTWISE_LESS_THAN_OR_EQ, TOKEN, OP_POINTWISE_GREATER_THAN_OR_EQ, TOKEN, OP_EQ, TOKEN, OP_LOGICAL_AND, TOKEN, OP_OVERFLOW_ADD, TOKEN, OP_OVERFLOW_SUB, TOKEN, OP_OVERFLOW_MULT, TOKEN, OP_BITWISE_AND_ASSIGNMENT, TOKEN, OP_BITWISE_OR_ASSIGNMENT, TOKEN, OP_BITWISE_XOR_ASSIGNMENT, TOKEN, OP_PATTERN_MATCH, TOKEN, OP_NOT_EQ, TOKEN, OP_BITSHIFT_LEFT, TOKEN, OP_BITSHIFT_RIGHT, TOKEN, OP_LESS_THAN_OR_EQ, TOKEN, OP_GREATER_THAN_OR_EQ, TOKEN, OP_POINTWISE_LESS_THAN, TOKEN, OP_POINTWISE_GREATER_THAN, TOKEN, OP_ADD_ASSIGNMENT, TOKEN, OP_SUB_ASSIGNMENT, TOKEN, OP_MULT_ASSIGNMENT, TOKEN, OP_DIV_ASSIGNMENT, TOKEN, OP_MODULO_ASSIGNMENT, TOKEN, OP_LOGICAL_OR, TOKEN, OP_POINTWISE_BITWISE_OR, TOKEN, OP_POINTWISE_BITWISE_XOR, TOKEN, OP_POINTWISE_NOT, TOKEN, OP_NIL_COALESCING, TOKEN, OP_TERNARY_CONDITIONAL, TOKEN, FWD_ARROW, TOKEN, STRING_INTERPOLATION_END, TOKEN, RPAREN, TOKEN, LPAREN, TOKEN, AT_SYMBOL, TOKEN, POUND, TOKEN, LBRACE, TOKEN, RBRACE, TOKEN, LBRACKET, TOKEN, RBRACKET, TOKEN, COMMA, TOKEN, COLON, TOKEN, SEMICOLON, TOKEN, DOT, TOKEN, BACKSLASH, TOKEN, FWDSLASH, TOKEN, OP_ASSIGNMENT, TOKEN, OP_ADD, TOKEN, OP_SUB, TOKEN, OP_MULT, TOKEN, OP_MODULO, TOKEN, OP_NOT, TOKEN, OP_LANGLE, TOKEN, OP_RANGLE, TOKEN, OP_BITWISE_AND, TOKEN, OP_BITWISE_OR, TOKEN, OP_BITWISE_XOR, TOKEN, OP_BITWISE_NOT, TOKEN, OP_QUESTION, TOKEN, IMPLICIT_PARAMETER_NAME, TOKEN, PROPERTY_WRAPPER_PROJECTION, TOKEN, DOT_OPERATOR, TOKEN, OPERATOR, TOKEN, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // balanced-token (balanced-token)*
  static boolean balanced_tokens(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "balanced_tokens")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = balanced_token(b, l + 1);
    r = r && balanced_tokens_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (balanced-token)*
  private static boolean balanced_tokens_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "balanced_tokens_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!balanced_tokens_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "balanced_tokens_1", c)) break;
    }
    return true;
  }

  // (balanced-token)
  private static boolean balanced_tokens_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "balanced_tokens_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = balanced_token(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER | any-keyword | literal | OPERATOR | balanced-token-punctuation
  static boolean base_balanced_token(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_balanced_token")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = any_keyword(b, l + 1);
    if (!r) r = literal(b, l + 1);
    if (!r) r = consumeToken(b, OPERATOR);
    if (!r) r = balanced_token_punctuation(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // platform-condition
  //     | IDENTIFIER
  //     | boolean-literal
  //     | (OP_NOT compilation-condition)
  static boolean base_compilation_condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_compilation_condition")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = platform_condition(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = boolean_literal(b, l + 1);
    if (!r) r = base_compilation_condition_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_NOT compilation-condition
  private static boolean base_compilation_condition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_compilation_condition_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_NOT);
    r = r && compilation_condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ((wildcard-pattern | identifier-pattern | tuple-pattern) type-annotation?)
  //   | value-binding-pattern
  //   | enum-case-pattern
  //   | optional-pattern
  //   | expression-pattern
  static boolean base_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_pattern")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = base_pattern_0(b, l + 1);
    if (!r) r = value_binding_pattern(b, l + 1);
    if (!r) r = enum_case_pattern(b, l + 1);
    if (!r) r = optional_pattern(b, l + 1);
    if (!r) r = expression_pattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (wildcard-pattern | identifier-pattern | tuple-pattern) type-annotation?
  private static boolean base_pattern_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_pattern_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = base_pattern_0_0(b, l + 1);
    r = r && base_pattern_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // wildcard-pattern | identifier-pattern | tuple-pattern
  private static boolean base_pattern_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_pattern_0_0")) return false;
    boolean r;
    r = wildcard_pattern(b, l + 1);
    if (!r) r = identifier_pattern(b, l + 1);
    if (!r) r = tuple_pattern(b, l + 1);
    return r;
  }

  // type-annotation?
  private static boolean base_pattern_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_pattern_0_1")) return false;
    type_annotation(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // primary-expression
  static boolean base_postfix_expression(PsiBuilder b, int l) {
    return primary_expression(b, l + 1);
  }

  /* ********************************************************** */
  // function-type
  //   | array-type
  //   | dictionary-type
  //   | type-identifier
  //   | tuple-type
  //   | protocol-composition-type
  //   | opaque-type
  //   | KW_UPPER_ANY
  //   | KW_UPPER_SELF
  static boolean base_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_type")) return false;
    boolean r;
    r = function_type(b, l + 1);
    if (!r) r = array_type(b, l + 1);
    if (!r) r = dictionary_type(b, l + 1);
    if (!r) r = type_identifier(b, l + 1);
    if (!r) r = tuple_type(b, l + 1);
    if (!r) r = protocol_composition_type(b, l + 1);
    if (!r) r = opaque_type(b, l + 1);
    if (!r) r = consumeToken(b, KW_UPPER_ANY);
    if (!r) r = consumeToken(b, KW_UPPER_SELF);
    return r;
  }

  /* ********************************************************** */
  // KW_TRUE | KW_FALSE
  static boolean boolean_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_literal")) return false;
    if (!nextTokenIs(b, "", KW_FALSE, KW_TRUE)) return false;
    boolean r;
    r = consumeToken(b, KW_TRUE);
    if (!r) r = consumeToken(b, KW_FALSE);
    return r;
  }

  /* ********************************************************** */
  // KW_LOWER_ANY type
  public static boolean boxed_protocol_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boxed_protocol_type")) return false;
    if (!nextTokenIs(b, KW_LOWER_ANY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_LOWER_ANY);
    r = r && type(b, l + 1);
    exit_section_(b, m, BOXED_PROTOCOL_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // if-statement | guard-statement | switch-statement
  static boolean branch_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "branch_statement")) return false;
    boolean r;
    r = if_statement(b, l + 1);
    if (!r) r = guard_statement(b, l + 1);
    if (!r) r = switch_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // KW_BREAK label-name?
  static boolean break_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "break_statement")) return false;
    if (!nextTokenIs(b, KW_BREAK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_BREAK);
    r = r && break_statement_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // label-name?
  private static boolean break_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "break_statement_1")) return false;
    label_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LBRACKET capture-list-items RBRACKET
  static boolean capture_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capture_list")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && capture_list_items(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // capture-specifier? capture-list-item-name
  //   | capture-specifier? capture-list-item-name OP_ASSIGNMENT expression
  //   | capture-specifier? self-expression
  public static boolean capture_list_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capture_list_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CAPTURE_LIST_ITEM, "<capture list item>");
    r = capture_list_item_0(b, l + 1);
    if (!r) r = capture_list_item_1(b, l + 1);
    if (!r) r = capture_list_item_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // capture-specifier? capture-list-item-name
  private static boolean capture_list_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capture_list_item_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = capture_list_item_0_0(b, l + 1);
    r = r && capture_list_item_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // capture-specifier?
  private static boolean capture_list_item_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capture_list_item_0_0")) return false;
    capture_specifier(b, l + 1);
    return true;
  }

  // capture-specifier? capture-list-item-name OP_ASSIGNMENT expression
  private static boolean capture_list_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capture_list_item_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = capture_list_item_1_0(b, l + 1);
    r = r && capture_list_item_name(b, l + 1);
    r = r && consumeToken(b, OP_ASSIGNMENT);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // capture-specifier?
  private static boolean capture_list_item_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capture_list_item_1_0")) return false;
    capture_specifier(b, l + 1);
    return true;
  }

  // capture-specifier? self-expression
  private static boolean capture_list_item_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capture_list_item_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = capture_list_item_2_0(b, l + 1);
    r = r && self_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // capture-specifier?
  private static boolean capture_list_item_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capture_list_item_2_0")) return false;
    capture_specifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean capture_list_item_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capture_list_item_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, CAPTURE_LIST_ITEM_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // capture-list-item (COMMA capture-list-item)*
  static boolean capture_list_items(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capture_list_items")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = capture_list_item(b, l + 1);
    r = r && capture_list_items_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA capture-list-item)*
  private static boolean capture_list_items_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capture_list_items_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!capture_list_items_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "capture_list_items_1", c)) break;
    }
    return true;
  }

  // COMMA capture-list-item
  private static boolean capture_list_items_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capture_list_items_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && capture_list_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_WEAK | KW_UNOWNED | KW_UNOWNED LPAREN KW_SAFE RPAREN | KW_UNOWNED LPAREN KW_UNSAFE RPAREN
  static boolean capture_specifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capture_specifier")) return false;
    if (!nextTokenIs(b, "", KW_UNOWNED, KW_WEAK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_WEAK);
    if (!r) r = consumeToken(b, KW_UNOWNED);
    if (!r) r = parseTokens(b, 0, KW_UNOWNED, LPAREN, KW_SAFE, RPAREN);
    if (!r) r = parseTokens(b, 0, KW_UNOWNED, LPAREN, KW_UNSAFE, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_CASE pattern initializer
  static boolean case_condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_condition")) return false;
    if (!nextTokenIs(b, KW_CASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CASE);
    r = r && pattern(b, l + 1);
    r = r && initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // pattern where-clause? (COMMA pattern where-clause?)*
  static boolean case_item_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_item_list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pattern(b, l + 1);
    r = r && case_item_list_1(b, l + 1);
    r = r && case_item_list_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // where-clause?
  private static boolean case_item_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_item_list_1")) return false;
    where_clause(b, l + 1);
    return true;
  }

  // (COMMA pattern where-clause?)*
  private static boolean case_item_list_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_item_list_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!case_item_list_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "case_item_list_2", c)) break;
    }
    return true;
  }

  // COMMA pattern where-clause?
  private static boolean case_item_list_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_item_list_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && pattern(b, l + 1);
    r = r && case_item_list_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // where-clause?
  private static boolean case_item_list_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_item_list_2_0_2")) return false;
    where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // attributes? KW_CASE case-item-list COLON
  static boolean case_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_label")) return false;
    if (!nextTokenIs(b, "", KW_CASE, OP_AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = case_label_0(b, l + 1);
    r = r && consumeToken(b, KW_CASE);
    r = r && case_item_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // attributes?
  private static boolean case_label_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_label_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_CATCH catch-pattern-list? code-block
  static boolean catch_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_clause")) return false;
    if (!nextTokenIs(b, KW_CATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CATCH);
    r = r && catch_clause_1(b, l + 1);
    r = r && code_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // catch-pattern-list?
  private static boolean catch_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_clause_1")) return false;
    catch_pattern_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // catch-clause (catch-clause)*
  static boolean catch_clauses(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_clauses")) return false;
    if (!nextTokenIs(b, KW_CATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = catch_clause(b, l + 1);
    r = r && catch_clauses_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (catch-clause)*
  private static boolean catch_clauses_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_clauses_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!catch_clauses_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "catch_clauses_1", c)) break;
    }
    return true;
  }

  // (catch-clause)
  private static boolean catch_clauses_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_clauses_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = catch_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // pattern where-clause?
  static boolean catch_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_pattern")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pattern(b, l + 1);
    r = r && catch_pattern_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // where-clause?
  private static boolean catch_pattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_pattern_1")) return false;
    where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // catch-pattern (COMMA catch-pattern)*
  static boolean catch_pattern_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_pattern_list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = catch_pattern(b, l + 1);
    r = r && catch_pattern_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA catch-pattern)*
  private static boolean catch_pattern_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_pattern_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!catch_pattern_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "catch_pattern_list_1", c)) break;
    }
    return true;
  }

  // COMMA catch-pattern
  private static boolean catch_pattern_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_pattern_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && catch_pattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (KW_FINAL access-level-modifier?) | (access-level-modifier? KW_FINAL?)
  static boolean class_access(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_access")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_access_0(b, l + 1);
    if (!r) r = class_access_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_FINAL access-level-modifier?
  private static boolean class_access_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_access_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FINAL);
    r = r && class_access_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // access-level-modifier?
  private static boolean class_access_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_access_0_1")) return false;
    access_level_modifier(b, l + 1);
    return true;
  }

  // access-level-modifier? KW_FINAL?
  private static boolean class_access_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_access_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_access_1_0(b, l + 1);
    r = r && class_access_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // access-level-modifier?
  private static boolean class_access_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_access_1_0")) return false;
    access_level_modifier(b, l + 1);
    return true;
  }

  // KW_FINAL?
  private static boolean class_access_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_access_1_1")) return false;
    consumeToken(b, KW_FINAL);
    return true;
  }

  /* ********************************************************** */
  // LBRACE class-members? RBRACE
  static boolean class_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_body")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && class_body_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // class-members?
  private static boolean class_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_body_1")) return false;
    class_members(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // attributes? class-access KW_CLASS class-name generic-parameter-clause? type-inheritance-clause? generic-where-clause? class-body
  public static boolean class_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_DECLARATION, "<class declaration>");
    r = class_declaration_0(b, l + 1);
    r = r && class_access(b, l + 1);
    r = r && consumeToken(b, KW_CLASS);
    r = r && class_name(b, l + 1);
    r = r && class_declaration_4(b, l + 1);
    r = r && class_declaration_5(b, l + 1);
    r = r && class_declaration_6(b, l + 1);
    r = r && class_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attributes?
  private static boolean class_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // generic-parameter-clause?
  private static boolean class_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_4")) return false;
    generic_parameter_clause(b, l + 1);
    return true;
  }

  // type-inheritance-clause?
  private static boolean class_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_5")) return false;
    type_inheritance_clause(b, l + 1);
    return true;
  }

  // generic-where-clause?
  private static boolean class_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_6")) return false;
    generic_where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // declaration | compiler-control-statement
  static boolean class_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_member")) return false;
    boolean r;
    r = declaration(b, l + 1);
    if (!r) r = compiler_control_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // class-member (class-member)*
  public static boolean class_members(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_members")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_MEMBERS, "<class members>");
    r = class_member(b, l + 1);
    r = r && class_members_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (class-member)*
  private static boolean class_members_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_members_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!class_members_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_members_1", c)) break;
    }
    return true;
  }

  // (class-member)
  private static boolean class_members_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_members_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_member(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean class_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, CLASS_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACE attributes? closure-signature? statements? RBRACE
  static boolean closure_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_expression")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && closure_expression_1(b, l + 1);
    r = r && closure_expression_2(b, l + 1);
    r = r && closure_expression_3(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // attributes?
  private static boolean closure_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_expression_1")) return false;
    attributes(b, l + 1);
    return true;
  }

  // closure-signature?
  private static boolean closure_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_expression_2")) return false;
    closure_signature(b, l + 1);
    return true;
  }

  // statements?
  private static boolean closure_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_expression_3")) return false;
    statements(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // closure-parameter-name type-annotation? | closure-parameter-name type-annotation ELLIPSIS
  public static boolean closure_parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_parameter")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = closure_parameter_0(b, l + 1);
    if (!r) r = closure_parameter_1(b, l + 1);
    exit_section_(b, m, CLOSURE_PARAMETER, r);
    return r;
  }

  // closure-parameter-name type-annotation?
  private static boolean closure_parameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_parameter_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = closure_parameter_name(b, l + 1);
    r = r && closure_parameter_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type-annotation?
  private static boolean closure_parameter_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_parameter_0_1")) return false;
    type_annotation(b, l + 1);
    return true;
  }

  // closure-parameter-name type-annotation ELLIPSIS
  private static boolean closure_parameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_parameter_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = closure_parameter_name(b, l + 1);
    r = r && type_annotation(b, l + 1);
    r = r && consumeToken(b, ELLIPSIS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN (closure-parameter-list)? RPAREN | identifier-list
  static boolean closure_parameter_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_parameter_clause")) return false;
    if (!nextTokenIs(b, "", IDENTIFIER, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = closure_parameter_clause_0(b, l + 1);
    if (!r) r = identifier_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN (closure-parameter-list)? RPAREN
  private static boolean closure_parameter_clause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_parameter_clause_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && closure_parameter_clause_0_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (closure-parameter-list)?
  private static boolean closure_parameter_clause_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_parameter_clause_0_1")) return false;
    closure_parameter_clause_0_1_0(b, l + 1);
    return true;
  }

  // (closure-parameter-list)
  private static boolean closure_parameter_clause_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_parameter_clause_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = closure_parameter_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // closure-parameter (COMMA closure-parameter)*
  static boolean closure_parameter_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_parameter_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = closure_parameter(b, l + 1);
    r = r && closure_parameter_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA closure-parameter)*
  private static boolean closure_parameter_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_parameter_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!closure_parameter_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "closure_parameter_list_1", c)) break;
    }
    return true;
  }

  // COMMA closure-parameter
  private static boolean closure_parameter_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_parameter_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && closure_parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean closure_parameter_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_parameter_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, CLOSURE_PARAMETER_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // capture-list? closure-parameter-clause async? throws-clause? function-result? KW_IN | capture-list KW_IN
  static boolean closure_signature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_signature")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = closure_signature_0(b, l + 1);
    if (!r) r = closure_signature_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // capture-list? closure-parameter-clause async? throws-clause? function-result? KW_IN
  private static boolean closure_signature_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_signature_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = closure_signature_0_0(b, l + 1);
    r = r && closure_parameter_clause(b, l + 1);
    r = r && closure_signature_0_2(b, l + 1);
    r = r && closure_signature_0_3(b, l + 1);
    r = r && closure_signature_0_4(b, l + 1);
    r = r && consumeToken(b, KW_IN);
    exit_section_(b, m, null, r);
    return r;
  }

  // capture-list?
  private static boolean closure_signature_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_signature_0_0")) return false;
    capture_list(b, l + 1);
    return true;
  }

  // async?
  private static boolean closure_signature_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_signature_0_2")) return false;
    consumeToken(b, ASYNC);
    return true;
  }

  // throws-clause?
  private static boolean closure_signature_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_signature_0_3")) return false;
    throws_clause(b, l + 1);
    return true;
  }

  // function-result?
  private static boolean closure_signature_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_signature_0_4")) return false;
    function_result(b, l + 1);
    return true;
  }

  // capture-list KW_IN
  private static boolean closure_signature_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closure_signature_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = capture_list(b, l + 1);
    r = r && consumeToken(b, KW_IN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACE statements? RBRACE
  public static boolean code_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CODE_BLOCK, "<code block>");
    r = consumeToken(b, LBRACE);
    r = r && code_block_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, SwiftParser::skip_until_rbrace);
    return r;
  }

  // statements?
  private static boolean code_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_block_1")) return false;
    statements(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // base-compilation-condition
  //     | (LPAREN base-compilation-condition RPAREN)
  //     | (base-compilation-condition (OP_LOGICAL_AND | OP_LOGICAL_OR) base-compilation-condition)
  static boolean compilation_condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilation_condition")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = base_compilation_condition(b, l + 1);
    if (!r) r = compilation_condition_1(b, l + 1);
    if (!r) r = compilation_condition_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN base-compilation-condition RPAREN
  private static boolean compilation_condition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilation_condition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && base_compilation_condition(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // base-compilation-condition (OP_LOGICAL_AND | OP_LOGICAL_OR) base-compilation-condition
  private static boolean compilation_condition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilation_condition_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = base_compilation_condition(b, l + 1);
    r = r && compilation_condition_2_1(b, l + 1);
    r = r && base_compilation_condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_LOGICAL_AND | OP_LOGICAL_OR
  private static boolean compilation_condition_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilation_condition_2_1")) return false;
    boolean r;
    r = consumeToken(b, OP_LOGICAL_AND);
    if (!r) r = consumeToken(b, OP_LOGICAL_OR);
    return r;
  }

  /* ********************************************************** */
  // conditional-compilation-block
  //     | line-control-statement
  public static boolean compiler_control_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compiler_control_statement")) return false;
    if (!nextTokenIs(b, "<compiler control statement>", KW_PND_IF, KW_PND_SOURCELOCATION)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPILER_CONTROL_STATEMENT, "<compiler control statement>");
    r = conditional_compilation_block(b, l + 1);
    if (!r) r = line_control_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression | availability-condition | case-condition | optional-binding-condition
  static boolean condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition")) return false;
    boolean r;
    r = expression(b, l + 1);
    if (!r) r = availability_condition(b, l + 1);
    if (!r) r = case_condition(b, l + 1);
    if (!r) r = optional_binding_condition(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // condition (COMMA condition)*
  public static boolean condition_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITION_LIST, "<condition list>");
    r = condition(b, l + 1);
    r = r && condition_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA condition)*
  private static boolean condition_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!condition_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "condition_list_1", c)) break;
    }
    return true;
  }

  // COMMA condition
  private static boolean condition_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // if-directive-clause elseif-directive-clauses? else-directive-clause? endif-directive
  public static boolean conditional_compilation_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_compilation_block")) return false;
    if (!nextTokenIs(b, KW_PND_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = if_directive_clause(b, l + 1);
    r = r && conditional_compilation_block_1(b, l + 1);
    r = r && conditional_compilation_block_2(b, l + 1);
    r = r && endif_directive(b, l + 1);
    exit_section_(b, m, CONDITIONAL_COMPILATION_BLOCK, r);
    return r;
  }

  // elseif-directive-clauses?
  private static boolean conditional_compilation_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_compilation_block_1")) return false;
    elseif_directive_clauses(b, l + 1);
    return true;
  }

  // else-directive-clause?
  private static boolean conditional_compilation_block_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_compilation_block_2")) return false;
    else_directive_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // if-expression | switch-expression
  public static boolean conditional_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_expression")) return false;
    if (!nextTokenIs(b, "<conditional expression>", KW_IF, KW_SWITCH)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_EXPRESSION, "<conditional expression>");
    r = if_expression(b, l + 1);
    if (!r) r = switch_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OP_QUESTION expression COLON
  static boolean conditional_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_operator")) return false;
    if (!nextTokenIs(b, OP_QUESTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_QUESTION);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // switch-if-directive-clause switch-elseif-directive-clauses? switch-else-directive-clause? endif-directive
  public static boolean conditional_switch_case(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_switch_case")) return false;
    if (!nextTokenIs(b, KW_PND_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = switch_if_directive_clause(b, l + 1);
    r = r && conditional_switch_case_1(b, l + 1);
    r = r && conditional_switch_case_2(b, l + 1);
    r = r && endif_directive(b, l + 1);
    exit_section_(b, m, CONDITIONAL_SWITCH_CASE, r);
    return r;
  }

  // switch-elseif-directive-clauses?
  private static boolean conditional_switch_case_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_switch_case_1")) return false;
    switch_elseif_directive_clauses(b, l + 1);
    return true;
  }

  // switch-else-directive-clause?
  private static boolean conditional_switch_case_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_switch_case_2")) return false;
    switch_else_directive_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // type-identifier COLON (type-identifier | protocol-composition-type)
  static boolean conformance_requirement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conformance_requirement")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && conformance_requirement_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type-identifier | protocol-composition-type
  private static boolean conformance_requirement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conformance_requirement_2")) return false;
    boolean r;
    r = type_identifier(b, l + 1);
    if (!r) r = protocol_composition_type(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // attributes? declaration-modifiers? KW_LET pattern-initializer-list
  public static boolean constant_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT_DECLARATION, "<constant declaration>");
    r = constant_declaration_0(b, l + 1);
    r = r && constant_declaration_1(b, l + 1);
    r = r && consumeToken(b, KW_LET);
    r = r && pattern_initializer_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attributes?
  private static boolean constant_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // declaration-modifiers?
  private static boolean constant_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_1")) return false;
    declaration_modifiers(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_CONTINUE label-name?
  static boolean continue_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continue_statement")) return false;
    if (!nextTokenIs(b, KW_CONTINUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CONTINUE);
    r = r && continue_statement_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // label-name?
  private static boolean continue_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continue_statement_1")) return false;
    label_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // break-statement | continue-statement | fallthrough-statement | return-statement | throw-statement
  public static boolean control_transfer_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "control_transfer_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTROL_TRANSFER_STATEMENT, "<control transfer statement>");
    r = break_statement(b, l + 1);
    if (!r) r = continue_statement(b, l + 1);
    if (!r) r = fallthrough_statement(b, l + 1);
    if (!r) r = return_statement(b, l + 1);
    if (!r) r = throw_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // import-declaration
  //   | constant-declaration
  //   | variable-declaration
  //   | typealias-declaration
  //   | function-declaration
  //   | enum-declaration
  //   | struct-declaration
  //   | class-declaration
  //   | actor-declaration
  //   | protocol-declaration
  //   | initializer-declaration
  //   | deinitializer-declaration
  //   | extension-declaration
  //   | subscript-declaration
  //   | operator-declaration
  //   | precedence-group-declaration
  public static boolean declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION, "<declaration>");
    r = import_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    if (!r) r = variable_declaration(b, l + 1);
    if (!r) r = typealias_declaration(b, l + 1);
    if (!r) r = function_declaration(b, l + 1);
    if (!r) r = enum_declaration(b, l + 1);
    if (!r) r = struct_declaration(b, l + 1);
    if (!r) r = class_declaration(b, l + 1);
    if (!r) r = actor_declaration(b, l + 1);
    if (!r) r = protocol_declaration(b, l + 1);
    if (!r) r = initializer_declaration(b, l + 1);
    if (!r) r = deinitializer_declaration(b, l + 1);
    if (!r) r = extension_declaration(b, l + 1);
    if (!r) r = subscript_declaration(b, l + 1);
    if (!r) r = operator_declaration(b, l + 1);
    if (!r) r = precedence_group_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_CLASS
  //   | KW_CONVENIENCE
  //   | KW_DYNAMIC
  //   | KW_FINAL
  //   | KW_INFIX
  //   | KW_LAZY
  //   | KW_OPTIONAL
  //   | KW_OVERRIDE
  //   | KW_POSTFIX
  //   | KW_PREFIX
  //   | KW_REQUIRED
  //   | KW_STATIC
  //   | KW_UNOWNED (LPAREN (KW_SAFE | KW_UNSAFE) RPAREN)?
  //   | KW_WEAK
  //   | access-level-modifier
  //   | mutation-modifier
  //   | KW_NONISOLATED
  static boolean declaration_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CLASS);
    if (!r) r = consumeToken(b, KW_CONVENIENCE);
    if (!r) r = consumeToken(b, KW_DYNAMIC);
    if (!r) r = consumeToken(b, KW_FINAL);
    if (!r) r = consumeToken(b, KW_INFIX);
    if (!r) r = consumeToken(b, KW_LAZY);
    if (!r) r = consumeToken(b, KW_OPTIONAL);
    if (!r) r = consumeToken(b, KW_OVERRIDE);
    if (!r) r = consumeToken(b, KW_POSTFIX);
    if (!r) r = consumeToken(b, KW_PREFIX);
    if (!r) r = consumeToken(b, KW_REQUIRED);
    if (!r) r = consumeToken(b, KW_STATIC);
    if (!r) r = declaration_modifier_12(b, l + 1);
    if (!r) r = consumeToken(b, KW_WEAK);
    if (!r) r = access_level_modifier(b, l + 1);
    if (!r) r = mutation_modifier(b, l + 1);
    if (!r) r = consumeToken(b, KW_NONISOLATED);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_UNOWNED (LPAREN (KW_SAFE | KW_UNSAFE) RPAREN)?
  private static boolean declaration_modifier_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_modifier_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_UNOWNED);
    r = r && declaration_modifier_12_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LPAREN (KW_SAFE | KW_UNSAFE) RPAREN)?
  private static boolean declaration_modifier_12_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_modifier_12_1")) return false;
    declaration_modifier_12_1_0(b, l + 1);
    return true;
  }

  // LPAREN (KW_SAFE | KW_UNSAFE) RPAREN
  private static boolean declaration_modifier_12_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_modifier_12_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && declaration_modifier_12_1_0_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_SAFE | KW_UNSAFE
  private static boolean declaration_modifier_12_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_modifier_12_1_0_1")) return false;
    boolean r;
    r = consumeToken(b, KW_SAFE);
    if (!r) r = consumeToken(b, KW_UNSAFE);
    return r;
  }

  /* ********************************************************** */
  // declaration-modifier (declaration-modifier)* {methods []}
  public static boolean declaration_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_modifiers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION_MODIFIERS, "<declaration modifiers>");
    r = declaration_modifier(b, l + 1);
    r = r && declaration_modifiers_1(b, l + 1);
    r = r && declaration_modifiers_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (declaration-modifier)*
  private static boolean declaration_modifiers_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_modifiers_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!declaration_modifiers_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declaration_modifiers_1", c)) break;
    }
    return true;
  }

  // (declaration-modifier)
  private static boolean declaration_modifiers_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_modifiers_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declaration_modifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // methods []
  private static boolean declaration_modifiers_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_modifiers_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, METHODS);
    r = r && declaration_modifiers_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // []
  private static boolean declaration_modifiers_2_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // OP_ASSIGNMENT expression
  static boolean default_argument_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_argument_clause")) return false;
    if (!nextTokenIs(b, OP_ASSIGNMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_ASSIGNMENT);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // attributes? (KW_DEFAULT COLON)
  static boolean default_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_label")) return false;
    if (!nextTokenIs(b, "", KW_DEFAULT, OP_AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = default_label_0(b, l + 1);
    r = r && default_label_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // attributes?
  private static boolean default_label_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_label_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // KW_DEFAULT COLON
  private static boolean default_label_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_label_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_DEFAULT, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_DEFER code-block
  public static boolean defer_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defer_statement")) return false;
    if (!nextTokenIs(b, KW_DEFER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DEFER);
    r = r && code_block(b, l + 1);
    exit_section_(b, m, DEFER_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // (attributes? KW_DEINIT code-block) {methods []}
  public static boolean deinitializer_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deinitializer_declaration")) return false;
    if (!nextTokenIs(b, "<deinitializer declaration>", KW_DEINIT, OP_AT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEINITIALIZER_DECLARATION, "<deinitializer declaration>");
    r = deinitializer_declaration_0(b, l + 1);
    r = r && deinitializer_declaration_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attributes? KW_DEINIT code-block
  private static boolean deinitializer_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deinitializer_declaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = deinitializer_declaration_0_0(b, l + 1);
    r = r && consumeToken(b, KW_DEINIT);
    r = r && code_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // attributes?
  private static boolean deinitializer_declaration_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deinitializer_declaration_0_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // methods []
  private static boolean deinitializer_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deinitializer_declaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, METHODS);
    r = r && deinitializer_declaration_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // []
  private static boolean deinitializer_declaration_1_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // (LBRACKET dictionary-literal-items COMMA? RBRACKET) | (LBRACKET COLON RBRACKET)
  static boolean dictionary_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_literal")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dictionary_literal_0(b, l + 1);
    if (!r) r = dictionary_literal_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACKET dictionary-literal-items COMMA? RBRACKET
  private static boolean dictionary_literal_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_literal_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && dictionary_literal_items(b, l + 1);
    r = r && dictionary_literal_0_2(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean dictionary_literal_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_literal_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // LBRACKET COLON RBRACKET
  private static boolean dictionary_literal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_literal_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACKET, COLON, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression COLON expression
  static boolean dictionary_literal_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_literal_item")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // dictionary-literal-item (COMMA dictionary-literal-item)*
  static boolean dictionary_literal_items(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_literal_items")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dictionary_literal_item(b, l + 1);
    r = r && dictionary_literal_items_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA dictionary-literal-item)*
  private static boolean dictionary_literal_items_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_literal_items_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dictionary_literal_items_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dictionary_literal_items_1", c)) break;
    }
    return true;
  }

  // COMMA dictionary-literal-item
  private static boolean dictionary_literal_items_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_literal_items_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && dictionary_literal_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET type COLON type RBRACKET
  static boolean dictionary_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dictionary_type")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // attributes? KW_DIDSET setter-name? code-block
  public static boolean didSet_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "didSet_clause")) return false;
    if (!nextTokenIs(b, "<did set clause>", KW_DIDSET, OP_AT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DID_SET_CLAUSE, "<did set clause>");
    r = didSet_clause_0(b, l + 1);
    r = r && consumeToken(b, KW_DIDSET);
    r = r && didSet_clause_2(b, l + 1);
    r = r && code_block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attributes?
  private static boolean didSet_clause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "didSet_clause_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // setter-name?
  private static boolean didSet_clause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "didSet_clause_2")) return false;
    setter_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_DO throws-clause? code-block catch-clauses?
  static boolean do_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_statement")) return false;
    if (!nextTokenIs(b, KW_DO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DO);
    r = r && do_statement_1(b, l + 1);
    r = r && code_block(b, l + 1);
    r = r && do_statement_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // throws-clause?
  private static boolean do_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_statement_1")) return false;
    throws_clause(b, l + 1);
    return true;
  }

  // catch-clauses?
  private static boolean do_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_statement_3")) return false;
    catch_clauses(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_ELSE (code-block | if-statement)
  static boolean else_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_clause")) return false;
    if (!nextTokenIs(b, KW_ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ELSE);
    r = r && else_clause_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // code-block | if-statement
  private static boolean else_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_clause_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = code_block(b, l + 1);
    if (!r) r = if_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_PND_ELSE
  static boolean else_directive(PsiBuilder b, int l) {
    return consumeToken(b, KW_PND_ELSE);
  }

  /* ********************************************************** */
  // else-directive statements?
  static boolean else_directive_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_directive_clause")) return false;
    if (!nextTokenIs(b, KW_PND_ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = else_directive(b, l + 1);
    r = r && else_directive_clause_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // statements?
  private static boolean else_directive_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_directive_clause_1")) return false;
    statements(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_PND_ELSEIF
  static boolean elseif_directive(PsiBuilder b, int l) {
    return consumeToken(b, KW_PND_ELSEIF);
  }

  /* ********************************************************** */
  // elseif-directive compilation-condition statements?
  static boolean elseif_directive_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elseif_directive_clause")) return false;
    if (!nextTokenIs(b, KW_PND_ELSEIF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = elseif_directive(b, l + 1);
    r = r && compilation_condition(b, l + 1);
    r = r && elseif_directive_clause_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // statements?
  private static boolean elseif_directive_clause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elseif_directive_clause_2")) return false;
    statements(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // elseif-directive-clause (elseif-directive-clause)*
  static boolean elseif_directive_clauses(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elseif_directive_clauses")) return false;
    if (!nextTokenIs(b, KW_PND_ELSEIF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = elseif_directive_clause(b, l + 1);
    r = r && elseif_directive_clauses_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (elseif-directive-clause)*
  private static boolean elseif_directive_clauses_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elseif_directive_clauses_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!elseif_directive_clauses_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "elseif_directive_clauses_1", c)) break;
    }
    return true;
  }

  // (elseif-directive-clause)
  private static boolean elseif_directive_clauses_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elseif_directive_clauses_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = elseif_directive_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_PND_ENDIF
  static boolean endif_directive(PsiBuilder b, int l) {
    return consumeToken(b, KW_PND_ENDIF);
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean enum_case_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_case_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, ENUM_CASE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // type-identifier? DOT enum-case-name tuple-pattern?
  static boolean enum_case_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_case_pattern")) return false;
    if (!nextTokenIs(b, "", DOT, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enum_case_pattern_0(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && enum_case_name(b, l + 1);
    r = r && enum_case_pattern_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type-identifier?
  private static boolean enum_case_pattern_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_case_pattern_0")) return false;
    type_identifier(b, l + 1);
    return true;
  }

  // tuple-pattern?
  private static boolean enum_case_pattern_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_case_pattern_3")) return false;
    tuple_pattern(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // attributes? access-level-modifier? (union-style-enum | raw-value-style-enum)
  public static boolean enum_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_DECLARATION, "<enum declaration>");
    r = enum_declaration_0(b, l + 1);
    r = r && enum_declaration_1(b, l + 1);
    r = r && enum_declaration_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attributes?
  private static boolean enum_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // access-level-modifier?
  private static boolean enum_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_1")) return false;
    access_level_modifier(b, l + 1);
    return true;
  }

  // union-style-enum | raw-value-style-enum
  private static boolean enum_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_2")) return false;
    boolean r;
    r = union_style_enum(b, l + 1);
    if (!r) r = raw_value_style_enum(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean enum_declaration_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, ENUM_DECLARATION_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // "simulator" | "macCatalyst"
  static boolean environment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "environment")) return false;
    boolean r;
    r = consumeToken(b, "simulator");
    if (!r) r = consumeToken(b, "macCatalyst");
    return r;
  }

  /* ********************************************************** */
  // DOT DECIMAL_LITERAL | DOT misc-wrapped-identifier-token (LPAREN argument-names RPAREN | generic-argument-clause?) | conditional-compilation-block
  static boolean explicit_member_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_member_expression")) return false;
    if (!nextTokenIs(b, "", DOT, KW_PND_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, DOT, DECIMAL_LITERAL);
    if (!r) r = explicit_member_expression_1(b, l + 1);
    if (!r) r = conditional_compilation_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DOT misc-wrapped-identifier-token (LPAREN argument-names RPAREN | generic-argument-clause?)
  private static boolean explicit_member_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_member_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && misc_wrapped_identifier_token(b, l + 1);
    r = r && explicit_member_expression_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN argument-names RPAREN | generic-argument-clause?
  private static boolean explicit_member_expression_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_member_expression_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = explicit_member_expression_1_2_0(b, l + 1);
    if (!r) r = explicit_member_expression_1_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN argument-names RPAREN
  private static boolean explicit_member_expression_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_member_expression_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && argument_names(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // generic-argument-clause?
  private static boolean explicit_member_expression_1_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_member_expression_1_2_1")) return false;
    generic_argument_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // try-operator? KW_AWAIT? prefix-expression infix-expressions?
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION, "<expression>");
    r = expression_0(b, l + 1);
    r = r && expression_1(b, l + 1);
    r = r && prefix_expression(b, l + 1);
    r = r && expression_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // try-operator?
  private static boolean expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_0")) return false;
    try_operator(b, l + 1);
    return true;
  }

  // KW_AWAIT?
  private static boolean expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1")) return false;
    consumeToken(b, KW_AWAIT);
    return true;
  }

  // infix-expressions?
  private static boolean expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_3")) return false;
    infix_expressions(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // expression
  static boolean expression_pattern(PsiBuilder b, int l) {
    return expression(b, l + 1);
  }

  /* ********************************************************** */
  // LBRACE extension-members? RBRACE
  static boolean extension_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extension_body")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && extension_body_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // extension-members?
  private static boolean extension_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extension_body_1")) return false;
    extension_members(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // attributes? access-level-modifier? KW_EXTENSION type-identifier type-inheritance-clause? generic-where-clause? extension-body
  public static boolean extension_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extension_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXTENSION_DECLARATION, "<extension declaration>");
    r = extension_declaration_0(b, l + 1);
    r = r && extension_declaration_1(b, l + 1);
    r = r && consumeToken(b, KW_EXTENSION);
    r = r && type_identifier(b, l + 1);
    r = r && extension_declaration_4(b, l + 1);
    r = r && extension_declaration_5(b, l + 1);
    r = r && extension_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attributes?
  private static boolean extension_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extension_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // access-level-modifier?
  private static boolean extension_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extension_declaration_1")) return false;
    access_level_modifier(b, l + 1);
    return true;
  }

  // type-inheritance-clause?
  private static boolean extension_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extension_declaration_4")) return false;
    type_inheritance_clause(b, l + 1);
    return true;
  }

  // generic-where-clause?
  private static boolean extension_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extension_declaration_5")) return false;
    generic_where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // declaration | compiler-control-statement
  static boolean extension_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extension_member")) return false;
    boolean r;
    r = declaration(b, l + 1);
    if (!r) r = compiler_control_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // extension-member (extension-member)*
  static boolean extension_members(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extension_members")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = extension_member(b, l + 1);
    r = r && extension_members_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (extension-member)*
  private static boolean extension_members_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extension_members_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!extension_members_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "extension_members_1", c)) break;
    }
    return true;
  }

  // (extension-member)
  private static boolean extension_members_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extension_members_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = extension_member(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean external_parameter_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_parameter_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, EXTERNAL_PARAMETER_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // external-parameter-name
  public static boolean external_parameter_name_holder(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_parameter_name_holder")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = external_parameter_name(b, l + 1);
    exit_section_(b, m, EXTERNAL_PARAMETER_NAME_HOLDER, r);
    return r;
  }

  /* ********************************************************** */
  // KW_FALLTHROUGH
  static boolean fallthrough_statement(PsiBuilder b, int l) {
    return consumeToken(b, KW_FALLTHROUGH);
  }

  /* ********************************************************** */
  // static-string-literal
  static boolean file_path(PsiBuilder b, int l) {
    return static_string_literal(b, l + 1);
  }

  /* ********************************************************** */
  // DECIMAL_FLOATING_POINT_LITERAL | HEX_FLOATING_POINT_LITERAL
  static boolean floating_point_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "floating_point_literal")) return false;
    if (!nextTokenIs(b, "", DECIMAL_FLOATING_POINT_LITERAL, HEX_FLOATING_POINT_LITERAL)) return false;
    boolean r;
    r = consumeToken(b, DECIMAL_FLOATING_POINT_LITERAL);
    if (!r) r = consumeToken(b, HEX_FLOATING_POINT_LITERAL);
    return r;
  }

  /* ********************************************************** */
  // KW_FOR KW_CASE? pattern KW_IN expression where-clause? code-block
  static boolean for_in_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_in_statement")) return false;
    if (!nextTokenIs(b, KW_FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FOR);
    r = r && for_in_statement_1(b, l + 1);
    r = r && pattern(b, l + 1);
    r = r && consumeToken(b, KW_IN);
    r = r && expression(b, l + 1);
    r = r && for_in_statement_5(b, l + 1);
    r = r && code_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_CASE?
  private static boolean for_in_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_in_statement_1")) return false;
    consumeToken(b, KW_CASE);
    return true;
  }

  // where-clause?
  private static boolean for_in_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_in_statement_5")) return false;
    where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (OP_NOT)
  static boolean forced_value_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forced_value_expression")) return false;
    if (!nextTokenIs(b, OP_NOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_NOT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // function-call-argument-label? (expression | OPERATOR)
  public static boolean function_call_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_argument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_CALL_ARGUMENT, "<function call argument>");
    r = function_call_argument_0(b, l + 1);
    r = r && function_call_argument_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // function-call-argument-label?
  private static boolean function_call_argument_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_argument_0")) return false;
    function_call_argument_label(b, l + 1);
    return true;
  }

  // expression | OPERATOR
  private static boolean function_call_argument_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_argument_1")) return false;
    boolean r;
    r = expression(b, l + 1);
    if (!r) r = consumeToken(b, OPERATOR);
    return r;
  }

  /* ********************************************************** */
  // LPAREN function-call-argument-list? RPAREN
  static boolean function_call_argument_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_argument_clause")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && function_call_argument_clause_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // function-call-argument-list?
  private static boolean function_call_argument_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_argument_clause_1")) return false;
    function_call_argument_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // misc-wrapped-identifier-token COLON
  public static boolean function_call_argument_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_argument_label")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = misc_wrapped_identifier_token(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, FUNCTION_CALL_ARGUMENT_LABEL, r);
    return r;
  }

  /* ********************************************************** */
  // function-call-argument (COMMA function-call-argument)*
  static boolean function_call_argument_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_argument_list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_call_argument(b, l + 1);
    r = r && function_call_argument_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA function-call-argument)*
  private static boolean function_call_argument_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_argument_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!function_call_argument_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_call_argument_list_1", c)) break;
    }
    return true;
  }

  // COMMA function-call-argument
  private static boolean function_call_argument_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_argument_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && function_call_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // function-call-argument-clause | (function-call-argument-clause? trailing-closures)
  static boolean function_call_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_expression")) return false;
    if (!nextTokenIs(b, "", LBRACE, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_call_argument_clause(b, l + 1);
    if (!r) r = function_call_expression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // function-call-argument-clause? trailing-closures
  private static boolean function_call_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_call_expression_1_0(b, l + 1);
    r = r && trailing_closures(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // function-call-argument-clause?
  private static boolean function_call_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_expression_1_0")) return false;
    function_call_argument_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // function-head function-declaration-name generic-parameter-clause? function-signature generic-where-clause?  code-block?
  public static boolean function_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DECLARATION, "<function declaration>");
    r = function_head(b, l + 1);
    r = r && function_declaration_name(b, l + 1);
    r = r && function_declaration_2(b, l + 1);
    r = r && function_signature(b, l + 1);
    r = r && function_declaration_4(b, l + 1);
    r = r && function_declaration_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // generic-parameter-clause?
  private static boolean function_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_2")) return false;
    generic_parameter_clause(b, l + 1);
    return true;
  }

  // generic-where-clause?
  private static boolean function_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_4")) return false;
    generic_where_clause(b, l + 1);
    return true;
  }

  // code-block?
  private static boolean function_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_5")) return false;
    code_block(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER | OPERATOR
  public static boolean function_declaration_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_name")) return false;
    if (!nextTokenIs(b, "<function declaration name>", IDENTIFIER, OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DECLARATION_NAME, "<function declaration name>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, OPERATOR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // attributes? declaration-modifiers? KW_FUNC
  static boolean function_head(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_head")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_head_0(b, l + 1);
    r = r && function_head_1(b, l + 1);
    r = r && consumeToken(b, KW_FUNC);
    exit_section_(b, m, null, r);
    return r;
  }

  // attributes?
  private static boolean function_head_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_head_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // declaration-modifiers?
  private static boolean function_head_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_head_1")) return false;
    declaration_modifiers(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_FWD_ARROW attributes? function-return-type
  static boolean function_result(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_result")) return false;
    if (!nextTokenIs(b, KW_FWD_ARROW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FWD_ARROW);
    r = r && function_result_1(b, l + 1);
    r = r && function_return_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // attributes?
  private static boolean function_result_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_result_1")) return false;
    attributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // type
  static boolean function_return_type(PsiBuilder b, int l) {
    return type(b, l + 1);
  }

  /* ********************************************************** */
  // parameter-clause KW_ASYNC? (KW_RETHROWS | throws-clause?) function-result?
  static boolean function_signature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_signature")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter_clause(b, l + 1);
    r = r && function_signature_1(b, l + 1);
    r = r && function_signature_2(b, l + 1);
    r = r && function_signature_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_ASYNC?
  private static boolean function_signature_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_signature_1")) return false;
    consumeToken(b, KW_ASYNC);
    return true;
  }

  // KW_RETHROWS | throws-clause?
  private static boolean function_signature_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_signature_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_RETHROWS);
    if (!r) r = function_signature_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // throws-clause?
  private static boolean function_signature_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_signature_2_1")) return false;
    throws_clause(b, l + 1);
    return true;
  }

  // function-result?
  private static boolean function_signature_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_signature_3")) return false;
    function_result(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // attributes? function-type-arguments-clause KW_ASYNC? throws-clause? KW_FWD_ARROW type
  public static boolean function_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type")) return false;
    if (!nextTokenIs(b, "<function type>", LPAREN, OP_AT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_TYPE, "<function type>");
    r = function_type_0(b, l + 1);
    r = r && function_type_arguments_clause(b, l + 1);
    r = r && function_type_2(b, l + 1);
    r = r && function_type_3(b, l + 1);
    r = r && consumeToken(b, KW_FWD_ARROW);
    r = r && type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attributes?
  private static boolean function_type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // KW_ASYNC?
  private static boolean function_type_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_2")) return false;
    consumeToken(b, KW_ASYNC);
    return true;
  }

  // throws-clause?
  private static boolean function_type_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_3")) return false;
    throws_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // attributes? KW_INOUT? type | function-type-argument-name type-annotation
  public static boolean function_type_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_argument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_TYPE_ARGUMENT, "<function type argument>");
    r = function_type_argument_0(b, l + 1);
    if (!r) r = function_type_argument_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attributes? KW_INOUT? type
  private static boolean function_type_argument_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_argument_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_type_argument_0_0(b, l + 1);
    r = r && function_type_argument_0_1(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // attributes?
  private static boolean function_type_argument_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_argument_0_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // KW_INOUT?
  private static boolean function_type_argument_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_argument_0_1")) return false;
    consumeToken(b, KW_INOUT);
    return true;
  }

  // function-type-argument-name type-annotation
  private static boolean function_type_argument_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_argument_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_type_argument_name(b, l + 1);
    r = r && type_annotation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean function_type_argument_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_argument_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, FUNCTION_TYPE_ARGUMENT_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN (function-type-arguments-list KW_ELLIPSIS?)? RPAREN
  static boolean function_type_arguments_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_arguments_clause")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && function_type_arguments_clause_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (function-type-arguments-list KW_ELLIPSIS?)?
  private static boolean function_type_arguments_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_arguments_clause_1")) return false;
    function_type_arguments_clause_1_0(b, l + 1);
    return true;
  }

  // function-type-arguments-list KW_ELLIPSIS?
  private static boolean function_type_arguments_clause_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_arguments_clause_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_type_arguments_list(b, l + 1);
    r = r && function_type_arguments_clause_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_ELLIPSIS?
  private static boolean function_type_arguments_clause_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_arguments_clause_1_0_1")) return false;
    consumeToken(b, KW_ELLIPSIS);
    return true;
  }

  /* ********************************************************** */
  // function-type-argument (COMMA function-type-argument)*
  public static boolean function_type_arguments_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_arguments_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_TYPE_ARGUMENTS_LIST, "<function type arguments list>");
    r = function_type_argument(b, l + 1);
    r = r && function_type_arguments_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA function-type-argument)*
  private static boolean function_type_arguments_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_arguments_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!function_type_arguments_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_type_arguments_list_1", c)) break;
    }
    return true;
  }

  // COMMA function-type-argument
  private static boolean function_type_arguments_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_type_arguments_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && function_type_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type
  static boolean generic_argument(PsiBuilder b, int l) {
    return type(b, l + 1);
  }

  /* ********************************************************** */
  // OP_LANGLE generic-argument-list OP_RANGLE
  static boolean generic_argument_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_argument_clause")) return false;
    if (!nextTokenIs(b, OP_LANGLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_LANGLE);
    r = r && generic_argument_list(b, l + 1);
    r = r && consumeToken(b, OP_RANGLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // generic-argument (COMMA generic-argument)*
  static boolean generic_argument_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_argument_list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_argument(b, l + 1);
    r = r && generic_argument_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA generic-argument)*
  private static boolean generic_argument_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_argument_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!generic_argument_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "generic_argument_list_1", c)) break;
    }
    return true;
  }

  // COMMA generic-argument
  private static boolean generic_argument_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_argument_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && generic_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // generic-parameter-type-name (COLON type-identifier | COLON protocol-composition-type)?
  public static boolean generic_parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_parameter")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_parameter_type_name(b, l + 1);
    r = r && generic_parameter_1(b, l + 1);
    exit_section_(b, m, GENERIC_PARAMETER, r);
    return r;
  }

  // (COLON type-identifier | COLON protocol-composition-type)?
  private static boolean generic_parameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_parameter_1")) return false;
    generic_parameter_1_0(b, l + 1);
    return true;
  }

  // COLON type-identifier | COLON protocol-composition-type
  private static boolean generic_parameter_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_parameter_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_parameter_1_0_0(b, l + 1);
    if (!r) r = generic_parameter_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COLON type-identifier
  private static boolean generic_parameter_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_parameter_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type_identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COLON protocol-composition-type
  private static boolean generic_parameter_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_parameter_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && protocol_composition_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OP_LANGLE generic-parameter-list OP_RANGLE
  public static boolean generic_parameter_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_parameter_clause")) return false;
    if (!nextTokenIs(b, OP_LANGLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_LANGLE);
    r = r && generic_parameter_list(b, l + 1);
    r = r && consumeToken(b, OP_RANGLE);
    exit_section_(b, m, GENERIC_PARAMETER_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // generic-parameter (COMMA generic-parameter)*
  public static boolean generic_parameter_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_parameter_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_parameter(b, l + 1);
    r = r && generic_parameter_list_1(b, l + 1);
    exit_section_(b, m, GENERIC_PARAMETER_LIST, r);
    return r;
  }

  // (COMMA generic-parameter)*
  private static boolean generic_parameter_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_parameter_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!generic_parameter_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "generic_parameter_list_1", c)) break;
    }
    return true;
  }

  // COMMA generic-parameter
  private static boolean generic_parameter_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_parameter_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && generic_parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean generic_parameter_type_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_parameter_type_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, GENERIC_PARAMETER_TYPE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // KW_WHERE requirement-list
  static boolean generic_where_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_where_clause")) return false;
    if (!nextTokenIs(b, KW_WHERE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_WHERE);
    r = r && requirement_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // attributes? mutation-modifier? KW_GET code-block
  public static boolean getter_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GETTER_CLAUSE, "<getter clause>");
    r = getter_clause_0(b, l + 1);
    r = r && getter_clause_1(b, l + 1);
    r = r && consumeToken(b, KW_GET);
    r = r && code_block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attributes?
  private static boolean getter_clause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter_clause_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // mutation-modifier?
  private static boolean getter_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter_clause_1")) return false;
    mutation_modifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // attributes? mutation-modifier? KW_GET
  public static boolean getter_keyword_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter_keyword_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GETTER_KEYWORD_CLAUSE, "<getter keyword clause>");
    r = getter_keyword_clause_0(b, l + 1);
    r = r && getter_keyword_clause_1(b, l + 1);
    r = r && consumeToken(b, KW_GET);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attributes?
  private static boolean getter_keyword_clause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter_keyword_clause_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // mutation-modifier?
  private static boolean getter_keyword_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter_keyword_clause_1")) return false;
    mutation_modifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // code-block | (LBRACE getter-clause setter-clause? RBRACE) | (LBRACE setter-clause getter-clause RBRACE)
  public static boolean getter_setter_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter_setter_block")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = code_block(b, l + 1);
    if (!r) r = getter_setter_block_1(b, l + 1);
    if (!r) r = getter_setter_block_2(b, l + 1);
    exit_section_(b, m, GETTER_SETTER_BLOCK, r);
    return r;
  }

  // LBRACE getter-clause setter-clause? RBRACE
  private static boolean getter_setter_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter_setter_block_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && getter_clause(b, l + 1);
    r = r && getter_setter_block_1_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // setter-clause?
  private static boolean getter_setter_block_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter_setter_block_1_2")) return false;
    setter_clause(b, l + 1);
    return true;
  }

  // LBRACE setter-clause getter-clause RBRACE
  private static boolean getter_setter_block_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter_setter_block_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && setter_clause(b, l + 1);
    r = r && getter_clause(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (LBRACE getter-keyword-clause setter-keyword-clause? RBRACE) | (LBRACE setter-keyword-clause getter-keyword-clause RBRACE)
  public static boolean getter_setter_keyword_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter_setter_keyword_block")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = getter_setter_keyword_block_0(b, l + 1);
    if (!r) r = getter_setter_keyword_block_1(b, l + 1);
    exit_section_(b, m, GETTER_SETTER_KEYWORD_BLOCK, r);
    return r;
  }

  // LBRACE getter-keyword-clause setter-keyword-clause? RBRACE
  private static boolean getter_setter_keyword_block_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter_setter_keyword_block_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && getter_keyword_clause(b, l + 1);
    r = r && getter_setter_keyword_block_0_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // setter-keyword-clause?
  private static boolean getter_setter_keyword_block_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter_setter_keyword_block_0_2")) return false;
    setter_keyword_clause(b, l + 1);
    return true;
  }

  // LBRACE setter-keyword-clause getter-keyword-clause RBRACE
  private static boolean getter_setter_keyword_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "getter_setter_keyword_block_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && setter_keyword_clause(b, l + 1);
    r = r && getter_keyword_clause(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_GUARD condition-list KW_ELSE code-block
  static boolean guard_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "guard_statement")) return false;
    if (!nextTokenIs(b, KW_GUARD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_GUARD);
    r = r && condition_list(b, l + 1);
    r = r && consumeToken(b, KW_ELSE);
    r = r && code_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER (COMMA IDENTIFIER)*
  public static boolean identifier_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && identifier_list_1(b, l + 1);
    exit_section_(b, m, IDENTIFIER_LIST, r);
    return r;
  }

  // (COMMA IDENTIFIER)*
  private static boolean identifier_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!identifier_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "identifier_list_1", c)) break;
    }
    return true;
  }

  // COMMA IDENTIFIER
  private static boolean identifier_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean identifier_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_pattern")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, IDENTIFIER_PATTERN, r);
    return r;
  }

  /* ********************************************************** */
  // KW_PND_IF
  static boolean if_directive(PsiBuilder b, int l) {
    return consumeToken(b, KW_PND_IF);
  }

  /* ********************************************************** */
  // if-directive compilation-condition statements?
  static boolean if_directive_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_directive_clause")) return false;
    if (!nextTokenIs(b, KW_PND_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = if_directive(b, l + 1);
    r = r && compilation_condition(b, l + 1);
    r = r && if_directive_clause_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // statements?
  private static boolean if_directive_clause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_directive_clause_2")) return false;
    statements(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_IF condition-list (LBRACE statement RBRACE) if-expression-tail
  static boolean if_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expression")) return false;
    if (!nextTokenIs(b, KW_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_IF);
    r = r && condition_list(b, l + 1);
    r = r && if_expression_2(b, l + 1);
    r = r && if_expression_tail(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE statement RBRACE
  private static boolean if_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && statement(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_ELSE (if-expression | LBRACE statement RBRACE)
  static boolean if_expression_tail(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expression_tail")) return false;
    if (!nextTokenIs(b, KW_ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ELSE);
    r = r && if_expression_tail_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // if-expression | LBRACE statement RBRACE
  private static boolean if_expression_tail_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expression_tail_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = if_expression(b, l + 1);
    if (!r) r = if_expression_tail_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE statement RBRACE
  private static boolean if_expression_tail_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expression_tail_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && statement(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_IF condition-list code-block else-clause?
  static boolean if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement")) return false;
    if (!nextTokenIs(b, KW_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_IF);
    r = r && condition_list(b, l + 1);
    r = r && code_block(b, l + 1);
    r = r && if_statement_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // else-clause?
  private static boolean if_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_3")) return false;
    else_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DOT misc-wrapped-identifier-token | DOT misc-wrapped-identifier-token DOT postfix-expression
  static boolean implicit_member_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implicit_member_expression")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = implicit_member_expression_0(b, l + 1);
    if (!r) r = implicit_member_expression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DOT misc-wrapped-identifier-token
  private static boolean implicit_member_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implicit_member_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && misc_wrapped_identifier_token(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DOT misc-wrapped-identifier-token DOT postfix-expression
  private static boolean implicit_member_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implicit_member_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && misc_wrapped_identifier_token(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && postfix_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OP_NOT
  static boolean implicitly_unwrapped_optional_type_suffix(PsiBuilder b, int l) {
    return consumeToken(b, OP_NOT);
  }

  /* ********************************************************** */
  // attributes? KW_IMPORT import-kind? import-path
  public static boolean import_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_declaration")) return false;
    if (!nextTokenIs(b, "<import declaration>", KW_IMPORT, OP_AT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_DECLARATION, "<import declaration>");
    r = import_declaration_0(b, l + 1);
    r = r && consumeToken(b, KW_IMPORT);
    r = r && import_declaration_2(b, l + 1);
    r = r && import_path(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attributes?
  private static boolean import_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // import-kind?
  private static boolean import_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_declaration_2")) return false;
    import_kind(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_TYPEALIAS | KW_STRUCT | KW_CLASS | KW_ENUM | KW_LOWER_PROTOCOL_DECL | KW_LET | KW_VAR | KW_FUNC
  public static boolean import_kind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_kind")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_KIND, "<import kind>");
    r = consumeToken(b, KW_TYPEALIAS);
    if (!r) r = consumeToken(b, KW_STRUCT);
    if (!r) r = consumeToken(b, KW_CLASS);
    if (!r) r = consumeToken(b, KW_ENUM);
    if (!r) r = consumeToken(b, KW_LOWER_PROTOCOL_DECL);
    if (!r) r = consumeToken(b, KW_LET);
    if (!r) r = consumeToken(b, KW_VAR);
    if (!r) r = consumeToken(b, KW_FUNC);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean import_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, IMPORT_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // import-name (DOT import-name)*
  public static boolean import_path(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_path")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = import_name(b, l + 1);
    r = r && import_path_1(b, l + 1);
    exit_section_(b, m, IMPORT_PATH, r);
    return r;
  }

  // (DOT import-name)*
  private static boolean import_path_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_path_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!import_path_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "import_path_1", c)) break;
    }
    return true;
  }

  // DOT import-name
  private static boolean import_path_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_path_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && import_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OP_BITWISE_AND primary-expression
  static boolean in_out_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "in_out_expression")) return false;
    if (!nextTokenIs(b, OP_BITWISE_AND)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BITWISE_AND);
    r = r && primary_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // infix-operator prefix-expression | OP_ASSIGNMENT try-operator? KW_AWAIT? prefix-expression | conditional-operator try-operator? KW_AWAIT? prefix-expression | type-casting-operator
  static boolean infix_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infix_expression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = infix_expression_0(b, l + 1);
    if (!r) r = infix_expression_1(b, l + 1);
    if (!r) r = infix_expression_2(b, l + 1);
    if (!r) r = type_casting_operator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // infix-operator prefix-expression
  private static boolean infix_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infix_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = infix_operator(b, l + 1);
    r = r && prefix_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_ASSIGNMENT try-operator? KW_AWAIT? prefix-expression
  private static boolean infix_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infix_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_ASSIGNMENT);
    r = r && infix_expression_1_1(b, l + 1);
    r = r && infix_expression_1_2(b, l + 1);
    r = r && prefix_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // try-operator?
  private static boolean infix_expression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infix_expression_1_1")) return false;
    try_operator(b, l + 1);
    return true;
  }

  // KW_AWAIT?
  private static boolean infix_expression_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infix_expression_1_2")) return false;
    consumeToken(b, KW_AWAIT);
    return true;
  }

  // conditional-operator try-operator? KW_AWAIT? prefix-expression
  private static boolean infix_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infix_expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = conditional_operator(b, l + 1);
    r = r && infix_expression_2_1(b, l + 1);
    r = r && infix_expression_2_2(b, l + 1);
    r = r && prefix_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // try-operator?
  private static boolean infix_expression_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infix_expression_2_1")) return false;
    try_operator(b, l + 1);
    return true;
  }

  // KW_AWAIT?
  private static boolean infix_expression_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infix_expression_2_2")) return false;
    consumeToken(b, KW_AWAIT);
    return true;
  }

  /* ********************************************************** */
  // infix-expression (infix-expression)*
  static boolean infix_expressions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infix_expressions")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = infix_expression(b, l + 1);
    r = r && infix_expressions_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (infix-expression)*
  private static boolean infix_expressions_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infix_expressions_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!infix_expressions_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "infix_expressions_1", c)) break;
    }
    return true;
  }

  // (infix-expression)
  private static boolean infix_expressions_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infix_expressions_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = infix_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OPERATOR
  static boolean infix_operator(PsiBuilder b, int l) {
    return consumeToken(b, OPERATOR);
  }

  /* ********************************************************** */
  // KW_INFIX KW_OPERATOR OPERATOR infix-operator-group?
  static boolean infix_operator_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infix_operator_declaration")) return false;
    if (!nextTokenIs(b, KW_INFIX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_INFIX, KW_OPERATOR, OPERATOR);
    r = r && infix_operator_declaration_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // infix-operator-group?
  private static boolean infix_operator_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infix_operator_declaration_3")) return false;
    infix_operator_group(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // COLON precedence-group-name
  static boolean infix_operator_group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infix_operator_group")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && precedence_group_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OP_ASSIGNMENT expression
  static boolean initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer")) return false;
    if (!nextTokenIs(b, OP_ASSIGNMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_ASSIGNMENT);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // initializer-head generic-parameter-clause? parameter-clause KW_ASYNC? (KW_RETHROWS | throws-clause?) generic-where-clause? code-block
  public static boolean initializer_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INITIALIZER_DECLARATION, "<initializer declaration>");
    r = initializer_head(b, l + 1);
    r = r && initializer_declaration_1(b, l + 1);
    r = r && parameter_clause(b, l + 1);
    r = r && initializer_declaration_3(b, l + 1);
    r = r && initializer_declaration_4(b, l + 1);
    r = r && initializer_declaration_5(b, l + 1);
    r = r && code_block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // generic-parameter-clause?
  private static boolean initializer_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_declaration_1")) return false;
    generic_parameter_clause(b, l + 1);
    return true;
  }

  // KW_ASYNC?
  private static boolean initializer_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_declaration_3")) return false;
    consumeToken(b, KW_ASYNC);
    return true;
  }

  // KW_RETHROWS | throws-clause?
  private static boolean initializer_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_declaration_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_RETHROWS);
    if (!r) r = initializer_declaration_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // throws-clause?
  private static boolean initializer_declaration_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_declaration_4_1")) return false;
    throws_clause(b, l + 1);
    return true;
  }

  // generic-where-clause?
  private static boolean initializer_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_declaration_5")) return false;
    generic_where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (DOT KW_INIT) (LPAREN argument-names RPAREN)?
  static boolean initializer_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_expression")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = initializer_expression_0(b, l + 1);
    r = r && initializer_expression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DOT KW_INIT
  private static boolean initializer_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, KW_INIT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LPAREN argument-names RPAREN)?
  private static boolean initializer_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_expression_1")) return false;
    initializer_expression_1_0(b, l + 1);
    return true;
  }

  // LPAREN argument-names RPAREN
  private static boolean initializer_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && argument_names(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // attributes? declaration-modifiers? (KW_INIT (OP_QUESTION | OP_NOT)? )
  static boolean initializer_head(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_head")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = initializer_head_0(b, l + 1);
    r = r && initializer_head_1(b, l + 1);
    r = r && initializer_head_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // attributes?
  private static boolean initializer_head_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_head_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // declaration-modifiers?
  private static boolean initializer_head_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_head_1")) return false;
    declaration_modifiers(b, l + 1);
    return true;
  }

  // KW_INIT (OP_QUESTION | OP_NOT)?
  private static boolean initializer_head_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_head_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_INIT);
    r = r && initializer_head_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_QUESTION | OP_NOT)?
  private static boolean initializer_head_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_head_2_1")) return false;
    initializer_head_2_1_0(b, l + 1);
    return true;
  }

  // OP_QUESTION | OP_NOT
  private static boolean initializer_head_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_head_2_1_0")) return false;
    boolean r;
    r = consumeToken(b, OP_QUESTION);
    if (!r) r = consumeToken(b, OP_NOT);
    return r;
  }

  /* ********************************************************** */
  // BINARY_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | HEXADECIMAL_LITERAL
  public static boolean integer_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTEGER_LITERAL, "<integer literal>");
    r = consumeToken(b, BINARY_LITERAL);
    if (!r) r = consumeToken(b, OCTAL_LITERAL);
    if (!r) r = consumeToken(b, DECIMAL_LITERAL);
    if (!r) r = consumeToken(b, HEXADECIMAL_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean internal_parameter_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "internal_parameter_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, INTERNAL_PARAMETER_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // internal-parameter-name
  public static boolean internal_parameter_name_holder(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "internal_parameter_name_holder")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = internal_parameter_name(b, l + 1);
    exit_section_(b, m, INTERNAL_PARAMETER_NAME_HOLDER, r);
    return r;
  }

  /* ********************************************************** */
  // (STRING_START interpolated-text? STRING_END) | (MULTILINE_STRING_START multiline-interpolated-text? MULTILINE_STRING_END)
  static boolean interpolated_string_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolated_string_literal")) return false;
    if (!nextTokenIs(b, "", MULTILINE_STRING_START, STRING_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interpolated_string_literal_0(b, l + 1);
    if (!r) r = interpolated_string_literal_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING_START interpolated-text? STRING_END
  private static boolean interpolated_string_literal_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolated_string_literal_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_START);
    r = r && interpolated_string_literal_0_1(b, l + 1);
    r = r && consumeToken(b, STRING_END);
    exit_section_(b, m, null, r);
    return r;
  }

  // interpolated-text?
  private static boolean interpolated_string_literal_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolated_string_literal_0_1")) return false;
    interpolated_text(b, l + 1);
    return true;
  }

  // MULTILINE_STRING_START multiline-interpolated-text? MULTILINE_STRING_END
  private static boolean interpolated_string_literal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolated_string_literal_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MULTILINE_STRING_START);
    r = r && interpolated_string_literal_1_1(b, l + 1);
    r = r && consumeToken(b, MULTILINE_STRING_END);
    exit_section_(b, m, null, r);
    return r;
  }

  // multiline-interpolated-text?
  private static boolean interpolated_string_literal_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolated_string_literal_1_1")) return false;
    multiline_interpolated_text(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // interpolated-text-item interpolated-text-item*
  static boolean interpolated_text(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolated_text")) return false;
    if (!nextTokenIs(b, "", STRING_INTERPOLATION_START, STRING_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interpolated_text_item(b, l + 1);
    r = r && interpolated_text_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // interpolated-text-item*
  private static boolean interpolated_text_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolated_text_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!interpolated_text_item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interpolated_text_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (STRING_INTERPOLATION_START expression STRING_INTERPOLATION_END) | STRING_TEXT
  static boolean interpolated_text_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolated_text_item")) return false;
    if (!nextTokenIs(b, "", STRING_INTERPOLATION_START, STRING_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interpolated_text_item_0(b, l + 1);
    if (!r) r = consumeToken(b, STRING_TEXT);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING_INTERPOLATION_START expression STRING_INTERPOLATION_END
  private static boolean interpolated_text_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolated_text_item_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_INTERPOLATION_START);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, STRING_INTERPOLATION_END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // misc-wrapped-identifier-token key-path-postfixes? | key-path-postfixes
  static boolean key_path_component(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_path_component")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = key_path_component_0(b, l + 1);
    if (!r) r = key_path_postfixes(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // misc-wrapped-identifier-token key-path-postfixes?
  private static boolean key_path_component_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_path_component_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = misc_wrapped_identifier_token(b, l + 1);
    r = r && key_path_component_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // key-path-postfixes?
  private static boolean key_path_component_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_path_component_0_1")) return false;
    key_path_postfixes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // key-path-component (DOT key-path-component)*
  static boolean key_path_components(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_path_components")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = key_path_component(b, l + 1);
    r = r && key_path_components_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DOT key-path-component)*
  private static boolean key_path_components_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_path_components_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!key_path_components_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "key_path_components_1", c)) break;
    }
    return true;
  }

  // DOT key-path-component
  private static boolean key_path_components_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_path_components_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && key_path_component(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BACKSLASH type? DOT key-path-components
  static boolean key_path_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_path_expression")) return false;
    if (!nextTokenIs(b, BACKSLASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BACKSLASH);
    r = r && key_path_expression_1(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && key_path_components(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type?
  private static boolean key_path_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_path_expression_1")) return false;
    type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // OP_QUESTION | OP_NOT | KW_LOWER_SELF | (LBRACKET function-call-argument-list RBRACKET)
  static boolean key_path_postfix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_path_postfix")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_QUESTION);
    if (!r) r = consumeToken(b, OP_NOT);
    if (!r) r = consumeToken(b, KW_LOWER_SELF);
    if (!r) r = key_path_postfix_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACKET function-call-argument-list RBRACKET
  private static boolean key_path_postfix_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_path_postfix_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && function_call_argument_list(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // key-path-postfix (key-path-postfix)*
  static boolean key_path_postfixes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_path_postfixes")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = key_path_postfix(b, l + 1);
    r = r && key_path_postfixes_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (key-path-postfix)*
  private static boolean key_path_postfixes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_path_postfixes_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!key_path_postfixes_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "key_path_postfixes_1", c)) break;
    }
    return true;
  }

  // (key-path-postfix)
  private static boolean key_path_postfixes_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_path_postfixes_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = key_path_postfix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_PND_KEYPATH (LPAREN expression RPAREN)
  static boolean key_path_string_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_path_string_expression")) return false;
    if (!nextTokenIs(b, KW_PND_KEYPATH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_PND_KEYPATH);
    r = r && key_path_string_expression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN expression RPAREN
  private static boolean key_path_string_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_path_string_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean label_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "label_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, LABEL_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // statement-label (loop-statement | if-statement | switch-statement | do-statement)
  public static boolean labeled_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "labeled_statement")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement_label(b, l + 1);
    r = r && labeled_statement_1(b, l + 1);
    exit_section_(b, m, LABELED_STATEMENT, r);
    return r;
  }

  // loop-statement | if-statement | switch-statement | do-statement
  private static boolean labeled_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "labeled_statement_1")) return false;
    boolean r;
    r = loop_statement(b, l + 1);
    if (!r) r = if_statement(b, l + 1);
    if (!r) r = switch_statement(b, l + 1);
    if (!r) r = do_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // KW_PND_SOURCELOCATION (LPAREN ("file" COLON file-path COMMA "line" COLON line-number)? RPAREN)
  static boolean line_control_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "line_control_statement")) return false;
    if (!nextTokenIs(b, KW_PND_SOURCELOCATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_PND_SOURCELOCATION);
    r = r && line_control_statement_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN ("file" COLON file-path COMMA "line" COLON line-number)? RPAREN
  private static boolean line_control_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "line_control_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && line_control_statement_1_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("file" COLON file-path COMMA "line" COLON line-number)?
  private static boolean line_control_statement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "line_control_statement_1_1")) return false;
    line_control_statement_1_1_0(b, l + 1);
    return true;
  }

  // "file" COLON file-path COMMA "line" COLON line-number
  private static boolean line_control_statement_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "line_control_statement_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "file");
    r = r && consumeToken(b, COLON);
    r = r && file_path(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && consumeToken(b, "line");
    r = r && consumeToken(b, COLON);
    r = r && line_number(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DECIMAL_LITERAL
  static boolean line_number(PsiBuilder b, int l) {
    return consumeToken(b, DECIMAL_LITERAL);
  }

  /* ********************************************************** */
  // numeric-literal | string-literal | regular-expression-literal | boolean-literal | nil-literal
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = numeric_literal(b, l + 1);
    if (!r) r = string_literal(b, l + 1);
    if (!r) r = regular_expression_literal(b, l + 1);
    if (!r) r = boolean_literal(b, l + 1);
    if (!r) r = nil_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // literal | array-literal | dictionary-literal | playground-literal
  static boolean literal_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_expression")) return false;
    boolean r;
    r = literal(b, l + 1);
    if (!r) r = array_literal(b, l + 1);
    if (!r) r = dictionary_literal(b, l + 1);
    if (!r) r = playground_literal(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // for-in-statement | while-statement | repeat-while-statement
  static boolean loop_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_statement")) return false;
    boolean r;
    r = for_in_statement(b, l + 1);
    if (!r) r = while_statement(b, l + 1);
    if (!r) r = repeat_while_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // macro-head macro-name generic-parameter-clause? macro-signature macro-definition? generic-where-clause
  public static boolean macro_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MACRO_DECLARATION, "<macro declaration>");
    r = macro_head(b, l + 1);
    r = r && macro_name(b, l + 1);
    r = r && macro_declaration_2(b, l + 1);
    r = r && macro_signature(b, l + 1);
    r = r && macro_declaration_4(b, l + 1);
    r = r && generic_where_clause(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // generic-parameter-clause?
  private static boolean macro_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_declaration_2")) return false;
    generic_parameter_clause(b, l + 1);
    return true;
  }

  // macro-definition?
  private static boolean macro_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_declaration_4")) return false;
    macro_definition(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // OP_ASSIGNMENT expression
  static boolean macro_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_definition")) return false;
    if (!nextTokenIs(b, OP_ASSIGNMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_ASSIGNMENT);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // POUND macro-expansion-expression-name generic-argument-clause? function-call-argument-clause? trailing-closures?
  public static boolean macro_expansion_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_expansion_expression")) return false;
    if (!nextTokenIs(b, POUND)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, POUND);
    r = r && macro_expansion_expression_name(b, l + 1);
    r = r && macro_expansion_expression_2(b, l + 1);
    r = r && macro_expansion_expression_3(b, l + 1);
    r = r && macro_expansion_expression_4(b, l + 1);
    exit_section_(b, m, MACRO_EXPANSION_EXPRESSION, r);
    return r;
  }

  // generic-argument-clause?
  private static boolean macro_expansion_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_expansion_expression_2")) return false;
    generic_argument_clause(b, l + 1);
    return true;
  }

  // function-call-argument-clause?
  private static boolean macro_expansion_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_expansion_expression_3")) return false;
    function_call_argument_clause(b, l + 1);
    return true;
  }

  // trailing-closures?
  private static boolean macro_expansion_expression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_expansion_expression_4")) return false;
    trailing_closures(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean macro_expansion_expression_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_expansion_expression_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, MACRO_EXPANSION_EXPRESSION_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // attributes? declaration-modifiers? KW_MACRO
  static boolean macro_head(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_head")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = macro_head_0(b, l + 1);
    r = r && macro_head_1(b, l + 1);
    r = r && consumeToken(b, KW_MACRO);
    exit_section_(b, m, null, r);
    return r;
  }

  // attributes?
  private static boolean macro_head_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_head_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // declaration-modifiers?
  private static boolean macro_head_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_head_1")) return false;
    declaration_modifiers(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean macro_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, MACRO_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // parameter-clause (KW_FWD_ARROW type)?
  static boolean macro_signature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_signature")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter_clause(b, l + 1);
    r = r && macro_signature_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KW_FWD_ARROW type)?
  private static boolean macro_signature_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_signature_1")) return false;
    macro_signature_1_0(b, l + 1);
    return true;
  }

  // KW_FWD_ARROW type
  private static boolean macro_signature_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_signature_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FWD_ARROW);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DOT KW_UPPER_TYPE | DOT KW_UPPER_PROTOCOL
  static boolean metatype_type_suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metatype_type_suffix")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, DOT, KW_UPPER_TYPE);
    if (!r) r = parseTokens(b, 0, DOT, KW_UPPER_PROTOCOL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean misc_wrapped_identifier_token(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "misc_wrapped_identifier_token")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, MISC_WRAPPED_IDENTIFIER_TOKEN, r);
    return r;
  }

  /* ********************************************************** */
  // multiline-interpolated-text-item multiline-interpolated-text*
  static boolean multiline_interpolated_text(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiline_interpolated_text")) return false;
    if (!nextTokenIs(b, "", MULTILINE_STRING_TEXT, STRING_INTERPOLATION_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multiline_interpolated_text_item(b, l + 1);
    r = r && multiline_interpolated_text_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // multiline-interpolated-text*
  private static boolean multiline_interpolated_text_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiline_interpolated_text_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!multiline_interpolated_text(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "multiline_interpolated_text_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (STRING_INTERPOLATION_START expression STRING_INTERPOLATION_END) | MULTILINE_STRING_TEXT
  static boolean multiline_interpolated_text_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiline_interpolated_text_item")) return false;
    if (!nextTokenIs(b, "", MULTILINE_STRING_TEXT, STRING_INTERPOLATION_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multiline_interpolated_text_item_0(b, l + 1);
    if (!r) r = consumeToken(b, MULTILINE_STRING_TEXT);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING_INTERPOLATION_START expression STRING_INTERPOLATION_END
  private static boolean multiline_interpolated_text_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiline_interpolated_text_item_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_INTERPOLATION_START);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, STRING_INTERPOLATION_END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MULTILINE_STRING_START MULTILINE_STRING_TEXT* MULTILINE_STRING_END
  static boolean multiline_string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiline_string")) return false;
    if (!nextTokenIs(b, MULTILINE_STRING_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MULTILINE_STRING_START);
    r = r && multiline_string_1(b, l + 1);
    r = r && consumeToken(b, MULTILINE_STRING_END);
    exit_section_(b, m, null, r);
    return r;
  }

  // MULTILINE_STRING_TEXT*
  private static boolean multiline_string_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiline_string_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, MULTILINE_STRING_TEXT)) break;
      if (!empty_element_parsed_guard_(b, "multiline_string_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_MUTATING | KW_NONMUTATING
  static boolean mutation_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mutation_modifier")) return false;
    if (!nextTokenIs(b, "", KW_MUTATING, KW_NONMUTATING)) return false;
    boolean r;
    r = consumeToken(b, KW_MUTATING);
    if (!r) r = consumeToken(b, KW_NONMUTATING);
    return r;
  }

  /* ********************************************************** */
  // KW_NIL
  static boolean nil_literal(PsiBuilder b, int l) {
    return consumeToken(b, KW_NIL);
  }

  /* ********************************************************** */
  // OP_SUB? integer-literal | OP_SUB? floating-point-literal
  public static boolean numeric_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numeric_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMERIC_LITERAL, "<numeric literal>");
    r = numeric_literal_0(b, l + 1);
    if (!r) r = numeric_literal_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OP_SUB? integer-literal
  private static boolean numeric_literal_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numeric_literal_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = numeric_literal_0_0(b, l + 1);
    r = r && integer_literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_SUB?
  private static boolean numeric_literal_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numeric_literal_0_0")) return false;
    consumeToken(b, OP_SUB);
    return true;
  }

  // OP_SUB? floating-point-literal
  private static boolean numeric_literal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numeric_literal_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = numeric_literal_1_0(b, l + 1);
    r = r && floating_point_literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_SUB?
  private static boolean numeric_literal_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numeric_literal_1_0")) return false;
    consumeToken(b, OP_SUB);
    return true;
  }

  /* ********************************************************** */
  // KW_SOME type
  public static boolean opaque_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "opaque_type")) return false;
    if (!nextTokenIs(b, KW_SOME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_SOME);
    r = r && type(b, l + 1);
    exit_section_(b, m, OPAQUE_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // "macOS" | "iOS" | "watchOS" | "tvOS" | "visionOS" | "Linux" | "Windows"
  static boolean operating_system(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operating_system")) return false;
    boolean r;
    r = consumeToken(b, "macOS");
    if (!r) r = consumeToken(b, "iOS");
    if (!r) r = consumeToken(b, "watchOS");
    if (!r) r = consumeToken(b, "tvOS");
    if (!r) r = consumeToken(b, "visionOS");
    if (!r) r = consumeToken(b, "Linux");
    if (!r) r = consumeToken(b, "Windows");
    return r;
  }

  /* ********************************************************** */
  // prefix-operator-declaration | postfix-operator-declaration | infix-operator-declaration
  public static boolean operator_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR_DECLARATION, "<operator declaration>");
    r = prefix_operator_declaration(b, l + 1);
    if (!r) r = postfix_operator_declaration(b, l + 1);
    if (!r) r = infix_operator_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (KW_LET | KW_VAR) pattern initializer?
  static boolean optional_binding_condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optional_binding_condition")) return false;
    if (!nextTokenIs(b, "", KW_LET, KW_VAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = optional_binding_condition_0(b, l + 1);
    r = r && pattern(b, l + 1);
    r = r && optional_binding_condition_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_LET | KW_VAR
  private static boolean optional_binding_condition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optional_binding_condition_0")) return false;
    boolean r;
    r = consumeToken(b, KW_LET);
    if (!r) r = consumeToken(b, KW_VAR);
    return r;
  }

  // initializer?
  private static boolean optional_binding_condition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optional_binding_condition_2")) return false;
    initializer(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (OP_QUESTION)
  static boolean optional_chaining_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optional_chaining_expression")) return false;
    if (!nextTokenIs(b, OP_QUESTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_QUESTION);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier-pattern OP_QUESTION
  static boolean optional_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "optional_pattern")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier_pattern(b, l + 1);
    r = r && consumeToken(b, OP_QUESTION);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OP_QUESTION
  static boolean optional_type_suffix(PsiBuilder b, int l) {
    return consumeToken(b, OP_QUESTION);
  }

  /* ********************************************************** */
  // external-parameter-name-holder? internal-parameter-name-holder parameter-type-annotation (KW_ELLIPSIS | default-argument-clause?)?
  public static boolean parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter_0(b, l + 1);
    r = r && internal_parameter_name_holder(b, l + 1);
    r = r && parameter_type_annotation(b, l + 1);
    r = r && parameter_3(b, l + 1);
    exit_section_(b, m, PARAMETER, r);
    return r;
  }

  // external-parameter-name-holder?
  private static boolean parameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_0")) return false;
    external_parameter_name_holder(b, l + 1);
    return true;
  }

  // (KW_ELLIPSIS | default-argument-clause?)?
  private static boolean parameter_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_3")) return false;
    parameter_3_0(b, l + 1);
    return true;
  }

  // KW_ELLIPSIS | default-argument-clause?
  private static boolean parameter_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ELLIPSIS);
    if (!r) r = parameter_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // default-argument-clause?
  private static boolean parameter_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_3_0_1")) return false;
    default_argument_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LPAREN parameter-list? RPAREN
  public static boolean parameter_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_clause")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && parameter_clause_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, PARAMETER_CLAUSE, r);
    return r;
  }

  // parameter-list?
  private static boolean parameter_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_clause_1")) return false;
    parameter_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // parameter (COMMA parameter)*
  public static boolean parameter_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter(b, l + 1);
    r = r && parameter_list_1(b, l + 1);
    exit_section_(b, m, PARAMETER_LIST, r);
    return r;
  }

  // (COMMA parameter)*
  private static boolean parameter_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parameter_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameter_list_1", c)) break;
    }
    return true;
  }

  // COMMA parameter
  private static boolean parameter_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_INOUT | KW_BORROWING | KW_CONSUMING
  static boolean parameter_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_modifier")) return false;
    boolean r;
    r = consumeToken(b, KW_INOUT);
    if (!r) r = consumeToken(b, KW_BORROWING);
    if (!r) r = consumeToken(b, KW_CONSUMING);
    return r;
  }

  /* ********************************************************** */
  // COLON attributes? parameter-modifier? type
  static boolean parameter_type_annotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_type_annotation")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && parameter_type_annotation_1(b, l + 1);
    r = r && parameter_type_annotation_2(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // attributes?
  private static boolean parameter_type_annotation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_type_annotation_1")) return false;
    attributes(b, l + 1);
    return true;
  }

  // parameter-modifier?
  private static boolean parameter_type_annotation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_type_annotation_2")) return false;
    parameter_modifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LPAREN expression RPAREN
  static boolean parenthesized_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesized_expression")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // base-pattern type-casting-suffix?
  //   | type-checking-pattern
  public static boolean pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, PATTERN, "<pattern>");
    r = pattern_0(b, l + 1);
    if (!r) r = type_checking_pattern(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // base-pattern type-casting-suffix?
  private static boolean pattern_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = base_pattern(b, l + 1);
    r = r && pattern_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type-casting-suffix?
  private static boolean pattern_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_0_1")) return false;
    type_casting_suffix(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // pattern initializer?
  static boolean pattern_initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_initializer")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pattern(b, l + 1);
    r = r && pattern_initializer_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // initializer?
  private static boolean pattern_initializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_initializer_1")) return false;
    initializer(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // pattern-initializer (COMMA pattern-initializer)*
  public static boolean pattern_initializer_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_initializer_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN_INITIALIZER_LIST, "<pattern initializer list>");
    r = pattern_initializer(b, l + 1);
    r = r && pattern_initializer_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA pattern-initializer)*
  private static boolean pattern_initializer_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_initializer_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!pattern_initializer_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pattern_initializer_list_1", c)) break;
    }
    return true;
  }

  // COMMA pattern-initializer
  private static boolean pattern_initializer_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_initializer_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && pattern_initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "os" (LPAREN operating-system RPAREN)
  //     | "arch" (LPAREN architecture RPAREN)
  //     | "swift" (LPAREN (OP_GREATER_THAN_OR_EQ | OP_LANGLE) swift-version RPAREN)
  //     | "compiler" (LPAREN (OP_LESS_THAN_OR_EQ | OP_LANGLE) swift-version RPAREN)
  //     | "canImport" (LPAREN import-path RPAREN)
  //     | "targetEnvironment" (LPAREN environment RPAREN)
  static boolean platform_condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platform_condition")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = platform_condition_0(b, l + 1);
    if (!r) r = platform_condition_1(b, l + 1);
    if (!r) r = platform_condition_2(b, l + 1);
    if (!r) r = platform_condition_3(b, l + 1);
    if (!r) r = platform_condition_4(b, l + 1);
    if (!r) r = platform_condition_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "os" (LPAREN operating-system RPAREN)
  private static boolean platform_condition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platform_condition_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "os");
    r = r && platform_condition_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN operating-system RPAREN
  private static boolean platform_condition_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platform_condition_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && operating_system(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // "arch" (LPAREN architecture RPAREN)
  private static boolean platform_condition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platform_condition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "arch");
    r = r && platform_condition_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN architecture RPAREN
  private static boolean platform_condition_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platform_condition_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && architecture(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // "swift" (LPAREN (OP_GREATER_THAN_OR_EQ | OP_LANGLE) swift-version RPAREN)
  private static boolean platform_condition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platform_condition_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "swift");
    r = r && platform_condition_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN (OP_GREATER_THAN_OR_EQ | OP_LANGLE) swift-version RPAREN
  private static boolean platform_condition_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platform_condition_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && platform_condition_2_1_1(b, l + 1);
    r = r && swift_version(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_GREATER_THAN_OR_EQ | OP_LANGLE
  private static boolean platform_condition_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platform_condition_2_1_1")) return false;
    boolean r;
    r = consumeToken(b, OP_GREATER_THAN_OR_EQ);
    if (!r) r = consumeToken(b, OP_LANGLE);
    return r;
  }

  // "compiler" (LPAREN (OP_LESS_THAN_OR_EQ | OP_LANGLE) swift-version RPAREN)
  private static boolean platform_condition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platform_condition_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "compiler");
    r = r && platform_condition_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN (OP_LESS_THAN_OR_EQ | OP_LANGLE) swift-version RPAREN
  private static boolean platform_condition_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platform_condition_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && platform_condition_3_1_1(b, l + 1);
    r = r && swift_version(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_LESS_THAN_OR_EQ | OP_LANGLE
  private static boolean platform_condition_3_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platform_condition_3_1_1")) return false;
    boolean r;
    r = consumeToken(b, OP_LESS_THAN_OR_EQ);
    if (!r) r = consumeToken(b, OP_LANGLE);
    return r;
  }

  // "canImport" (LPAREN import-path RPAREN)
  private static boolean platform_condition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platform_condition_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "canImport");
    r = r && platform_condition_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN import-path RPAREN
  private static boolean platform_condition_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platform_condition_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && import_path(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // "targetEnvironment" (LPAREN environment RPAREN)
  private static boolean platform_condition_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platform_condition_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "targetEnvironment");
    r = r && platform_condition_5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN environment RPAREN
  private static boolean platform_condition_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platform_condition_5_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && environment(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "iOS"
  //     | "iOSApplicationExtension"
  //     | "macOS"
  //     | "macOSApplicationExtension"
  //     | "macCatalyst"
  //     | "macCatalystApplicationExtension"
  //     | "watchOS"
  //     | "watchOSApplicationExtension"
  //     | "tvOS"
  //     | "tvOSApplicationExtension"
  //     | "visionOS"
  //     | "visionOSApplicationExtension"
  static boolean platform_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "platform_name")) return false;
    boolean r;
    r = consumeToken(b, "iOS");
    if (!r) r = consumeToken(b, "iOSApplicationExtension");
    if (!r) r = consumeToken(b, "macOS");
    if (!r) r = consumeToken(b, "macOSApplicationExtension");
    if (!r) r = consumeToken(b, "macCatalyst");
    if (!r) r = consumeToken(b, "macCatalystApplicationExtension");
    if (!r) r = consumeToken(b, "watchOS");
    if (!r) r = consumeToken(b, "watchOSApplicationExtension");
    if (!r) r = consumeToken(b, "tvOS");
    if (!r) r = consumeToken(b, "tvOSApplicationExtension");
    if (!r) r = consumeToken(b, "visionOS");
    if (!r) r = consumeToken(b, "visionOSApplicationExtension");
    return r;
  }

  /* ********************************************************** */
  // (KW_PND_COLORLITERAL (LPAREN (("red" COLON expression) COMMA) (("green" COLON expression) COMMA) (("blue" COLON expression) COMMA) (("alpha" COLON expression) COMMA?) RPAREN)) | (KW_PND_FILELITERAL | KW_PND_IMAGELITERAL) (LPAREN "resourceName" COLON expression RPAREN)
  static boolean playground_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "playground_literal")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = playground_literal_0(b, l + 1);
    if (!r) r = playground_literal_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_PND_COLORLITERAL (LPAREN (("red" COLON expression) COMMA) (("green" COLON expression) COMMA) (("blue" COLON expression) COMMA) (("alpha" COLON expression) COMMA?) RPAREN)
  private static boolean playground_literal_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "playground_literal_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_PND_COLORLITERAL);
    r = r && playground_literal_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN (("red" COLON expression) COMMA) (("green" COLON expression) COMMA) (("blue" COLON expression) COMMA) (("alpha" COLON expression) COMMA?) RPAREN
  private static boolean playground_literal_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "playground_literal_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && playground_literal_0_1_1(b, l + 1);
    r = r && playground_literal_0_1_2(b, l + 1);
    r = r && playground_literal_0_1_3(b, l + 1);
    r = r && playground_literal_0_1_4(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("red" COLON expression) COMMA
  private static boolean playground_literal_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "playground_literal_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = playground_literal_0_1_1_0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // "red" COLON expression
  private static boolean playground_literal_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "playground_literal_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "red");
    r = r && consumeToken(b, COLON);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("green" COLON expression) COMMA
  private static boolean playground_literal_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "playground_literal_0_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = playground_literal_0_1_2_0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // "green" COLON expression
  private static boolean playground_literal_0_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "playground_literal_0_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "green");
    r = r && consumeToken(b, COLON);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("blue" COLON expression) COMMA
  private static boolean playground_literal_0_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "playground_literal_0_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = playground_literal_0_1_3_0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // "blue" COLON expression
  private static boolean playground_literal_0_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "playground_literal_0_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "blue");
    r = r && consumeToken(b, COLON);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("alpha" COLON expression) COMMA?
  private static boolean playground_literal_0_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "playground_literal_0_1_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = playground_literal_0_1_4_0(b, l + 1);
    r = r && playground_literal_0_1_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "alpha" COLON expression
  private static boolean playground_literal_0_1_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "playground_literal_0_1_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "alpha");
    r = r && consumeToken(b, COLON);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean playground_literal_0_1_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "playground_literal_0_1_4_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // (KW_PND_FILELITERAL | KW_PND_IMAGELITERAL) (LPAREN "resourceName" COLON expression RPAREN)
  private static boolean playground_literal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "playground_literal_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = playground_literal_1_0(b, l + 1);
    r = r && playground_literal_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_PND_FILELITERAL | KW_PND_IMAGELITERAL
  private static boolean playground_literal_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "playground_literal_1_0")) return false;
    boolean r;
    r = consumeToken(b, KW_PND_FILELITERAL);
    if (!r) r = consumeToken(b, KW_PND_IMAGELITERAL);
    return r;
  }

  // LPAREN "resourceName" COLON expression RPAREN
  private static boolean playground_literal_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "playground_literal_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && consumeToken(b, "resourceName");
    r = r && consumeToken(b, COLON);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // base-postfix-expression (postfix-operator | function-call-expression | initializer-expression | explicit-member-expression | postfix-self-expression | subscript-expression | forced-value-expression | optional-chaining-expression)?
  static boolean postfix_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfix_expression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = base_postfix_expression(b, l + 1);
    r = r && postfix_expression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (postfix-operator | function-call-expression | initializer-expression | explicit-member-expression | postfix-self-expression | subscript-expression | forced-value-expression | optional-chaining-expression)?
  private static boolean postfix_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfix_expression_1")) return false;
    postfix_expression_1_0(b, l + 1);
    return true;
  }

  // postfix-operator | function-call-expression | initializer-expression | explicit-member-expression | postfix-self-expression | subscript-expression | forced-value-expression | optional-chaining-expression
  private static boolean postfix_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfix_expression_1_0")) return false;
    boolean r;
    r = postfix_operator(b, l + 1);
    if (!r) r = function_call_expression(b, l + 1);
    if (!r) r = initializer_expression(b, l + 1);
    if (!r) r = explicit_member_expression(b, l + 1);
    if (!r) r = postfix_self_expression(b, l + 1);
    if (!r) r = subscript_expression(b, l + 1);
    if (!r) r = forced_value_expression(b, l + 1);
    if (!r) r = optional_chaining_expression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // OPERATOR
  static boolean postfix_operator(PsiBuilder b, int l) {
    return consumeToken(b, OPERATOR);
  }

  /* ********************************************************** */
  // KW_POSTFIX KW_OPERATOR OPERATOR
  static boolean postfix_operator_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfix_operator_declaration")) return false;
    if (!nextTokenIs(b, KW_POSTFIX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_POSTFIX, KW_OPERATOR, OPERATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DOT KW_LOWER_SELF
  static boolean postfix_self_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfix_self_expression")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, KW_LOWER_SELF);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_ASSIGNMENT COLON boolean-literal
  static boolean precedence_group_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precedence_group_assignment")) return false;
    if (!nextTokenIs(b, KW_ASSIGNMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_ASSIGNMENT, COLON);
    r = r && boolean_literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_ASSOCIATIVITY COLON ("left" | "right" | "none")
  static boolean precedence_group_associativity(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precedence_group_associativity")) return false;
    if (!nextTokenIs(b, KW_ASSOCIATIVITY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_ASSOCIATIVITY, COLON);
    r = r && precedence_group_associativity_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "left" | "right" | "none"
  private static boolean precedence_group_associativity_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precedence_group_associativity_2")) return false;
    boolean r;
    r = consumeToken(b, "left");
    if (!r) r = consumeToken(b, "right");
    if (!r) r = consumeToken(b, "none");
    return r;
  }

  /* ********************************************************** */
  // precedence-group-relation | precedence-group-assignment | precedence-group-associativity
  static boolean precedence_group_attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precedence_group_attribute")) return false;
    boolean r;
    r = precedence_group_relation(b, l + 1);
    if (!r) r = precedence_group_assignment(b, l + 1);
    if (!r) r = precedence_group_associativity(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // precedence-group-attribute (precedence-group-attribute)*
  static boolean precedence_group_attributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precedence_group_attributes")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = precedence_group_attribute(b, l + 1);
    r = r && precedence_group_attributes_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (precedence-group-attribute)*
  private static boolean precedence_group_attributes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precedence_group_attributes_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!precedence_group_attributes_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "precedence_group_attributes_1", c)) break;
    }
    return true;
  }

  // (precedence-group-attribute)
  private static boolean precedence_group_attributes_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precedence_group_attributes_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = precedence_group_attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_PRECEDENCEGROUP precedence-group-name (LBRACE precedence-group-attributes? RBRACE)
  public static boolean precedence_group_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precedence_group_declaration")) return false;
    if (!nextTokenIs(b, KW_PRECEDENCEGROUP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_PRECEDENCEGROUP);
    r = r && precedence_group_name(b, l + 1);
    r = r && precedence_group_declaration_2(b, l + 1);
    exit_section_(b, m, PRECEDENCE_GROUP_DECLARATION, r);
    return r;
  }

  // LBRACE precedence-group-attributes? RBRACE
  private static boolean precedence_group_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precedence_group_declaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && precedence_group_declaration_2_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // precedence-group-attributes?
  private static boolean precedence_group_declaration_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precedence_group_declaration_2_1")) return false;
    precedence_group_attributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean precedence_group_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precedence_group_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, PRECEDENCE_GROUP_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // precedence-group-name (COMMA precedence-group-name)*
  static boolean precedence_group_names(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precedence_group_names")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = precedence_group_name(b, l + 1);
    r = r && precedence_group_names_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA precedence-group-name)*
  private static boolean precedence_group_names_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precedence_group_names_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!precedence_group_names_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "precedence_group_names_1", c)) break;
    }
    return true;
  }

  // COMMA precedence-group-name
  private static boolean precedence_group_names_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precedence_group_names_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && precedence_group_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (KW_HIGHER_THAN COLON |  KW_LOWER_THAN COLON) precedence-group-names
  static boolean precedence_group_relation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precedence_group_relation")) return false;
    if (!nextTokenIs(b, "", KW_HIGHER_THAN, KW_LOWER_THAN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = precedence_group_relation_0(b, l + 1);
    r = r && precedence_group_names(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_HIGHER_THAN COLON |  KW_LOWER_THAN COLON
  private static boolean precedence_group_relation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precedence_group_relation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, KW_HIGHER_THAN, COLON);
    if (!r) r = parseTokens(b, 0, KW_LOWER_THAN, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // prefix-operator? postfix-expression | in-out-expression
  static boolean prefix_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix_expression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prefix_expression_0(b, l + 1);
    if (!r) r = in_out_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // prefix-operator? postfix-expression
  private static boolean prefix_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prefix_expression_0_0(b, l + 1);
    r = r && postfix_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // prefix-operator?
  private static boolean prefix_expression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix_expression_0_0")) return false;
    prefix_operator(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // OPERATOR
  static boolean prefix_operator(PsiBuilder b, int l) {
    return consumeToken(b, OPERATOR);
  }

  /* ********************************************************** */
  // KW_PREFIX KW_OPERATOR OPERATOR
  static boolean prefix_operator_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix_operator_declaration")) return false;
    if (!nextTokenIs(b, KW_PREFIX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_PREFIX, KW_OPERATOR, OPERATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // primary-expression-identifier generic-argument-clause? | literal-expression | self-expression | superclass-expression | conditional-expression | closure-expression | parenthesized-expression | tuple-expression | implicit-member-expression | wildcard-expression | macro-expansion-expression | key-path-expression | selector-expression | key-path-string-expression
  static boolean primary_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_expression_0(b, l + 1);
    if (!r) r = literal_expression(b, l + 1);
    if (!r) r = self_expression(b, l + 1);
    if (!r) r = superclass_expression(b, l + 1);
    if (!r) r = conditional_expression(b, l + 1);
    if (!r) r = closure_expression(b, l + 1);
    if (!r) r = parenthesized_expression(b, l + 1);
    if (!r) r = tuple_expression(b, l + 1);
    if (!r) r = implicit_member_expression(b, l + 1);
    if (!r) r = wildcard_expression(b, l + 1);
    if (!r) r = macro_expansion_expression(b, l + 1);
    if (!r) r = key_path_expression(b, l + 1);
    if (!r) r = selector_expression(b, l + 1);
    if (!r) r = key_path_string_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // primary-expression-identifier generic-argument-clause?
  private static boolean primary_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_expression_identifier(b, l + 1);
    r = r && primary_expression_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // generic-argument-clause?
  private static boolean primary_expression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression_0_1")) return false;
    generic_argument_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  static boolean primary_expression_identifier(PsiBuilder b, int l) {
    return consumeToken(b, IDENTIFIER);
  }

  /* ********************************************************** */
  // attributes? access-level-modifier? KW_ASSOCIATEDTYPE typealias-name type-inheritance-clause? typealias-assignment? generic-where-clause?
  public static boolean protocol_associated_type_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_associated_type_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROTOCOL_ASSOCIATED_TYPE_DECLARATION, "<protocol associated type declaration>");
    r = protocol_associated_type_declaration_0(b, l + 1);
    r = r && protocol_associated_type_declaration_1(b, l + 1);
    r = r && consumeToken(b, KW_ASSOCIATEDTYPE);
    r = r && typealias_name(b, l + 1);
    r = r && protocol_associated_type_declaration_4(b, l + 1);
    r = r && protocol_associated_type_declaration_5(b, l + 1);
    r = r && protocol_associated_type_declaration_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attributes?
  private static boolean protocol_associated_type_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_associated_type_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // access-level-modifier?
  private static boolean protocol_associated_type_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_associated_type_declaration_1")) return false;
    access_level_modifier(b, l + 1);
    return true;
  }

  // type-inheritance-clause?
  private static boolean protocol_associated_type_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_associated_type_declaration_4")) return false;
    type_inheritance_clause(b, l + 1);
    return true;
  }

  // typealias-assignment?
  private static boolean protocol_associated_type_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_associated_type_declaration_5")) return false;
    typealias_assignment(b, l + 1);
    return true;
  }

  // generic-where-clause?
  private static boolean protocol_associated_type_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_associated_type_declaration_6")) return false;
    generic_where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LBRACE protocol-members? RBRACE
  static boolean protocol_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_body")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && protocol_body_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // protocol-members?
  private static boolean protocol_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_body_1")) return false;
    protocol_members(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // type-identifier (OP_BITWISE_AND type-identifier)+
  public static boolean protocol_composition_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_composition_type")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_identifier(b, l + 1);
    r = r && protocol_composition_type_1(b, l + 1);
    exit_section_(b, m, PROTOCOL_COMPOSITION_TYPE, r);
    return r;
  }

  // (OP_BITWISE_AND type-identifier)+
  private static boolean protocol_composition_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_composition_type_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = protocol_composition_type_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!protocol_composition_type_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "protocol_composition_type_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_BITWISE_AND type-identifier
  private static boolean protocol_composition_type_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_composition_type_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_BITWISE_AND);
    r = r && type_identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // attributes? access-level-modifier? KW_LOWER_PROTOCOL_DECL protocol-name type-inheritance-clause? generic-where-clause? protocol-body
  public static boolean protocol_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROTOCOL_DECLARATION, "<protocol declaration>");
    r = protocol_declaration_0(b, l + 1);
    r = r && protocol_declaration_1(b, l + 1);
    r = r && consumeToken(b, KW_LOWER_PROTOCOL_DECL);
    r = r && protocol_name(b, l + 1);
    r = r && protocol_declaration_4(b, l + 1);
    r = r && protocol_declaration_5(b, l + 1);
    r = r && protocol_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attributes?
  private static boolean protocol_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // access-level-modifier?
  private static boolean protocol_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_declaration_1")) return false;
    access_level_modifier(b, l + 1);
    return true;
  }

  // type-inheritance-clause?
  private static boolean protocol_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_declaration_4")) return false;
    type_inheritance_clause(b, l + 1);
    return true;
  }

  // generic-where-clause?
  private static boolean protocol_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_declaration_5")) return false;
    generic_where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // initializer-head generic-parameter-clause? parameter-clause throws-clause? generic-where-clause? | initializer-head generic-parameter-clause? parameter-clause KW_RETHROWS generic-where-clause?
  static boolean protocol_initializer_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_initializer_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = protocol_initializer_declaration_0(b, l + 1);
    if (!r) r = protocol_initializer_declaration_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // initializer-head generic-parameter-clause? parameter-clause throws-clause? generic-where-clause?
  private static boolean protocol_initializer_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_initializer_declaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = initializer_head(b, l + 1);
    r = r && protocol_initializer_declaration_0_1(b, l + 1);
    r = r && parameter_clause(b, l + 1);
    r = r && protocol_initializer_declaration_0_3(b, l + 1);
    r = r && protocol_initializer_declaration_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // generic-parameter-clause?
  private static boolean protocol_initializer_declaration_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_initializer_declaration_0_1")) return false;
    generic_parameter_clause(b, l + 1);
    return true;
  }

  // throws-clause?
  private static boolean protocol_initializer_declaration_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_initializer_declaration_0_3")) return false;
    throws_clause(b, l + 1);
    return true;
  }

  // generic-where-clause?
  private static boolean protocol_initializer_declaration_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_initializer_declaration_0_4")) return false;
    generic_where_clause(b, l + 1);
    return true;
  }

  // initializer-head generic-parameter-clause? parameter-clause KW_RETHROWS generic-where-clause?
  private static boolean protocol_initializer_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_initializer_declaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = initializer_head(b, l + 1);
    r = r && protocol_initializer_declaration_1_1(b, l + 1);
    r = r && parameter_clause(b, l + 1);
    r = r && consumeToken(b, KW_RETHROWS);
    r = r && protocol_initializer_declaration_1_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // generic-parameter-clause?
  private static boolean protocol_initializer_declaration_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_initializer_declaration_1_1")) return false;
    generic_parameter_clause(b, l + 1);
    return true;
  }

  // generic-where-clause?
  private static boolean protocol_initializer_declaration_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_initializer_declaration_1_4")) return false;
    generic_where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // protocol-member-declaration | compiler-control-statement
  static boolean protocol_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_member")) return false;
    boolean r;
    r = protocol_member_declaration(b, l + 1);
    if (!r) r = compiler_control_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // protocol-method-declaration | protocol-initializer-declaration | protocol-subscript-declaration | protocol-associated-type-declaration | typealias-declaration | protocol-variable-declaration
  public static boolean protocol_member_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_member_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROTOCOL_MEMBER_DECLARATION, "<protocol member declaration>");
    r = protocol_method_declaration(b, l + 1);
    if (!r) r = protocol_initializer_declaration(b, l + 1);
    if (!r) r = protocol_subscript_declaration(b, l + 1);
    if (!r) r = protocol_associated_type_declaration(b, l + 1);
    if (!r) r = typealias_declaration(b, l + 1);
    if (!r) r = protocol_variable_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // protocol-member (protocol-member)*
  static boolean protocol_members(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_members")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = protocol_member(b, l + 1);
    r = r && protocol_members_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (protocol-member)*
  private static boolean protocol_members_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_members_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!protocol_members_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "protocol_members_1", c)) break;
    }
    return true;
  }

  // (protocol-member)
  private static boolean protocol_members_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_members_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = protocol_member(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // function-head function-declaration-name generic-parameter-clause? function-signature generic-where-clause?
  static boolean protocol_method_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_method_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_head(b, l + 1);
    r = r && function_declaration_name(b, l + 1);
    r = r && protocol_method_declaration_2(b, l + 1);
    r = r && function_signature(b, l + 1);
    r = r && protocol_method_declaration_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // generic-parameter-clause?
  private static boolean protocol_method_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_method_declaration_2")) return false;
    generic_parameter_clause(b, l + 1);
    return true;
  }

  // generic-where-clause?
  private static boolean protocol_method_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_method_declaration_4")) return false;
    generic_where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean protocol_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, PROTOCOL_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // subscript-head subscript-result generic-where-clause? getter-setter-keyword-block
  static boolean protocol_subscript_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_subscript_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = subscript_head(b, l + 1);
    r = r && subscript_result(b, l + 1);
    r = r && protocol_subscript_declaration_2(b, l + 1);
    r = r && getter_setter_keyword_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // generic-where-clause?
  private static boolean protocol_subscript_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_subscript_declaration_2")) return false;
    generic_where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // variable-declaration-head variable-name type-annotation getter-setter-keyword-block
  public static boolean protocol_variable_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "protocol_variable_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROTOCOL_VARIABLE_DECLARATION, "<protocol variable declaration>");
    r = variable_declaration_head(b, l + 1);
    r = r && variable_name(b, l + 1);
    r = r && type_annotation(b, l + 1);
    r = r && getter_setter_keyword_block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OP_ASSIGNMENT raw-value-literal
  static boolean raw_value_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_value_assignment")) return false;
    if (!nextTokenIs(b, OP_ASSIGNMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_ASSIGNMENT);
    r = r && raw_value_literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // numeric-literal | static-string-literal | boolean-literal
  static boolean raw_value_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_value_literal")) return false;
    boolean r;
    r = numeric_literal(b, l + 1);
    if (!r) r = static_string_literal(b, l + 1);
    if (!r) r = boolean_literal(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // KW_ENUM enum-declaration-name generic-parameter-clause? type-inheritance-clause generic-where-clause? (LBRACE raw-value-style-enum-members RBRACE)
  public static boolean raw_value_style_enum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_value_style_enum")) return false;
    if (!nextTokenIs(b, KW_ENUM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ENUM);
    r = r && enum_declaration_name(b, l + 1);
    r = r && raw_value_style_enum_2(b, l + 1);
    r = r && type_inheritance_clause(b, l + 1);
    r = r && raw_value_style_enum_4(b, l + 1);
    r = r && raw_value_style_enum_5(b, l + 1);
    exit_section_(b, m, RAW_VALUE_STYLE_ENUM, r);
    return r;
  }

  // generic-parameter-clause?
  private static boolean raw_value_style_enum_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_value_style_enum_2")) return false;
    generic_parameter_clause(b, l + 1);
    return true;
  }

  // generic-where-clause?
  private static boolean raw_value_style_enum_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_value_style_enum_4")) return false;
    generic_where_clause(b, l + 1);
    return true;
  }

  // LBRACE raw-value-style-enum-members RBRACE
  private static boolean raw_value_style_enum_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_value_style_enum_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && raw_value_style_enum_members(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // enum-case-name raw-value-assignment?
  public static boolean raw_value_style_enum_case(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_value_style_enum_case")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enum_case_name(b, l + 1);
    r = r && raw_value_style_enum_case_1(b, l + 1);
    exit_section_(b, m, RAW_VALUE_STYLE_ENUM_CASE, r);
    return r;
  }

  // raw-value-assignment?
  private static boolean raw_value_style_enum_case_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_value_style_enum_case_1")) return false;
    raw_value_assignment(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // attributes? KW_CASE raw-value-style-enum-case-list
  public static boolean raw_value_style_enum_case_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_value_style_enum_case_clause")) return false;
    if (!nextTokenIs(b, "<raw value style enum case clause>", KW_CASE, OP_AT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RAW_VALUE_STYLE_ENUM_CASE_CLAUSE, "<raw value style enum case clause>");
    r = raw_value_style_enum_case_clause_0(b, l + 1);
    r = r && consumeToken(b, KW_CASE);
    r = r && raw_value_style_enum_case_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attributes?
  private static boolean raw_value_style_enum_case_clause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_value_style_enum_case_clause_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // raw-value-style-enum-case (COMMA raw-value-style-enum-case)*
  public static boolean raw_value_style_enum_case_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_value_style_enum_case_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = raw_value_style_enum_case(b, l + 1);
    r = r && raw_value_style_enum_case_list_1(b, l + 1);
    exit_section_(b, m, RAW_VALUE_STYLE_ENUM_CASE_LIST, r);
    return r;
  }

  // (COMMA raw-value-style-enum-case)*
  private static boolean raw_value_style_enum_case_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_value_style_enum_case_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!raw_value_style_enum_case_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "raw_value_style_enum_case_list_1", c)) break;
    }
    return true;
  }

  // COMMA raw-value-style-enum-case
  private static boolean raw_value_style_enum_case_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_value_style_enum_case_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && raw_value_style_enum_case(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // declaration | raw-value-style-enum-case-clause | compiler-control-statement
  static boolean raw_value_style_enum_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_value_style_enum_member")) return false;
    boolean r;
    r = declaration(b, l + 1);
    if (!r) r = raw_value_style_enum_case_clause(b, l + 1);
    if (!r) r = compiler_control_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // raw-value-style-enum-member (raw-value-style-enum-member)*
  public static boolean raw_value_style_enum_members(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_value_style_enum_members")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RAW_VALUE_STYLE_ENUM_MEMBERS, "<raw value style enum members>");
    r = raw_value_style_enum_member(b, l + 1);
    r = r && raw_value_style_enum_members_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (raw-value-style-enum-member)*
  private static boolean raw_value_style_enum_members_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_value_style_enum_members_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!raw_value_style_enum_members_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "raw_value_style_enum_members_1", c)) break;
    }
    return true;
  }

  // (raw-value-style-enum-member)
  private static boolean raw_value_style_enum_members_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raw_value_style_enum_members_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = raw_value_style_enum_member(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // REGEXP_LITERAL
  public static boolean regular_expression_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regular_expression_literal")) return false;
    if (!nextTokenIs(b, REGEXP_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REGEXP_LITERAL);
    exit_section_(b, m, REGULAR_EXPRESSION_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // KW_REPEAT code-block KW_WHILE expression
  static boolean repeat_while_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "repeat_while_statement")) return false;
    if (!nextTokenIs(b, KW_REPEAT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_REPEAT);
    r = r && code_block(b, l + 1);
    r = r && consumeToken(b, KW_WHILE);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // conformance-requirement | same-type-requirement
  static boolean requirement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requirement")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    r = conformance_requirement(b, l + 1);
    if (!r) r = same_type_requirement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // requirement (COMMA requirement)*
  static boolean requirement_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requirement_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = requirement(b, l + 1);
    r = r && requirement_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA requirement)*
  private static boolean requirement_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requirement_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!requirement_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "requirement_list_1", c)) break;
    }
    return true;
  }

  // COMMA requirement
  private static boolean requirement_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requirement_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && requirement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // return expression?
  static boolean return_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && return_statement_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression?
  private static boolean return_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement_1")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // type-identifier OP_EQ type
  static boolean same_type_requirement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "same_type_requirement")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_identifier(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_PND_SELECTOR (LPAREN expression RPAREN) | KW_PND_SELECTOR (LPAREN "getter" COLON expression RPAREN) | KW_PND_SELECTOR (LPAREN "setter" COLON expression RPAREN)
  static boolean selector_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selector_expression")) return false;
    if (!nextTokenIs(b, KW_PND_SELECTOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = selector_expression_0(b, l + 1);
    if (!r) r = selector_expression_1(b, l + 1);
    if (!r) r = selector_expression_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_PND_SELECTOR (LPAREN expression RPAREN)
  private static boolean selector_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selector_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_PND_SELECTOR);
    r = r && selector_expression_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN expression RPAREN
  private static boolean selector_expression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selector_expression_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_PND_SELECTOR (LPAREN "getter" COLON expression RPAREN)
  private static boolean selector_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selector_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_PND_SELECTOR);
    r = r && selector_expression_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN "getter" COLON expression RPAREN
  private static boolean selector_expression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selector_expression_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && consumeToken(b, "getter");
    r = r && consumeToken(b, COLON);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_PND_SELECTOR (LPAREN "setter" COLON expression RPAREN)
  private static boolean selector_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selector_expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_PND_SELECTOR);
    r = r && selector_expression_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN "setter" COLON expression RPAREN
  private static boolean selector_expression_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selector_expression_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && consumeToken(b, "setter");
    r = r && consumeToken(b, COLON);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_LOWER_SELF | self-method-expression | self-subscript-expression | self-initializer-expression
  static boolean self_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "self_expression")) return false;
    if (!nextTokenIs(b, KW_LOWER_SELF)) return false;
    boolean r;
    r = consumeToken(b, KW_LOWER_SELF);
    if (!r) r = self_method_expression(b, l + 1);
    if (!r) r = self_subscript_expression(b, l + 1);
    if (!r) r = self_initializer_expression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // KW_LOWER_SELF DOT KW_INIT
  static boolean self_initializer_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "self_initializer_expression")) return false;
    if (!nextTokenIs(b, KW_LOWER_SELF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_LOWER_SELF, DOT, KW_INIT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_LOWER_SELF DOT self-method-expression-identifier
  static boolean self_method_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "self_method_expression")) return false;
    if (!nextTokenIs(b, KW_LOWER_SELF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_LOWER_SELF, DOT);
    r = r && self_method_expression_identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  static boolean self_method_expression_identifier(PsiBuilder b, int l) {
    return consumeToken(b, IDENTIFIER);
  }

  /* ********************************************************** */
  // KW_LOWER_SELF (LBRACKET function-call-argument-list RBRACKET)
  static boolean self_subscript_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "self_subscript_expression")) return false;
    if (!nextTokenIs(b, KW_LOWER_SELF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_LOWER_SELF);
    r = r && self_subscript_expression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACKET function-call-argument-list RBRACKET
  private static boolean self_subscript_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "self_subscript_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && function_call_argument_list(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // attributes? mutation-modifier? KW_SET setter-name? code-block
  public static boolean setter_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setter_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SETTER_CLAUSE, "<setter clause>");
    r = setter_clause_0(b, l + 1);
    r = r && setter_clause_1(b, l + 1);
    r = r && consumeToken(b, KW_SET);
    r = r && setter_clause_3(b, l + 1);
    r = r && code_block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attributes?
  private static boolean setter_clause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setter_clause_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // mutation-modifier?
  private static boolean setter_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setter_clause_1")) return false;
    mutation_modifier(b, l + 1);
    return true;
  }

  // setter-name?
  private static boolean setter_clause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setter_clause_3")) return false;
    setter_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // attributes? mutation-modifier? KW_SET
  public static boolean setter_keyword_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setter_keyword_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SETTER_KEYWORD_CLAUSE, "<setter keyword clause>");
    r = setter_keyword_clause_0(b, l + 1);
    r = r && setter_keyword_clause_1(b, l + 1);
    r = r && consumeToken(b, KW_SET);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attributes?
  private static boolean setter_keyword_clause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setter_keyword_clause_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // mutation-modifier?
  private static boolean setter_keyword_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setter_keyword_clause_1")) return false;
    mutation_modifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LPAREN misc-wrapped-identifier-token RPAREN
  public static boolean setter_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setter_name")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && misc_wrapped_identifier_token(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, SETTER_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // STRING_START STRING_TEXT* STRING_END
  static boolean singleline_string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "singleline_string")) return false;
    if (!nextTokenIs(b, STRING_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_START);
    r = r && singleline_string_1(b, l + 1);
    r = r && consumeToken(b, STRING_END);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING_TEXT*
  private static boolean singleline_string_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "singleline_string_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, STRING_TEXT)) break;
      if (!empty_element_parsed_guard_(b, "singleline_string_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // !COMMA
  static boolean skip_until_comma(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "skip_until_comma")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, COMMA);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !(KW_FUNC | KW_STRUCT | KW_CLASS | KW_ENUM | KW_PROTOCOL | KW_ACTOR | LBRACE | RBRACE)
  static boolean skip_until_decl_or_brace(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "skip_until_decl_or_brace")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !skip_until_decl_or_brace_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KW_FUNC | KW_STRUCT | KW_CLASS | KW_ENUM | KW_PROTOCOL | KW_ACTOR | LBRACE | RBRACE
  private static boolean skip_until_decl_or_brace_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "skip_until_decl_or_brace_0")) return false;
    boolean r;
    r = consumeToken(b, KW_FUNC);
    if (!r) r = consumeToken(b, KW_STRUCT);
    if (!r) r = consumeToken(b, KW_CLASS);
    if (!r) r = consumeToken(b, KW_ENUM);
    if (!r) r = consumeToken(b, KW_PROTOCOL);
    if (!r) r = consumeToken(b, KW_ACTOR);
    if (!r) r = consumeToken(b, LBRACE);
    if (!r) r = consumeToken(b, RBRACE);
    return r;
  }

  /* ********************************************************** */
  // !OP_RANGLE
  static boolean skip_until_rangle(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "skip_until_rangle")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, OP_RANGLE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !(OP_RANGLE | COMMA)
  static boolean skip_until_rangle_or_comma(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "skip_until_rangle_or_comma")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !skip_until_rangle_or_comma_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OP_RANGLE | COMMA
  private static boolean skip_until_rangle_or_comma_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "skip_until_rangle_or_comma_0")) return false;
    boolean r;
    r = consumeToken(b, OP_RANGLE);
    if (!r) r = consumeToken(b, COMMA);
    return r;
  }

  /* ********************************************************** */
  // !RBRACE
  static boolean skip_until_rbrace(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "skip_until_rbrace")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !RBRACKET
  static boolean skip_until_rbracket(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "skip_until_rbracket")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RBRACKET);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !RPAREN
  static boolean skip_until_rparen(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "skip_until_rparen")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !SEMICOLON
  static boolean skip_until_semicolon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "skip_until_semicolon")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !(KW_FUNC | KW_STRUCT | KW_CLASS | KW_ENUM | KW_PROTOCOL | KW_ACTOR | KW_TYPEALIAS | KW_VAR | KW_LET | KW_IMPORT | KW_EXTENSION | KW_OPERATOR | KW_PRECEDENCEGROUP | KW_INIT | KW_DEINIT | KW_SUBSCRIPT | KW_MACRO | EOF)
  static boolean skip_until_top_level_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "skip_until_top_level_decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !skip_until_top_level_decl_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KW_FUNC | KW_STRUCT | KW_CLASS | KW_ENUM | KW_PROTOCOL | KW_ACTOR | KW_TYPEALIAS | KW_VAR | KW_LET | KW_IMPORT | KW_EXTENSION | KW_OPERATOR | KW_PRECEDENCEGROUP | KW_INIT | KW_DEINIT | KW_SUBSCRIPT | KW_MACRO | EOF
  private static boolean skip_until_top_level_decl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "skip_until_top_level_decl_0")) return false;
    boolean r;
    r = consumeToken(b, KW_FUNC);
    if (!r) r = consumeToken(b, KW_STRUCT);
    if (!r) r = consumeToken(b, KW_CLASS);
    if (!r) r = consumeToken(b, KW_ENUM);
    if (!r) r = consumeToken(b, KW_PROTOCOL);
    if (!r) r = consumeToken(b, KW_ACTOR);
    if (!r) r = consumeToken(b, KW_TYPEALIAS);
    if (!r) r = consumeToken(b, KW_VAR);
    if (!r) r = consumeToken(b, KW_LET);
    if (!r) r = consumeToken(b, KW_IMPORT);
    if (!r) r = consumeToken(b, KW_EXTENSION);
    if (!r) r = consumeToken(b, KW_OPERATOR);
    if (!r) r = consumeToken(b, KW_PRECEDENCEGROUP);
    if (!r) r = consumeToken(b, KW_INIT);
    if (!r) r = consumeToken(b, KW_DEINIT);
    if (!r) r = consumeToken(b, KW_SUBSCRIPT);
    if (!r) r = consumeToken(b, KW_MACRO);
    if (!r) r = consumeToken(b, EOF);
    return r;
  }

  /* ********************************************************** */
  // (expression | declaration | loop-statement | branch-statement | labeled-statement | control-transfer-statement | defer-statement | do-statement) SEMICOLON?
  //   | compiler-control-statement
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = statement_0(b, l + 1);
    if (!r) r = compiler_control_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (expression | declaration | loop-statement | branch-statement | labeled-statement | control-transfer-statement | defer-statement | do-statement) SEMICOLON?
  private static boolean statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement_0_0(b, l + 1);
    r = r && statement_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression | declaration | loop-statement | branch-statement | labeled-statement | control-transfer-statement | defer-statement | do-statement
  private static boolean statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0_0")) return false;
    boolean r;
    r = expression(b, l + 1);
    if (!r) r = declaration(b, l + 1);
    if (!r) r = loop_statement(b, l + 1);
    if (!r) r = branch_statement(b, l + 1);
    if (!r) r = labeled_statement(b, l + 1);
    if (!r) r = control_transfer_statement(b, l + 1);
    if (!r) r = defer_statement(b, l + 1);
    if (!r) r = do_statement(b, l + 1);
    return r;
  }

  // SEMICOLON?
  private static boolean statement_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0_1")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // label-name COLON
  public static boolean statement_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_label")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label_name(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, STATEMENT_LABEL, r);
    return r;
  }

  /* ********************************************************** */
  // statement (statement)*
  public static boolean statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENTS, "<statements>");
    r = statement(b, l + 1);
    r = r && statements_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (statement)*
  private static boolean statements_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statements_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statements_1", c)) break;
    }
    return true;
  }

  // (statement)
  private static boolean statements_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // singleline-string | multiline-string
  static boolean static_string_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_string_literal")) return false;
    if (!nextTokenIs(b, "", MULTILINE_STRING_START, STRING_START)) return false;
    boolean r;
    r = singleline_string(b, l + 1);
    if (!r) r = multiline_string(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // static-string-literal | interpolated-string-literal
  public static boolean string_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal")) return false;
    if (!nextTokenIs(b, "<string literal>", MULTILINE_STRING_START, STRING_START)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_LITERAL, "<string literal>");
    r = static_string_literal(b, l + 1);
    if (!r) r = interpolated_string_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBRACE struct-members? RBRACE
  static boolean struct_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_body")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && struct_body_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // struct-members?
  private static boolean struct_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_body_1")) return false;
    struct_members(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // attributes? access-level-modifier? KW_STRUCT struct-name generic-parameter-clause? type-inheritance-clause? generic-where-clause? struct-body
  public static boolean struct_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_DECLARATION, "<struct declaration>");
    r = struct_declaration_0(b, l + 1);
    r = r && struct_declaration_1(b, l + 1);
    r = r && consumeToken(b, KW_STRUCT);
    r = r && struct_name(b, l + 1);
    r = r && struct_declaration_4(b, l + 1);
    r = r && struct_declaration_5(b, l + 1);
    r = r && struct_declaration_6(b, l + 1);
    r = r && struct_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attributes?
  private static boolean struct_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // access-level-modifier?
  private static boolean struct_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_1")) return false;
    access_level_modifier(b, l + 1);
    return true;
  }

  // generic-parameter-clause?
  private static boolean struct_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_4")) return false;
    generic_parameter_clause(b, l + 1);
    return true;
  }

  // type-inheritance-clause?
  private static boolean struct_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_5")) return false;
    type_inheritance_clause(b, l + 1);
    return true;
  }

  // generic-where-clause?
  private static boolean struct_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_6")) return false;
    generic_where_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // declaration | compiler-control-statement
  static boolean struct_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_member")) return false;
    boolean r;
    r = declaration(b, l + 1);
    if (!r) r = compiler_control_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // struct-member (struct-member)*
  static boolean struct_members(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_members")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_member(b, l + 1);
    r = r && struct_members_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (struct-member)*
  private static boolean struct_members_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_members_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!struct_members_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "struct_members_1", c)) break;
    }
    return true;
  }

  // (struct-member)
  private static boolean struct_members_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_members_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_member(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean struct_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, STRUCT_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // subscript-head subscript-result generic-where-clause? (code-block | getter-setter-block | getter-setter-keyword-block)
  public static boolean subscript_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subscript_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBSCRIPT_DECLARATION, "<subscript declaration>");
    r = subscript_head(b, l + 1);
    r = r && subscript_result(b, l + 1);
    r = r && subscript_declaration_2(b, l + 1);
    r = r && subscript_declaration_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // generic-where-clause?
  private static boolean subscript_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subscript_declaration_2")) return false;
    generic_where_clause(b, l + 1);
    return true;
  }

  // code-block | getter-setter-block | getter-setter-keyword-block
  private static boolean subscript_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subscript_declaration_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = code_block(b, l + 1);
    if (!r) r = getter_setter_block(b, l + 1);
    if (!r) r = getter_setter_keyword_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET function-call-argument-list RBRACKET
  static boolean subscript_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subscript_expression")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && function_call_argument_list(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // attributes? declaration-modifiers? KW_SUBSCRIPT generic-parameter-clause? parameter-clause
  static boolean subscript_head(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subscript_head")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = subscript_head_0(b, l + 1);
    r = r && subscript_head_1(b, l + 1);
    r = r && consumeToken(b, KW_SUBSCRIPT);
    r = r && subscript_head_3(b, l + 1);
    r = r && parameter_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // attributes?
  private static boolean subscript_head_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subscript_head_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // declaration-modifiers?
  private static boolean subscript_head_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subscript_head_1")) return false;
    declaration_modifiers(b, l + 1);
    return true;
  }

  // generic-parameter-clause?
  private static boolean subscript_head_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subscript_head_3")) return false;
    generic_parameter_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_FWD_ARROW attributes? type
  static boolean subscript_result(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subscript_result")) return false;
    if (!nextTokenIs(b, KW_FWD_ARROW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FWD_ARROW);
    r = r && subscript_result_1(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // attributes?
  private static boolean subscript_result_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subscript_result_1")) return false;
    attributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // superclass-method-expression | superclass-subscript-expression | superclass-initializer-expression
  static boolean superclass_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "superclass_expression")) return false;
    if (!nextTokenIs(b, KW_SUPER)) return false;
    boolean r;
    r = superclass_method_expression(b, l + 1);
    if (!r) r = superclass_subscript_expression(b, l + 1);
    if (!r) r = superclass_initializer_expression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // KW_SUPER DOT KW_INIT
  static boolean superclass_initializer_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "superclass_initializer_expression")) return false;
    if (!nextTokenIs(b, KW_SUPER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_SUPER, DOT, KW_INIT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_SUPER DOT superclass-method-expression-identifier
  public static boolean superclass_method_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "superclass_method_expression")) return false;
    if (!nextTokenIs(b, KW_SUPER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_SUPER, DOT);
    r = r && superclass_method_expression_identifier(b, l + 1);
    exit_section_(b, m, SUPERCLASS_METHOD_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  static boolean superclass_method_expression_identifier(PsiBuilder b, int l) {
    return consumeToken(b, IDENTIFIER);
  }

  /* ********************************************************** */
  // KW_SUPER LBRACKET function-call-argument-list RBRACKET
  static boolean superclass_subscript_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "superclass_subscript_expression")) return false;
    if (!nextTokenIs(b, KW_SUPER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_SUPER, LBRACKET);
    r = r && function_call_argument_list(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DECIMAL_LITERAL (DOT DECIMAL_LITERAL)*
  static boolean swift_version(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "swift_version")) return false;
    if (!nextTokenIs(b, DECIMAL_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DECIMAL_LITERAL);
    r = r && swift_version_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DOT DECIMAL_LITERAL)*
  private static boolean swift_version_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "swift_version_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!swift_version_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "swift_version_1", c)) break;
    }
    return true;
  }

  // DOT DECIMAL_LITERAL
  private static boolean swift_version_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "swift_version_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, DECIMAL_LITERAL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // top-level-declaration?
  static boolean swiftFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "swiftFile")) return false;
    top_level_declaration(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // case-label statements | default-label statements | conditional-switch-case
  static boolean switch_case(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_case")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = switch_case_0(b, l + 1);
    if (!r) r = switch_case_1(b, l + 1);
    if (!r) r = conditional_switch_case(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // case-label statements
  private static boolean switch_case_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_case_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = case_label(b, l + 1);
    r = r && statements(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // default-label statements
  private static boolean switch_case_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_case_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = default_label(b, l + 1);
    r = r && statements(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // switch-case (switch-case)*
  static boolean switch_cases(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_cases")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = switch_case(b, l + 1);
    r = r && switch_cases_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (switch-case)*
  private static boolean switch_cases_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_cases_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!switch_cases_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "switch_cases_1", c)) break;
    }
    return true;
  }

  // (switch-case)
  private static boolean switch_cases_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_cases_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = switch_case(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // else-directive switch-cases?
  static boolean switch_else_directive_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_else_directive_clause")) return false;
    if (!nextTokenIs(b, KW_PND_ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = else_directive(b, l + 1);
    r = r && switch_else_directive_clause_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // switch-cases?
  private static boolean switch_else_directive_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_else_directive_clause_1")) return false;
    switch_cases(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // elseif-directive compilation-condition switch-cases?
  static boolean switch_elseif_directive_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_elseif_directive_clause")) return false;
    if (!nextTokenIs(b, KW_PND_ELSEIF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = elseif_directive(b, l + 1);
    r = r && compilation_condition(b, l + 1);
    r = r && switch_elseif_directive_clause_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // switch-cases?
  private static boolean switch_elseif_directive_clause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_elseif_directive_clause_2")) return false;
    switch_cases(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // elseif-directive-clause (elseif-directive-clause)*
  static boolean switch_elseif_directive_clauses(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_elseif_directive_clauses")) return false;
    if (!nextTokenIs(b, KW_PND_ELSEIF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = elseif_directive_clause(b, l + 1);
    r = r && switch_elseif_directive_clauses_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (elseif-directive-clause)*
  private static boolean switch_elseif_directive_clauses_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_elseif_directive_clauses_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!switch_elseif_directive_clauses_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "switch_elseif_directive_clauses_1", c)) break;
    }
    return true;
  }

  // (elseif-directive-clause)
  private static boolean switch_elseif_directive_clauses_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_elseif_directive_clauses_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = elseif_directive_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_SWITCH expression (LBRACE switch-expression-cases RBRACE)
  static boolean switch_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_expression")) return false;
    if (!nextTokenIs(b, KW_SWITCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_SWITCH);
    r = r && expression(b, l + 1);
    r = r && switch_expression_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE switch-expression-cases RBRACE
  private static boolean switch_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && switch_expression_cases(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // case-label statement | default-label statement
  static boolean switch_expression_case(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_expression_case")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = switch_expression_case_0(b, l + 1);
    if (!r) r = switch_expression_case_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // case-label statement
  private static boolean switch_expression_case_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_expression_case_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = case_label(b, l + 1);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // default-label statement
  private static boolean switch_expression_case_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_expression_case_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = default_label(b, l + 1);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // switch-expression-case (switch-expression-case)*
  static boolean switch_expression_cases(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_expression_cases")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = switch_expression_case(b, l + 1);
    r = r && switch_expression_cases_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (switch-expression-case)*
  private static boolean switch_expression_cases_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_expression_cases_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!switch_expression_cases_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "switch_expression_cases_1", c)) break;
    }
    return true;
  }

  // (switch-expression-case)
  private static boolean switch_expression_cases_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_expression_cases_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = switch_expression_case(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // if-directive compilation-condition switch-cases?
  static boolean switch_if_directive_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_if_directive_clause")) return false;
    if (!nextTokenIs(b, KW_PND_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = if_directive(b, l + 1);
    r = r && compilation_condition(b, l + 1);
    r = r && switch_if_directive_clause_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // switch-cases?
  private static boolean switch_if_directive_clause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_if_directive_clause_2")) return false;
    switch_cases(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // switch expression (LBRACE switch-cases? RBRACE)
  static boolean switch_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_statement")) return false;
    if (!nextTokenIs(b, SWITCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SWITCH);
    r = r && expression(b, l + 1);
    r = r && switch_statement_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE switch-cases? RBRACE
  private static boolean switch_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && switch_statement_2_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // switch-cases?
  private static boolean switch_statement_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_statement_2_1")) return false;
    switch_cases(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // throw expression
  static boolean throw_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "throw_statement")) return false;
    if (!nextTokenIs(b, THROW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THROW);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_THROWS (LPAREN type RPAREN)?
  static boolean throws_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "throws_clause")) return false;
    if (!nextTokenIs(b, KW_THROWS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_THROWS);
    r = r && throws_clause_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LPAREN type RPAREN)?
  private static boolean throws_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "throws_clause_1")) return false;
    throws_clause_1_0(b, l + 1);
    return true;
  }

  // LPAREN type RPAREN
  private static boolean throws_clause_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "throws_clause_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // statements
  public static boolean top_level_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_level_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TOP_LEVEL_DECLARATION, "<top level declaration>");
    r = statements(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // misc-wrapped-identifier-token COLON
  static boolean trailing_closure_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trailing_closure_label")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = misc_wrapped_identifier_token(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // closure-expression (trailing-closure-label closure-expression)*
  static boolean trailing_closures(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trailing_closures")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = closure_expression(b, l + 1);
    r = r && trailing_closures_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (trailing-closure-label closure-expression)*
  private static boolean trailing_closures_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trailing_closures_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!trailing_closures_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "trailing_closures_1", c)) break;
    }
    return true;
  }

  // trailing-closure-label closure-expression
  private static boolean trailing_closures_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trailing_closures_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = trailing_closure_label(b, l + 1);
    r = r && closure_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_TRY (OP_QUESTION | OP_NOT)?
  static boolean try_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_operator")) return false;
    if (!nextTokenIs(b, KW_TRY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_TRY);
    r = r && try_operator_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_QUESTION | OP_NOT)?
  private static boolean try_operator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_operator_1")) return false;
    try_operator_1_0(b, l + 1);
    return true;
  }

  // OP_QUESTION | OP_NOT
  private static boolean try_operator_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_operator_1_0")) return false;
    boolean r;
    r = consumeToken(b, OP_QUESTION);
    if (!r) r = consumeToken(b, OP_NOT);
    return r;
  }

  /* ********************************************************** */
  // expression | (misc-wrapped-identifier-token COLON expression)
  static boolean tuple_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_element")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    if (!r) r = tuple_element_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // misc-wrapped-identifier-token COLON expression
  private static boolean tuple_element_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_element_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = misc_wrapped_identifier_token(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // tuple-element (COMMA tuple-element)*
  static boolean tuple_element_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_element_list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tuple_element(b, l + 1);
    r = r && tuple_element_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA tuple-element)*
  private static boolean tuple_element_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_element_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tuple_element_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tuple_element_list_1", c)) break;
    }
    return true;
  }

  // COMMA tuple-element
  private static boolean tuple_element_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_element_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && tuple_element(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN (tuple-element COMMA tuple-element-list)? RPAREN
  static boolean tuple_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_expression")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && tuple_expression_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (tuple-element COMMA tuple-element-list)?
  private static boolean tuple_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_expression_1")) return false;
    tuple_expression_1_0(b, l + 1);
    return true;
  }

  // tuple-element COMMA tuple-element-list
  private static boolean tuple_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tuple_element(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && tuple_element_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN tuple-pattern-element-list? RPAREN
  public static boolean tuple_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_pattern")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && tuple_pattern_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, TUPLE_PATTERN, r);
    return r;
  }

  // tuple-pattern-element-list?
  private static boolean tuple_pattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_pattern_1")) return false;
    tuple_pattern_element_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // pattern | tuple-pattern-element-name
  public static boolean tuple_pattern_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_pattern_element")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TUPLE_PATTERN_ELEMENT, "<tuple pattern element>");
    r = pattern(b, l + 1);
    if (!r) r = tuple_pattern_element_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // tuple-pattern-element (COMMA tuple-pattern-element)*
  public static boolean tuple_pattern_element_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_pattern_element_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TUPLE_PATTERN_ELEMENT_LIST, "<tuple pattern element list>");
    r = tuple_pattern_element(b, l + 1);
    r = r && tuple_pattern_element_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA tuple-pattern-element)*
  private static boolean tuple_pattern_element_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_pattern_element_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tuple_pattern_element_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tuple_pattern_element_list_1", c)) break;
    }
    return true;
  }

  // COMMA tuple-pattern-element
  private static boolean tuple_pattern_element_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_pattern_element_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && tuple_pattern_element(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON pattern
  public static boolean tuple_pattern_element_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_pattern_element_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    r = r && pattern(b, l + 1);
    exit_section_(b, m, TUPLE_PATTERN_ELEMENT_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN (tuple-type-element (COMMA tuple-type-element)+)? RPAREN
  static boolean tuple_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_type")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && tuple_type_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (tuple-type-element (COMMA tuple-type-element)+)?
  private static boolean tuple_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_type_1")) return false;
    tuple_type_1_0(b, l + 1);
    return true;
  }

  // tuple-type-element (COMMA tuple-type-element)+
  private static boolean tuple_type_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_type_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tuple_type_element(b, l + 1);
    r = r && tuple_type_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA tuple-type-element)+
  private static boolean tuple_type_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_type_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tuple_type_1_0_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!tuple_type_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tuple_type_1_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA tuple-type-element
  private static boolean tuple_type_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_type_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && tuple_type_element(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // tuple-type-element-name type-annotation | type
  static boolean tuple_type_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_type_element")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tuple_type_element_0(b, l + 1);
    if (!r) r = type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tuple-type-element-name type-annotation
  private static boolean tuple_type_element_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_type_element_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tuple_type_element_name(b, l + 1);
    r = r && type_annotation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  static boolean tuple_type_element_name(PsiBuilder b, int l) {
    return consumeToken(b, IDENTIFIER);
  }

  /* ********************************************************** */
  // (LPAREN? base-type RPAREN?) (optional-type-suffix | implicitly-unwrapped-optional-type-suffix | metatype-type-suffix)?
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, TYPE, "<type>");
    r = type_0(b, l + 1);
    r = r && type_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LPAREN? base-type RPAREN?
  private static boolean type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_0_0(b, l + 1);
    r = r && base_type(b, l + 1);
    r = r && type_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN?
  private static boolean type_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_0_0")) return false;
    consumeToken(b, LPAREN);
    return true;
  }

  // RPAREN?
  private static boolean type_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_0_2")) return false;
    consumeToken(b, RPAREN);
    return true;
  }

  // (optional-type-suffix | implicitly-unwrapped-optional-type-suffix | metatype-type-suffix)?
  private static boolean type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1")) return false;
    type_1_0(b, l + 1);
    return true;
  }

  // optional-type-suffix | implicitly-unwrapped-optional-type-suffix | metatype-type-suffix
  private static boolean type_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1_0")) return false;
    boolean r;
    r = optional_type_suffix(b, l + 1);
    if (!r) r = implicitly_unwrapped_optional_type_suffix(b, l + 1);
    if (!r) r = metatype_type_suffix(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // COLON attributes? KW_INOUT? type
  static boolean type_annotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_annotation")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type_annotation_1(b, l + 1);
    r = r && type_annotation_2(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // attributes?
  private static boolean type_annotation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_annotation_1")) return false;
    attributes(b, l + 1);
    return true;
  }

  // KW_INOUT?
  private static boolean type_annotation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_annotation_2")) return false;
    consumeToken(b, KW_INOUT);
    return true;
  }

  /* ********************************************************** */
  // (OP_TYPE_CHECK | OP_TYPE_CAST (OP_QUESTION | OP_NOT)?) type
  static boolean type_casting_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_casting_operator")) return false;
    if (!nextTokenIs(b, "", OP_TYPE_CAST, OP_TYPE_CHECK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_casting_operator_0(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_TYPE_CHECK | OP_TYPE_CAST (OP_QUESTION | OP_NOT)?
  private static boolean type_casting_operator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_casting_operator_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_TYPE_CHECK);
    if (!r) r = type_casting_operator_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OP_TYPE_CAST (OP_QUESTION | OP_NOT)?
  private static boolean type_casting_operator_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_casting_operator_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_TYPE_CAST);
    r = r && type_casting_operator_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OP_QUESTION | OP_NOT)?
  private static boolean type_casting_operator_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_casting_operator_0_1_1")) return false;
    type_casting_operator_0_1_1_0(b, l + 1);
    return true;
  }

  // OP_QUESTION | OP_NOT
  private static boolean type_casting_operator_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_casting_operator_0_1_1_0")) return false;
    boolean r;
    r = consumeToken(b, OP_QUESTION);
    if (!r) r = consumeToken(b, OP_NOT);
    return r;
  }

  /* ********************************************************** */
  // OP_TYPE_CAST type
  static boolean type_casting_suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_casting_suffix")) return false;
    if (!nextTokenIs(b, OP_TYPE_CAST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_TYPE_CAST);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OP_TYPE_CHECK type
  static boolean type_checking_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_checking_pattern")) return false;
    if (!nextTokenIs(b, OP_TYPE_CHECK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_TYPE_CHECK);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type-name generic-argument-clause? (DOT type-name generic-argument-clause?)*
  public static boolean type_identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_identifier")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_name(b, l + 1);
    r = r && type_identifier_1(b, l + 1);
    r = r && type_identifier_2(b, l + 1);
    exit_section_(b, m, TYPE_IDENTIFIER, r);
    return r;
  }

  // generic-argument-clause?
  private static boolean type_identifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_identifier_1")) return false;
    generic_argument_clause(b, l + 1);
    return true;
  }

  // (DOT type-name generic-argument-clause?)*
  private static boolean type_identifier_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_identifier_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_identifier_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_identifier_2", c)) break;
    }
    return true;
  }

  // DOT type-name generic-argument-clause?
  private static boolean type_identifier_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_identifier_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && type_name(b, l + 1);
    r = r && type_identifier_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // generic-argument-clause?
  private static boolean type_identifier_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_identifier_2_0_2")) return false;
    generic_argument_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // COLON type-inheritance-list
  public static boolean type_inheritance_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_inheritance_clause")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type_inheritance_list(b, l + 1);
    exit_section_(b, m, TYPE_INHERITANCE_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // attributes? type-identifier (COMMA attributes? type-identifier)*
  static boolean type_inheritance_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_inheritance_list")) return false;
    if (!nextTokenIs(b, "", IDENTIFIER, OP_AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_inheritance_list_0(b, l + 1);
    r = r && type_identifier(b, l + 1);
    r = r && type_inheritance_list_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // attributes?
  private static boolean type_inheritance_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_inheritance_list_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // (COMMA attributes? type-identifier)*
  private static boolean type_inheritance_list_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_inheritance_list_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_inheritance_list_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_inheritance_list_2", c)) break;
    }
    return true;
  }

  // COMMA attributes? type-identifier
  private static boolean type_inheritance_list_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_inheritance_list_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && type_inheritance_list_2_0_1(b, l + 1);
    r = r && type_identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // attributes?
  private static boolean type_inheritance_list_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_inheritance_list_2_0_1")) return false;
    attributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean type_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, TYPE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // OP_ASSIGNMENT type
  public static boolean typealias_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typealias_assignment")) return false;
    if (!nextTokenIs(b, OP_ASSIGNMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_ASSIGNMENT);
    r = r && type(b, l + 1);
    exit_section_(b, m, TYPEALIAS_ASSIGNMENT, r);
    return r;
  }

  /* ********************************************************** */
  // attributes? access-level-modifier? KW_TYPEALIAS typealias-name generic-parameter-clause? typealias-assignment
  public static boolean typealias_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typealias_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPEALIAS_DECLARATION, "<typealias declaration>");
    r = typealias_declaration_0(b, l + 1);
    r = r && typealias_declaration_1(b, l + 1);
    r = r && consumeToken(b, KW_TYPEALIAS);
    r = r && typealias_name(b, l + 1);
    r = r && typealias_declaration_4(b, l + 1);
    r = r && typealias_assignment(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attributes?
  private static boolean typealias_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typealias_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // access-level-modifier?
  private static boolean typealias_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typealias_declaration_1")) return false;
    access_level_modifier(b, l + 1);
    return true;
  }

  // generic-parameter-clause?
  private static boolean typealias_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typealias_declaration_4")) return false;
    generic_parameter_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean typealias_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typealias_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, TYPEALIAS_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // (KW_INDIRECT? KW_ENUM enum-declaration-name) generic-parameter-clause? type-inheritance-clause? generic-where-clause? (LBRACE union-style-enum-members? RBRACE)
  public static boolean union_style_enum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_style_enum")) return false;
    if (!nextTokenIs(b, "<union style enum>", KW_ENUM, KW_INDIRECT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNION_STYLE_ENUM, "<union style enum>");
    r = union_style_enum_0(b, l + 1);
    r = r && union_style_enum_1(b, l + 1);
    r = r && union_style_enum_2(b, l + 1);
    r = r && union_style_enum_3(b, l + 1);
    r = r && union_style_enum_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KW_INDIRECT? KW_ENUM enum-declaration-name
  private static boolean union_style_enum_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_style_enum_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = union_style_enum_0_0(b, l + 1);
    r = r && consumeToken(b, KW_ENUM);
    r = r && enum_declaration_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_INDIRECT?
  private static boolean union_style_enum_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_style_enum_0_0")) return false;
    consumeToken(b, KW_INDIRECT);
    return true;
  }

  // generic-parameter-clause?
  private static boolean union_style_enum_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_style_enum_1")) return false;
    generic_parameter_clause(b, l + 1);
    return true;
  }

  // type-inheritance-clause?
  private static boolean union_style_enum_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_style_enum_2")) return false;
    type_inheritance_clause(b, l + 1);
    return true;
  }

  // generic-where-clause?
  private static boolean union_style_enum_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_style_enum_3")) return false;
    generic_where_clause(b, l + 1);
    return true;
  }

  // LBRACE union-style-enum-members? RBRACE
  private static boolean union_style_enum_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_style_enum_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && union_style_enum_4_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // union-style-enum-members?
  private static boolean union_style_enum_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_style_enum_4_1")) return false;
    union_style_enum_members(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // enum-case-name tuple-type?
  public static boolean union_style_enum_case(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_style_enum_case")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enum_case_name(b, l + 1);
    r = r && union_style_enum_case_1(b, l + 1);
    exit_section_(b, m, UNION_STYLE_ENUM_CASE, r);
    return r;
  }

  // tuple-type?
  private static boolean union_style_enum_case_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_style_enum_case_1")) return false;
    tuple_type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // attributes? KW_INDIRECT? KW_CASE union-style-enum-case-list
  public static boolean union_style_enum_case_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_style_enum_case_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNION_STYLE_ENUM_CASE_CLAUSE, "<union style enum case clause>");
    r = union_style_enum_case_clause_0(b, l + 1);
    r = r && union_style_enum_case_clause_1(b, l + 1);
    r = r && consumeToken(b, KW_CASE);
    r = r && union_style_enum_case_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attributes?
  private static boolean union_style_enum_case_clause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_style_enum_case_clause_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // KW_INDIRECT?
  private static boolean union_style_enum_case_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_style_enum_case_clause_1")) return false;
    consumeToken(b, KW_INDIRECT);
    return true;
  }

  /* ********************************************************** */
  // union-style-enum-case (COMMA union-style-enum-case)*
  public static boolean union_style_enum_case_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_style_enum_case_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = union_style_enum_case(b, l + 1);
    r = r && union_style_enum_case_list_1(b, l + 1);
    exit_section_(b, m, UNION_STYLE_ENUM_CASE_LIST, r);
    return r;
  }

  // (COMMA union-style-enum-case)*
  private static boolean union_style_enum_case_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_style_enum_case_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!union_style_enum_case_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "union_style_enum_case_list_1", c)) break;
    }
    return true;
  }

  // COMMA union-style-enum-case
  private static boolean union_style_enum_case_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_style_enum_case_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && union_style_enum_case(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // declaration | union-style-enum-case-clause | compiler-control-statement
  static boolean union_style_enum_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_style_enum_member")) return false;
    boolean r;
    r = declaration(b, l + 1);
    if (!r) r = union_style_enum_case_clause(b, l + 1);
    if (!r) r = compiler_control_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // union-style-enum-member (union-style-enum-member)*
  public static boolean union_style_enum_members(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_style_enum_members")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNION_STYLE_ENUM_MEMBERS, "<union style enum members>");
    r = union_style_enum_member(b, l + 1);
    r = r && union_style_enum_members_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (union-style-enum-member)*
  private static boolean union_style_enum_members_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_style_enum_members_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!union_style_enum_members_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "union_style_enum_members_1", c)) break;
    }
    return true;
  }

  // (union-style-enum-member)
  private static boolean union_style_enum_members_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union_style_enum_members_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = union_style_enum_member(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (KW_VAR | KW_LET) pattern
  static boolean value_binding_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_binding_pattern")) return false;
    if (!nextTokenIs(b, "", KW_LET, KW_VAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value_binding_pattern_0(b, l + 1);
    r = r && pattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_VAR | KW_LET
  private static boolean value_binding_pattern_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_binding_pattern_0")) return false;
    boolean r;
    r = consumeToken(b, KW_VAR);
    if (!r) r = consumeToken(b, KW_LET);
    return r;
  }

  /* ********************************************************** */
  // variable-declaration-head (pattern-initializer-list | variable-name (type-annotation (code-block | getter-setter-block | getter-setter-keyword-block ) | initializer willSet-didSet-block | type-annotation initializer? willSet-didSet-block))
  public static boolean variable_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DECLARATION, "<variable declaration>");
    r = variable_declaration_head(b, l + 1);
    r = r && variable_declaration_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // pattern-initializer-list | variable-name (type-annotation (code-block | getter-setter-block | getter-setter-keyword-block ) | initializer willSet-didSet-block | type-annotation initializer? willSet-didSet-block)
  private static boolean variable_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pattern_initializer_list(b, l + 1);
    if (!r) r = variable_declaration_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // variable-name (type-annotation (code-block | getter-setter-block | getter-setter-keyword-block ) | initializer willSet-didSet-block | type-annotation initializer? willSet-didSet-block)
  private static boolean variable_declaration_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_name(b, l + 1);
    r = r && variable_declaration_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type-annotation (code-block | getter-setter-block | getter-setter-keyword-block ) | initializer willSet-didSet-block | type-annotation initializer? willSet-didSet-block
  private static boolean variable_declaration_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_declaration_1_1_1_0(b, l + 1);
    if (!r) r = variable_declaration_1_1_1_1(b, l + 1);
    if (!r) r = variable_declaration_1_1_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type-annotation (code-block | getter-setter-block | getter-setter-keyword-block )
  private static boolean variable_declaration_1_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_1_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_annotation(b, l + 1);
    r = r && variable_declaration_1_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // code-block | getter-setter-block | getter-setter-keyword-block
  private static boolean variable_declaration_1_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_1_1_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = code_block(b, l + 1);
    if (!r) r = getter_setter_block(b, l + 1);
    if (!r) r = getter_setter_keyword_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // initializer willSet-didSet-block
  private static boolean variable_declaration_1_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_1_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = initializer(b, l + 1);
    r = r && willSet_didSet_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type-annotation initializer? willSet-didSet-block
  private static boolean variable_declaration_1_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_1_1_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_annotation(b, l + 1);
    r = r && variable_declaration_1_1_1_2_1(b, l + 1);
    r = r && willSet_didSet_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // initializer?
  private static boolean variable_declaration_1_1_1_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_1_1_1_2_1")) return false;
    initializer(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // attributes? declaration-modifiers? KW_VAR
  public static boolean variable_declaration_head(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_head")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DECLARATION_HEAD, "<variable declaration head>");
    r = variable_declaration_head_0(b, l + 1);
    r = r && variable_declaration_head_1(b, l + 1);
    r = r && consumeToken(b, KW_VAR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attributes?
  private static boolean variable_declaration_head_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_head_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // declaration-modifiers?
  private static boolean variable_declaration_head_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_head_1")) return false;
    declaration_modifiers(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean variable_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, VARIABLE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // KW_WHERE where-expression
  static boolean where_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "where_clause")) return false;
    if (!nextTokenIs(b, KW_WHERE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_WHERE);
    r = r && where_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression
  static boolean where_expression(PsiBuilder b, int l) {
    return expression(b, l + 1);
  }

  /* ********************************************************** */
  // KW_WHILE condition-list code-block
  static boolean while_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement")) return false;
    if (!nextTokenIs(b, KW_WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_WHILE);
    r = r && condition_list(b, l + 1);
    r = r && code_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OP_UNDERSCORE
  static boolean wildcard_expression(PsiBuilder b, int l) {
    return consumeToken(b, OP_UNDERSCORE);
  }

  /* ********************************************************** */
  // KW_UNDERSCORE
  static boolean wildcard_pattern(PsiBuilder b, int l) {
    return consumeToken(b, KW_UNDERSCORE);
  }

  /* ********************************************************** */
  // attributes? KW_WILLSET setter-name? code-block
  public static boolean willSet_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "willSet_clause")) return false;
    if (!nextTokenIs(b, "<will set clause>", KW_WILLSET, OP_AT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WILL_SET_CLAUSE, "<will set clause>");
    r = willSet_clause_0(b, l + 1);
    r = r && consumeToken(b, KW_WILLSET);
    r = r && willSet_clause_2(b, l + 1);
    r = r && code_block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attributes?
  private static boolean willSet_clause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "willSet_clause_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // setter-name?
  private static boolean willSet_clause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "willSet_clause_2")) return false;
    setter_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (LBRACE willSet-clause didSet-clause? RBRACE) | (LBRACE didSet-clause willSet-clause? RBRACE)
  public static boolean willSet_didSet_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "willSet_didSet_block")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = willSet_didSet_block_0(b, l + 1);
    if (!r) r = willSet_didSet_block_1(b, l + 1);
    exit_section_(b, m, WILL_SET_DID_SET_BLOCK, r);
    return r;
  }

  // LBRACE willSet-clause didSet-clause? RBRACE
  private static boolean willSet_didSet_block_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "willSet_didSet_block_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && willSet_clause(b, l + 1);
    r = r && willSet_didSet_block_0_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // didSet-clause?
  private static boolean willSet_didSet_block_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "willSet_didSet_block_0_2")) return false;
    didSet_clause(b, l + 1);
    return true;
  }

  // LBRACE didSet-clause willSet-clause? RBRACE
  private static boolean willSet_didSet_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "willSet_didSet_block_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && didSet_clause(b, l + 1);
    r = r && willSet_didSet_block_1_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // willSet-clause?
  private static boolean willSet_didSet_block_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "willSet_didSet_block_1_2")) return false;
    willSet_clause(b, l + 1);
    return true;
  }

}
