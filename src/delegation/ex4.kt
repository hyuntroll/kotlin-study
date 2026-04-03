package delegation

class UserMap(val map: Map<String, Any>) {
    val name: String by map
    val age: Int by map
}

fun main(){
    val user = UserMap(mapOf(
        "name" to "John Doe",
        "age" to 20,
        "gender" to "Male"
    ))

    println(user.name)
    println(user.age)
    println(user.map["gender"])
    println(user.map["name"])
}