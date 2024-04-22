import ru.project.gosts.Demon
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DemonTest {
    val testDemonTest : Demon = Demon()

    @Test
    fun checkName() {
       val nameGhost = testDemonTest.name
       assertEquals("Demon", nameGhost)
    }

    @Test
    fun checkInfo() {
        val infoGhost = testDemonTest.showInformationGhost("Demon")
        assertEquals(listOf(testDemonTest.name, testDemonTest.history,
            testDemonTest.abilities.joinToString(), testDemonTest.evidences.joinToString()), infoGhost)
    }
}