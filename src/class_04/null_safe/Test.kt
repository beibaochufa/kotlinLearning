package class_04.null_safe

import class_04.null_safe.NullSafe.format

fun main(args: Array<String>) {
    function("")
}

fun function(str: String) {
    val fmt1 = format(str)
    val fmt2: String = format(str)
    val fmt3: String? = format(str)
}