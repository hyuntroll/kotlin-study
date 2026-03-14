package variable

fun main() {
    val type1: String = "저는 타입을 명시했습니다.";
    val type2: Int = 2;
    val type3: Float = 1f;

    val type4 = "저는 타입을 추론합니다."
    val type5 = 5L;
    val type6 = 0x124;

    var type7 = "저는 값을 변경할 수 있지요"
    type7 = "이렇게 변경될 수 있습니다."

    println(type7)
}