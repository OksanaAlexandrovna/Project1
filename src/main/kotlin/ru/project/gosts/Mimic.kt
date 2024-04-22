package ru.project.gosts

import ability.gosts.CopyGhostAbility
import ru.project.evidence.FreezingTemperatures
import ru.project.evidence.SpiritBox
import ru.project.evidence.Ultraviolet
import ru.project.gosts.Ghosts

class Mimic() : Ghosts("Mimic", "An impartial imitator who copies the behavioral traits of other ghosts" +
        " and thereby completely misleads the hunters") {
    init {
        evidences.add(Ultraviolet())
        evidences.add(FreezingTemperatures())
        evidences.add(SpiritBox())
    }
    init {
        abilities.add(CopyGhostAbility())
    }
}