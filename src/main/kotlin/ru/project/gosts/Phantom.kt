package ru.project.gosts

import ru.project.ability.gosts.Invisibility
import ru.project.evidence.LaserProjector
import ru.project.evidence.SpiritBox
import ru.project.evidence.Ultraviolet
import ru.project.gosts.Ghosts

class Phantom() : Ghosts("Phantom", "A phantom is a ghost that can inhabit living people, instilling fear " +
        "in those around them. They are most often summoned using a Ouija Board") {
    init {
        evidences.add(SpiritBox())
        evidences.add(LaserProjector())
        evidences.add(Ultraviolet())
    }
    init {
        abilities.add(Invisibility())
    }

}