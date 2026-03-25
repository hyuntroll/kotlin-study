package classes

interface Runnable {
    fun run()
}

interface Sleepable {
    fun sleep()
}

open class Animal(var name: String) {
    protected open fun eat(food: String) = println("$name eats $food")
}

class Dog : Runnable, Sleepable {
    override fun run() {
        println("Dog is running...")
    }

    override fun sleep() {
        println("Dog is sleeping...")
    }
}

class Cat : Sleepable {
    override fun sleep() {
        println("Cat is sleeping...")
        println("Cat is sleeping...")
    }
}

abstract class EnhancedAnimal(val name: String) : Runnable, Sleepable {
    var energy: Long = 100L

    override fun run() {
        if (energy > 0) {
            energy--
            println("$name is running...")
        } else {
            println("#name doesn't have enough energy.")
        }
    }

    abstract fun fillEnergy(energy: Long)
}

class Human(name: String) : EnhancedAnimal(name) {
    override fun fillEnergy(energy: Long) {
        this.energy += energy
    }

    override fun sleep() {
        println("$name is sleeping...")
        this.energy += 20
    }

}

class Dozi(name: String) : Animal(name), Sleepable {
    public override fun eat(food: String) = println("dozi named $name eats $food")

    fun legacyEat(food: String) = super.eat(food)
    override fun sleep() {
        println("Dozi is sleeping...")
    }
}

fun main() {
    var dog = Dog()
    dog.run()
    dog.sleep()
    var cat: Cat = Cat()
    cat.sleep()


    val dozi = Dozi(name = "Dozi")
    dozi.sleep()
    dozi.eat("과일")
    dozi.legacyEat("엄준식")

    var human = Human("Human")
    human.run()
}