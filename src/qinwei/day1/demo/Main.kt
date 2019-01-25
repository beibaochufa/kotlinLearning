package qinwei.day1.demo

fun main(args: Array<String>) {

    var xiaomin: User = User("小明")
    var musicPlayer = MusicPlayerClient.get()
    musicPlayer.login(xiaomin)
    musicPlayer.showPlayerUiAfterLogin()

}