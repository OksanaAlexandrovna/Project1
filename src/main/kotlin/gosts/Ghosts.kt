package gosts

import evidence.Evidence

open class Ghosts(val name: String) {
    val evidences = ArrayList<Evidence>()
    fun showEvidences() {
        println(evidences)
    }
}