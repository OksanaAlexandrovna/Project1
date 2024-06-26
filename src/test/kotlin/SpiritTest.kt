import ru.project.gosts.Spirit
import org.junit.jupiter.api.Test
import ru.project.apiTests.dto.GhostDto
import kotlin.test.assertEquals

class SpiritTest {
    val testSpiritTest : Spirit = Spirit()

    @Test
    fun checkName() {
        val nameGhost = testSpiritTest.name
        assertEquals("Spirit", nameGhost)
    }

    @Test
    fun checkInfo() {
        val infoGhost = testSpiritTest.showInformationGhost("Spirit")
        assertEquals(
            GhostDto(testSpiritTest.name, testSpiritTest.history,
            testSpiritTest.abilities.joinToString(), testSpiritTest.evidences.joinToString()), infoGhost)
    }
}