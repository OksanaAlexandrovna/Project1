package gosts

import evidence.GhostOrb
import evidence.LaserProjector
import evidence.Ultraviolet


class Banshee() : Ghosts("Banshee") {
    init {
        evidences.add(Ultraviolet())
        evidences.add(GhostOrb())
        evidences.add(LaserProjector())
    }
}

