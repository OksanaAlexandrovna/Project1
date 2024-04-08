import journal.Journal
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.RuntimeException
import kotlin.test.assertEquals

class FunctionalJournalTest {
    private val testJournalTest: Journal = Journal()
     @Test
     fun checkAllGhost() {
         val result = testJournalTest.getAllGhostsNames()
         assertEquals(listOf("Banshee", "Demon", "Deogen", "Mimic", "Phantom", "Spirit", "Yurei"), result)
     }

    @Test
    fun unexpectedGhostName() {
        val names = testJournalTest.getAllGhostsNames()
        val msg = assertThrows<RuntimeException> {
            testJournalTest.describeGhost("Mamic")
        }
        assertEquals("Non-existent ghost name! Choose a ghost name from the following $names", msg.message)
        testJournalTest.describeGhost("Mimic")
    }

    @Test
    fun checkLaserProjector() {
        val evidenceName = testJournalTest.searchGhostsEvidence("Laser Projector")
        assertEquals(listOf("Banshee", "Deogen", "Phantom", "Yurei"), evidenceName)
    }

    @Test
    fun checkEmf5() {
        val evidenceName = testJournalTest.searchGhostsEvidence("EMF 5 level")
        assertEquals(listOf("Spirit"), evidenceName)
    }

    @Test
    fun checkFreezing() {
        val evidenceName = testJournalTest.searchGhostsEvidence("Freezing Temperatures")
        assertEquals(listOf("Demon", "Mimic", "Yurei"), evidenceName)
    }

    @Test
    fun checkGhostOrb() {
        val evidenceName = testJournalTest.searchGhostsEvidence("Ghost Orb")
        assertEquals(listOf("Banshee", "Yurei"), evidenceName)
    }

    @Test
    fun checkGhostWhiting() {
        val evidenceName = testJournalTest.searchGhostsEvidence("Ghost Writing")
        assertEquals(listOf("Demon", "Deogen", "Spirit"), evidenceName)
    }

    @Test
    fun checkSpiritBox() {
        val evidenceName = testJournalTest.searchGhostsEvidence("Spirit Box")
        assertEquals(listOf("Deogen", "Mimic", "Phantom", "Spirit"), evidenceName)
    }

    @Test
    fun checkUltraviolet() {
        val evidenceName = testJournalTest.searchGhostsEvidence("Ultraviolet")
        assertEquals(listOf("Banshee", "Demon", "Mimic", "Phantom"), evidenceName)
    }
}