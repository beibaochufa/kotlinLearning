package class_11

interface Animal {
    fun bark()
}

class Dog : Animal {
    override fun bark() {
        println("Wang!!!")
    }

}

class Zoo(animal: Animal) : Animal by animal {
//    override fun bark() {
//        println("Zoo!!!")
//    }
}

fun main(args: Array<String>) {
    Zoo(Dog()).bark()
}