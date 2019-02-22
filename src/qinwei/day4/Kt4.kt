package qinwei.day4

fun main(args: Array<String>) {
//    test1()
//    test2()
//    test3()
    test4()
}

fun test() {
    val list = listOf("kotlin", "Android", "Java", "PHP", "Python", "IOS")
    println(list.contains("kotlin"))
}

fun test1() {
    val list = listOf("kotlin", "Android", "Android", "PHP", "Python", "IOS")
    println(list.indexOfLast { it == "Android" })
}

fun test2() {
    val list1 = listOf(-1, -2, -3, 1, 11, 2, 33, 10, 6)
    // 升序
    println(list1.sorted())
    //降序
    println(list1.sortedDescending())
    // 反序
    println(list1.reversed())
}

fun test3() {
    val list1 = listOf(-1, -2, -3, 1, 11, 2, 33, 10, 6)
    //选择大于0
    println(list1.filter { it > 0 })
    //选择下标大于1且小于4
    println(list1.filterIndexed { index, result -> result > 1 && result < 4 })
}


fun test4() {
    val list = arrayListOf<Int>(-1, 1, 2, 3, 4, 5)
    var a = list.filter { it > 0 }
            .findLast { it < 3 }
    println(a)
}





