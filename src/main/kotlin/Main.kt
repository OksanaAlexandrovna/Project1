import gosts.Banshee
import gosts.Deogen
import journal.Journal

fun main(args: Array<String>) {
    val journal = Journal()
    journal.printAllGhostsNames()
    val banshee = Banshee()
    banshee.showEvidences()
    banshee.showAbilities()
    journal.printGhostsEvidenceLaser()
}