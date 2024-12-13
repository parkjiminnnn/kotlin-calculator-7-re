package calculator

import calculator.domain.Calculator
import calculator.domain.Separator
import calculator.view.InputView.inputValueMessage
import calculator.view.OutputView.printResult

class CalculatorController {
    fun run() {
        val value = inputValueMessage()
        val separator = Separator(value)
        val calculator = Calculator(separator)

        printResult(calculator.calculate())
    }
}