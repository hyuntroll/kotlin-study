package delegation.partice

import kotlin.reflect.KProperty

class IntDelegate {
    private var value: Int = 0
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        println("현재 값은 ${value}입니다")
        return value
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        this.value = value
    }
}

class Counter {
    var count: Int by IntDelegate()
}

fun main() {
    val counter = Counter()
    counter.count = 3
    println(counter.count)
}