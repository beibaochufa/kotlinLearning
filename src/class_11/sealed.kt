package class_11

sealed class SuperCommand {
    object A : SuperCommand()
    object B : SuperCommand()
    object C : SuperCommand()
    object D : SuperCommand()
    class E : SuperCommand()
}

fun exec2(superCommand: SuperCommand) = when (superCommand) {
    SuperCommand.A -> {
    }
    SuperCommand.B -> {
    }
    SuperCommand.C -> {
    }
    SuperCommand.D -> {
    }
    is SuperCommand.E -> {

    }
}