package qinwei.day13and14

fun whileLoop() {
    var count = 0
    while (count < 5) {
        count++
        println(count)
    }
}

fun dowhileLoop() {
    var count = 0
    do {
        println(count)
        count++
    } while (count <= 5)
}

fun loop() {
    for (i in 1..5) {
        println(i);
    }
}

fun loopWithLoop() {
    out@ for (i in 1..2) {
        println(" ${i}父级开始")
        for (j in 1..2) {
            println("${j}子级开始")
            if (i > 1) {
                continue@out
            }
            println("${j}子级结束")
        }
        println(" ${i}父级结束")
    }
//    parent@ for (i in 1..2) {
//        println(" ${i}父级b开始")
//        for (j in 1..2) {
//            println("${j}子级b开始")
//            if (i > 1) {
//                break@parent
//            }
//            println("${j}子级b结束")
//        }
//        println(" ${i}父级b结束")
//    }
}


fun main(args: Array<String>) {
//    bubbleSort()
//    whileLoop()
//    loopWithLoop()
    loop6()
}


fun loop6() {
    val list = arrayListOf<String>("a", "b", "c", "d")
//    for (str in list){
//    }
    for (i in list.withIndex()) {
        println("第${i.index}个元素是${i.value}")
    }
}

fun loop7() {
    val map = mapOf<String, Int>("key1" to 1, "key2" to 2)
//    for (element in map) {
//        println(element)
//    }
    for ((key, value) in map) {
        println("key:${key} value${value}")
    }
}





fun bubbleSort() {
    val data = intArrayOf(1, 0, 3, 4, 8, 6, 2, 5, 9, 7)
    for (i in 0 until data.size - 1) {
        for (j in 0 until data.size - 1 - i) {
            if (data[j] > data[j + 1]) {

//                val temp = data[j]
//                data[j] = data[j + 1]
//                data[j + 1] = temp


                data[j] = data[j] xor data[j+1]
                data[j+1] = data[j+1] xor data[j]
                data[j] = data[j] xor data[j+1]
            }
        }
    }
//    for (k in 0 until data.size) {
//        println(data[k])
//    }
//
    val dataList = data.toList().withIndex();
    for ((index,value)in dataList){
        println("第${index}元素是${value}")
    }
}
