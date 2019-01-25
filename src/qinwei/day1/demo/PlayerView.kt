package qinwei.day1.demo

interface PlayerView {

    fun showButton()

    fun showProgressBar();
}

class YellowSkin : PlayerView {

    override fun showProgressBar() {
        print("显示黄色的进度\n")
    }

    override fun showButton() {
        print("显示黄色的按钮")
    }

}
class RedSkin : PlayerView {

    override fun showProgressBar() {
        print("显示红色的进度\n")
    }

    override fun showButton() {
        print("显示红色的按钮")
    }

}