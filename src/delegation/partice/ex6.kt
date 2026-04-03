package delegation.partice

import kotlin.reflect.KProperty

class PositiveIntDelegate {
    private var value: Int = 0

    operator fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return value;
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value < 0) {
            this.value = 0
        } else {
            this.value = value
        }
    }
}

class Box {
    var  size: Int by PositiveIntDelegate()
}

fun main() {
    val box = Box()
    box.size = 10
    println(box.size)
    box.size = -5
    println(box.size)

}