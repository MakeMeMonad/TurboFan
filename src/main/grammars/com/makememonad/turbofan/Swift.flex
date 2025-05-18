// Swift Language JFlex for CLion Plugin
// BEGIN FILE Swift.flex

// Reference Links:
// https://docs.swift.org/swift-book/documentation/the-swift-programming-language/aboutthelanguagereference/
// https://docs.swift.org/swift-book/documentation/the-swift-programming-language/lexicalstructure/
// https://docs.swift.org/swift-book/documentation/the-swift-programming-language/summaryofthegrammar/
// Above references are:
// Copyright © 2014–2023 Apple Inc. and the Swift project authors. All rights reserved.
   //
   //This document is made available under a Creative Commons Attribution 4.0 International (CC BY 4.0) License.
   //
   //Swift and the Swift logo are trademarks of Apple Inc.
//
// https://www.jflex.de/manual.html
// Above reference is:
	// The Fast Lexical Analyser Generator
	// Copyright © 1998–2020 by Gerwin Klein, Steve Rowe, and Régis Décamps.
	// Version 1.9.1, 11 March 2023
	// JFlex is free software, published under a BSD-style license.
	// © JFlex Team. Website text licensed under Creative Commons Attribution-NonCommercial-ShareAlike
//
//
//

		// --- JFlex Section 1: USERCODE
// The text up to the second section is copied verbatim to the top of the generated lexer class (before the actual class declaration).
package com.makememonad.turbofan.language.swift.psi.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
// Import types defined in Swift.bnf after they're generated)
// import static com.makememonad.turbofan.language.swift.psi.SwiftTypes.*

%%
		// --- JFlex Section 2: OPTIONS, CUSTOM CODE, MACRO DECLARATIONS
	// JFlex Scanner Option Switches:
%class SwiftLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
	// JFlex End-of-File/End-of-Stream Custom Code:
		// The code between the %eof{ and %eof} is executed at the end of each input stream from the file/buffer it's given
%eof{  return;
%eof}
	// JFlex Scanner Custom Code:
		// The code between %{ and %} is copied verbatim into the generated lexer class source.
		// Member variables and functions to be used inside scanner actions.
%{
  private java.util.Stack<Integer> stateStack = new java.util.Stack<>();
  private int currentExtendedDelimiterLength = 0;
%}
	// JFlex Constructor Custom Code:
%init{
  this.stateStack.push(YYINITIAL);
%init}
		// --- JFlex MACRO DECLARATIONS
LineTerm = \R
inlineSp =  [\u0009 \u0020]
SwiftLineBr = \u000A | \u000D | \u000D\u000A
wsItem = [\u0000 \u000B \u000C]
comTextItem = [^\u000A \u000D]
	// Integer and Floating Point Literal Macros:
DecimalDigit = [0-9]
BinaryDigit = [01]
OctalDigit = [0-7]
HexDigit = [0-9a-fA-F]
Sign = [+-]
FloatingPointE = [eE]
FloatingPointP = [pP]
DecimalDigitsWithUnderscores = {DecimalDigit}+ ( _ {DecimalDigit}+ )*
BinaryDigitsWithUnderscores  = {BinaryDigit}+ ( _ {BinaryDigit}+ )*
OctalDigitsWithUnderscores   = {OctalDigit}+ ( _ {OctalDigit}+ )*
HexDigitsWithUnderscores     = {HexDigit}+ ( _ {HexDigit}+ )*
DecimalBody = {DecimalDigit}+ ( _ {DecimalDigit}+ )*
BinaryBody =  {BinaryDigit}+ ( _ {BinaryDigit}+ )*
OctalBody =  {OctalDigit}+ ( _ {OctalDigit}+ )*
HexBody =  {HexDigit}+ ( _ {HexDigit}+ )*
DecimalFraction = \. {DecimalDigitsWithUnderscores}
DecimalExponent = {FloatingPointE} {Sign}? {DecimalDigitsWithUnderscores}
HexFraction = \. {HexDigitsWithUnderscores}
HexExponent = {FloatingPointP} {Sign}? {DecimalDigitsWithUnderscores}

	// String Literal Macros:
	// Escape sequences (character patterns for the escapes). The patterns *after* the backslash
EscapeSequence0       = "0"
EscapeSequenceBackslash = "\\"
EscapeSequenceT       = "t"
EscapeSequenceN       = "n"
EscapeSequenceR       = "r"
EscapeSequenceQuote   = "\""
EscapeSequenceApostrophe = "'"

UnicodeScalarDigits = {HexDigit}{1,8}
EscapeSequenceUnicode = [uU] "{" {UnicodeScalarDigits} "}"
AnyEscapedCharacterPattern = {EscapeSequence0} | {EscapeSequenceBackslash} | {EscapeSequenceT} | {EscapeSequenceN} | {EscapeSequenceR} | {EscapeSequenceQuote} | {EscapeSequenceApostrophe} | {EscapeSequenceUnicode}
EscapedNewlinePattern = \\ {inlineSp}* {LineTerm}
    // TODO: Check formatting and escaping of this rule... Specifically the escaped literal double-quote...
    //  IDE says syntax error when not escaped. JFlex may want not escaped...
QuotedTextItemPattern_SingleLine = [^\u000A\u000D\"\\]
MultilineQuotedTextItemPattern_Basic = [^\\]+
ExtendedDelimiter = #+

		// IDENTIFIER GRAMMAR SPEC 6.1

//
//		Grammar of an identifier
//        identifier → identifier-head identifier-characters?
//        identifier → ` identifier-head identifier-characters? `
//        identifier → implicit-parameter-name
//        identifier → property-wrapper-projection
//        identifier-list → identifier | identifier , identifier-list
//        identifier-head → Upper- or lowercase letter A through Z
//        identifier-head → _
//        identifier-head → U+00A8, U+00AA, U+00AD, U+00AF, U+00B2–U+00B5, or U+00B7–U+00BA
//        identifier-head → U+00BC–U+00BE, U+00C0–U+00D6, U+00D8–U+00F6, or U+00F8–U+00FF
//        identifier-head → U+0100–U+02FF, U+0370–U+167F, U+1681–U+180D, or U+180F–U+1DBF
//        identifier-head → U+1E00–U+1FFF
//        identifier-head → U+200B–U+200D, U+202A–U+202E, U+203F–U+2040, U+2054, or U+2060–U+206F
//        identifier-head → U+2070–U+20CF, U+2100–U+218F, U+2460–U+24FF, or U+2776–U+2793
//        identifier-head → U+2C00–U+2DFF or U+2E80–U+2FFF
//        identifier-head → U+3004–U+3007, U+3021–U+302F, U+3031–U+303F, or U+3040–U+D7FF
//        identifier-head → U+F900–U+FD3D, U+FD40–U+FDCF, U+FDF0–U+FE1F, or U+FE30–U+FE44
//        identifier-head → U+FE47–U+FFFD
//        identifier-head → U+10000–U+1FFFD, U+20000–U+2FFFD, U+30000–U+3FFFD, or U+40000–U+4FFFD
//        identifier-head → U+50000–U+5FFFD, U+60000–U+6FFFD, U+70000–U+7FFFD, or U+80000–U+8FFFD
//        identifier-head → U+90000–U+9FFFD, U+A0000–U+AFFFD, U+B0000–U+BFFFD, or U+C0000–U+CFFFD
//        identifier-head → U+D0000–U+DFFFD or U+E0000–U+EFFFD
//        identifier-character → Digit 0 through 9
//        identifier-character → U+0300–U+036F, U+1DC0–U+1DFF, U+20D0–U+20FF, or U+FE20–U+FE2F
//        identifier-character → identifier-head
//        identifier-characters → identifier-character identifier-characters?
//        implicit-parameter-name → $ decimal-digits
//        property-wrapper-projection → $ identifier-characters

	// Identifier Character Macros:
IdentifierHeadBasicASCII = [A-Za-z_]
	// Matched to Swift 6.1 specification.
		// The below format is structurally matched with the Swift Lang Reference's structure.
		// While condensing the ranges and using exclusions to save space is certainly possible, I'm gonna keep this format.
		// I believe this will enable easier maintenance upon language spec updates, and make it easier to cross-check with the reference.

		// One, Two: Latin supplement and spacing modifiers. Three, Four: Latin Ext, Greek, etc.
		// Five: General Punc/Format.
		// Six: SuperScript, SubScript, LetterlikeSymbols, Dingbats, whatnot.
		// Seven, Eight, Nine: Glagolitic, CJK, Rads, Ideographs, Compat, Arabic Forms, etc.
		// Ten: Specials and Replacement.
IHUR_BMP_1 = [\u00A8\u00AA\u00AD\u00AF\u00B2-\u00B5\u00B7-\u00BA]
IHUR_BMP_2 = [\u00BC-\u00BE\u00C0-\u00D6\u00D8-\u00F6\u00F8-\u00FF]
IHUR_BMP_3 = [\u0100-\u02FF\u0370-\u167F\u1681-\u180D\u180F-\u1DBF]
IHUR_BMP_4 = [\u1E00-\u1FFF]
IHUR_BMP_5 = [\u200B-\u200D\u202A-\u202E\u203F-\u2040\u2054\u2060-\u206F]
IHUR_BMP_6 = [\u2070-\u20CF\u2100-\u218F\u2460-\u24FF\u2776-\u2793]
IHUR_BMP_7 = [\u2C00-\u2DFF\u2E80-\u2FFF]
IHUR_BMP_8 = [\u3004-\u3007\u3021-\u302F\u3031-\u303F\u3040-\uD7FF]
IHUR_BMP_9 = [\uF900-\uFD3D\uFD40-\uFDCF\uFDF0-\uFE1F\uFE30-\uFE44]
IHUR_BMP_10 = [\uFE47-\uFFFD]
		// Supplementary Plane Groups (using \u{XXXXX} syntax)
		// Eleven-Fourteen: Supplement Plane Groups 1-4
IHUR_SPG_1 = [\u{10000}-\u{1FFFD}\u{20000}-\u{2FFFD}\u{30000}-\u{3FFFD}\u{40000}-\u{4FFFD}]
IHUR_SPG_2 = [\u{50000}-\u{5FFFD}\u{60000}-\u{6FFFD}\u{70000}-\u{7FFFD}\u{80000}-\u{8FFFD}]
IHUR_SPG_3 = [\u{90000}-\u{9FFFD}\u{A0000}-\u{AFFFD}\u{B0000}-\u{BFFFD}\u{C0000}-\u{CFFFD}]
IHUR_SPG_4 = [\u{D0000}-\u{DFFFD}\u{E0000}-\u{EFFFD}]
		// Final combined ranges, matched to Swift 6.1 Specification
IdentifierHeadUnicodeRanges = {IHUR_BMP_1} | {IHUR_BMP_2} | {IHUR_BMP_3} | {IHUR_BMP_4} | \
                              {IHUR_BMP_5} | {IHUR_BMP_6} | {IHUR_BMP_7} | {IHUR_BMP_8} | \
                              {IHUR_BMP_9} | {IHUR_BMP_10} | \
                              {IHUR_SPG_1} | {IHUR_SPG_2} | {IHUR_SPG_3} | {IHUR_SPG_4}

IdentifierHead = {IdentifierHeadBasicASCII} | {IdentifierHeadUnicodeRanges}
	IdentifierCharacterDigit = {DecimalDigit}
	IdentifierCharacterCombining = [\u0300-\u036F\u1DC0-\u1DFF\u20D0-\u20FF\uFE20-\uFE2F]
	IdentifierCharacterHead = {IdentifierHead}
	IdentifierCharacter = {IdentifierCharacterDigit} | {IdentifierCharacterCombining} | {IdentifierCharacterHead}



		// OPERATOR GRAMMAR SPEC 6.1

//
//Grammar of operators
//operator → operator-head operator-characters?
//operator → dot-operator-head dot-operator-characters
//operator-head → / | = | - | + | ! | * | % | < | > | & | | | ^ | ~ | ?
//operator-head → U+00A1–U+00A7
//operator-head → U+00A9 or U+00AB
//operator-head → U+00AC or U+00AE
//operator-head → U+00B0–U+00B1
//operator-head → U+00B6, U+00BB, U+00BF, U+00D7, or U+00F7
//operator-head → U+2016–U+2017
//operator-head → U+2020–U+2027
//operator-head → U+2030–U+203E
//operator-head → U+2041–U+2053
//operator-head → U+2055–U+205E
//operator-head → U+2190–U+23FF
//operator-head → U+2500–U+2775
//operator-head → U+2794–U+2BFF
//operator-head → U+2E00–U+2E7F
//operator-head → U+3001–U+3003
//operator-head → U+3008–U+3020
//operator-head → U+3030
//operator-character → operator-head
//operator-character → U+0300–U+036F
//operator-character → U+1DC0–U+1DFF
//operator-character → U+20D0–U+20FF
//operator-character → U+FE00–U+FE0F
//operator-character → U+FE20–U+FE2F
//operator-character → U+E0100–U+E01EF
//operator-characters → operator-character operator-characters?
//dot-operator-head → .
//dot-operator-character → . | operator-character
//dot-operator-characters → dot-operator-character dot-operator-characters?
//infix-operator → operator
//prefix-operator → operator
//postfix-operator → operator
//

	// Operator Character Macros:
OperatorHeadASCII = [/=\-+\*%!<>&|\^~?]
		// Split just for more manageability...
OHUR_1 = [\u00A1-\u00A7\u00A9\u00AB\u00AC\u00AE\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7]
OHUR_2 = [\u2016-\u2017\u2020-\u2027\u2030-\u203E\u2041-\u2053\u2055-\u205E\u2190-\u23FF]
OHUR_3 = [\u2500-\u2775\u2794-\u2BFF\u2E00-\u2E7F\u3001-\u3003\u3008-\u3020\u3030]
		// Final Combined Ranges
OperatorHeadUnicodeRanges = {OHUR_1} | {OHUR_2} | {OHUR_3}
OperatorHead = {OperatorHeadASCII} | {OperatorHeadUnicodeRanges}

		// One-Three: Standard Combining Marks?
		// Four: Variation Selectors. Five: Combining Half_Marks. Six: Variation Selector Supplement.
OCC_1_2_3 = [\u0300-\u036F\u1DC0-\u1DFF\u20D0-\u20FF]
OCC_4 = [\uFE00-\uFE0F]
OCC_5 = [\uFE20-\uFE2F]
OCC_6 = [\u{E0100}-\u{E01EF}]
OperatorCharacterCombining = {OCC_1_2_3} | {OCC_4} | {OCC_5} | {OCC_6}
		// Any character valid as an operator head can also be an operator character
OperatorCharacterHead = {OperatorHead}
OperatorCharacter = {OperatorCharacterCombining} | {OperatorCharacterHead}
DotOperatorHead = \.
DotOperatorCharacter = \. | {OperatorCharacter}

	// JFlex Lexical State Declarations:
%xstate INITIAL
%xstate STRING
%xstate MULTILINE_STRING
%xstate MULTILINE_COMMENT
%xstate EXTENDED_STRING
%xstate EXTENDED_MULTILINE_STRING
%xstate REGEX_LITERAL
%xstate EXTENDED_REGEX_LITERAL
%xstate STRING_INTERPOLATION_MARKER

%%
		// --- JFlex Section Three: Lexical Rules

	// Rules for <YYINITIAL> state
<YYINITIAL> {

		// STATE CHANGE: MULTILINE COMMENT START
	"/*" {
		  stateStack.push(yystate());
		  yybegin(MULTILINE_COMMENT);
		  return com.makememonad.turbofan.language.swift.psi.SwiftTypes.MULTILINE_COMMENT_START;
	  }

		// RULES: WHITESPACE, SINGLE COMMENT
	({inlineSp}|{LineTerm}|{wsItem})+ {
		  return WHITE_SPACE;}
	("//" {comTextItem}+ {LineTerm}?) {
		  return com.makememonad.turbofan.language.swift.psi.SwiftTypes.SINGLELINE_COMMENT;}

		// RULE: QUOTED/PRIVATE-USE IDENTIFIERS
	"`" {IdentifierHead}{IdentifierCharacter}* "`" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.QUOTED_IDENTIFIER;}
		// RULES: KEYWORDS reserved for distinct(?) use that begin with the POUND SIGN (#)
			// NOTE: Prior to Swift 5.9, the following keywords were reserved: #column, #dsohandle, #error, #fileID, #filePath, #file, #function, #line, and #warning.
			// NOTE: These are now implemented as macros in the Swift standard library: column, dsohandle, error(_:), fileID, filePath, file, function, line, and warning(_:).
	"#available" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_PND_AVAILABLE;}
	"#colorLiteral" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_PND_COLORLITERAL;}
	"#else" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_PND_ELSE;}
	"#elseif" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_PND_ELSEIF;}
	"#endif" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_PND_ENDIF;}
	"#fileLiteral" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_PND_FILELITERAL;}
	"#if" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_PND_IF;}
	"#imageLiteral" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_PND_IMAGELITERAL;}
	"#keyPath" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_PND_KEYPATH;}
	"#selector"  {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_PND_SELECTOR;}
	"#sourceLocation" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_PND_SOURCELOCATION;}
	"#unavailable" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_PND_UNAVAILABLE;}

		// RULES: KEYWORDS reserved for DISTINCT USE.
	"Any" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_UPPER_ANY;}
	"associatedtype" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_ASSOCIATEDTYPE;}
	"await" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_AWAIT;}
	"borrowing" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_BORROWING;}
	"break" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_BREAK;}
	"case" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_CASE;}
	"class" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_CLASS;}
	"consuming" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_CONSUMING;}
	"continue" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_CONTINUE;}
	"default" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_DEFAULT;}
	"defer" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_DEFER;}
	"deinit" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_DEINIT;}
	"do" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_DO;}
	"else" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_ELSE;}
	"enum" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_ENUM;}
	"extension" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_EXTENSION;}
	"fallthrough" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_FALLTHROUGH;}
	"false" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_FALSE;}
	"fileprivate" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_FILEPRIVATE;}
	"for" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_FOR;}
	"func" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_FUNC;}
	"guard" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_GUARD;}
	"if" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_IF;}
	"import" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_IMPORT;}
	"in" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_IN;}
	"init" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_INIT;}
	"inout" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_INOUT;}
	"internal" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_INTERNAL;}
	"let" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_LET;}
	"nil" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_NIL;}
	"nonisolated" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_NONISOLATED;}
	"open" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_OPEN;}
	"operator" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_OPERATOR;}
	"precedencegroup" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_PRECEDENCEGROUP;}
	"private" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_PRIVATE;}
	"protocol" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_LOWER_PROTOCOL_DECL;}
	"public" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_PUBLIC;}
	"repeat" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_REPEAT;}
	"return" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_RETURN;}
	"self" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_LOWER_SELF;}
	"Self" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_UPPER_SELF;}
	"static" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_STATIC;}
	"struct" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_STRUCT;}
	"super" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_SUPER;}
	"switch" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_SWITCH;}
	"subscript" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_SUBSCRIPT;}
	"throws" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_THROWS;}
	"true" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_TRUE;}
	"try" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_TRY;}
	"typealias" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_TYPEALIAS;}
	"var" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_VAR;}
	"where" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_WHERE;}
	"while" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_WHILE;}

		// RULES: KEYWORDS reserved for DIFFERING USES depending on the context. Disambiguation for these occurs during parsing according to the grammar.
	"catch" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_CATCH;}
	"throw" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_THROW;}
	"rethrows" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_RETHROWS;}

		// RULES: KEYWORDS reserved ONLY IN PARTICULAR CONTEXTS. Outside the context in which they appear in the grammar, they can be used as identifiers.
	"associativity" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_ASSOCIATIVITY;}
	"async" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_ASYNC;}
	"convenience" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_CONVENIENCE;}
	"didSet" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_DIDSET;}
	"dynamic" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_DYNAMIC;}
	"final" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_FINAL;}
	"get" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_GET;}
	"indirect" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_INDIRECT;}
	"infix" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_INFIX;}
	"lazy" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_LAZY;}
	"left" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_LEFT;}
	"mutating" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_MUTATING;}
	"none" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_NONE;}
	"nonmutating" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_NONMUTATING;}
	"optional" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_OPTIONAL;}
	"override" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_OVERRIDE;}
	"package" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_PACKAGE;}
	"postfix" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_POSTFIX;}
	"precedence" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_PRECEDENCE;}
	"prefix" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_PREFIX;}
	"Protocol" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_UPPER_PROTOCOL;}
	"required" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_REQUIRED;}
	"right" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_RIGHT;}
	"set" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_SET;}
	"some" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_SOME;}
	"Type" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_UPPER_TYPE;}
	"unowned" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_UNOWNED;}
	"weak" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_WEAK;}
	"willSet" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_WILLSET;}

		// RULES: KEYWORDS reserved for PATTERNS
	"_" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_UNDERSCORE;}

	//RULES: --- FLOATING POINT LITERALS
		// Pattern: 0x/0X followed by (optional HexDigitsWithUnderscores) followed by (optional HexFraction) followed by REQUIRED HexExponent.
		// Constraint: Must have EITHER HexDigitsWithUnderscores before fraction, OR HexFraction, OR both. AND must have HexExponent.
	"0"[xX] (({HexDigitsWithUnderscores})? {HexFraction} | {HexDigitsWithUnderscores}) {HexExponent} {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.HEX_FLOATING_POINT_LITERAL;}
		// Pattern: DecimalDigitsWithUnderscores followed by (optional DecimalFraction) followed by (optional DecimalExponent).
		// Constraint: Must have EITHER DecimalFraction OR DecimalExponent, OR both. Cannot be just DecimalDigitsWithUnderscores.
	{DecimalDigitsWithUnderscores} ( {DecimalFraction} ({DecimalExponent})? | {DecimalExponent} ) {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.DECIMAL_FLOATING_POINT_LITERAL;}

	// RULES: --- INTEGER LITERALS
		// Binary Literal: 0b followed by binary digits with optional underscores
		// Octal Literal: 0o followed by octal digits with optional underscores
		// Hexadecimal Literal: 0x followed by hex digits with optional underscores
		// Decimal Literal: Decimal digits with optional underscores (comes after prefixed)
	"0"[bB]{BinaryBody} {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.BINARY_LITERAL;}
	"0"[oO]{OctalBody} {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OCTAL_LITERAL;}
	"0"[xX]{HexBody} {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.HEX_LITERAL;}
	{DecimalBody} {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.DECIMAL_LITERAL;}

	// RULES: --- OPERATORS AND PUNCTUATION (Fixed String Literals)
		// The following tokens are reserved as punc and can’t be used as cust operators (, ), {, }, [, ], ., ,, :, ;, =, @, #, & (as a prefix operator), ->, `, ?, and ! (as postfix op).
	"as!" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_TYPE_CAST_BANG;}
	"as?" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_TYPE_CAST_OPT;}
	"as" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_TYPE_CAST;}
	"is" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_TYPE_CHECK;}
	"&<<="  {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_OVERFLOW_BITSHIFT_LEFT_AND_ASSIGNMENT;}
	"&>>="  {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_OVERFLOW_BITSHIFT_RIGHT_AND_ASSIGNMENT;}
	"<<<"  {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_TRIPLE_LANGLE;}
	">>>"  {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_TRIPLE_RANGLE;}
	"===" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_IDENTICAL;}
	"!==" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_NOT_IDENTICAL;}
	"<<=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_BITSHIFT_LEFT_AND_ASSIGNMENT;}
	">>=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_BITSHIFT_RIGHT_AND_ASSIGNMENT;}
	"&<<"  {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_OVERFLOW_BITSHIFT_LEFT;}
	"&>>"  {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_OVERFLOW_BITSHIFT_RIGHT;}
	"..." {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_HALFOPEN_RANGE;}
	"..<" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_CLOSED_RANGE;}
	".==" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_POINTWISE_EQ;}
	".!=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_POINTWISE_NOT_EQ;}
	"&+=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_OVERFLOW_ADD_AND_ASSIGNMENT;}
	"&-=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_OVERFLOW_SUB_AND_ASSIGNMENT;}
	"&*=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_OVERFLOW_MULT_AND_ASSIGNMENT;}
	".&=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_POINTWISE_BITWISE_AND_AND_ASSIGNMENT;}
	".|=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_POINTWISE_BITWISE_OR_AND_ASSIGNMENT;}
	".^=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_POINTWISE_BITWISE_XOR_AND_ASSIGNMENT;}
	".<=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_POINTWISE_LESS_THAN_OR_EQ;}
	".>=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_POINTWISE_GREATER_THAN_OR_EQ;}
	"==" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_EQ;}
	"&&" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_LOGICAL_AND;}
	"&+" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_OVERFLOW_ADD;}
	"&-" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_OVERFLOW_SUB;}
	"&*" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_OVERFLOW_MULT;}
	"&=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_BITWISE_AND_ASSIGNMENT;}
	"|=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_BITWISE_OR_ASSIGNMENT;}
	"^=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_BITWISE_XOR_ASSIGNMENT;}
	"~=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_PATTERN_MATCH;}
	"!=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_NOT_EQ;}
	"<<"  {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_BITSHIFT_LEFT;}
	">>"  {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_BITSHIFT_RIGHT;}
	"<=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_LESS_THAN_OR_EQ;}
	">=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_GREATER_THAN_OR_EQ;}
	".<" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_POINTWISE_LESS_THAN;}
	".>" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_POINTWISE_GREATER_THAN;}
	"+=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_ADD_ASSIGNMENT;}
	"-=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_SUB_ASSIGNMENT;}
	"*=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_MULT_ASSIGNMENT;}
	"/=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_DIV_ASSIGNMENT;}
	"%=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_MODULO_ASSIGNMENT;}
	"||" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_LOGICAL_OR;}
	".|" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_POINTWISE_BITWISE_OR;}
	".^" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_POINTWISE_BITWISE_XOR;}
	".!" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_POINTWISE_NOT;}
	"??" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_NIL_COALESCING;}
	"?:" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_TERNARY_CONDITIONAL;}
	"->" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.FWD_ARROW;}

		// SPECIAL RULE: RPAREN
	")" {
		  if (stateStack.peek() == yystate(STRING_INTERPOLATION_MARKER)) {
			  stateStack.pop(); // pop marker state off the stack
			  yybegin(stateStack.pop()); // pop true prior state off the stack and return to that state
			  return com.makememonad.turbofan.language.swift.psi.SwiftTypes.STRING_INTERPOLATION_END;
		  }
		  else {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.RPAREN;
		  }
	  }

		// RULES: FIXIE SINGLE-CHAR PUNCTUATION:
	"(" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.LPAREN;}
	"@" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.AT_SYMBOL;}
	"#" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.POUND;}
	"{" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.LBRACE;}
	"}" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.RBRACE;}
	"[" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.LBRACKET;}
	"]" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.RBRACKET;}
	"," {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.COMMA;}
	":" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.COLON;}
	";" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.SEMICOLON;}
	"." {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.DOT;}

		// RULES: FIXIE SINGLE-CHARs that CAN ALSO START CUSTOM OPERATORS
		//operator-head → / | = | - | + | ! | * | % | < | > | & | | | ^ | ~ | ?
	"/" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.FWDSLASH;}
	"=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_ASSIGNMENT;}
	"+" { return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_ADD; }
	"-" { return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_SUB;}
	"*" { return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_MULT;}
	"%" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_MODULO;}
	"!" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_NOT;}
	"<"  {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_LANGLE;}
	">"  {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_RANGLE;}
	"&" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_BITWISE_AND;}
	"|" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_BITWISE_OR;}
	"^" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_BITWISE_XOR;}
	"~" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_BITWISE_NOT;}
	"?" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OP_QUESTION;}

		// RULE: IMPLICIT PARAMETER NAMES, PROPERTY WRAPPER PROJECTIONS
	"\$"{DecimalDigit}+ {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.IMPLICIT_PARAMETER_NAME;}
	"\$"{IdentifierHead}{IdentifierCharacter}* {return com.makememonad.turbofan.language.swift.SwiftTypes.PROPERTY_WRAPPER_PROJECTION;}

	// RULES: --- CUSTOM OPERATORS
		// DOT OPERATORS: Matches ".+" ".**." etc.
		// NON-DOT OPERATORS: Matches "***" "+++" "<*>" etc.
		// REGULAR IDENTIFIERS:
	{DotOperatorHead} {DotOperatorCharacter}+ {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.DOT_OPERATOR;}
	{OperatorHead} {OperatorCharacter}* {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OPERATOR;}
	{IdentifierHead}{IdentifierCharacter}* {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.IDENTIFIER;}

	// RULES: --- String Literal Entry Rules

	// EXT MULTILINE STRING
	{ExtendedDelimiter}"\"\"\"" {
		currentExtendedDelimiterLength = yytext().length() - 3;
		stateStack.push(yystate());
		yybegin(EXTENDED_MULTILINE_STRING);
		return com.makememonad.turbofan.language.swift.psi.SwiftTypes.EXTENDED_MULTILINE_STRING_START;
	}

	// MUTILINE STRING ENTRY
	"\"\"\"" {
		currentExtendedDelimiterLength = 0;
		stateStack.push(yystate());
		yybegin(MULTILINE_STRING);
		return com.makememonad.turbofan.language.swift.psi.SwiftTypes.MULTILINE_STRING_START;
	}

	// EXT STRING ENTRY
	{ExtendedDelimiter}"\"" {
		currentExtendedDelimiterLength = yytext().length() - 1;
		stateStack.push(yystate());
		yybegin(EXTENDED_STRING);
		return com.makememonad.turbofan.language.swift.psi.SwiftTypes.EXTENDED_STRING_START;
	}

	// STRING ENTRY
	"\"" {
		currentExtendedDelimiterLength = 0;
		stateStack.push(yystate());
		yybegin(STRING);
		return com.makememonad.turbofan.language.swift.psi.SwiftTypes.STRING_START;
	}

		// Fallback: Should never be matched. Good practice to have regardless.
		// *Shudders, imagining the number of bugs I've yet to notice in my code*
	. {return BAD_CHARACTER;}
}


//
// ADDITIONAL STATES BELOW
//


	// RULES: FOR STRING LITERAL STATE
<STRING> {
		// RULE: STRING INTERPOLATION START
	"\\(" {
          stateStack.push(yystate());
          stateStack.push(STRING_INTERPOLATION_MARKER);
          yybegin(INITIAL);
          return com.makememonad.turbofan.language.swift.psi.SwiftTypes.STRING_INTERPOLATION_START;
	}
		// RULE: CLOSING DELIMITER
	"\"" {yybegin(stateStack.pop);return com.makememonad.turbofan.language.swift.psi.SwiftTypes.STRING_END;}
		// RULES: ESCAPE SEQuences, PROHIBITED NEWLINES, STRING CONTENT
	\\ {AnyEscapedCharacterPattern} {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.STRING_ESCAPED_SEQUENCE;}
	[\u000A\u000D] {return BAD_CHARACTER;}
	{QuotedTextItemPattern_SingleLine}+ {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.STRING_TEXT;}
		// Fallback: (good practice, though shouldn't ever be matched
	. {return BAD_CHARACTER;}
}


	// RULES: FOR MULTILINE_STRING STATE
<MULTILINE_STRING> {
		// RULE: INTERPOLATION START
	"\\(" {
		  stateStack.push(yystate());
		  stateStack.push(STRING_INTERPOLATION_MARKER);
		  yybegin(INITIAL);
		  return com.makememonad.turbofan.language.swift.psi.SwiftTypes.STRING_INTERPOLATION_START;
	  }
		// RULE: CLOSING DELIMITER
	"\"\"\"" {
		yybegin(stateStack.pop());
		return com.makememonad.turbofan.language.swift.psi.SwiftTypes.MULTILINE_STRING_END;
	}
		// RULE: NESTED MULTILINE STRING START
	"/*" {
		stateStack.push(yystate());
		yybegin(MULTILINE_COMMENT);
		return com.makememonad.turbofan.language.swift.psi.SwiftTypes.MULTILINE_STRING_START;
	}

		// RULES: ESCAPE SEQs
	{EscapedNewlinePattern} {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.MULTILINE_STRING_ESCAPED_NEWLINE;}
	\\{AnyEscapedCharacterPattern} {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.MULTILINE_STRING_ESCAPED_SEQUENCE;}

		// RULE: MULTILINE STRING CONTENT
	(.|\n)+ {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.STRING_TEXT;}
		// Fallback:
	. {return BAD_CHARACTER;}
}


	// RULES: FOR EXTENDED_STRING STATE
<EXTENDED_STRING> {
	// RULE: INTERPOLATION START
	"\\"{ExtendedDelimiter}"(" {
		if (currentExtendedDelimiterLength == yytext().length() - 2 ){
		    stateStack.push(yystate());
		    stateStack.push(STRING_INTERPOLATION_MARKER);
		    yybegin(INITIAL);
		    return com.makememonad.turbofan.language.swift.psi.SwiftTypes.STRING_INTERPOLATION_START;}
		else {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.STRING_TEXT;}
	}

    // RULE: CLOSING DELIMITER
    "\""{ExtendedDelimiter} {
        int matchedNumHashes = yytext().length() - 1;
        if (matchedNumHashes == currentExtendedDelimiterLength) {
            if (!stateStack.isEmpty()) {yybegin(stateStack.pop());}
			else {yybegin(INITIAL);}
            return com.makememonad.turbofan.language.swift.psi.SwiftTypes.EXTENDED_STRING_END;}
		else {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.STRING_TEXT;}
    }

    // RULE: ESC DELIMITER OR BACKSLASH
    "\\" {
        // Action code attempts to check for an escaped delimiter: \ + N '#' + "
        // Simplified placeholder version due to yyinput() and pushback complexities.
        if (currentExtendedDelimiterLength > 0) {
            boolean hashesMatch = true;
            for (int i = 0; i < currentExtendedDelimiterLength; i++) {
                int charN = yyinput();
                if (charN == YYEOF || (char) charN != '#') {hashesMatch = false;break;}
			}
            if (hashesMatch) {
                int charQuote = yyinput();
                if (charQuote != YYEOF && (char) charQuote == '"') {}
				else {}}else {}}
        return com.makememonad.turbofan.language.swift.psi.SwiftTypes.STRING_TEXT;
    }

		// RULE: PROHIBITED NEWLINES
	[\r\n] {return BAD_CHARACTER;}

		// RULE: EXTENDED STRING CONTENT
	[^\r\n]+ {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.STRING_TEXT;}
		// Fallback (shouldn't be reached, but good practice soooo ya' know)
	. { return BAD_CHARACTER; }
}


	// RULES: FOR EXTENDED_MULTILINE_STRING STATE
<EXTENDED_MULTILINE_STRING> {

	// RULE: INTERPOLATION START
	"\\{ExtendedDelimiter}(" {
		if (currentExtendedDelimiterLength == yytext().length() - 2 ){
			stateStack.push(yystate());
			stateStack.push(STRING_INTERPOLATION_MARKER);
			yybegin(INITIAL);
			return com.makememonad.turbofan.language.swift.psi.SwiftTypes.STRING_INTERPOLATION_START;}
		else {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.STRING_TEXT;}
	}

    // RULE: CLOSING DELIMITER
    "\"\"\""{ExtendedDelimiter} {
        int matchedNumHashes = yytext().length() - 3;
        if (matchedNumHashes == currentExtendedDelimiterLength) {
            if (!stateStack.isEmpty()) { yybegin(stateStack.pop());}
		    else {yybegin(INITIAL);}
            return com.makememonad.turbofan.language.swift.psi.SwiftTypes.EXTENDED_MULTILINE_STRING_END;}
		else {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.STRING_TEXT;}
    }

    // RULE: ESCAPED DELIMITER or LITERAL BACKSLASH
    "\\" {
        if (currentExtendedDelimiterLength > 0) {
            boolean hashesMatch = true;
            for (int i = 0; i < currentExtendedDelimiterLength; i++) {
                int charN = yyinput();
                if (charN == YYEOF || (char) charN != '#') {hashesMatch = false;break;}
			}
            if (hashesMatch) {
                int q1 = yyinput();
                int q2 = yyinput();
                int q3 = yyinput();
                if (q1 != YYEOF && (char)q1 == '"' &&
                    q2 != YYEOF && (char)q2 == '"' &&
                    q3 != YYEOF && (char)q3 == '"') {}
				else {}} else {}}
		return com.makememonad.turbofan.language.swift.psi.SwiftTypes.STRING_TEXT;
    }

    // RULE: NESTED MULTILINE COMMENT START
	"/*" {stateStack.push(yystate());yybegin(MULTILINE_COMMENT);
		  return com.makememonad.turbofan.language.swift.psi.SwiftTypes.MULTILINE_STRING_START;}

		// RULE: EXTENDED MULTILINE STRING CONTENT
	(.|\n)+ {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.STRING_TEXT;}
		// Fallback (shouldn't be reached, ideally)
	. {return BAD_CHARACTER;}
}


		// RULES: FOR MULTILINE_COMMENT STATE
<MULTILINE_COMMENT> {
		// RULE: NESTED MULTILINE COMMENT START

	"/*" {
				stateStack.push(yystate());
				yybegin(MULTILINE_COMMENT);
				return SwiftTypes.MULTILINE_COMMENT_START;
	  }

		// RULE: CLOSING DELIMITER
	"*/" {yybegin(stateStack.pop());return SwiftTypes.MULTILINE_COMMENT_END;}

		// RULES: MULTILINE COMMENT CONTENT & Fallbacks
	[^*\n/]+ {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.COMMENT_TEXT;}
	"*" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.COMMENT_TEXT;}
	"/" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.COMMENT_TEXT;}
	.|\n {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.COMMENT_TEXT; }
	. {return BAD_CHARACTER;}
}
// END FILE Swift.flex