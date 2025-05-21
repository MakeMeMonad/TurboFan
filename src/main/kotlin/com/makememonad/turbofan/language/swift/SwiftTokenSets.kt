package com.makememonad.turbofan.language.swift

import com.intellij.psi.tree.TokenSet
import com.makememonad.turbofan.language.swift.psi.SwiftTypes.*

interface SwiftTokenSets {
    companion object {
        val IDENTIFIERS = TokenSet.create(IDENTIFIER)
        val KEYWORDS = TokenSet.create(ANY_KEYWORD)
        val OPERATORS = TokenSet.create(OPERATOR, DOT_OPERATOR, PREFIX_OPERATOR, INFIX_OPERATOR, POSTFIX_OPERATOR)
        val COMMENTS = TokenSet.create(SINGLELINE_COMMENT, COMMENT_TEXT, MULTILINE_COMMENT_START, MULTILINE_COMMENT_END)
        // TODO: Split out multi-line comments, get them a dedicated token or something for multi-line comment text...
        // TODO: Figure out doc-string comments, get a rule in place for those and a token as well...
        val LITERALS = TokenSet.create(LITERAL)
        val STRINGS = TokenSet.create(STRING_LITERAL, STATIC_STRING_LITERAL, STRING_START, STRING_TEXT, STRING_END)
        val MULTILINE_STRINGS = TokenSet.create(MULTILINE_STRING_START, MULTILINE_STRING_TEXT, MULTILINE_STRING_END)
        val INTEGERS = TokenSet.create(INTEGER_LITERAL)
        // TODO: Split out subtypes of INTEGER, tokens already in place, just 2tired for it tongiht...
        val FLOATS = TokenSet.create(HEX_FLOATING_POINT_LITERAL, DECIMAL_FLOATING_POINT_LITERAL)
        val REGEXP = TokenSet.create(REGULAR_EXPRESSION_LITERAL)
        val NUMBERS = TokenSet.orSet(
            INTEGERS,
            FLOATS
        )
        val BOOLEAN = TokenSet.create(KW_TRUE, KW_FALSE)
        val NIL = TokenSet.create(KW_NIL)




    }
}