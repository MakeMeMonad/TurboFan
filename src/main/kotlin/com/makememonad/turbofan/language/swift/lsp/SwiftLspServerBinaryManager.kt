package com.makememonad.turbofan.language.swift.lsp

import com.intellij.openapi.application.ApplicationManager
import java.io.File

class SwiftLspServerBinaryManager {

	private val storage: SwiftLspServerBinaryManagerStorage
		get() = ApplicationManager.getApplication().getService(SwiftLspServerBinaryManagerStorage::class.java)

	fun findSourceKitLsp(): String? {
		// 1. User-configured path
		val userPath = storage.skPath
		if (userPath.isNotBlank() && File(userPath).exists()) return userPath

		// 2. Check default locations
		for (path in storage.state.skDefaultPaths) {
			if (path.isNotBlank() && File(path).exists()) return path
		}

		// 3. Try "which sourcekit-lsp"
		val whichResult = runCommand(listOf("which", "sourcekit-lsp"))
		if (!whichResult.isNullOrBlank() && File(whichResult).exists()) return whichResult

		// 4. Try "xcrun -f sourcekit-lsp" (for Xcode-based macOS)
		val xcrunResult = runCommand(listOf("xcrun", "-f", "sourcekit-lsp"))
		if (!xcrunResult.isNullOrBlank() && File(xcrunResult).exists()) return xcrunResult
		// 5. No result, return null
		return null
	}

	private fun runCommand(cmd: List<String>): String? =
		try {
			val process = ProcessBuilder(cmd).start()
			process.inputStream.bufferedReader().readLine()?.trim()
		} catch (e: Exception) {
			null
		}
}