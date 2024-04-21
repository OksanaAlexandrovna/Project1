package ru.project.gosts

import ru.project.ability.gosts.Hunt3Minutes
import ru.project.evidence.EmfLevel5
import ru.project.evidence.GhostWriting
import ru.project.evidence.SpiritBox
import ru.project.gosts.Ghosts

class Spirit() : Ghosts("Spirit", "Spirits are very common apparitions. They are very strong, but passive," +
        " attacking only when they need to") {
    init {
        evidences.add(EmfLevel5())
        evidences.add(SpiritBox())
        evidences.add(GhostWriting())
    }
    init {
        abilities.add(Hunt3Minutes())
    }
}