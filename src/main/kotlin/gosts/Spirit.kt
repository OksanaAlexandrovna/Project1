package gosts

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
}