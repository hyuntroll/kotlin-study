package delegation.partice

import kotlin.reflect.KProperty

class NameDelegate {
    private var value: String = ""
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "이름: ${value}"
    }
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        this.value = value
    }
}

class Person1 {
    var name: String by NameDelegate()
}

fun main() {
    val person = Person1()
    person.name = "철수"
    println(person.name)
}