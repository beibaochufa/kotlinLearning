package class_08

val runnable = Runnable {
    println("Runnable::run")
}

var function: () -> Unit = runnable::run
