package qinwei.day1.demo

class MusicPlayerClient {
    var user: User? = null;

    private constructor()

    companion object {
        fun get(): MusicPlayerClient {
            return Holder.INSTANCE;
        }

        private object Holder {

            val INSTANCE = MusicPlayerClient()
        }
    }

    fun login(user: User) {
        this.user = user;
    }

    fun showPlayerUiAfterLogin() {
        var view: PlayerView = getPlayerViewType(user!!.type);
        print(user!!.name + "登陆 ")
        view.showButton()
        view.showProgressBar()
    }


    private fun getPlayerViewType(type: PlayerType): PlayerView {
        when (type) {
            PlayerType.YELLOW -> return YellowSkin()
            PlayerType.RED -> return RedSkin()
        }
    }
}