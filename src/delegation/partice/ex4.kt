package delegation.partice

import kotlin.reflect.KProperty

class TrimDelegate {
    private var value: String = ""

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return value
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        this.value = value.trim()
    }
}

class Message {
    var text: String by TrimDelegate()
}

fun main() {
    val message = Message()
    message.text = " hello kotlin "
    println(message.text)
}