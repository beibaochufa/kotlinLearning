package class_12

fun main(args: Array<String>) {
//    val user = User(1, "knight",PlayerViewType.GREEN)
//    PlayerUI.get().showPlayer(user)

    val vip = User(
            2,
            "vip knight",
            PlayerViewType.VIP("vip title", "vip message")
    )
    PlayerUI.get().showPlayer(vip)
}