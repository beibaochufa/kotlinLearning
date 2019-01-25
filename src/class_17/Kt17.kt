package class_17

import qinwei.day3.GoldKnight
import qinwei.day3.SilverKnight

fun main(args: Array<String>) {


    for (i in 1..100 step 20) {
        print("$i ")
    }
//
////
////
////    for (i in 1.rangeTo(100) step 20) {
////        print("$i ")
////    }
//
//    var str = "1"
//    str = str + " test"
//    print(str)

//    print(5 vs 6)
    var k = SilverKnight()
//    ++k
    print(++k)

}

//operator fun String.plus(other: Any?):String=""
operator fun SilverKnight.inc() = SilverKnight()

sealed class CompareResult {
    object LESS : CompareResult() {
        override fun toString(): String {
            return "小于"
        }
    }

    object MORE : CompareResult() {
        override fun toString(): String {
            return "大于"
        }
    }

    object EQUAL : CompareResult() {
        override fun toString(): String {
            return "等于"
        }
    }
}


infix fun Int.vs(num: Int): CompareResult =
        if (this - num > 0) {
            CompareResult.MORE
        } else if (this - num < 0) {
            CompareResult.LESS
        } else {
            CompareResult.EQUAL
        }


