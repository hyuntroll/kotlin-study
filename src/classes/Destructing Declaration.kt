package classes

class Point(var x: Int, var y: Int) {

    operator fun component1(): Int {
        return x
    }

    operator fun component2(): Int {
        return y
    }

}

fun main() {
    val point  = Point(10, 20)

    // 구조분해는 한꺼번에 값을 꺼내는거임. 꺼내고 싶은걸 괄호로 묶어서 꺼낼 수 있는데
    // 자동으로 빼기 위해선 componentN이라는 함수를 직접 구현해줘야함. x = component1, y = component2를 받게됨
    val (x, y) = point

    println("$x,$y")

    // 데이터클래스는 이를 선언과 동시에 자동으로 만들어주지예 ㅋㅋ
    // 배열, 컬릭션에도 componentN함수가 내장되어있음
}

