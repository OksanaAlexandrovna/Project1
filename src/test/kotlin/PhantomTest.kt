import ru.project.gosts.Phantom
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PhantomTest {
    val testPhantomTest : Phantom = Phantom()

    @Test
    fun checkName() {
        val nameGhost = testPhantomTest.name
        assertEquals("Phantom", nameGhost)
    }

    @Test
    fun checkInfo() {
        val infoGhost = testPhantomTest.showInformationGhost("Phantom")
        assertEquals(listOf(testPhantomTest.name, testPhantomTest.history,
            testPhantomTest.abilities.joinToString(), testPhantomTest.evidences.joinToString()), infoGhost)
    }
}