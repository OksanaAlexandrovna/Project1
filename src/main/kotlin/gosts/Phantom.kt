package gosts

import ability.gosts.Invisibility
import evidence.LaserProjector
import evidence.SpiritBox
import evidence.Ultraviolet
import gosts.Ghosts

class Phantom() : Ghosts("Phantom") {
    init {
        evidences.add(SpiritBox())
        evidences.add(LaserProjector())
        evidences.add(Ultraviolet())
    }
    init {
        abilities.add(Invisibility())
    }
    fun strengths() {
        println("The Phantom greatly reduces the sanity of players who stare at it for too long")
    }
    fun weaknesses() {
        println("The Phantom is afraid of bright flashes, so it can be made to disappear with a camera flash")
    }

}