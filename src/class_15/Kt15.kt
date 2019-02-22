package class_15


fun main(args: Array<String>) {
//    test1()
//    test2()
//    test3()
}

fun test1() {
    val list = arrayListOf<Char>('a', 'b', 'c', 'd')
    var a = list.map { it - 'a' }
            .filter { it > 0 }
            .findLast { it > 1 }
    println(a)
}


val a = arrayOf("4", "0", "7", "i", "f", "w", "0", "9")
val index = arrayOf(5, 3, 9, 4, 8, 3, 1, 9, 2, 1, 7)

fun test2() {
    index.filter { it < a.size }
            .map { a[it] }
            .reduce { s, s1 -> "$s$s1" }
            .also { print("密码是：$it") }
}

fun test3() {
    val list: List<Int> = listOf(1, 2, 3, 4)
    list.convert { it + 1 }.forEach { print(it) }
}

inline fun <T, E> Iterable<T>.convert(action: (T) -> E): MutableList<E> {
    val list: MutableList<E> = mutableListOf()
    for (item: T in this) list.add(action(item))
    return list
}