package ru.project.apiTests.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.project.journal.Journal

@RestController
@RequestMapping("/ghosts")
class GhostController(
    @Autowired private val ghostService: Journal
) {
    @GetMapping
    fun getAllGhostsNames(): List<String> = ghostService.getAllGhostsNames()

    @GetMapping("/search/{evidence}")
    fun searchGhostsEvidence(@PathVariable("evidence") evidence: String): List<String> =
        ghostService.searchGhostsEvidence(evidence)

    @GetMapping("/{name}")
    fun showInformationGhost(@PathVariable("name") name: String): List<String> = ghostService.describeGhost(name)
}
