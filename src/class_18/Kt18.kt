package class_18

import java.io.File

fun normal() {
    println("test")
}

fun `1234`() {
    println("test1")
}

fun ` `() {
    println("test2")
}

fun `   `() {
    println("test3")
}

fun main(args: Array<String>){
//    `1234`()
//    normal()
//    `1234`()
//    ` `()
//    `   `()
    test()

    val a:File =A("test.jpg")
    val  b = HashMap<String,Int>()
}

fun test() {
    var a = "String"
    val b = String("String".toByteArray())
    println(a == b)
    print(a === b)
}


typealias A = File