package class_09

class KnightPerson : Person, IPersonAction {

    constructor() : super() {
        println("constructor")
    }

    constructor(name: String) : super(name) {
        println("constructor(name:String)")
    }

    constructor(name: String, age: Int) : super(name, age) {
        println("constructor(name: String, age: Int)")
    }

}

fun main(args: Array<String>) {
    val person = KnightPerson()
    val person2 = KnightPerson("knight")
    val person3 = KnightPerson("knight", 18)
}