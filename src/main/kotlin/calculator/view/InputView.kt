package calculator.view

import camp.nextstep.edu.missionutils.Console

object InputView {
    fun inputValueMessage():String {
        println("덧셈할 문자열을 입력해 주세요.")
        val value = Console.readLine()
        return value
    }
}
