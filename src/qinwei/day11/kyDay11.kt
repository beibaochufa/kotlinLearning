package qinwei.day11


abstract class Fruits {
    abstract fun color()
}

class Apple(var fName: String) : Fruits() {
    override fun color() {
    }

    var name: String;


    init {
        this.name = fName;
    }

    override fun toString(): String {
        return name;
    }
}

object Qw {
    fun test3() {
        print("test3")
    }
}

open class XZ {
    fun test4() {
        print("test4")
    }
}

fun main(args: Array<String>) {
    var apple: Apple = Apple("s");
    print(apple.toString())
}



