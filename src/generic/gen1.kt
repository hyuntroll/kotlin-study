package generic

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    val list2 = mutableListOf(1,2,3)
}


// 공변성: out 키워드를 사용하며 제네 대상으로 지정된 타입과 그 하위 타입을 읽기는 가능하지만, 쓰기는 불가능하다.
class Covariance<out T> (private var value: T) {
    // 읽기
    fun getValue() = this.value

    // 쓰기는 불가능
    // Type parameter 'T' is declared as 'out' but occurs in 'in' position in type 'T (of class Covariance<out T>)'.
//    fun setValue (value: T) {
//        this.value = value
//    }

    private fun setValue(newValue: T) {
        this.value = newValue
    }

    // getter 에선 안전하게 사용 가능하지만
    // setter, var에서 사용하기 위해선 private 를 사용해야한다. 그래야 코틀린에서 외부에 노출되지 않으므로, 그 규칙을 제외하기 때문이다.
}

//반공변성: in 키워드를 사용해 반대임
class Contravariance<in T>(private var value: T) {
    //Type parameter 'T' is declared as 'in' but occurs in 'out' position in type 'T (of class Contravariance<in T>)'
//    fun getValue() = this.value

    fun setValue(newValue: T) {
        this.value = newValue
    }
}

// 불변성: 둘다 가능
class Invariant<T>(private var value: T) {
    fun getValue() = this.value
    fun setValue(newValue: T) {
        this.value = newValue
    }
}