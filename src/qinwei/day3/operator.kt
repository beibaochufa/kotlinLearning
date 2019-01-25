package qinwei.day3

data class Human(val x: String)

operator fun Human.not() = "非人哉"

fun main() {
    //! = .not()
//    print(!Human("人类"))


    var knight = SilverKnight()
//    //因为骑士人很好，所以给他++
    knight++
    print(knight)
}


open class SilverKnight {
    operator fun inc() = GoldKnight()
    fun commonRight(): String {
        return "接单权限 2单 "
    }

    override fun toString(): String {
        return commonRight()
    }
}

open class GoldKnight : SilverKnight() {

    fun moreRight(): String {
        return "节假日福利 商城优惠券"
    }

    override fun toString(): String {
        return commonRight() + moreRight();
    }
}


