package qinwei.day11

import java.awt.Color

enum class TouchEvent {
    ACTION_MOVE,
    ACTION_DOWN,
    ACTION_UP
}

fun testEvent(s: TouchEvent) {
    when (s) {
        TouchEvent.ACTION_DOWN -> print("按下")
        TouchEvent.ACTION_UP -> print("抬起")
    }
}


fun main(args: Array<String>) {
    //
//    testEvent(TouchEvent.ACTION_UP)
//    testOrderStatus(OrderStatusV1.ACCEPT)
//    testOrderStatusV2(OrderStatusV2.FETCH(NEED_ARRIVE))
    testColor(COLOR.RED.PINK)
}


sealed class OrderStatusV1 {

    object ACCEPT : OrderStatusV1()
    object FETCH : OrderStatusV1();
    object DISPATCH : OrderStatusV1()
    object FINISH : OrderStatusV1();
}

fun testOrderStatus(s: OrderStatusV1) {
    when (s) {
        OrderStatusV1.ACCEPT -> print("待接单")
        OrderStatusV1.FETCH -> print("待取货")
        OrderStatusV1.DISPATCH -> print("配送中")
        OrderStatusV1.FINISH -> print("已完成")
    }
}


sealed class OrderStatusV2 {
    object ACCEPT : OrderStatusV2()
    class FETCH(var fetchStatus: Int) : OrderStatusV2()
    object DISPATCH : OrderStatusV2()
    object FINISH : OrderStatusV2()
}

val NEED_ARRIVE: Int = 1
val NO_NEED_ARRIVE: Int = 2

fun testOrderStatusV2(s: OrderStatusV2) {
    when (s) {
        OrderStatusV2.ACCEPT -> print("待接单")
        is OrderStatusV2.FETCH -> {
            when (s.fetchStatus) {
                NEED_ARRIVE -> print("须到店")
                NO_NEED_ARRIVE -> print("无需到店")
                else -> print("取货未知状态")
            }
        }
        OrderStatusV2.DISPATCH -> print("配送中")
        OrderStatusV2.FINISH -> print("已完成")
    }
}

sealed class COLOR {
    open class RED : COLOR() {
        object CRIMSON : RED();
        object PINK : RED();
    }

    object GREEN : COLOR();
    object BLUE : COLOR()
}

fun testColor(c: COLOR) {
    when (c) {
        COLOR.GREEN -> print("绿色")
        COLOR.BLUE -> print("蓝色")
        COLOR.RED.CRIMSON -> print("红(深红)")
        COLOR.RED.PINK -> print("红(粉红)")
    }
}