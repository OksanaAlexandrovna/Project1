package gosts

import ability.gosts.Ability
import evidence.Evidence

open class Ghosts(val name: String) {
    val evidences = ArrayList<Evidence>()
    fun showEvidences() {
        println(evidences)
    }

    val abilities = ArrayList<Ability>()
    fun showAbilities() {
        println(abilities)
    }

    fun isRelates(evidence: Evidence): Boolean {
        for (i in 0 until evidences.size) {
            if (evidences[i].name == evidence.name) return true
        }
        return false
    }
}