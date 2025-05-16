package com.makememonad.turbofan.language.swift.psi.lexer;

// JFlex Section One: USERCODE
// The text up to the second section is copied verbatim to the top of the generated lexer class (before the actual class declaration).
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
// Import types defined in Swift.bnf after they're generated)
// import static com.makememonad.turbofan.language.swift.psi.SwiftTypes.*

%%
      // JFlex Section Two: Option Switches, Macros, and Declarations
%class SwiftLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
      // The code between the %eof{ and %eof} is ...
%eof{  return;
%eof}
      // The code between %{ and %} is copied verbatim into the generated lexer class source.
      // Member variables and functions to be used inside scanner actions.
%{
private java.util.Stack<Integer> stateStack = new java.util.Stack<>();
private int commentNestingDepth = 0;
private int currentExtendedDelimiterLength = 0;
%}
	// Macro Declarations:
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

	// --- String Literal Macro Declarations ---
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
QuotedTextItemPattern_SingleLine = [^"\\\u000A\u000D]
MultilineQuotedTextItemPattern_Basic = [^\\"]+
		// You need to handle sequences like \" and \\\ within multiline content too.
		// And prevent matching """ unless it's the end delimiter. This will be tricky with regex alone.

		// Interpolated text items: \( expression ) | quoted-text-item
		// The \( ... ) part requires parser coordination. The quoted-text-item depends on the string type.

		// Matches one or more '#' characters
ExtendedDelimiter = #+

	// --- Identifier Character Macro Declarations ---
		// Based on Swift Language Reference -> Lexical Structure -> Identifiers
		// Unicode ranges specified by Swift for identifier-head beyond basic ASCII
IdentifierHeadBasicASCII = [A-Za-z_]
IdentifierHeadUnicodeRanges = [\u00A8\u00AA\u00AD\u00AF\u00B2-\u00B5\u00B7-\u00BA\u00BC-\u00BE\u00C0-\u00D6\u00D8-\u00F6\u00F8-\u00FF\u0100-\u02FF\u0370-\u167F\u1681-\u180D\u180F-\u1DBF\u1E00-\u1FFF\u200B-\u200D\u202A-\u202E\u203F-\u2040\u2054\u2060-\u206F\u2070-\u20CF\u2100-\u218F\u2460-\u24FF\u2776-\u2793\u2C00-\u2DFF\u2E80-\u2FFF\u3004-\u3007\u3021-\u302F\u3031-\u303F\u3040-\uD7FF\uF900-\uFD3D\uFD40-\uFDCF\uFDF0-\uFE1F\uFE30-\uFE44\uFE47-\uFFFD]
		// Additionally, characters outside BMP not in Private Use Area - tricky, can use properties
		// BMP ranges match \p{L} \p{Nl} etc. Adding \p{L} \p{Nl} might simplify or expand coverage
IdentifierHead = {IdentifierHeadBasicASCII} | {IdentifierHeadUnicodeRanges} | [\p{L}\p{Nl}]
		// Note: The full set is complex; this is a strong approximation using properties and listed ranges.
		// Private Use Area characters are in ranges like U+E000..U+F8FF (BMP), U+F0000..U+FFFFD (Suppl. Private Use A), U+100000..U+10FFFD (Suppl. Private Use B).
		// Excluding these explicitly is needed if properties aren't enough: \P{Co}

		// identifier-character:
	IdentifierCharacterDigit = {DecimalDigit}
	IdentifierCharacterCombining = [\u0300-\u036F\u1DC0-\u1DFF\u20D0-\u20FF\uFE20-\uFE2F] | [\p{Mn}\p{Mc}]
	IdentifierCharacterHead = {IdentifierHead}
	IdentifierCharacter = {IdentifierCharacterDigit} | {IdentifierCharacterCombining} | {IdentifierCharacterHead}

	// --- Operator Character Macro Declarations ---
		// Based on Swift Language Reference -> Lexical Structure -> Operators
		// Unicode ranges and properties specified by Swift for operator-head
OperatorHeadASCII = [/=\-+\*%!<>&\\|^~?]

OperatorHeadUnicodeRanges = [\u00A1-\u00A7\u00A9\u00AB\u00AC\u00AE\u00B0-\u00B1\u00B6\u00BB\u00BF\u00D7\u00F7\u2016-\u2017\u2020-\u2027\u2030-\u203E\u2041-\u2053\u2055-\u205E\u2190-\u23FF\u2500-\u2775\u2794-\u2BFF\u2E00-\u2E7F\u3001-\u3003\u3008-\u3020\u3030]
		// Common Unicode properties for symbols (check overlap with ranges)
		// Math Symbol, Modifier Symbol, Other Symbol, Dash Punctuation
OperatorHeadUnicodeProperties = [\p{Sm}\p{Sk}\p{So}\p{Pd}]
OperatorHead = {OperatorHeadASCII} | {OperatorHeadUnicodeRanges} | {OperatorHeadUnicodeProperties}
		// Note: Again, check overlap and completeness vs. spec. Combining properties and ranges might be best.

		// Combining Mark, Enclosing Mark, Variation Selector ranges from spec
OperatorCharacterCombining = [\u0300-\u036F\u1DC0-\u1DFF\u20D0-\u20FF\uFE00-\uFE0F\uFE20-\uFE2F] | [\p{Mn}\p{Mc}\p{Me}]
		// Any character valid as an operator head can also be an operator character
OperatorCharacterHead = {OperatorHead}
OperatorCharacter = {OperatorCharacterCombining} | {OperatorCharacterHead}
DotOperatorHead = \.
DotOperatorCharacter = \. | {OperatorCharacter}



	// Lexical State Declarations:
%xstate INITIAL
%xstate STRING
%xstate MULTILINE_STRING
%xstate STRING_INTERPOLATION
%xstate MULTILINE_COMMENT
%xstate EXTENDED_STRING
%xstate EXTENDED_MULTILINE_STRING

%%
	// --- JFlex Section Three: Lexical Rules ---
		// Rules for <YYINITIAL> state
<YYINITIAL> {
		// State Change Rules:
	"/*" {commentNestingDepth++; stateStack.push(yystate()); yybegin(MULTILINE_COMMENT);
	return com.makememonad.turbofan.language.swift.psi.SwiftTypes.MULTILINE_COMMENT_START;}
	"\"" {yybegin(STRING); return com.makememonad.turbofan.language.swift.psi.SwiftTypes.DOUBLE_QUOTE;}
		// Whitespace:
	({inlineSp}|{LineTerm}|{wsItem})+ {return WHITE_SPACE;}
		// Comments:
	("//" {comTextItem}+ {LineTerm}?) {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.SINGLELINE_COMMENT;}

      	// --- Private-Use Identifier Rule ---
      	// Matches ` followed by identifier characters followed by `
      	"`" {IdentifierHead}{IdentifierCharacter}* "`" { return com.makememonad.turbofan.language.swift.psi.SwiftTypes.QUOTED_IDENTIFIER; } // Define this token

		// Keywords that begin with a number sign (#):
		// Prior to Swift 5.9, the following keywords were reserved: #column, #dsohandle, #error, #fileID, #filePath, #file, #function, #line, and #warning.
		// These are now implemented as macros in the Swift standard library: column, dsohandle, error(_:), fileID, filePath, file, function, line, and warning(_:).
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
		// Keywords (For Declarations):
	"associatedtype" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_ASSOCIATEDTYPE;}
	"borrowing" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_BORROWING;}
	"class" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_CLASS;}
	"consuming" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_CONSUMING;}
	"deinit" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_DEINIT;}
	"enum" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_ENUM;}
	"extension" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_EXTENSION;}
	"fileprivate" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_FILEPRIVATE;}
	"func" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_FUNC;}
	"import" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_IMPORT;}
	"init" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_INIT;}
	"inout" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_INOUT;}
	"internal" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_INTERNAL;}
	"let" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_LET;}
	"nonisolated" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_NONISOLATED;}
	"open" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_OPEN;}
	"operator" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_OPERATOR;}
	"precedencegroup" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_PRECEDENCEGROUP;}
	"private" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_PRIVATE;}
	"protocol" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_LOWER_PROTOCOL_DECL;}
	"public" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_PUBLIC;}
	"rethrows" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_RETHROWS;}
	"static" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_STATIC;}
	"struct" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_STRUCT;}
	"subscript" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_SUBSCRIPT;}
	"typealias" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_TYPEALIAS;}
	"var" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_VAR;}
		// Keywords (For Statements):
	"break" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_BREAK;}
	"case" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_CASE;}
	"catch" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_CATCH;}
	"continue" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_CONTINUE;}
	"default" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_DEFAULT;}
	"defer" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_DEFER;}
	"do" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_DO;}
	"else" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_ELSE;}
	"fallthrough" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_FALLTHROUGH;}
	"for" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_FOR;}
	"guard" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_GUARD;}
	"if" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_IF;}
	"in" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_IN;}
	"repeat" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_REPEAT;}
	"return" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_RETURN;}
	"switch" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_SWITCH;}
	"throw" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_THROW;}
	"where" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_WHERE;}
	"while" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_WHILE;}
		// Keywords (For Expressions/Types):
	"Any" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_UPPER_ANY;}
	"as" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_AS;}
	"await" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_AWAIT;}
	"catch" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_CATCH;}
	"false" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_FALSE;}
	"is" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_IS;}
	"nil" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_NIL;}
	"rethrows" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_RETHROWS;}
	"self" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_LOWER_SELF;}
	"Self" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_UPPER_SELF;}
	"super" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_SUPER;}
	"throw" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_THROW;}
	"throws" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_THROWS;}
	"true" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_TRUE;}
	"try" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_TRY;}
		// Keywords (For Patterns):
	"_" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_UNDERSCORE;}
		// Keywords reserved in particular contexts: Outside the context in which they appear in the grammar, they can be used as identifiers.
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

	// --- Floating Point Literals ---

		// Pattern: 0x/0X followed by (optional HexDigitsWithUnderscores) followed by (optional HexFraction) followed by REQUIRED HexExponent.
		// Constraint: Must have EITHER HexDigitsWithUnderscores before fraction, OR HexFraction, OR both. AND must have HexExponent.
	"0"[xX] (({HexDigitsWithUnderscores})? {HexFraction} | {HexDigitsWithUnderscores}) {HexExponent} {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.HEX_FLOATING_POINT_LITERAL;}

		// Pattern: DecimalDigitsWithUnderscores followed by (optional DecimalFraction) followed by (optional DecimalExponent).
		// Constraint: Must have EITHER DecimalFraction OR DecimalExponent, OR both. Cannot be just DecimalDigitsWithUnderscores.
	{DecimalDigitsWithUnderscores} ( {DecimalFraction} ({DecimalExponent})? | {DecimalExponent} ) {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.DECIMAL_FLOATING_POINT_LITERAL;}

	// --- Integer Literals ---

		// Binary Literal: 0b followed by binary digits with optional underscores
		// Octal Literal: 0o followed by octal digits with optional underscores
		// Hexadecimal Literal: 0x followed by hex digits with optional underscores
		// Decimal Literal: Decimal digits with optional underscores (comes after prefixed)
	"0"[bB]{BinaryBody} {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.BINARY_LITERAL;}
	"0"[oO]{OctalBody} {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OCTAL_LITERAL;}
	"0"[xX]{HexBody} {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.HEX_LITERAL;}
	{DecimalBody} {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.DECIMAL_LITERAL;}

	// --- Operators and Punctuation (Fixed String Literals) ---
		// The following tokens are reserved as punc and can’t be used as cust operators (, ), {, }, [, ], ., ,, :, ;, =, @, #, & (as a prefix operator), ->, `, ?, and ! (as postfix op).
	"<<<"  {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.TRIPLE_LANGLE;}
	">>>"  {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.TRIPLE_RANGLE;}
	"===" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.TRIPLE_EQ;}
	"..." {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.ELLIPSIS;}
	"..<" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.RANGE_UPTO;}
	"==" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.DOUBLE_EQ;}
	"&&" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.DOUBLE_AMP;}
	"||" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.DOUBLE_PIPE;}
	"<<"  {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.DOUBLE_LANGLE;}
	">>"  {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.DOUBLE_RANGLE;}
	"??" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.DOUBLE_QUESTION;}
	"!?" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.INTERROBANG;}
	"!=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.NOTEQUAL;}
	"<=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.LESSTHAN_OREQUAL;}
	">=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.GREATERTHAN_OREQUAL;}
	"->" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.FWD_ARROW;}

		// Fixed punctuation: (order might matter relative to multi-char ops, but often can group)
	"=" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.EQ;}
	"@" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.AT_SYMBOL;}
	"#" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.POUND;}
	"$" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.SDOLLAR;}
	"(" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.LPAREN;}
	")" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.RPAREN;}
	"{" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.LBRACE;}
	"}" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.RBRACE;}
	"[" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.LBRACKET;}
	"]" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.RBRACKET;}
	"," {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.COMMA;}
	":" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.COLON;}
	";" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.SEMICOLON;}
	"'" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.APOSTROPHE;}
		// Gotta escape double-quote mark
	"\\\"" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.DOUBLE_QUOTE;}
		// Gotta escape backslash
	"\\\\" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.BACKSLASH;}
		// Standalone Backtick:
	"`" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.BACKTICK;}
		// Standalone dot: - must come BEFORE dot operator rule
	"." {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.DOT;}

		// Fixed single characters that can also start custom operators: - must come AFTER multi-char ops starting with them
	"+" { return com.makememonad.turbofan.language.swift.psi.SwiftTypes.PLUS; }
	"-" { return com.makememonad.turbofan.language.swift.psi.SwiftTypes.MINUS;}

	    // All other fixed single-char operators:
	"/"{return com.makememonad.turbofan.language.swift.psi.SwiftTypes.FWDSLASH;}
	"?" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.QUESTION;}
	"!" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.BANG;}
	"|" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.PIPE;}
	"*" { return com.makememonad.turbofan.language.swift.psi.SwiftTypes.STAR;}
	"&" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.AMP;}
	"<"  {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.LANGLE;}
	">"  {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.RANGLE;}
	"~" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.TILDE;}
	"^" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.CARAT;}
	"%" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.MODULO;}

	// --- General Custom Operator Rules ---
		// Based on Swift Language Reference -> Lexical Structure -> Operators
	{DotOperatorHead} {DotOperatorCharacter}+ {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.DOT_OPERATOR;}
		// Note: This matches ".+" ".**." etc. It matches the longest sequence starting with dot followed by dot-operator-chars.

	{OperatorHead} {OperatorCharacter}* {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.OPERATOR;}
		// Note: This matches "***" "+++" "<*>" etc. It matches the longest sequence starting with operator-head followed by operator-chars.

		// Identifiers (Regular - using the comprehensive macros)
	{IdentifierHead}{IdentifierCharacter}* {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.IDENTIFIER;}

	// --- String Literal Entry Rules ---
		// Longest matching extended delimiters first, then regular delimiters.
	{ExtendedDelimiter}"\"\"\"" {
		currentExtendedDelimiterLength = yytext().length() - 3;
		yybegin(EXTENDED_MULTILINE_STRING);
		return com.makememonad.turbofan.language.swift.psi.SwiftTypes.EXTENDED_MULTILINE_STRING_OPEN;
	}

	"\"\"\"" {
		currentExtendedDelimiterLength = 0;
		yybegin(MULTILINE_STRING);
		return com.makememonad.turbofan.language.swift.psi.SwiftTypes.TRIPLE_DOUBLE_QUOTE;
	}

	{ExtendedDelimiter}"\"" {
		currentExtendedDelimiterLength = yytext().length() - 1;
		yybegin(EXTENDED_STRING);
		return com.makememonad.turbofan.language.swift.psi.SwiftTypes.EXTENDED_SINGLE_QUOTE_OPEN;
	}

	"\"" {
		currentExtendedDelimiterLength = 0;
		yybegin(STRING);
		return com.makememonad.turbofan.language.swift.psi.SwiftTypes.DOUBLE_QUOTE;
	}
		// Fallback:
	. {return BAD_CHARACTER;}
}

		// Rules for <MULTILINE_COMMENT> state
<MULTILINE_COMMENT> {
	"/*" {commentNestingDepth++;
		  return SwiftTypes.MULTILINE_COMMENT_START;
	  }
	"*/" {commentNestingDepth--;
		  if (commentNestingDepth == 0) {yybegin(stateStack.pop()); return SwiftTypes.MULTILINE_COMMENT_END;}
		  else {return SwiftTypes.MULTILINE_COMMENT_END;}
	}
		// Rules for comment content (order matters):
		// Sequences of non-stars, non-newlines, non-slashes
	[^*\n/]+ {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.COMMENT_TEXT;}
		// A single star (that wasn't part of */)
	"*" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.COMMENT_TEXT;}
		// A single slash (that wasn't part of /*)
	"/" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.COMMENT_TEXT;}
		// Fallback - matches any other character, including newlines
		// Treat everything else as text within the comment
	.|\n {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.COMMENT_TEXT; }
		// You could add a final '.' rule returning BAD_CHARACTER if you wanted to be very strict, but within a comment, this is rarely needed as most chars are valid.
}

		// Rules for <String> state
<STRING> {
	"\\("{
		stateStack.push(yystate());
		yybegin(STRING_INTERPOLATION);
		return com.makememonad.turbofan.language.swift.psi.SwiftTypes.STRING_INTERPOLATION_START;
	}
		// Closing Delimiter Rule (matches just the quote)
	"\"" {
			// Only transition if it's the correct delimiter for a regular string (length 0)
		if (currentExtendedDelimiterLength == 0) {
			yybegin(YYINITIAL); return com.makememonad.turbofan.language.swift.psi.SwiftTypes.DOUBLE_QUOTE;
		}
			// Stay in state; fallback or other rules consume rest.
		else {return BAD_CHARACTER;}
	}
		// Escape Sequences
	\\ {AnyEscapedCharacterPattern} {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.STRING_ESCAPE_SEQUENCE;}
		// Prohibited Newlines
	[\u000A\u000D] { /* Found newline in single line string - Error? */ return BAD_CHARACTER;}
		// Regular String Content
	{QuotedTextItemPattern_SingleLine}+ {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.STRING_TEXT;}
		// Fallback
	. {return BAD_CHARACTER;}
}

		// Rules for <MULTILINE_STRING> state
<MULTILINE_STRING> {
	"\\(" {
		  stateStack.push(yystate());
		  yybegin(STRING_INTERPOLATION);
		  return com.makememonad.turbofan.language.swift.psi.SwiftTypes.STRING_INTERPOLATION_START;
	  }

	\\{AnyEscapedCharacterPattern} {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.MULTILINE_STRING_ESCAPE_SEQUENCE;}
	{EscapedNewlinePattern} {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.MULTILINE_STRING_ESCAPED_NEWLINE;}

	// Nested Multiline Comment Start
	"/*" {
		commentNestingDepth++;
		stateStack.push(yystate());
		yybegin(MULTILINE_COMMENT);
		return com.makememonad.turbofan.language.swift.psi.SwiftTypes.MULTILINE_COMMENT_START;
	}

		// Closing Delimiter
	"\"\"\"" {
		if (currentExtendedDelimiterLength == 0) {
			yybegin(YYINITIAL); return com.makememonad.turbofan.language.swift.psi.SwiftTypes.TRIPLE_DOUBLE_QUOTE;}
		else {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.MULTILINE_STRING_TEXT;} // Or a specific """_LITERAL token
	}

	// Regular Multiline String Content
	([^"\\\u000A\u000D] | [\u000A\u000D])+ {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.MULTILINE_STRING_TEXT;}

    // Alternative simplified content rule, relying on ordering and other rules taking precedence:
    // [^"\\/]+ { return com.makememonad.turbofan.language.swift.psi.SwiftTypes.MULTILINE_STRING_TEXT; } // Match chars not ", \, or /
    // Or even just:
    // [^"\\]+ { return com.makememonad.turbofan.language.swift.psi.SwiftTypes.MULTILINE_STRING_TEXT; } // Match chars not " or \ (allows /)

		// Fallback:
	.|\n {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.MULTILINE_STRING_TEXT;}
		// The above content rule might consume newlines, but the fallback should catch any char not handled.
		// Need to revisit the rules in <MULTILINE_COMMENT> to ensure "*/" pops back to MULTILINE_STRING if that's on the stack.

}

		// Rules for <EXTENDED_STRING> state
<EXTENDED_STRING> {

		// Fallback:
	. {return BAD_CHARACTER}
}

		// Rules for <EXTENDED_MULTILINE_STRING> state
<EXTENDED_MULTILINE_STRING> {

		// Fallback:
	. {return BAD_CHARACTER}
}

      // Rules for String Interpolation
      // Parser will need to handle a lot of this after lexing... Will need to implement after code-gen
<STRING_INTERPOLATION> {
		// Signal to the parser that the embedded expression ends here.
	")" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.RPAREN;}
		// Fallback:
	. {return BAD_CHARACTER;}
}