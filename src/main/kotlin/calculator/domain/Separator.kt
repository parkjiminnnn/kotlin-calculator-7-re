package calculator.domain

class Separator(private val value: String) {
    private fun isSeparator(): Boolean {
        return value.substring(0, 2) == "//"
    }

    private fun findSeparator(): String {
        if (isSeparator()) {
            return findCustomSeparator()
        }
        return ","
    }

    private fun findCustomSeparator(): String {
        value.forEach { char ->
            val number = char.digitToIntOrNull()
            if (number != null) {
                val header = findHeader()
                return header.substring(2, header.length - 2)
            }
        }
        return ""
    }

    private fun findHeader(): String {
        value.forEachIndexed { index, char ->
            val number = char.digitToIntOrNull()
            if (number != null) {
                return value.substring(0, index)
            }
        }
        return ""
    }

    fun getRawNumbers(): List<String> {
        val separator = findSeparator()
        if (isSeparator()) {
            return value.substring(findHeader().length).split(separator)

        }
        return value.replace(':', ',').split(separator)
    }
}
