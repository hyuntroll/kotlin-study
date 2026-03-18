package classes.clas

// 생성자

// 1. 기본 생성자
class Class2(name: String, age: Int) {
}

// 2. init
// 자바에서는 생성자에서 멤버변수를 초기화할 수 있지만 코틀린에서는 init을 써서 기본생성자가 호출 뒤 초기화를 해야한다
class Class2_1(name: String, age: Int) {
    private var name: String
    private var age: Int
    init {
        this.name = name
        this.age = age
    }
}

// 또는 기본생성자의 매개변수 앞에 var, val을 붙여 클래스 내부에서 사용할 수 있게도 가능하다
class Class2_2(
    var name: String,
    private var age: Int
) {
    fun introduce() {
        println("my name is $name and i'm $age years old")
    }
}

// 3. 보조생성자