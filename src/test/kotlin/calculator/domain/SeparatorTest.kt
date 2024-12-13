package calculator.domain

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SeparatorTest {
    private val separator = Separator("//%\\n1%2%3")

    @Test
    fun `구분자 지정  테스트`() {
        val excepted = "//%\\n"
        val result = separator.findCustomSeparate()

            assertEquals(excepted, result)
    }

    @Test
    fun `숫자리스트 출력 테스트`() {
        val excepted = listOf(1,2,3)
        val result = separator.getNumbers()

            assertEquals(excepted, result)
    }
}