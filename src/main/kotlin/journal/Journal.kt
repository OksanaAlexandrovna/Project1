package journal

import gosts.*
import java.lang.RuntimeException

class Journal() {
    val ghosts = ArrayList<Ghosts>()

    init {
        ghosts.add(Banshee())
        ghosts.add(Demon())
        ghosts.add(Deogen())
        ghosts.add(Mimic())
        ghosts.add(Phantom())
        ghosts.add(Spirit())
        ghosts.add(Yurei())
    }

    fun getAllGhostsNames() : List<String> {
        val nameAllGhosts = ArrayList<String>()
        for (i in 0 until ghosts.size) {
            nameAllGhosts.add(ghosts[i].name)
        }
        return nameAllGhosts
    }

    fun searchGhostsEvidence(evidence: String) : List<String> {
        val searchGhostEvidence = ArrayList<String>()
        for (i in 0 until ghosts.size) {
            if (ghosts[i].isRelates(evidence)) {
                searchGhostEvidence.add(ghosts[i].name)
            }
        }
        return searchGhostEvidence
    }

    fun describeGhost(name: String) : List<String> {
        for (ghost in ghosts) {
            if (ghost.name == name) {
                return ghost.showInformationGhost(name)
            }
        }
        val allGhosts = getAllGhostsNames()
        throw RuntimeException("Non-existent ghost name! Choose a ghost name from the following $allGhosts")
    }

}