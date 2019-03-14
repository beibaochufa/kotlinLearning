//package qinwei.day5
//
//import qinwei.day5.java.BasketJ
//
//open class Basket<T> where T : Eatable, T : Color {
//
//    var content: T? = null
//
//    fun set(fruit: T) {
//        content = fruit
//    }
//
//    fun get(): T? {
//        return content
//    }
//}
////
////class SmallBasket : Basket<Apple>()
////
////
//class Basket2< T:Fruit>(private var content: T) {
//
//    fun set(fruit: T) {
//        content = fruit
//    }
//
//    fun get(): T {
//        return content
//    }
//}
////
//class Basket3<in T> {
//
//    fun set(param: T) {
//        println(param)
//    }
//}
////
////interface Source<out T> {
////    fun get(): T
////}
////
////
//fun fill(dest: Array< in String>, value: String) {
//    if (dest.size > 0) {
//        dest[0] = value
//    }
//}
//
//
//fun main(args: Array<String>) {
//
////    //out
////    var basket2Fruit: Basket2<Fruit> = Basket2(Fruit())
////    var basket2Apple: Basket2<Apple> = Basket2(Apple())
////    //ok的 符合协变
////    basket2Fruit =basket2Apple
//
//
//    //int
//    var basket3Apple = Basket3<Apple>()
//    var basket3Fruit = Basket3<Fruit>()
//    //ok的 符合逆变
//    basket3Apple = basket3Fruit
//
//
////    //类型投影 out
////    var numArr: Array< Number> = arrayOf(1,2,3,4,5)
////    numArr.set(0,2)
////    var intArr:Array<Int> = arrayOf(1,2,3)
////    numArr = intArr//报错 不支持声明时协
//
//    //类型投影 in
////    var arr1:Array<CharSequence> = arrayOf("a","b",StringBuilder("test"))
////    fill(arr1,"test")
////    println(arr1.contentToString())
////    fill(arrayOf(Fruit(),"ss"),"s")
////    var intArr:Array<in Int> = arrayOf(1,2,3)
////    var number:Array<Number> = arrayOf(1,2,3)
////
////    intArr = number //报错：不支持声明时逆变
////    var list:Array<*> =  arrayOf("1","2")
////
////    //星号投影
//////    list[0]="1"//报错 无法被写入
//////    val l:Array<*> = arrayOf("",1,2)
//////    l.get(0)
//////    l[1]
////
////    //单个形参上限
////    var basket2Fruit: Basket2<Fruit> = Basket2(Fruit())
////    var basket2Apple: Basket2<Apple> = Basket2(Apple())
////    basket2Fruit = basket2Apple
//
//
//
//    //多个形参上限
////        var b1: Basket<Fruit> = Basket()
////        var b2: Basket<Banana> = Basket()
////    var j1:BasketJ<Banana> = BasketJ<Banana>()
////
//{}

fun main(args: Array<String>) {
    findData1(Int.javaClass)
    findData<Int>()
}

//
//}
//
//
fun<T> findData1(clazz:Class<T>){

}

 inline fun <reified T> findData(){
     println(T::class.java)
}
