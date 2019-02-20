package class_08

import java.io.File

inline fun onlyif(isDebug: Boolean, block: () -> Unit) {
    if (isDebug)
        block()
}

fun main(args: Array<String>) {
    onlyif(true) {
        println("打印日志")
    }

//    val a = File("")
//    a.readBytes()

}