import gosts.Deogen
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DeogenTest {
    val testDeogenTest : Deogen = Deogen()

    @Test
    fun checkName() {
        val nameGhost = testDeogenTest.name
        assertEquals("Deogen", nameGhost)
    }

    @Test
    fun checkInfo() {
        val infoGhost = testDeogenTest.showInformationGhost("Deogen")
        assertEquals(listOf(testDeogenTest.name, testDeogenTest.history,
            testDeogenTest.abilities.joinToString(), testDeogenTest.evidences.joinToString()), infoGhost)
    }

}