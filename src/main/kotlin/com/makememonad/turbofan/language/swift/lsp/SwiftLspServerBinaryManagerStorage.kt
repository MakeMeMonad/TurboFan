package com.makememonad.turbofan.language.swift.lsp

import com.intellij.openapi.components.SerializablePersistentStateComponent
import com.intellij.openapi.components.Service
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage

@Service
@State(
	name = "SwiftLspServerBinaryManagerStorage",
	storages = [Storage("SwiftLspServerBinaryManagerStorage.xml")]
)
class SwiftLspServerBinaryManagerStorage :
	SerializablePersistentStateComponent<SwiftLspServerBinaryManagerStorage.State>(State()) {
	var skPath: String
		get() = state.skPath
		set(value) {updateState {it.copy(skPath = value)}}
	var skFound: Boolean
		get() = state.skFound
		set(value) {updateState {it.copy(skFound = value)}}
	data class State(
		@JvmField val skPath: String = "",
		@JvmField val skFound: Boolean = false,
		@JvmField val skDefaultPaths: List<String> = listOf<String>("/usr/bin/sourcekit-lsp", "/usr/local/bin/sourcekit-lsp", "")
	)
}