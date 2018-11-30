package class_04.reflect

import class_04.wrapper.A

fun main(args: Array<String>) {
    val a = A()
    val aMethods = a::class.java

    val methods = aMethods.declaredMethods
    val integerMethod = methods[1]
    integerMethod.invoke(a, 1)
}