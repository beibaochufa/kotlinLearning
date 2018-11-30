package class_10

class Single private constructor() {
    companion object {
        fun get(): Single = Holder.instance
    }

    private object Holder {
        val instance = Single()
    }
}

fun main(args: Array<String>) {
    Single.get()
}