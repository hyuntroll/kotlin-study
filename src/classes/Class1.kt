package classes

fun main() {
    val person:Person = Person("안녕", 14)
    person.age = 20
    person.name_()

    val clazz: Class1 = Class1()
    println(clazz.name)
    println(clazz)
    println(clazz.job)

}

// 기본 접근 제어자: public
class Class1 {
    val name: String = "Kotlin"
    private val age: Int = 18
    // 같은 모듈 (같이 컴파일되는 파일들)내에서만 접근 가능
    internal val job: String = "Kotlin Server"

    // 상속 관계에서만 접근 가능, 최상위 함수나 클래스 자체는 될 수 없음
//    protected val address: String = "Kotlin Server"
}

class Person(var name: String, var age: Int) {
    init {
        println("$name is $age years old")
    }

    fun name_() {
        println(name)
    }
}