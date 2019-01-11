package qinwei.day11

sealed class Animal {

    abstract fun getName(): String

    fun eat() {
        print(getName() + "在吃东西")
    }
}

class Tiger : Animal() {
    override fun getName(): String {
        return "老虎"
    }

}


fun main(args: Array<String>) {
    Tiger().eat();
//    Animal().eat()
}

