package ru.project.apiTests.controller

import ru.project.apiTests.dto.GhostDto
import ru.project.apiTests.service.GhostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/ghosts")
class GhostController(
    @Autowired private val ghostService: GhostService,
) {
    @GetMapping

    fun getAll(): List<GhostDto> = ghostService.getAll()
}