package ru.project.apiTests.service

import ru.project.apiTests.dto.GhostDto

interface GhostService {
    fun getAll(): List<GhostDto>
}