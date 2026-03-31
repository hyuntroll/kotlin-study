package classes

sealed interface Result

data class Success(val value: String) : Result
data class Failure(val reason: String) : Result

fun handleResult(result: Result) {
    when (result) {
        is Success -> {
            println("성공했습니다 성공 값: ${result.value}")
        }
        is Failure -> {
            println("실패했습니다. 사유: ${result.reason}")
        }
    }
}

fun main() {
    val result1 = Failure("당신의 존재 자체가 실패사유입니다.")
    val result2 = Success("umjunsik")
    handleResult(result1)
    handleResult(result2)
}