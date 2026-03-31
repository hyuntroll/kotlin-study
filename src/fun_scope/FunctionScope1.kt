package fun_scope

// 함수 스코프는
/*
함수 참조
let it
run this
run
with this
apply this
also it

참조 방식이 it, this로 나뉨
* */


data class Person(val name: String, var age: Int)


fun main() {

    //임시 스코프
    //이 스코프에서는 객체 이름 없이 접근이 가능하다.
    // let가 함수 스코프임
    Person("현승민", 18).let {
        println(it)
        it.age = 123
    }

    val person = Person("현숭민", 18)


    // 이미 생성된 객체로 일관된 작업을 할 때 유용함
    println(
            with (person) {
            // this를 이용해 참조하기 때문에 키워드 생략이 가능하다
            this.age = 234
            println(name)

            "yaho" // 반환 값이 람다 result이므로 마지막에 적어주면 반환됨
        }
    )

    // 무언가 적용할 때 좋음
    // 반환 값이 Object reference임
    // 인자로 람다 함수를 받기 때문에 코드 블록 바로 작성 가능
    // extension function 이므로 객체를 생성해서 할당하기 전에 사용이 가능
    val person2 = person.apply { age = 245 }
    println(person.age == person2.age)

}