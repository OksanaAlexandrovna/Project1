package ru.project.gosts

import ru.project.ability.gosts.Ability
import ru.project.apiTests.dto.GhostDto
import ru.project.evidence.Evidence

open class Ghosts(val name: String, val history: String) {

    val evidences = ArrayList<Evidence>()
    val abilities = ArrayList<Ability>()

    fun isRelates(evidence: String): Boolean {
        for (i in 0 until evidences.size) {
            if (evidences[i].name == evidence) return true
        }
        return false
    }

    fun showInformationGhost(name: String): GhostDto {
        return GhostDto(name, history, abilities.joinToString(), evidences.joinToString())
    }
}