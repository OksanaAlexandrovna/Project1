import ru.project.gosts.Yurei
import org.junit.jupiter.api.Test
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
        assertEquals(listOf(testYureiTest.name, testYureiTest.history,
            testYureiTest.abilities.joinToString(), testYureiTest.evidences.joinToString()), infoGhost)
    }
}