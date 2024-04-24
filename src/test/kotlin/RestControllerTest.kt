import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.boot.test.web.client.TestRestTemplate
import ru.project.GhostApplication
import ru.project.apiTests.dto.GhostDto
import ru.project.journal.Journal
import kotlin.test.assertEquals


@SpringBootTest(
    classes = arrayOf(GhostApplication::class),
    webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT
)
class RestControllerTest {
    @Autowired
    lateinit var restTemplate: TestRestTemplate

    @MockBean
    lateinit var journal: Journal

    @Test
    fun getAllGhostsNames() {
        Mockito.`when`(journal.getAllGhostsNames()).thenReturn(arrayListOf("ABC"))
        val result = restTemplate.getForEntity("/ghosts", List::class.java)
        assertEquals(arrayListOf("ABC"), result.body)
    }

    @Test
    fun checkStatusCodeIs4xx() {
        Mockito.`when`(journal.getAllGhostsNames()).thenReturn(arrayListOf("Error"))
        val result = restTemplate.getForEntity("/ghost", Any::class.java).statusCode.is4xxClientError
        assertEquals(true, result)
    }

    @Test
    fun searchEvidence() {
        Mockito.`when`(journal.searchGhostsEvidence("Laser Projector")).thenReturn(arrayListOf("list of ghosts"))
        val url = "http://127.0.0.1:8080/ghosts/search/Laser Projector"
        val result = restTemplate.getForEntity(url, List::class.java)
        assertEquals(arrayListOf("list of ghosts"), result.body)
    }

    @Test
    fun checkStatusCodeError() {
        Mockito.`when`(journal.searchGhostsEvidence("Laser Projector")).thenReturn(arrayListOf("list of ghosts"))
        val url = "http://127.0.0.1:8080/ghosts/search/Laser Projector"
        val result = restTemplate.getForEntity(url, Any::class.java).statusCode.isError
        assertEquals(false, result)
    }

    @Test
    fun showInformationGhost() {
        Mockito.`when`(journal.describeGhost("Banshee")).thenReturn(GhostDto("info",".", "d",
            "d"))
        val url = "http://127.0.0.1:8080/ghosts/Banshee"
        val result = restTemplate.getForEntity(url, GhostDto::class.java)
        assertEquals(GhostDto("info",".", "d", "d"), result.body)
    }

    @Test
    fun checkStatusCode2xx() {
        Mockito.`when`(journal.describeGhost("AnyGhost")).thenReturn(GhostDto("info", "info",
            "info", "info"))
        val url = "http://127.0.0.1:8080/ghosts/Banshee"
        val result = restTemplate.getForEntity(url, Any::class.java).statusCode.is2xxSuccessful
        assertEquals(true, result)
    }
}