package calculator.domain

import calculator.utils.ErrorHandler.handleNumber

class Separator(private val value: String) {
    private fun isSeparator(): Boolean {
        return value.substring(0, 2) == "//"
    }

    fun findCustomSeparate(): String {
        if (isSeparator()) {
            value.forEachIndexed { index, char ->
                val number = char.digitToIntOrNull()
                if (number != null) {
                    return value.substring(0, index)
                }
            }
        }
        return value.replace(':', ',')
    }


    private fun findCustomSeparator(): String {
        val separate = findCustomSeparate()
        return separate.substring(2, separate.length - 2)
    }

    fun getNumbers(): List<Int> {
        val customSeparator = findCustomSeparator()
        val separate = findCustomSeparate()
        val rawNumbers = value.substring(separate.length)
        return rawNumbers.split(customSeparator).map { it.toInt() }.handleNumber()
    }
}