package classes

data class Person1(
    val name: String,
    val age: Int,
    val userId: Long,
    val length: Int
) {
    init {
        println("새로운 사람이 만들어졌습니다.")
    }

    constructor(name: String, age: Int, userId: Long) : this(name, age, userId, 150) {
        println("이상한거 쓰지마라")
    }

    override fun equals(other: Any?): Boolean {
        println("지금은 값이 같은지 비교하는거다")
        return super.equals(other)
    }

    operator fun component5(): Int = 5
}

fun main() {
    val person1 = Person1("현승민", 18, 1, 166)
    val person2 = Person1("현승민", 18, 2)
    val person3 = person1.copy()
    val person4 = person1

    val (name, age) = person1
    println("$name is $age years old")
    println(person1)
    println(person1 == person2)
    println(person1 == person3) // 두 객체의 멤버 변수가 완전히 같음
    println(person1 == person4)
    println(person1 === person3) // 하지만 두 객체의 메모리는 다른 위치에 있음


}