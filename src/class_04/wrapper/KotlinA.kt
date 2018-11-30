package class_04.wrapper

class KotlinA : AInterface {
    override fun putNumber(num: Int) {
        println("int")
    }

    companion object {
        val a = A()
    }
}