package inline_fun

fun main() {
    stay  {
        println("인라인 함수입니다.")
        println("인라인 함수는 함수 안 바이트 코드가 바로 함수 안에 들어갑니다.")
        println("그렇기에 일반적인 람다보다 성능이 좋습니다.")

        println("그러나 파라미터로 받은 람다를 다른 함수로 전달할 수 없습니다.")
        println("왜냐하면 특정 공간에 람다가 있는게 아니기 때문이죠.")

    }

    stay2 {
        println("그러나 noinline을 붙여주면 기존 형식으로 됩니다.")

        println("그리고 많은 코드를 가진 lambda를 inline처리하면 바이트 코드의 양이 방대해지므로 inline처리는 1~3줄 길이를 권장합니다.")
    }
}

inline fun stay(callback: () -> Unit): Boolean {
    callback()
//    eum(callback)
    return true
}

inline fun stay2(noinline callback: () -> Unit): Boolean {
    eum(callback)
    return true
}

fun eum(callback: () -> Unit): Boolean {
    callback()
    return true
}