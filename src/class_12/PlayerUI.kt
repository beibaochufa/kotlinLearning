package class_12

class PlayerUI private constructor() {
    companion object {
        fun get(): PlayerUI = Holder.instance
    }

    private object Holder {
        val instance = PlayerUI()
    }

    fun showPlayer(user: User) {
        MediaPlayerView(getPlayerView(user.playerType)).showView()
    }
}