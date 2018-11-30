package class_03

object Test {

    val value = "knight"
    fun printMessage(msg: String) {
        println("msg is $msg")
    }
}

fun main(args: Array<String>) {
    Test.printMessage("knight")
}