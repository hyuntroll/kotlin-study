package inline_fun

inline fun <reified T> doSomething(value :T) {
    println(value)
    println(T::class.simpleName)
}

fun main() {
    doSomething(123346345)
    doSomething("inline을 사용하면 T 타입에 대해 런타에 접근할 수 있게 됩니다.")
    doSomething("이로 인해 타입을 유지하기 위해 Class와 같은 파라미터를 넘길 필요가 업습니다.")
    doSomething(Unit::class)
}