package control

fun main() {
    var x: Int = 10
    var y: Int = 28

    when (x) {
        1 -> println("하나의 값과 매칭되었네요.")
        in 2..10 -> println("2와 10 사이에 있네요.")
        else -> println("그 외 값이네요.")
    }

    var result = expression(y)

    println(result)

}

fun expression(x: Int): Int = when {
    (x == 10) -> 1
    (x < -12) -> -1
    x in 23..45 -> 2
    else -> 2
}