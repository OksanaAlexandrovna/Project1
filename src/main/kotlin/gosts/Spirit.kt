package gosts

import ability.gosts.Hunt3Minutes
import evidence.EmfLevel5
import evidence.GhostWriting
import evidence.SpiritBox
import gosts.Ghosts

class Spirit() : Ghosts("Spirit", "Spirits are very common apparitions. They are very strong, but passive, attacking only when they need to. They defend their death place extremely aggressively, killing anyone who abuses their hospitality") {
    init {
        evidences.add(EmfLevel5())
        evidences.add(SpiritBox())
        evidences.add(GhostWriting())
    }
    init {
        abilities.add(Hunt3Minutes())
    }
}