import ru.project.gosts.Mimic
import org.junit.jupiter.api.Test
import ru.project.apiTests.dto.GhostDto
import kotlin.test.assertEquals

class MimicTest {
    private val testMimicTest : Mimic = Mimic()

    @Test
    fun checkName() {
        val nameGhost = testMimicTest.name
        assertEquals("Mimic", nameGhost)
    }

    @Test
    fun checkInfo() {
        val infoGhost = testMimicTest.showInformationGhost("Mimic")
        assertEquals(
            GhostDto(testMimicTest.name, testMimicTest.history,
            testMimicTest.abilities.joinToString(), testMimicTest.evidences.joinToString()), infoGhost)
    }
}