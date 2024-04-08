package gosts

import ability.gosts.Ability
import evidence.Evidence

open class Ghosts(val name: String, val history: String) {

    val evidences = ArrayList<Evidence>()
    fun showEvidences() {
        println(evidences)
    }

    val abilities = ArrayList<Ability>()
    fun showAbilities() {
        println(abilities)
    }

    fun isRelates(evidence: String): Boolean {
        for (i in 0 until evidences.size) {
            if (evidences[i].name == evidence) return true
        }
        return false
    }

    // val allInformation = mutableListOf(name, history, evidences)
    fun showInformationGhost(name: String): List<String> {
        return listOf(name, history, abilities.joinToString(), evidences.joinToString())
    }
}