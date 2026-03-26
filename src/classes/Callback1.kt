package classes

fun main() {
    callback1({
        println("I'm dead")
    })

    // 마지막에 있으면 밖으로 빼기 가능
    callback1 {
        println("I'm dead")
    }

    callback2 { number ->
        println(number)

    }

}

fun callback1(callback: () -> Unit = {}) {
    println("나는 콜백함수를 실행하지요")
    callback()
}

// 타임 확인하고 인터페이스도
fun callback2(callback: (a: Int) -> Unit) {
    callback(12345)
    print("엄")
}