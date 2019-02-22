package class_16

import java.io.File

data class User(var name: String)

fun main(args: Array<String>) {
    val user = User("xiezhen")


//    let 与run 都会返回闭包的执行结果，区别在于let有闭包参数，而run没有
    val resultLet = user.let { user ->  "let: ${user.name}" }
    println(resultLet)
    val resultRun = user.run { "run: ${this.name}" }
    println(resultRun)
//
//    also 和 apply 都不返回闭包的执行结果（可方便链式调用），其余区别类似于 let和run
//    user.also { println("also: ${it.javaClass}") }
//            .apply {
//                println("apply: ${this.javaClass}")
//            }
//            .name = "qw"
//    println(user.name)

//    以下操作添加于 kotlin 1.2之后
//    takeIf 的闭包返回一个判断结果 ，为true时候，返回对象本身，返回false时，takeIf 会返回空,执行:之后的语句
//    takeUnless 与take if 结果相反，闭包的返回结果为true的时候会返回空，执行:之后的语句
    var a=user.takeIf { it.equals("qw") }
//             a?:println("是覃伟")

//    if ((user.equals("qw") ? user : null) != null) {
//        String var4 = "是覃伟";
//    }

//    user.takeIf { user -> user.name.length > 0 }?.also { println("姓名为: ${it.name}") } ?: print("姓名为空")
//    user.takeUnless { user -> user.name.length > 0 }?.also { println("姓名为: ${it.name}") }
//            ?: println("姓名为: ${user.name}")
//
////    repeat(5) { count: Int ->
////        println(user.name)
////        print(count)
////    }
////
    with(user) {
       this.name="1"
    }

    user.apply {
        this.name="1"
    }
//    print(user.name)

}