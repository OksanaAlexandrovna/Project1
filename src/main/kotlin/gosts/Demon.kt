package gosts


import ability.gosts.EarlyHunt
import evidence.FreezingTemperatures
import evidence.GhostWriting
import evidence.Ultraviolet
import gosts.Ghosts

class Demon() : Ghosts("Demon", "The demon is one of the worst ghosts you can meet. He is known to be capable of attacking without reason") {
    init {
        evidences.add(Ultraviolet())
        evidences.add(GhostWriting())
        evidences.add(FreezingTemperatures())
    }
    init {
        abilities.add(EarlyHunt())
    }
}