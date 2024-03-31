package gosts

import ability.gosts.BansheeScream
import ability.gosts.Pursuit
import evidence.GhostOrb
import evidence.LaserProjector
import evidence.Ultraviolet


class Banshee() : Ghosts("Banshee") {
    init {
        evidences.add(Ultraviolet())
        evidences.add(GhostOrb())
        evidences.add(LaserProjector())
    }
    init {
        abilities.add(Pursuit())
        abilities.add(BansheeScream())
    }
}

