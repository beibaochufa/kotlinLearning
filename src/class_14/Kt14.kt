package class_14


fun main(args: Array<String>) {
    loop1()
}

fun loop1() {
    for (i in 1..10 step 1) {
        println(i);
    }
}

fun loop2() {
    for (i in 1 until 10) {
        println(i)
    }
}

fun loop3() {
    for (i in 10 downTo 1) {
        println(i)
    }
}

fun loop4() {
    for (i in 1..10 step 2) {
        println(i)
    }
}

fun loop5() {
    repeat(10) {
        println(it)
    }
}

