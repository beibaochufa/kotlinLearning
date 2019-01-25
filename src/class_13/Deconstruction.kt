package class_13

class User(var age: Int, var name: String) {
    operator fun component1() = age;
    operator fun component2() = name;
}

fun main(args: Array<String>) {
    var man = User(48, "pony")
    val (age, name) = man;
    var i = 1;
    i++
    println(age)
    println(name)
}


fun printMap() {
    val map = mapOf<String, String>("key" to "key", "value" to "value")
    for ((k, v) in map) {
        print("$k----$v")
    }
}