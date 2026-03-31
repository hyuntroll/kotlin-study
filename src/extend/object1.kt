package extend


// 싱글톤 클래스 정의
object object1 {

    // const val (컴파일 시 정해짐) 그래서 localhost:8080해두면 고정됨
    // val (런타임 도중에 선언됨) x+5이라하면 x의 값에 따라 변하게 됨
    const val BASE_URL = "localhost:8080"
    var energy = 0

    fun run() {
        if (energy > 0) {
            energy--
            println("server is running... on $BASE_URL")
        }
        else {
            println("server has to get more energy")
        }
    }

    fun increment() = energy++

}

class Umjunsik(val name: String, var age: Int) {
    companion object {
        const val DNA = "AAAAAGGTCGAGTCAGGGTACCAGTAC"
    }
}

fun main() {
    object1.increment()
    object1.increment()
    object1.run()
    object1.run()
    object1.run()

    var object1Instance = object1
    object1Instance.increment()

    val person1 = Umjunsik("엄준일", 23)
    val person2 =  Umjunsik("엄준이", 28)

    println(person1.age)
    println(person2.age)

    println(Umjunsik.DNA)
}