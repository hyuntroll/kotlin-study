package classes

class User(name: String, schoolnum: String) {
    var name: String = name
        set(value) {
            field = value.trim()
        }

    var schoolnum: String = schoolnum
        private set
        get() {
            println("field is $field")
            return field
        }

    fun setSchoolnum(schoolnum: String) {
        if (schoolnum.startsWith("0")) {
            throw IllegalArgumentException("School num isn't valid")
        }
        this.schoolnum = schoolnum
    }
}

class Square(val width: Int, val height: Int) {
    val area: Int
        get() = width * height
}

fun main() {
    val square =  Square(10, 20)
    println(square.area)

    val user = User("사용자명", "1323")
    println(user.name)
    user.name = "   아     "
    println(user.schoolnum)
//    user.schoolnum = "1111"
    try {
        user.setSchoolnum("0132")
    }
    catch (e: Exception) {
        e.printStackTrace()
    }

}