package ru.project.gosts


import ru.project.ability.gosts.EarlyHunt
import ru.project.evidence.FreezingTemperatures
import ru.project.evidence.GhostWriting
import ru.project.evidence.Ultraviolet

class Demon() : Ghosts(
    "Demon",
    "The demon is one of the worst ghosts you can meet. He is known to be capable of attacking without reason"
) {
    init {
        evidences.add(Ultraviolet())
        evidences.add(GhostWriting())
        evidences.add(FreezingTemperatures())
    }

    init {
        abilities.add(EarlyHunt())
    }
}