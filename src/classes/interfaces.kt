package classes

interface interfaces {
    val name: String
    val color: String

    fun print(a: String, b: Boolean): String
}

class Class2_4(
    override val name: String,
    override val color: String
) : interfaces {
    override fun print(a: String, b: Boolean): String {
        return "$a, $b + $name + $color"
    }

    fun print(): String {
        return "this is amazing"
    }

}

fun main() {
    var test: interfaces = Class2_4("아이 라브", "코틀린")
    println(test.print("1", false))

    var test2: Class2_4 = test as Class2_4
    println(test2.print())
}