package com.makememonad.turbofan.language.swift

import com.intellij.psi.tree.TokenSet
import com.intellij.psi.tree.TokenSet.create
import com.intellij.psi.tree.TokenSet.orSet
import com.makememonad.turbofan.language.swift.psi.SwiftTypes.*

object SwiftTokenSets {
	
	val TS_ALL_KEYWORDS: TokenSet
		get() = create(                /* ...types = */ KW_PND_AVAILABLE,
					       KW_PND_COLORLITERAL,
					       KW_PND_ELSE,
					       KW_PND_ELSEIF,
					       KW_PND_ENDIF,
					       KW_PND_FILELITERAL,
					       KW_PND_IF,
					       KW_PND_IMAGELITERAL,
					       KW_PND_KEYPATH,
					       KW_PND_SELECTOR,
					       KW_PND_SOURCELOCATION,
					       KW_PND_UNAVAILABLE,
					       KW_UPPER_ANY,
					       KW_LOWER_ANY,
					       KW_ASSOCIATEDTYPE,
					       KW_AWAIT,
					       KW_BORROWING,
					       KW_BREAK,
					       KW_CASE,
					       KW_CLASS,
					       KW_CONSUMING,
					       KW_CONTINUE,
					       KW_DEFAULT,
					       KW_DEFER,
					       KW_DEINIT,
					       KW_DO,
					       KW_ELSE,
					       KW_ENUM,
					       KW_EXTENSION,
					       KW_FALLTHROUGH,
					       KW_FALSE,
					       KW_FILEPRIVATE,
					       KW_FOR,
					       KW_FUNC,
					       KW_GUARD,
					       KW_IF,
					       KW_IMPORT,
					       KW_IN,
					       KW_INIT,
					       KW_INOUT,
					       KW_INTERNAL,
					       KW_LET,
					       KW_NIL,
					       KW_NONISOLATED,
					       KW_OPEN,
					       KW_OPERATOR,
					       KW_PRECEDENCEGROUP,
					       KW_PRIVATE,
					       KW_LOWER_PROTOCOL_DECL,
					       KW_PUBLIC,
					       KW_REPEAT,
					       KW_RETURN,
					       KW_LOWER_SELF,
					       KW_UPPER_SELF,
					       KW_STATIC,
					       KW_STRUCT,
					       KW_SUPER,
					       KW_SWITCH,
					       KW_SUBSCRIPT,
					       KW_THROWS,
					       KW_TRUE,
					       KW_TRY,
					       KW_TYPEALIAS,
					       KW_VAR,
					       KW_WHERE,
					       KW_WHILE,
					       KW_CATCH,
					       KW_THROW,
					       KW_RETHROWS,
					       KW_ASSOCIATIVITY,
					       KW_ASYNC,
					       KW_CONVENIENCE,
					       KW_DIDSET,
					       KW_DYNAMIC,
					       KW_FINAL,
					       KW_GET,
					       KW_INDIRECT,
					       KW_INFIX,
					       KW_LAZY,
					       KW_LEFT,
					       KW_MUTATING,
					       KW_NONE,
					       KW_NONMUTATING,
					       KW_OPTIONAL,
					       KW_OVERRIDE,
					       KW_PACKAGE,
					       KW_POSTFIX,
					       KW_PRECEDENCE,
					       KW_PREFIX,
					       KW_UPPER_PROTOCOL,
					       KW_REQUIRED,
					       KW_RIGHT,
					       KW_SET,
					       KW_SOME,
					       KW_UPPER_TYPE,
					       KW_UNOWNED,
					       KW_WEAK,
					       KW_WILLSET)
	val TS_ALL_IDENTIFIERS: TokenSet
		get() = create(/* ...types = */ IDENTIFIER)
	val TS_ALL_NUMBERS: TokenSet
		get() = orSet(/* ...sets = */ TS_ALL_INTEGERS, TS_ALL_FLOATS)
	val TS_ALL_STRINGS: TokenSet
		get() = orSet(/* ...sets = */TS_SINGLELINE_STRINGS, TS_MULTILINE_STRINGS)
	
	// TODO: Fill this out with all other Operator tokens emitted by the lexer..?
	val TS_ALL_OPERATORS: TokenSet
		get() = create(/* ...types = */ OPERATOR, OP_ADD)
	
	// TODO: Figure out doc-string comments, get a rule in place for those and a token as well...
	val TS_ALL_LITERALS: TokenSet
		get() = orSet(                /* ...sets = */ TS_ALL_STRINGS, TS_ALL_NUMBERS, TS_OTHER_LITERALS)
	val TS_ALL_COMMENTS: TokenSet
		get() = orSet(                /* ...sets = */ TS_SINGLELINE_COMMENTS, TS_MULTILINE_COMMENTS)
	val TS_OTHER_LITERALS: TokenSet
		get() = orSet(                /* ...sets = */ TS_REGEXP, TS_BOOLEANS, TS_NILS)
	val TS_ALL_INTEGERS: TokenSet
		get() = create(          /* ...types = */ INTEGER_LITERAL, HEX_LITERAL, OCTAL_LITERAL, BINARY_LITERAL)
	val TS_ALL_FLOATS: TokenSet
		get() = create(            /* ...types = */ HEX_FLOATING_POINT_LITERAL, DECIMAL_FLOATING_POINT_LITERAL)
	val TS_SINGLELINE_STRINGS: TokenSet
		get() = create(                        /* ...types = */ STRING_START, STRING_TEXT, STRING_END)
	val TS_MULTILINE_STRINGS: TokenSet
		get() = create(                /* ...types = */ MULTILINE_STRING_START, MULTILINE_STRING_TEXT, MULTILINE_STRING_END)
	val TS_SINGLELINE_COMMENTS: TokenSet
		get() = create(                /* ...types = */ SINGLELINE_COMMENT, COMMENT_TEXT)
	val TS_MULTILINE_COMMENTS: TokenSet
		get() = create(/* ...types = */ MULTILINE_COMMENT_START, MULTILINE_COMMENT_TEXT, MULTILINE_COMMENT_END)
	val TS_REGEXP: TokenSet
		get() = create(/* ...types = */ REGULAR_EXPRESSION_LITERAL)
	val TS_BOOLEANS: TokenSet
		get() = create(/* ...types = */ KW_TRUE, KW_FALSE)
	val TS_NILS: TokenSet
		get() = create(/* ...types = */ KW_NIL)
}