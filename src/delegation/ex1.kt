package delegation //위임

// 클래스 위임
// 특정 인스턴스의 메서드 호출 시 해당 기능을 다른 클래스에게 위임함

interface EnhanceAnimal {
    fun think()
}

class Human : EnhanceAnimal {
    init {
        println("human constructure")
    }
    override fun think() {
        println("human thinking...")
    }
}


class Child(private val human: Human) : EnhanceAnimal {
    override fun think() {
        human.think()
    }
}


//by를 사용한 클래스 위임 1
class ByChild1(private val human: Human) : EnhanceAnimal by human

//by를 사용한 클래스 위임 2
class ByChild2 : EnhanceAnimal by Human()

fun main() {
    val parent = Human()
    val child = Child(parent)
    child.think()

    val byChild1 = ByChild1(parent)
    byChild1.think()
    val byChild2 = ByChild2()
    byChild2.think()

}