package com.makememonad.turbofan.language.swift

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.NlsContexts
import org.jetbrains.annotations.Nls
import org.jetbrains.annotations.NonNls
import javax.swing.Icon

object SwiftFileType: LanguageFileType(/* language = */ SwiftLanguage) {
    const val FILE_NAME: String = "Swift File"
    const val DISP_NAME: String = "Swift"
    const val FILE_DESCRIPTION: String = "Swift language source file."
    const val DEFAULT_EXTENSION: String = "swift"
    override fun getName(): @NonNls String {return FILE_NAME}
    override fun getDisplayName():@Nls(capitalization = Nls.Capitalization.Title) String {return DISP_NAME}
    override fun getDescription(): @Nls(capitalization = Nls.Capitalization.Sentence) @NlsContexts.Label String {return FILE_DESCRIPTION}
    override fun getDefaultExtension(): @NonNls String {return DEFAULT_EXTENSION}
    override fun getIcon(): Icon? {return SwiftIcons.SwiftFileIcon}
}