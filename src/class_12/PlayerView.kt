package class_12

import javax.swing.JOptionPane

interface PlayerView {
    fun showView()

    fun getPlayButton()
}

class GreenPlayerView : PlayerView {
    override fun showView() {
        JOptionPane.showConfirmDialog(null, "显示绿色播放器", "绿色播放器", JOptionPane.DEFAULT_OPTION)
    }

    override fun getPlayButton() {
        println("显示绿色 Button")
    }

}

class BluePlayerView : PlayerView {
    override fun showView() {
        JOptionPane.showConfirmDialog(null, "显示蓝色播放器", "蓝色播放器", JOptionPane.DEFAULT_OPTION)
    }

    override fun getPlayButton() {
        println("显示蓝色 Button")
    }

}

class MediaPlayerView(playerView: PlayerView) : PlayerView by playerView