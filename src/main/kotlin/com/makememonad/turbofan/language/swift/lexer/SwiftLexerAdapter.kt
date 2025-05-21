package com.makememonad.turbofan.language.swift.lexer

import com.intellij.lexer.FlexAdapter
import com.makememonad.turbofan.language.swift.psi.lexer.SwiftLexer

class SwiftLexerAdapter: FlexAdapter(/* flex = */ SwiftLexer(null))