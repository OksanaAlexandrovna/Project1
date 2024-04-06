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
}