package gosts

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
    fun strengths() {
        println("The gosts.Phantom greatly reduces the sanity of players who stare at it for too long")
    }
    val strengths = "The gosts.Phantom greatly reduces the sanity of players who stare at it for too long"
    fun weaknesses() {
        println("The gosts.Phantom is afraid of bright flashes, so it can be made to disappear with a camera flash")
    }

     fun printName() {
        println(name)
    }
}