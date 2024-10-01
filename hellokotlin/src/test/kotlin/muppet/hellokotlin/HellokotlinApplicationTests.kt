package muppet.hellokotlin

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import kotlin.test.assertNotNull

@SpringBootTest
class HellokotlinApplicationTests {

    @Test
    fun contextLoads() {
    }

    @Test
    fun taxas() {
        val taxa1 = Taxa(100, "RS")
        val taxa2 = Taxa(50, "SC")
        val veiculo = Veiculo("RS")
        val veiculo2 = Veiculo("SC")
        val veiculo3 = Veiculo("RS")

        val veiculos = listOf(veiculo, veiculo2, veiculo3)
        val taxas = listOf(taxa1, taxa2)

        val map = taxas.associate { taxa ->
            taxa.origem to (veiculos.count { it.origem == taxa.origem } * taxa.valor)
        }

        assertNotNull(map)
        assertTrue(map.containsKey("RS"))
        assertEquals(200, map["RS"])
        assertTrue(map.containsKey("SC"))
        assertEquals(50, map["SC"])
    }

    data class Veiculo(val origem: String)
    data class Taxa(val valor: Int, val origem: String)
}
