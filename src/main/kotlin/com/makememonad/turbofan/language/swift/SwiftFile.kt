package com.makememonad.turbofan.language.swift

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.psi.FileViewProvider


class SwiftFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, SwiftLanguage) {
    override fun getFileType() = SwiftFileType
    override fun toString(): String = "Swift File"
}