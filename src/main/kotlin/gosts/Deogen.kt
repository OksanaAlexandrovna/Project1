package gosts

import ability.gosts.UniqueAnswer
import evidence.GhostWriting
import evidence.LaserProjector
import evidence.SpiritBox
import gosts.Ghosts

class Deogen() : Ghosts("Deogen", "") {
    init {
        evidences.add(SpiritBox())
        evidences.add(GhostWriting())
        evidences.add(LaserProjector())
    }
    init {
        abilities.add(UniqueAnswer())
    }

}