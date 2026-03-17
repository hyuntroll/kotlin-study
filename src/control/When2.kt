package control

fun main() {
    println(today("sunday"))
    println(today(14))
}

fun today(a: Any) = when (a) {
    "Sunday", "sunday" -> true
    in listOf("Mon", "Tue", "Wed", "Thu", "Fri", "Sat") -> false
    "Friday" -> true
    in 2 .. 15 -> true
    is Boolean -> true
    else -> 1

}