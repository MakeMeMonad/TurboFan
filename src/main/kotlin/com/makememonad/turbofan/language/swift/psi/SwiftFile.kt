package com.makememonad.turbofan.language.swift.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.psi.FileViewProvider
import com.makememonad.turbofan.language.swift.SwiftFileType
import com.makememonad.turbofan.language.swift.SwiftLanguage

// TODO: Add stuff for package and import and other top-level stuff...
class SwiftFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, SwiftLanguage) {
    override fun getFileType() = SwiftFileType
    override fun toString(): String = "Swift File"
}