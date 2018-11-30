package class_06

import java.io.File

fun main(args: Array<String>) {
    val file = File("KotlinTest.iml")
    println(file.readText())
}