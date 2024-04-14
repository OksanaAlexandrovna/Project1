package ru.project.gosts

import ru.project.ability.gosts.ClosingTheDoors
import ru.project.evidence.FreezingTemperatures
import ru.project.evidence.GhostOrb
import ru.project.evidence.LaserProjector
import ru.project.gosts.Ghosts

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