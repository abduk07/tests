package kg.varis.tests

class Divide {

    fun divide(firstNum: String, secondNum: String): String {
        var result = ""

        if (secondNum == "0" || firstNum == "0") {
            result = "Нельзя делить на ноль (0)"
        } else {
            try {
                result = (firstNum.toDouble() / secondNum.toDouble()).toInt().toString()
            } catch (ex: Exception) {
                result = "Error: ${ex.message}"
            }
        }
        return result
    }
}