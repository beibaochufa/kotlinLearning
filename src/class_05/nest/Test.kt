package class_05.nest

fun main(args: Array<String>) {
    function()
}


fun function() {
    val str = "hello!"

    fun say(count: Int = 10) {
        println(str)
        if (count > 0) {
            say(count - 1)
        }
    }
    say()
}