package gosts


import evidence.FreezingTemperatures
import evidence.GhostWriting
import evidence.Ultraviolet
import gosts.Ghosts

class Demon() : Ghosts("Demon") {
    init {
        evidences.add(Ultraviolet())
        evidences.add(GhostWriting())
        evidences.add(FreezingTemperatures())
    }
}