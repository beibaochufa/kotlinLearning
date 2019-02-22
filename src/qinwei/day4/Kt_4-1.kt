package qinwei.day4

class A {
    inner class Inner
}
typealias AInner = A.Inner



fun test(p: (Int) -> Unit) {
    p(10)
}

typealias NiuBi = (Int) -> Unit

fun test2(p:NiuBi){
    p(20)
}

fun main(args: Array<String>) {
    test {
        println(it)
    }
    test2 {
        println(it)
    }
}