package com.makememonad.turbofan.language.swift

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.NlsContexts
import com.intellij.openapi.vfs.VirtualFile
import org.jetbrains.annotations.Nls
import org.jetbrains.annotations.NonNls
import javax.swing.Icon

class SwiftFileType: LanguageFileType(/* language = */ SwiftLanguage) {
    val fileName: String = "Swift File"
    val dispName: String = "Swift"
    val description: String = "Swift language source file."
    val defaultExt: String = "swift"
    val defaultCharset: String = "UTF-8"
    override fun getName(): @NonNls String {return fileName}
    override fun getDisplayName():@Nls String {return dispName}
    override fun getDescription(): @NlsContexts.Label String {return description}
    override fun getDefaultExtension(): @NonNls String {return defaultExt}
    override fun getCharset(file:VirtualFile, content:ByteArray):@NonNls String {return defaultCharset}
    override fun getIcon(): Icon? {return SwiftIcons.Icon}
}