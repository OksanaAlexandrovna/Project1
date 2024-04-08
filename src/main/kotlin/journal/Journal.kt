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
        // лист, в котором будет записываться имя каждого призрака
        // прогоняет массив через for, ищет имя и записывает его в лист и переходит в след этапу
        val nameAllGhosts = ArrayList<String>()
        for (i in 0 until ghosts.size) {
            nameAllGhosts.add(ghosts[i].name)
        }
        return nameAllGhosts
    }

    // Вывести массив призраков с уликами и по уликам вывести определенных призраков?
    fun searchGhostsEvidence(evidence: String) : List<String> {
        val searchGhostEvidence = ArrayList<String>()
        for (i in 0 until ghosts.size) {
            if (ghosts[i].isRelates(evidence)) {
                searchGhostEvidence.add(ghosts[i].name)
            }
        }
        return searchGhostEvidence
    }

    fun describeGhost(name: String) {
        for (ghost in ghosts) {
            if (ghost.name == name) {
                ghost.showInformationGhost(name)
                return
            }
        }
        val allGhosts = getAllGhostsNames()
        throw RuntimeException("Non-existent ghost name! Choose a ghost name from the following $allGhosts")
    }

}