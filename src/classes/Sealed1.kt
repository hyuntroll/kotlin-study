package classes

sealed class ApiResponse {
    class Success(val value: String) : ApiResponse()
    data class Failure(val error: String) : ApiResponse()
    object Loading : ApiResponse()
}
// 타입 안정성 덕분에 When에서도 예외를 적어주지 않아도되고 강력한 타입 제한으로 새롭게 추가하면 바로 warning

// 하위 클래스 class, data class가 있고 , data class는 저장과 처리에 중점을 두며 복잡한 로직과 상태관리에 사용됨


fun handleResponse(response: ApiResponse) {
    when (response) {
        is ApiResponse.Success -> println(response.value)
        is ApiResponse.Failure -> println(response.error)
        is ApiResponse.Loading  -> println("loading....")
    }
}


fun main() {
    val success = ApiResponse.Success("야르")
    val error = ApiResponse.Failure("터져라")
    val loading = ApiResponse.Loading

    handleResponse(success)
    handleResponse(error)
    handleResponse(loading)
}