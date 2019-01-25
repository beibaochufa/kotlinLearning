package qinwei.day1

class Test private constructor() {

    companion object {

        fun get(): Test {
            return Holder.INSTANCE;
        }

        private object Holder {
            val INSTANCE = Test();
        }

    }
}


fun main(args: Array<String>) {
}