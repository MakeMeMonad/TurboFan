/* Swift Language JFlex for CLion Plugin
  BEGIN FILE Swift.flex
  References and Links:
  https://docs.swift.org/swift-book/documentation/the-swift-programming-language/aboutthelanguagereference/
  https://docs.swift.org/swift-book/documentation/the-swift-programming-language/lexicalstructure/
  https://docs.swift.org/swift-book/documentation/the-swift-programming-language/summaryofthegrammar/
  Above references are:
    Copyright © 2014–2023 Apple Inc. and the Swift project authors. All rights reserved.
    This document is made available under a Creative Commons Attribution 4.0 International (CC BY 4.0) License.
    Swift and the Swift logo are trademarks of Apple Inc.

  https://github.com/JetBrains/Grammar-Kit
  Above reference is:
    Pertinent License Info goes here...

    https://www.jflex.de/manual.html
  Above reference is:
    Fast Lexical Analyser Generator
    Copyright © 1998–2020 by Gerwin Klein, Steve Rowe, and Régis Décamps.
    Version 1.9.1, 11 March 2023
    JFlex is free software, published under a BSD-style license.
    © JFlex Team. Website text licensed under Creative Commons Attribution-NonCommercial-ShareAlike

*/

		// JFlex Section 1: USER-CODE
package com.makememonad.turbofan.language.swift.psi.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.makememonad.turbofan.language.swift.psi.SwiftTypes;
import static com.makememonad.turbofan.language.swift.psi.SwiftTypes.*;
import com.intellij.psi.TokenType.*;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;

%%
  // --- JFlex Section 2: OPTIONS, CUSTOM CODE, MACRO DECLARATIONS
    // JFlex Scanner Option Switches:
    %public
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

		// --- Grammar-Kit JFlex MACRO DECLARATIONS
LineTerm = \R
Underscore = "_"

  // WHITESPACE and COMMENT MACROS:

  // WHITESPACE GRAMMAR SPEC 6.1
  //whitespace → whitespace-item whitespace?
  //whitespace-item → line-break
  //whitespace-item → inline-space
  //whitespace-item → comment
  //whitespace-item → multiline-comment
  //whitespace-item → U+0000, U+000B, or U+000C
  //line-break → U+000A
  //line-break → U+000D
  //line-break → U+000D followed by U+000A
  //inline-spaces → inline-space inline-spaces?
  //inline-space → U+0009 or U+0020
  //comment → // comment-text line-break
  //multiline-comment → /* multiline-comment-text */
  //comment-text → comment-text-item comment-text?
  //comment-text-item → Any Unicode scalar value except U+000A or U+000D
  //multiline-comment-text → multiline-comment-text-item multiline-comment-text?
  //multiline-comment-text-item → multiline-comment
  //multiline-comment-text-item → comment-text-item
  //multiline-comment-text-item → Any Unicode scalar value except /* or */

  WhiteSpace = {WhiteSpaceItem}+
  WhiteSpaceItem = {LineBreak} | {InlineSpace} | [\u0000 \u000B \u000C]
  LineBreak = \u000A | \u000D | \u000D\u000A
  InlineSpace = [\u0009 \u0020]
  Comment = {CommentText} {LineBreak}
  CommentText = {CommentTextItem}+
  CommentTextItem = [^\u000A \u000D]
  MultilineComment ="/*" {MultilineCommentText} "*/"
  MultilineCommentText = {MultilineCommentTextItem}+
  MultilineCommentTextItem = [^ "/*" "*/" ]

  // IDENTIFIER MACROS:

  // IDENTIFIER GRAMMAR SPEC 6.1
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

  IdentifierHeadBasicASCII = [A-Za-z_]
  // Matched to Swift 6.1 specification.
  // The below format is structurally matched with the Swift Lang Reference's structure.
  // While condensing the ranges and using exclusions to save space is certainly possible, I'm gonna keep this format.
  // I believe this will enable easier maintenance upon language spec updates, and make it easier to cross-check with the reference.
  Identifier = {IdentifierHead} {IdentifierCharacters}? | ` {IdentifierHead} {IdentifierCharacters}? ` | {ImplicitParameterName} | {PropertyWrapperProjection}
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
		// Supplementary Plane Groups (using \u{XXXXX} syntax for Grammar-Kit JFlex..?) Eleven-Fourteen: Supplement Plane Groups 1-4
  IHUR_SPG_1 = [\u{10000}-\u{1FFFD}\u{20000}-\u{2FFFD}\u{30000}-\u{3FFFD}\u{40000}-\u{4FFFD}]
  IHUR_SPG_2 = [\u{50000}-\u{5FFFD}\u{60000}-\u{6FFFD}\u{70000}-\u{7FFFD}\u{80000}-\u{8FFFD}]
  IHUR_SPG_3 = [\u{90000}-\u{9FFFD}\u{A0000}-\u{AFFFD}\u{B0000}-\u{BFFFD}\u{C0000}-\u{CFFFD}]
  IHUR_SPG_4 = [\u{D0000}-\u{DFFFD}\u{E0000}-\u{EFFFD}]
  IdentifierHeadUnicodeRanges = {IHUR_BMP_1} | {IHUR_BMP_2} | {IHUR_BMP_3} | {IHUR_BMP_4} | \
                                {IHUR_BMP_5} | {IHUR_BMP_6} | {IHUR_BMP_7} | {IHUR_BMP_8} | \
                                {IHUR_BMP_9} | {IHUR_BMP_10} | \
                                {IHUR_SPG_1} | {IHUR_SPG_2} | {IHUR_SPG_3} | {IHUR_SPG_4}

    IdentifierHead = {IdentifierHeadBasicASCII} | {IdentifierHeadUnicodeRanges}
    ICDigit = {DecimalDigit}
    ICCombining = [\u0300-\u036F\u1DC0-\u1DFF\u20D0-\u20FF\uFE20-\uFE2F]
    IdentifierCharacter = {ICDigit} | {ICCombining} | {IdentifierHead}
    IdentifierCharacters = {IdentifierCharacter}+
    ImplicitParameterName = "$" {DecimalDigits}
    PropertyWrapperProjection = "$" {IdentifierCharacters}

	// INTEGER LITERAL MACROS:

  // INTEGER LITERAL GRAMMAR SPEC 6.1
  //integer-literal → binary-literal
  //integer-literal → octal-literal
  //integer-literal → decimal-literal
  //integer-literal → hexadecimal-literal
  //binary-literal → 0b binary-digit binary-literal-characters?
  //binary-digit → Digit 0 or 1
  //binary-literal-character → binary-digit | _
  //binary-literal-characters → binary-literal-character binary-literal-characters?
  //octal-literal → 0o octal-digit octal-literal-characters?
  //octal-digit → Digit 0 through 7
  //octal-literal-character → octal-digit | _
  //octal-literal-characters → octal-literal-character octal-literal-characters?
  //decimal-literal → decimal-digit decimal-literal-characters?
  //decimal-digit → Digit 0 through 9
  //decimal-digits → decimal-digit decimal-digits?
  //decimal-literal-character → decimal-digit | _
  //decimal-literal-characters → decimal-literal-character decimal-literal-characters?
  //hexadecimal-literal → 0x hexadecimal-digit hexadecimal-literal-characters?
  //hexadecimal-digit → Digit 0 through 9, a through f, or A through F
  //hexadecimal-literal-character → hexadecimal-digit | _
  //hexadecimal-literal-characters → hexadecimal-literal-character hexadecimal-literal-characters?

  BinaryLiteral = "0b" {BinaryDigit} {BinaryLiteralCharacters}?
  BinaryDigit = [01]
  BinaryLiteralCharacter = {BinaryDigit} | {Underscore}
  BinaryLiteralCharacters = {BinaryLiteralCharacter}+
  OctalLiteral = [0o] {OctalDigit} {OctalLiteralCharacters}?
  OctalDigit = [0-7]
  OctalLiteralCharacter = {OctalDigit} | {Underscore}
  OctalLiteralCharacters = {OctalLiteralCharacter}+
  DecimalLiteral = {DecimalDigit} {DecimalLiteralCharacters}?
  DecimalDigit = [0-9]
  DecimalDigits = {DecimalDigit} {DecimalDigit}*
  DecimalLiteralCharacter = {DecimalDigit} | {Underscore}
  DecimalLiteralCharacters = {DecimalLiteralCharacter}+
  HexLiteral = [0x] {HexDigit} {HexLiteralCaracters}?
  HexDigit = [0-9a-fA-F]
  HexLiteralCaracter = {HexDigit} | {Underscore}
  HexLiteralCaracters = {HexLiteralCaracter}+

  // FLOATING POINT LITERAL MACROS:

  // FLOATING POINT GRAMMAR SPEC 6.1
  //floating-point-literal → decimal-literal decimal-fraction? decimal-exponent?
  //floating-point-literal → hexadecimal-literal hexadecimal-fraction? hexadecimal-exponent
  //decimal-fraction → . decimal-literal
  //decimal-exponent → floating-point-e sign? decimal-literal
  //hexadecimal-fraction → . hexadecimal-digit hexadecimal-literal-characters?
  //hexadecimal-exponent → floating-point-p sign? decimal-literal
  //floating-point-e → e | E
  //floating-point-p → p | P
  //sign → + | -

  FloatingPointLiteral = {DecimalLiteral} {DecimalFraction}* {DecimalExponent}? | {HexLiteral} {HexFraction}? {HexExponent}
  DecimalFraction = \. {DecimalLiteral}
  DecimalExponent = {FloatingPointE} {Sign}? {DecimalLiteral}
  HexFraction = \. {HexDigit} {HexLiteralCaracters}?
  HexExponent = {FloatingPointP} {Sign}? {DecimalLiteral}
  FloatingPointE = [eE]
  FloatingPointP = [pP]
  Sign = [+-]

	// STRING LITERAL MACROS:

	// STRING LITERAL GRAMMAR SPEC 6.1
  //string-literal → static-string-literal | interpolated-string-literal
  //string-literal-opening-delimiter → extended-string-literal-delimiter? "
  //string-literal-closing-delimiter → " extended-string-literal-delimiter?
  //static-string-literal → string-literal-opening-delimiter quoted-text? string-literal-closing-delimiter
  //static-string-literal → multiline-string-literal-opening-delimiter multiline-quoted-text? multiline-string-literal-closing-delimiter
  //multiline-string-literal-opening-delimiter → extended-string-literal-delimiter? """
  //multiline-string-literal-closing-delimiter → """ extended-string-literal-delimiter?
  //extended-string-literal-delimiter → # extended-string-literal-delimiter?
  //quoted-text → quoted-text-item quoted-text?
  //quoted-text-item → escaped-character
  //quoted-text-item → Any Unicode scalar value except ", \, U+000A, or U+000D
  //multiline-quoted-text → multiline-quoted-text-item multiline-quoted-text?
  //multiline-quoted-text-item → escaped-character
  //multiline-quoted-text-item → Any Unicode scalar value except \
  //multiline-quoted-text-item → escaped-newline
  //interpolated-string-literal → string-literal-opening-delimiter interpolated-text? string-literal-closing-delimiter
  //interpolated-string-literal → multiline-string-literal-opening-delimiter multiline-interpolated-text? multiline-string-literal-closing-delimiter
  //interpolated-text → interpolated-text-item interpolated-text?
  //interpolated-text-item → \( expression ) | quoted-text-item
  //multiline-interpolated-text → multiline-interpolated-text-item multiline-interpolated-text?
  //multiline-interpolated-text-item → \( expression ) | multiline-quoted-text-item
  //escape-sequence → \ extended-string-literal-delimiter
  //escaped-character → escape-sequence 0 | escape-sequence \ | escape-sequence t | escape-sequence n | escape-sequence r | escape-sequence " | escape-sequence '
  //escaped-character → escape-sequence u { unicode-scalar-digits }
  //unicode-scalar-digits → Between one and eight hexadecimal digits
  //escaped-newline → escape-sequence inline-spaces? line-break

  StringLiteral = {StaticStringLiteral}
  StringLiteralOpeningDelimiter = {ExtendedStringLiteralDelimiter}? "\""
  StringLiteralClosingDelimiter = "\""{ExtendedStringLiteralDelimiter}?
  StaticStringLiteral = {StringLiteralOpeningDelimiter} {QuotedText}? {StringLiteralClosingDelimiter} | {MultilineStringLiteralOpeningDelimiter} {MultilineQuotedText}? {MultilineStringLiteralClosingDelimiter}
  MultilineStringLiteralOpeningDelimiter = {ExtendedStringLiteralDelimiter}?"\"\"\""
  MultilineStringLiteralClosingDelimiter = "\"\"\""{ExtendedStringLiteralDelimiter}?
  ExtendedStringLiteralDelimiter = #+
  QuotedText = {QuotedTextItem}+
  QuotedTextItem = {EscapedCharacter} | [^\"\u000A\u000D\\]]
  MultilineQuotedText = {MultilineQuotedTextItem}+ | {QuotedTextItem}
  MultilineQuotedTextItem = {EscapedCharacter} | !\\ | {EscapedNewline}
  EscapeSequence = "\\" {ExtendedStringLiteralDelimiter}?
  EscapedCharacter = {EscapeSequence}(0 | \\ | t | n | r | \" | \') | {EscapeSequence} [uU] "{" {UnicodeScalarDigits} "}"
  UnicodeScalarDigits = {HexDigit}{1,8}
  EscapedNewline = {EscapeSequence} {InlineSpace}* {LineBreak}

  // REGEX LITERAL MACROS:

  // REGEX LITERAL GRAMMAR SPEC 6.1
  //regular-expression-literal → regular-expression-literal-opening-delimiter regular-expression regular-expression-literal-closing-delimiter
  //regular-expression → Any regular expression
  //regular-expression-literal-opening-delimiter → extended-regular-expression-literal-delimiter? /
  //regular-expression-literal-closing-delimiter → / extended-regular-expression-literal-delimiter?
  //extended-regular-expression-literal-delimiter → # extended-regular-expression-literal-delimiter?

  RegularExpressionLiteral = {RegularExpressionLiteralOpeningDelimiter} {RegularExpression} {RegularExpressionLiteralClosingDelimiter}
  RegularExpression = ([^/ \\ \n]|\\.)*
  RegularExpressionLiteralOpeningDelimiter = {ExtendedRegularExpressionLiteralDelimiter}? "/"
  RegularExpressionLiteralClosingDelimiter = "/" {ExtendedRegularExpressionLiteralDelimiter}?
  ExtendedRegularExpressionLiteralDelimiter = #+

  // OPERATOR MACROS:

	// OPERATOR GRAMMAR SPEC 6.1
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

  Operator = {OperatorHead} {OperatorCharacters}? | {DotOperatorHead} {DotOperatorCharacters}
  OperatorHeadASCII = [/=\-+\*%!<>&|\^~?]
  OHUR_1 = [\u00A1-\u00A7\u00A9\u00AB\u00AC\u00AE\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7]
  OHUR_2 = [\u2016-\u2017\u2020-\u2027\u2030-\u203E\u2041-\u2053\u2055-\u205E\u2190-\u23FF]
  OHUR_3 = [\u2500-\u2775\u2794-\u2BFF\u2E00-\u2E7F\u3001-\u3003\u3008-\u3020\u3030]
  OperatorHeadUnicodeRanges = {OHUR_1} | {OHUR_2} | {OHUR_3}
  OperatorHead = {OperatorHeadASCII} | {OperatorHeadUnicodeRanges}
      // One-Three: Standard Combining Marks? Four: Variation Selectors. Five: Combining Half_Marks. Six: Variation Selector Supplement.
  OCC_1_2_3 = [\u0300-\u036F\u1DC0-\u1DFF\u20D0-\u20FF]
  OCC_4 = [\uFE00-\uFE0F]
  OCC_5 = [\uFE20-\uFE2F]
  OCC_6 = [\u{E0100}-\u{E01EF}]
  OCCombining = {OCC_1_2_3} | {OCC_4} | {OCC_5} | {OCC_6}
  OperatorCharacter = {OperatorHead} | {OCCombining}
  OperatorCharacters = {OperatorCharacter}+
  DotOperatorHead = \.
  DotOperatorCharacter = \. | {OperatorCharacter}
  DotOperatorCharacters = {DotOperatorCharacter}+

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

		 STATE CHANGE: MULTILINE COMMENT START

	"/*" {
		  stateStack.push(yystate());
		  yybegin(MULTILINE_COMMENT);
		  return MULTILINE_COMMENT_START;
	  }

		// RULES: WHITESPACE and SINGLE LINE COMMENTS

  {WhiteSpace} {return WHITE_SPACE;}
  {Comment} {return SINGLELINE_COMMENT;}

		// RULE: PRIVATE-USE IDENTIFIERS
	"`" {IdentifierHead}{IdentifierCharacters}? "`" {return QUOTED_IDENTIFIER;}
		// RULES: KEYWORDS reserved for distinct(?) use that begin with the POUND SIGN (#)
			// NOTE: Prior to Swift 5.9, the following keywords were reserved: #column, #dsohandle, #error, #fileID, #filePath, #file, #function, #line, and #warning.
			// NOTE: These are now implemented as macros in the Swift standard library: column, dsohandle, error(_:), fileID, filePath, file, function, line, and warning(_:).
	"#available" {return KW_PND_AVAILABLE;}
	"#colorLiteral" {return KW_PND_COLORLITERAL;}
	"#else" {return KW_PND_ELSE;}
	"#elseif" {return KW_PND_ELSEIF;}
	"#endif" {return KW_PND_ENDIF;}
	"#fileLiteral" {return KW_PND_FILELITERAL;}
	"#if" {return KW_PND_IF;}
	"#imageLiteral" {return KW_PND_IMAGELITERAL;}
	"#keyPath" {return KW_PND_KEYPATH;}
	"#selector"  {return KW_PND_SELECTOR;}
	"#sourceLocation" {return KW_PND_SOURCELOCATION;}
	"#unavailable" {return KW_PND_UNAVAILABLE;}

		// RULES: KEYWORDS reserved for DISTINCT USE.
	"Any" {return KW_UPPER_ANY;}
  "any" {return KW_LOWER_ANY;}
	"associatedtype" {return KW_ASSOCIATEDTYPE;}
	"await" {return KW_AWAIT;}
	"borrowing" {return KW_BORROWING;}
	"break" {return KW_BREAK;}
	"case" {return KW_CASE;}
	"class" {return KW_CLASS;}
	"consuming" {return KW_CONSUMING;}
	"continue" {return KW_CONTINUE;}
	"default" {return KW_DEFAULT;}
	"defer" {return KW_DEFER;}
	"deinit" {return KW_DEINIT;}
	"do" {return KW_DO;}
	"else" {return KW_ELSE;}
	"enum" {return KW_ENUM;}
	"extension" {return KW_EXTENSION;}
	"fallthrough" {return KW_FALLTHROUGH;}
	"false" {return KW_FALSE;}
	"fileprivate" {return KW_FILEPRIVATE;}
	"for" {return KW_FOR;}
	"func" {return KW_FUNC;}
	"guard" {return KW_GUARD;}
	"if" {return KW_IF;}
	"import" {return KW_IMPORT;}
	"in" {return KW_IN;}
	"init" {return KW_INIT;}
	"inout" {return KW_INOUT;}
	"internal" {return KW_INTERNAL;}
	"let" {return KW_LET;}
	"nil" {return KW_NIL;}
	"nonisolated" {return KW_NONISOLATED;}
	"open" {return KW_OPEN;}
	"operator" {return KW_OPERATOR;}
	"precedencegroup" {return KW_PRECEDENCEGROUP;}
	"private" {return KW_PRIVATE;}
	"protocol" {return KW_LOWER_PROTOCOL_DECL;}
	"public" {return KW_PUBLIC;}
	"repeat" {return KW_REPEAT;}
	"return" {return KW_RETURN;}
	"self" {return KW_LOWER_SELF;}
	"Self" {return KW_UPPER_SELF;}
	"static" {return KW_STATIC;}
	"struct" {return KW_STRUCT;}
	"super" {return KW_SUPER;}
	"switch" {return KW_SWITCH;}
	"subscript" {return KW_SUBSCRIPT;}
	"throws" {return KW_THROWS;}
	"true" {return KW_TRUE;}
	"try" {return KW_TRY;}
	"typealias" {return KW_TYPEALIAS;}
	"var" {return KW_VAR;}
	"where" {return KW_WHERE;}
	"while" {return KW_WHILE;}

		// RULES: KEYWORDS reserved for DIFFERING USES depending on the context. Disambiguation for these occurs during parsing according to the grammar.
	"catch" {return KW_CATCH;}
	"throw" {return KW_THROW;}
	"rethrows" {return KW_RETHROWS;}

		// RULES: KEYWORDS reserved ONLY IN PARTICULAR CONTEXTS. Outside the context in which they appear in the grammar, they can be used as identifiers.
	"associativity" {return KW_ASSOCIATIVITY;}
	"async" {return KW_ASYNC;}
	"convenience" {return KW_CONVENIENCE;}
	"didSet" {return KW_DIDSET;}
	"dynamic" {return KW_DYNAMIC;}
	"final" {return KW_FINAL;}
	"get" {return KW_GET;}
	"indirect" {return KW_INDIRECT;}
	"infix" {return KW_INFIX;}
	"lazy" {return KW_LAZY;}
	"left" {return KW_LEFT;}
	"mutating" {return KW_MUTATING;}
	"none" {return KW_NONE;}
	"nonmutating" {return KW_NONMUTATING;}
	"optional" {return KW_OPTIONAL;}
	"override" {return KW_OVERRIDE;}
	"package" {return KW_PACKAGE;}
	"postfix" {return KW_POSTFIX;}
	"precedence" {return KW_PRECEDENCE;}
	"prefix" {return KW_PREFIX;}
	"Protocol" {return KW_UPPER_PROTOCOL;}
	"required" {return KW_REQUIRED;}
	"right" {return KW_RIGHT;}
	"set" {return KW_SET;}
	"some" {return KW_SOME;}
	"Type" {return KW_UPPER_TYPE;}
	"unowned" {return KW_UNOWNED;}
	"weak" {return KW_WEAK;}
	"willSet" {return KW_WILLSET;}

		// RULES: KEYWORDS reserved for PATTERNS
	{Underscore} {return KW_UNDERSCORE;}

	//RULES: --- FLOATING POINT LITERALS
	{HexLiteral} {HexFraction}* {HexExponent} {return HEX_FLOATING_POINT_LITERAL;}
	{DecimalLiteral} {DecimalFraction}+ {return DECIMAL_FLOATING_POINT_LITERAL;}
//  {FloatingPointLiteral} {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.FLOATING_POINT_LITERAL;}

	// RULES: --- INTEGER LITERALS
	{BinaryLiteral} {return BINARY_LITERAL;}
	{OctalLiteral}} {return OCTAL_LITERAL;}
	{HexLiteral}} {return HEX_LITERAL;}
	{DecimalLiteral} {return DECIMAL_LITERAL;}

  // RULE: --- REGEX LITERALS
  {RegularExpressionLiteral} {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.REGEXP_LITERAL;}

	// RULES: --- OPERATORS AND PUNCTUATION (Fixed String Literals)
		// The following tokens are reserved as punc and can’t be used as cust operators (, ), {, }, [, ], ., ,, :, ;, =, @, #, & (as a prefix operator), ->, `, ?, and ! (as postfix op).
	"as" {return OP_TYPE_CAST;}
	"is" {return OP_TYPE_CHECK;}
	"&<<="  {return OP_OVERFLOW_BITSHIFT_LEFT_AND_ASSIGNMENT;}
	"&>>="  {return OP_OVERFLOW_BITSHIFT_RIGHT_AND_ASSIGNMENT;}
	"<<<"  {return OP_TRIPLE_LANGLE;}
	">>>"  {return OP_TRIPLE_RANGLE;}
	"===" {return OP_IDENTICAL;}
	"!==" {return OP_NOT_IDENTICAL;}
	"<<=" {return OP_BITSHIFT_LEFT_AND_ASSIGNMENT;}
	">>=" {return OP_BITSHIFT_RIGHT_AND_ASSIGNMENT;}
	"&<<"  {return OP_OVERFLOW_BITSHIFT_LEFT;}
	"&>>"  {return OP_OVERFLOW_BITSHIFT_RIGHT;}
	"..." {return OP_HALFOPEN_RANGE;}
	"..<" {return OP_CLOSED_RANGE;}
	".==" {return OP_POINTWISE_EQ;}
	".!=" {return OP_POINTWISE_NOT_EQ;}
	"&+=" {return OP_OVERFLOW_ADD_AND_ASSIGNMENT;}
	"&-=" {return OP_OVERFLOW_SUB_AND_ASSIGNMENT;}
	"&*=" {return OP_OVERFLOW_MULT_AND_ASSIGNMENT;}
	".&=" {return OP_POINTWISE_BITWISE_AND_AND_ASSIGNMENT;}
	".|=" {return OP_POINTWISE_BITWISE_OR_AND_ASSIGNMENT;}
	".^=" {return OP_POINTWISE_BITWISE_XOR_AND_ASSIGNMENT;}
	".<=" {return OP_POINTWISE_LESS_THAN_OR_EQ;}
	".>=" {return OP_POINTWISE_GREATER_THAN_OR_EQ;}
	"==" {return OP_EQ;}
	"&&" {return OP_LOGICAL_AND;}
	"&+" {return OP_OVERFLOW_ADD;}
	"&-" {return OP_OVERFLOW_SUB;}
	"&*" {return OP_OVERFLOW_MULT;}
	"&=" {return OP_BITWISE_AND_ASSIGNMENT;}
	"|=" {return OP_BITWISE_OR_ASSIGNMENT;}
	"^=" {return OP_BITWISE_XOR_ASSIGNMENT;}
	"~=" {return OP_PATTERN_MATCH;}
	"!=" {return OP_NOT_EQ;}
	"<<"  {return OP_BITSHIFT_LEFT;}
	">>"  {return OP_BITSHIFT_RIGHT;}
	"<=" {return OP_LESS_THAN_OR_EQ;}
	">=" {return OP_GREATER_THAN_OR_EQ;}
	".<" {return OP_POINTWISE_LESS_THAN;}
	".>" {return OP_POINTWISE_GREATER_THAN;}
	"+=" {return OP_ADD_ASSIGNMENT;}
	"-=" {return OP_SUB_ASSIGNMENT;}
	"*=" {return OP_MULT_ASSIGNMENT;}
	"/=" {return OP_DIV_ASSIGNMENT;}
	"%=" {return OP_MODULO_ASSIGNMENT;}
	"||" {return OP_LOGICAL_OR;}
	".|" {return OP_POINTWISE_BITWISE_OR;}
	".^" {return OP_POINTWISE_BITWISE_XOR;}
	".!" {return OP_POINTWISE_NOT;}
	"??" {return OP_NIL_COALESCING;}
	"?:" {return OP_TERNARY_CONDITIONAL;}
	"->" {return FWD_ARROW;}

		// SPECIAL RULE: RPAREN
	")" {
		  if (stateStack.peek() == yystate(STRING_INTERPOLATION_MARKER)) {
			  stateStack.pop(); // pop marker state off the stack
			  yybegin(stateStack.pop()); // pop true prior state off the stack and return to that state
			  return STRING_INTERPOLATION_END;
		  }
		  else {return RPAREN;
		  }
	  }

		// RULES: FIXIE SINGLE-CHAR PUNCTUATION:
	"(" {return LPAREN;}
	"@" {return AT_SYMBOL;}
	"#" {return POUND;}
	"{" {return LBRACE;}
	"}" {return RBRACE;}
	"[" {return LBRACKET;}
	"]" {return RBRACKET;}
	"," {return COMMA;}
	":" {return COLON;}
	";" {return SEMICOLON;}
	"." {return DOT;}
  "\\" {return BACKSLASH;}

		// RULES: FIXIE SINGLE-CHARs that CAN ALSO START CUSTOM OPERATORS
	"/" {return FWDSLASH;}
	"=" {return OP_ASSIGNMENT;}
	"+" { return OP_ADD; }
	"-" { return OP_SUB;}
	"*" { return OP_MULT;}
	"%" {return OP_MODULO;}
	"!" {return OP_NOT;}
	"<"  {return OP_LANGLE;}
	">"  {return OP_RANGLE;}
	"&" {return OP_BITWISE_AND;}
	"|" {return OP_BITWISE_OR;}
	"^" {return OP_BITWISE_XOR;}
	"~" {return OP_BITWISE_NOT;}
	"?" {return OP_QUESTION;}

		// RULE: IMPLICIT PARAMETER NAMES, PROPERTY WRAPPER PROJECTIONS
	{ImplicitParameterName} {return IMPLICIT_PARAMETER_NAME;}
	{PropertyWrapperProjection} {return PROPERTY_WRAPPER_PROJECTION;}

    // RULES: --- CUSTOM OPERATORS
  //   DOT OPERATORS: Matches ".+" ".**." etc.
  //   NON-DOT OPERATORS: Matches "***" "+++" "<*>" etc.
  //   REGULAR IDENTIFIERS:
  // {DotOperatorHead} {DotOperatorCharacter}+ {return DOT_OPERATOR;}


  // TODO: uncomment
	{Operator} {return OPERATOR;}
	{Identifier} {return IDENTIFIER;}

	// RULES: --- String Literal Entry Rules

	// EXT MULTILINE STRING
  {ExtendedStringLiteralDelimiter}"\"\"\"" {
    currentExtendedDelimiterLength = yytext().length() - 3;
    stateStack.push(yystate());
    yybegin(EXTENDED_MULTILINE_STRING);
    return EXTENDED_MULTILINE_STRING_START;
  }

	// MUTILINE STRING ENTRY
	"\"\"\"" {
		currentExtendedDelimiterLength = 0;
		stateStack.push(yystate());
		yybegin(MULTILINE_STRING);
		return MULTILINE_STRING_START;
	}

	// EXT STRING ENTRY
	{ExtendedStringLiteralDelimiter}"\"" {
		currentExtendedDelimiterLength = yytext().length() - 1;
		stateStack.push(yystate());
		yybegin(EXTENDED_STRING);
		return EXTENDED_STRING_START;
	}

	// STRING ENTRY
	"\"" {
		currentExtendedDelimiterLength = 0;
		stateStack.push(yystate());
		yybegin(STRING);
		return STRING_START;
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
          return STRING_INTERPOLATION_START;
	}
		// RULE: CLOSING DELIMITER
	"\"" {yybegin(stateStack.pop);return STRING_END;}
		// RULES: ESCAPE SEQuences, PROHIBITED NEWLINES, STRING CONTENT
	{EscapedCharacter} {return STRING_ESCAPED_SEQUENCE;}
	[\u000A\u000D] {return BAD_CHARACTER;}
	{QuotedText} {return STRING_TEXT;}
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
		  return STRING_INTERPOLATION_START;
	  }
		// RULE: CLOSING DELIMITER
	"\"\"\"" {
		yybegin(stateStack.pop());
		return MULTILINE_STRING_END;
	}
		// RULE: NESTED MULTILINE STRING START
	"/*" {
		stateStack.push(yystate());
		yybegin(MULTILINE_STRING);
		return MULTILINE_STRING_START;
	}

		// RULES: ESCAPE SEQs
//	{EscapedNewline} {return MULTILINE_STRING_ESCAPED_NEWLINE;}
	{EscapedCharacter} {return MULTILINE_STRING_ESCAPED_SEQUENCE;}

		// RULE: MULTILINE STRING CONTENT
	(.|\n)+ {return STRING_TEXT;}
		// Fallback:
	. {return BAD_CHARACTER;}
}


	// RULES: FOR EXTENDED_STRING STATE
<EXTENDED_STRING> {
	// RULE: INTERPOLATION START
	"\\"{ExtendedStringLiteralDelimiter}"(" {
		if (currentExtendedDelimiterLength == yytext().length() - 2 ){
		    stateStack.push(yystate());
		    stateStack.push(STRING_INTERPOLATION_MARKER);
		    yybegin(INITIAL);
		    return STRING_INTERPOLATION_START;}
		else {return STRING_TEXT;}
	}

    // RULE: CLOSING DELIMITER
    "\""{ExtendedStringLiteralDelimiter} {
        int matchedNumHashes = yytext().length() - 1;
        if (matchedNumHashes == currentExtendedDelimiterLength) {
            if (!stateStack.isEmpty()) {yybegin(stateStack.pop());}
			else {yybegin(INITIAL);}
            return EXTENDED_STRING_END;}
		else {return STRING_TEXT;}
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
        return STRING_TEXT;
    }

		// RULE: PROHIBITED NEWLINES
	[\r\n] {return BAD_CHARACTER;}

		// RULE: EXTENDED STRING CONTENT
	[^\r\n]+ {return STRING_TEXT;}
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
			return STRING_INTERPOLATION_START;}
		else {return STRING_TEXT;}
	}

    // RULE: CLOSING DELIMITER
    "\"\"\""{ExtendedStringLiteralDelimiter} {
        int matchedNumHashes = yytext().length() - 3;
        if (matchedNumHashes == currentExtendedDelimiterLength) {
            if (!stateStack.isEmpty()) { yybegin(stateStack.pop());}
		    else {yybegin(INITIAL);}
            return EXTENDED_MULTILINE_STRING_END;}
		else {return STRING_TEXT;}
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
		return STRING_TEXT;
    }

    // RULE: NESTED MULTILINE COMMENT START
	"/*" {stateStack.push(yystate());yybegin(MULTILINE_COMMENT);
		  return MULTILINE_COMMENT_START;}

		// RULE: EXTENDED MULTILINE STRING CONTENT
	(.|\n)+ {return STRING_TEXT;}
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
	[^*\n/]+ {return COMMENT_TEXT;}
	"*" {return COMMENT_TEXT;}
	"/" {return COMMENT_TEXT;}
	.|\n {return COMMENT_TEXT;}
	. {return BAD_CHARACTER;}
}
// END FILE Swift.flex