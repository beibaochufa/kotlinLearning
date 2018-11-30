package class_10

class StringUtils {
    companion object {
        fun isEmpty(str: String) = "" == str
    }
}

fun main(args: Array<String>) {
    StringUtils.isEmpty("===")
}