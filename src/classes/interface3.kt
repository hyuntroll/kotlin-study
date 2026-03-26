package classes

fun main() {
    iwantusefun(object : FunctionalInterface1{
        override fun doSomething() {
            println("i want use")
        }
    })

    
}


fun iwantusefun(callback: FunctionalInterface1) {
    callback.doSomething()
}

interface FunctionalInterface1 {
    fun doSomething()
}