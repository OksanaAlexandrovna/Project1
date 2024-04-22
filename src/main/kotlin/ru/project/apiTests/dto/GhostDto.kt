package ru.project.apiTests.dto

data class GhostDto(
    val name: String,
    val history: String,
    val ability: List<String>,
    val evidences: List<String>
)