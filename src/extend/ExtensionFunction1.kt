package extend

class Umjunsik1 {
    val name = "엄준식"

    fun shit() {
        println("shit!!")
    }
}

// 오버로딩은 가능하지만 완전 같아버리면 class의 메서드가 우선시
fun Umjunsik1.shit() {
    println("오 마이 갓")
}

// 확장 함수는 정적 바인딩이 됨
fun Umjunsik1.um() = "엄;"

var StringBuilder.lastChar: Char
    get() = this[length - 1]
    set(value) {
            this[length - 1] = value
        }

fun main() {
    val um = Umjunsik1()
    print(um.um())

    println(StringBuilder("Char").lastChar)
    val a = StringBuilder("aadfadf")
    a.lastChar = 'a'
    println(a)

}