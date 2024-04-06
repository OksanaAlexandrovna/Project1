package gosts

import ability.gosts.CopyGhostAbility
import evidence.FreezingTemperatures
import evidence.SpiritBox
import evidence.Ultraviolet
import gosts.Ghosts

class Mimic() : Ghosts("Mimic", "") {
    init {
        evidences.add(Ultraviolet())
        evidences.add(FreezingTemperatures())
        evidences.add(SpiritBox())
    }
    init {
        abilities.add(CopyGhostAbility())
    }
}