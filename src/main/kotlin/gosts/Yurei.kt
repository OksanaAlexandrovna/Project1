package gosts

import ability.gosts.ClosingTheDoors
import evidence.FreezingTemperatures
import evidence.GhostOrb
import evidence.LaserProjector

class Yurei() : Ghosts("Yurei") {
    init {
        evidences.add(FreezingTemperatures())
        evidences.add(GhostOrb())
        evidences.add(LaserProjector())
    }
    init {
        abilities.add(ClosingTheDoors())
    }
}