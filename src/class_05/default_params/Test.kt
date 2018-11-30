package class_05.default_params

fun sayMessage(name: String = "knight") {
    println(name)
}

fun main(args: Array<String>) {
    sayMessage("xiezhen")
}