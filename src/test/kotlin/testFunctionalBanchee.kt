import evidence.Ultraviolet
import gosts.Banshee
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Assertions
import kotlin.test.assertContains

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
        assertEquals(listOf(testbansheeTest.name, testbansheeTest.history,
            testbansheeTest.abilities.joinToString(), testbansheeTest.evidences.joinToString()), infoGhost)
    }
}