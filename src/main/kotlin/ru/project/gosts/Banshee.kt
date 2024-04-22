package ru.project.gosts

import org.springframework.stereotype.Component
import ru.project.ability.gosts.BansheeScream
import ru.project.ability.gosts.Pursuit
import ru.project.evidence.GhostOrb
import ru.project.evidence.LaserProjector
import ru.project.evidence.Ultraviolet

@Component
class Banshee() : Ghosts("Banshee", "A singing siren who attracts her victims with songs. Known for " +
        "choosing her prey before delivering the killing blow") {
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

