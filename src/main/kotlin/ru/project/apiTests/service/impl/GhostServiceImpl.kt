package ru.project.apiTests.service.impl

import ru.project.apiTests.dto.GhostDto
import ru.project.apiTests.service.GhostService
import org.springframework.stereotype.Service

@Service
class GhostServiceImpl : GhostService {
    override fun getAll(): List<GhostDto> {
        return listOf(
            GhostDto("Banshee", "A singing siren who attracts her victims with songs", listOf("Pursuit",
                "Banshee Scream"), listOf("Ultraviolet", "Ghost Orb", "Laser Projector")),
            GhostDto("Demon", "The demon is one of the worst ghosts you can meet", listOf("Early Hunt"),
                listOf("Ultraviolet", "Ghost Writing", "Freezing Temperatures"))
        )
    }
}