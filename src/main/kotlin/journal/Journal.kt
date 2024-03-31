package journal

import evidence.LaserProjector
import gosts.*

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

    fun printAllGhostsNames() {
        // лист, в котором будет записываться имя каждого призрака
        // прогоняет массив через for, ищет имя и записывает его в лист и переходит в след этапу
        val nameAllGhosts = ArrayList<String>()
        for (i in 0 .. ghosts.size - 1) {
            nameAllGhosts.add(ghosts[i].name)
        }
        println(nameAllGhosts)
    }

    // Вывести массив призраков с уликами и по уликам вывести определенных призраков?
    fun printGhostsEvidenceLaser() {
        val ghostsLaserProjector = ArrayList<String>()
        for (i in 0 until ghosts.size) {
            if (ghosts[i].isRelates(LaserProjector())) {
                ghostsLaserProjector.add(ghosts[i].name)
            }
        }
        println(ghostsLaserProjector)
    }
}