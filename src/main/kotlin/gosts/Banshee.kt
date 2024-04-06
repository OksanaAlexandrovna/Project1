package gosts

import ability.gosts.BansheeScream
import ability.gosts.Pursuit
import evidence.GhostOrb
import evidence.LaserProjector
import evidence.Ultraviolet


class Banshee() : Ghosts("Banshee", "A singing siren who attracts her victims with songs. Known for choosing her prey before delivering the killing blow") {
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

