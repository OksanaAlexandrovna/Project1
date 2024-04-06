package gosts

import ability.gosts.ClosingTheDoors
import evidence.FreezingTemperatures
import evidence.GhostOrb
import evidence.LaserProjector

class Yurei() : Ghosts("Yurei", "A Yurei is a ghost that has returned to the physical world, usually for revenge or hatred") {
    init {
        evidences.add(FreezingTemperatures())
        evidences.add(GhostOrb())
        evidences.add(LaserProjector())
    }
    init {
        abilities.add(ClosingTheDoors())
    }
}