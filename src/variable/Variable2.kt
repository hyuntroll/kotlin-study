package variable

fun main() {
    var age: Int? = null;
    var name: String? = "코틀린";

    println("name length = ${name?.length}")

    if (age == null) {
        age = 4
        println(age)
    }
}