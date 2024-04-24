import ru.project.gosts.Deogen
import org.junit.jupiter.api.Test
import ru.project.apiTests.dto.GhostDto
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
        assertEquals(
            GhostDto(testDeogenTest.name, testDeogenTest.history,
            testDeogenTest.abilities.joinToString(), testDeogenTest.evidences.joinToString()), infoGhost)
    }

}