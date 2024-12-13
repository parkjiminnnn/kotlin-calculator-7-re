package calculator.utils

object ErrorHandler {
    fun List<Int>.handleNumber(): List<Int> {
        this.forEach {
            if (it <0)  throw IllegalArgumentException()
        }
        return this
    }
}