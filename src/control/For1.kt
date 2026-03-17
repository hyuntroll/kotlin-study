package control

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val arrays = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (num in numbers) {
        print(num)
    }
    println()
    for (num in arrays) {
        print(num)
    }
    for (i in 1..4) {
        print(i)
    }
    println()
    for (i in 5 downTo 1) {
        print(i)
    }
    println()
    for (i in 6 downTo 1 step 2) {
        print(i)
    }
    println()
    for (i in 6 until 10) {
        print(i)
    }
    println()

}