package gosts

import ability.gosts.Hunt3Minutes
import evidence.EmfLevel5
import evidence.GhostWriting
import evidence.SpiritBox
import gosts.Ghosts

class Spirit() : Ghosts("Spirit") {
    init {
        evidences.add(EmfLevel5())
        evidences.add(SpiritBox())
        evidences.add(GhostWriting())
    }
    init {
        abilities.add(Hunt3Minutes())
    }
}