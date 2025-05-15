package com.makememonad.turbofan.language.swift.psi.lexer;

// JFlex Section One: USERCODE
// The text up to the second section is copied verbatim to the top of the generated lexer class (before the actual class declaration).

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;

// Import the token types you defined in Swift.bnf (they will be generated)
// This line will need to point to the generated PsiTypes class
// import com.makememonad.turbofan.language.swift.psi.SwiftTypes;


%%
// JFlex Section Two: Options, Macros, and Declarations

// JFlex Option Switches:

%class SwiftLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

// The code between %{ and %} is copied verbatim into the generated lexer class source.
// There you can declare member variables and functions that are used inside scanner actions.

%{

%}

// Macro Declarations:

LineTerm = \R

// InputCharacter =
// DecIntLit =

// Whitespace Declarations
inlineSp =  [\u0009 \u0020]
lineBr = [\u000A \u000D (\u000D \u000A)]
ws = [\u0000 \u000B \u000C]

// Comment Declarations
comTextItem = [^\u000A \u000D]
multiComTextItem = [ [^"/*" "*/"] | [^\u000A \u000D] | multiCom]

// Identifier Declarations


// Lexical State Declarations:

// Define states here if needed for complex lexing (e.g., string interpolation)
// %state STRING

// %multiCom MULTICOM


%%
// JFlex Section Three: Lexical Rules
//

<YYINITIAL> {
  // Define patterns for the tokens listed in Swift.bnf's tokens {} block

// Whitespace
			[ws lineBr inlineSp ("//" comTextItem+ lineBr) ("/*" multiComTextItem+ "*/")]+ { return com.makememonad.turbofan.language.swift.psi.SwiftTypes.WHITE_SPACE;}
      inlineSp+ {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.INLINE_SPACES;}

// Comments
("//" comTextItem+ lineBr) { return com.makememonad.turbofan.language.swift.psi.SwiftTypes.SINGLE_LINE_COMMENT; }
("/*" multiComTextItem+ "*/") { return com.makememonad.turbofan.language.swift.psi.SwiftTypes.MULTI_LINE_COMMENT; }

  // Identifiers (very basic - Swift rules are complex!)
  [a-zA-Z_][a-zA-Z0-9_]* { return com.makememonad.turbofan.language.swift.psi.SwiftTypes.IDENTIFIER; }

      // Keywords (For Declarations)
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

      // Keywords (For Statements)
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

      // Keywords (For Expressions/Types)
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

      // Keywords (For Patterns)
			"_" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_PATTERN_UNDERSCORE;}

      // Keywords (Beginning with #)

//Keywords that begin with a number sign (#): #available, #colorLiteral, #else, #elseif, #endif, #fileLiteral, #if, #imageLiteral, #keyPath, #selector, #sourceLocation, #unavailable.
//Prior to Swift 5.9, the following keywords were reserved: #column, #dsohandle, #error, #fileID, #filePath, #file, #function, #line, and #warning. These are now implemented as macros in the Swift standard library: column, dsohandle, error(_:), fileID, filePath, file, function, line, and warning(_:).

"#available" {return com.makememonad.turbofan.language.swift.psi.SwiftTypes.KW_AVAILABLE;}



      // Keywords (Only In Particular Contexts) Use States for These..?
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

    //The following tokens are reserved as punctuation and can’t be used as custom operators:
    // (, ), {, }, [, ], ., ,, :, ;, =, @, #, & (as a prefix operator), ->, `, ?, and ! (as a postfix operator).


  // Punctuation (simple examples)
  "("                    { return com.makememonad.turbofan.language.swift.psi.SwiftTypes.LPAREN; }
  ")"                    { return com.makememonad.turbofan.language.swift.psi.SwiftTypes.RPAREN; }
  "{"                    { return com.makememonad.turbofan.language.swift.psi.SwiftTypes.LBRACE; }
  "}"                    { return com.makememonad.turbofan.language.swift.psi.RBRACE; }
      "[" {return com.makememonad.turbofan.language.swift.psi.LBRACKET;}
      "]" {return com.makememonad.turbofan.language.swift.psi.RBRACKET;}
      "." {return com.makememonad.turbofan.language.swift.psi.DOT;}
      "," {return com.makememonad.turbofan.language.swift.psi.COMMA;}
      ":" {return com.makememonad.turbofan.language.swift.psi.COLON;}
      ";" {return com.makememonad.turbofan.language.swift.psi.SEMICOLON;}
      "="
      "@" {return com.makememonad.turbofan.language.swift.psi.AT_SYMBOL;}
      "#" {return com.makememonad.turbofan.language.swift.psi.POUND;}
      "&" //As prefix
      "->" {return com.makememonad.turbofan.language.swift.psi.FWD_ARROW;}
      "`" {return com.makememonad.turbofan.language.swift.psi.BACKTICK;}
      "?" //handle unwrapping...?
      "!" //As postfix


// Literals

  // Integer Literals (basic)
  [0-9]+                 { return com.makememonad.turbofan.language.swift.psi.SwiftTypes.INTEGER_LITERAL; }

  // String Literals (very basic, no escapes/interpolation)
  \"[^\"]*\"            { return com.makememonad.turbofan.language.swift.psi.SwiftTypes.STRING_LITERAL; }



  // Operators (simple examples)
  "+"                    { return com.makememonad.turbofan.language.swift.psi.SwiftTypes.PLUS; }
  "="                    { return com.makememonad.turbofan.language.swift.psi.SwiftTypes.EQ; }



  // Catch any other character as a BAD_CHARACTER
  .                      { return BAD_CHARACTER; }
}

// Define rules for other states here if you add them (e.g., <STRING> ...)