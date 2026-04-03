package delegation.partice

import kotlin.reflect.KProperty

class PropertyNameDelegate {
    private var value: String = ""

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "${property.name}의 값은 ${value}입니다."
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        this.value = value
    }
}

class Person {
    var name: String by PropertyNameDelegate()
}

fun main(){
    val person = Person()
    person.name = "John"
    println(person.name)
}