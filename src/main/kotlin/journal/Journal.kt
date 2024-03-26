package journal

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
           // ghosts[i].getName()
            nameAllGhosts.add(ghosts[i].name)
        }
        println(nameAllGhosts)
    }
}