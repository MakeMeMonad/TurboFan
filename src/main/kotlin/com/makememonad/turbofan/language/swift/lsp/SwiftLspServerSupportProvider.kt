package com.makememonad.turbofan.language.swift.lsp

import com.intellij.notification.NotificationGroupManager
import com.intellij.notification.NotificationType
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.LspServer
import com.intellij.platform.lsp.api.LspServerSupportProvider
import com.intellij.platform.lsp.api.lsWidget.LspServerWidgetItem
import com.makememonad.turbofan.language.swift.SwiftIcons.SwiftFileIcon

final class SwiftLspServerSupportProvider: com.intellij.platform.lsp.api.LspServerSupportProvider {
	
	override fun fileOpened(project: Project, file: VirtualFile, serverStarter: LspServerSupportProvider.LspServerStarter) {
		val manager = com.makememonad.turbofan.language.swift.lsp.SwiftLspServerBinaryManager()
		val lspPath = manager.findSourceKitLsp()
		if(lspPath != null) {
			serverStarter.ensureServerStarted(SwiftLspServerDescriptor(project, "SourceKit-LSP", lspPath))
		}
		else {
			notifySourceKitNotFound(project)
		}
	}
	
	override fun createLspServerWidgetItem(lspServer: LspServer, currentFile: VirtualFile?): LspServerWidgetItem? {
		return LspServerWidgetItem(
			    lspServer = lspServer, currentFile = currentFile, icon = SwiftFileIcon, settingsPageClass = null)
	}
	
	// TODO: Add a link to the notification for quick access to the Swift toolchain download page, preferably for the host os/arch...
	// TODO: Implement settings page for user-configured path, and link to it from notification...
	fun notifySourceKitNotFound(project: Project? = null) {
		NotificationGroupManager
			    .getInstance()
			    .getNotificationGroup("TurboFan Notifications")
			    .createNotification(
					"Could not find SourceKit-LSP", "Please install the Swift toolchain or provide the path in settings.", NotificationType.ERROR)
			    .notify(project)
	}
}