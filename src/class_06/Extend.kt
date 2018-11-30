package class_06

open class Animal
class Dog : Animal()

fun Animal.name() = "animal"
fun Dog.name() = "dog"

fun Animal.printName(anim: Animal) {
    println(anim.name())
}

fun main(args: Array<String>) {
    Dog().printName(Dog())
}