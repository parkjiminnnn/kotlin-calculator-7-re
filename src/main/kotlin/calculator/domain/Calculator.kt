package calculator.domain

import calculator.utils.ErrorHandler.handleNumber

class Calculator(private val separator: Separator) {

    private fun getNumbers(): List<Int> {
        return separator.getRawNumbers().map { it.toInt() }.handleNumber()
    }

    fun calculate():Int {
        val numbers = getNumbers()
        return numbers.sum()
    }
}