package control

fun main() {
    var age:Int = 17

    val flag:Boolean = if ( age > 16 ) {
        println("Yes")
        true
    } else {
        println("No")
        false
    }

    println(flag)
}