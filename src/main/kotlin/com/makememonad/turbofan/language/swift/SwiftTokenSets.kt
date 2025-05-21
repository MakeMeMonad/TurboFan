package com.makememonad.turbofan.language.swift

import com.intellij.psi.tree.TokenSet
import com.makememonad.turbofan.language.swift.psi.SwiftTypes.*

object SwiftTokenSets {
    val IDENTIFIERS = TokenSet.create(IDENTIFIER)
    val KEYWORDS = TokenSet.create(ANY_KEYWORD)
    val OPERATORS = TokenSet.create(OPERATOR, DOT_OPERATOR, PREFIX_OPERATOR, INFIX_OPERATOR, POSTFIX_OPERATOR)
    // TODO: Figure out doc-string comments, get a rule in place for those and a token as well...
    val LITERALS = TokenSet.orSet(this.STRINGS, this.NUMBERS, this.COMMENTS, this.OTHER_LITERALS)
    val STRINGS: TokenSet
        get() = TokenSet.orSet(/* ...sets = */ SINGLELINE_STRINGS, MULTILINE_STRINGS)
    val NUMBERS: TokenSet
        get() = TokenSet.orSet(/* ...sets = */ INTEGERS, FLOATS)
    val COMMENTS: TokenSet
        get() = TokenSet.orSet(/* ...sets = */ SINGLELINE_COMMENTS, MULTILINE_COMMENTS)
    val OTHER_LITERALS: TokenSet
        get() = TokenSet.orSet(/* ...sets = */ REGEXP, BOOLEANS, NILS)
    val SINGLELINE_STRINGS = TokenSet.create(STRING_LITERAL, STATIC_STRING_LITERAL, STRING_START, STRING_TEXT, STRING_END)
    val MULTILINE_STRINGS = TokenSet.create(MULTILINE_STRING_START, MULTILINE_STRING_TEXT, MULTILINE_STRING_END)
    val SINGLELINE_COMMENTS = TokenSet.create(SINGLELINE_COMMENT, COMMENT_TEXT)
    val MULTILINE_COMMENTS = TokenSet.create(MULTILINE_COMMENT_START, MULTILINE_COMMENT_END)
    val INTEGERS = TokenSet.create(INTEGER_LITERAL, HEX_LITERAL, OCTAL_LITERAL, BINARY_LITERAL)
    val FLOATS = TokenSet.create(HEX_FLOATING_POINT_LITERAL, DECIMAL_FLOATING_POINT_LITERAL)
    val REGEXP = TokenSet.create(REGULAR_EXPRESSION_LITERAL)
    val BOOLEANS = TokenSet.create(KW_TRUE, KW_FALSE)
    val NILS = TokenSet.create(KW_NIL)

    }