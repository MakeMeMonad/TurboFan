package com.makememonad.turbofan.language.swift.workspace

import com.intellij.platform.workspace.storage.EntityPointer
import com.intellij.platform.workspace.storage.EntitySource
import com.intellij.platform.workspace.storage.WorkspaceEntity
import com.intellij.platform.workspace.storage.annotations.Child

data class SwiftPmPackageEntity(
	val name: String,
	val path: String,
	override val entitySource: EntitySource,

	@Child val targets: List<SwiftPmTargetEntity> = listOf(),
	@Child val products: List<SwiftPmProductEntity> = listOf()
) : WorkspaceEntity {
	override fun <E : WorkspaceEntity> createPointer(): EntityPointer<E> {
		TODO("Not yet implemented")
	}

	override fun getEntityInterface(): Class<out WorkspaceEntity> {
		TODO("Not yet implemented")
	}
}

data class SwiftPmTargetEntity(
	val name: String,
	val type: String, // "library", "executable", etc.
	override val entitySource: EntitySource,

	@Child val dependencies: List<SwiftPmDependencyEntity> = listOf()
) : WorkspaceEntity {
	override fun <E : WorkspaceEntity> createPointer(): EntityPointer<E> {
		TODO("Not yet implemented")
	}

	override fun getEntityInterface(): Class<out WorkspaceEntity> {
		TODO("Not yet implemented")
	}
}

data class SwiftPmProductEntity(
	val name: String,
	val type: String, // "executable", "library", etc.
	override val entitySource: EntitySource
) : WorkspaceEntity {
	override fun <E : WorkspaceEntity> createPointer(): EntityPointer<E> {
		TODO("Not yet implemented")
	}

	override fun getEntityInterface(): Class<out WorkspaceEntity> {
		TODO("Not yet implemented")
	}
}

data class SwiftPmDependencyEntity(
	val name: String,
	val url: String?,
	override val entitySource: EntitySource
) : WorkspaceEntity {
	override fun <E : WorkspaceEntity> createPointer(): EntityPointer<E> {
		TODO("Not yet implemented")
	}

	override fun getEntityInterface(): Class<out WorkspaceEntity> {
		TODO("Not yet implemented")
	}
}