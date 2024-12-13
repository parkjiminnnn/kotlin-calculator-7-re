package calculator.domain

class Calculator(private val separator: Separator) {
    fun calculate():Int {
        val numbers = separator.getNumbers()
        return numbers.sum()
    }
}