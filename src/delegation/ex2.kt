package delegation

import kotlin.reflect.KProperty

class Example {
    // 위임 프로퍼티
    var p: String by Delegate()
}

class Delegate {
    init {
        println("위임 클래스 생성")
    }

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}

fun main() {
    val ex = Example()
    println(ex.p)
    ex.p = "IDK";

}