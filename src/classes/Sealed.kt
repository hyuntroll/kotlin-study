package classes

sealed class ApiResponse {
    data class Success(val value: String) : ApiResponse()
    data class Failure(val error: String) : ApiResponse()
    object Loading : ApiResponse()
}

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