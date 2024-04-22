package ru.project.gosts

import ru.project.ability.gosts.UniqueAnswer
import ru.project.evidence.GhostWriting
import ru.project.evidence.LaserProjector
import ru.project.evidence.SpiritBox

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