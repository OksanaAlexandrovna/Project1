import ru.project.gosts.Banshee
import org.junit.jupiter.api.Test
import ru.project.apiTests.dto.GhostDto
import kotlin.test.assertEquals

class bansheeTest {
    private val testbansheeTest : Banshee = Banshee()

    @Test
    fun checkName() {
        val result = testbansheeTest.name
        assertEquals("Banshee", result)
    }

    @Test
    fun checkFullInfo() {
        val infoGhost = testbansheeTest.showInformationGhost("Banshee")
        assertEquals(GhostDto(testbansheeTest.name, testbansheeTest.history,
            testbansheeTest.abilities.joinToString(), testbansheeTest.evidences.joinToString()), infoGhost)
    }
}