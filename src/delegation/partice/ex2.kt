package delegation.partice

import kotlin.reflect.KProperty

class UpperCaseDelegate {
    private var value: String = ""
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return value
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        this.value = value.uppercase()
    }
}

class User {
    var nickname: String by UpperCaseDelegate()
}

fun main() {
    val user = User()
    user.nickname = "hyuntroll"

    println(user.nickname)
}