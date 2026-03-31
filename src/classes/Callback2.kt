package classes

fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)

    forEach(list) { item ->
        println(item)
    }

    list.forEach {
        println(it)
    }

    var test = Test1("큐빅")
}

fun <T> forEach(iterable: Iterable<T>, callback: (item: T) -> Unit) {
    for (item in iterable) {
        callback(item)
    }
}