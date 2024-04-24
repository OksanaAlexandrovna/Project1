import ru.project.gosts.Yurei
import org.junit.jupiter.api.Test
import ru.project.apiTests.dto.GhostDto
import kotlin.test.assertEquals

class YureiTest {
    val testYureiTest : Yurei = Yurei()

    @Test
    fun checkName() {
        val nameGhost = testYureiTest.name
        assertEquals("Yurei", nameGhost)
    }

    @Test
    fun checkInfo() {
        val infoGhost = testYureiTest.showInformationGhost("Yurei")
        assertEquals(
            GhostDto(testYureiTest.name, testYureiTest.history,
            testYureiTest.abilities.joinToString(), testYureiTest.evidences.joinToString()), infoGhost)
    }
}