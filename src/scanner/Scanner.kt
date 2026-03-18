package scanner

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val name: String = sc.nextLine()
    val age: Int = sc.nextInt()

    println("$name is $age years old")
}