package qinwei.day5

open class Fruit : Eatable {
    override fun eat() {
        println("水果能吃")
    }

    open fun desc() {
        println("它是水果")
    }
}

class Apple : Fruit() {

    override fun desc() {
        println("它是苹果")
    }
}

class Banana : Fruit(), Color {
    override fun desc() {
        println("它是香蕉")
    }
}

interface Eatable {
    fun eat()
}

interface Color

