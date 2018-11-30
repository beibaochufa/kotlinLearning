# Kotlin 视频学习


---
**Kotlin** 这个名字来源于他们开发团队所在地的一个岛屿的名称
## 02 Kotlin 基础语法
``` java
package class_02

var age = 18
val name = "knight"
val name2: String? = null

fun main(args: Array<String>) {
    println("the name is $name")
}
```
运行上述代码查看生成的 TestKT.class 文件：
``` java
package class_02;
//省略...
public final class TestKt{
  public static final int getAge(){
    return age;
  }

  public static final void setAge(int <set-?>){
    age = <set-?>;
  }

  private static int age = 18;

  @NotNull
  public static final String getName(){
    return name;
  }

  @NotNull
  private static final String name = "knight";
  @Nullable
  private static final String name2;

  @Nullable
  public static final String getName2(){
    return name2;
  }

  public static final void main(@NotNull String[] args){
    Intrinsics.checkParameterIsNotNull(args, "args");
    String str = "the name is " + name;
    System.out.println(str);
  }
}
```

 - 可以看到对于使用 **var** 声明的可变变量 **age** 在 class 文件中生成了一个私有的静态变量，并生成了对应的 **get** 和 **set** 方法。
 - 对于使用 **val** 声明的不可变变量 **name:String**，则生成了一个私有的用 **final** 修饰符修饰的静态变量，仅提供对应的 **get** 方法。
 - 对于使用 **val** 声明的可空字符串类型 **name2:String?** 来说，和 **name:String** 的 的区别则是在变量和方法上使用了 @Nullable 可空注解进行修饰。


## 03 Kotlin 与 Java 完全兼容，就可以随便调用了吗？
### 在 Java 文件中使用 Kotlin 的函数
``` java
package class_02
// Utils.kt
fun echo(name: String) {
    println("$name")
}

package class_02;

public class Main {
    public static void main(String[] args) {
        UtilsKt.echo("knight");
    }
}
```
我们在 **Utils.kt** 文件中声明了一个 **echo** 函数，并且在 **Main** 类中去调用它来打印字符串。在 Java 中调用 Kotlin 的函数的形式是：**Kotlin 的文件名+KT 后缀.方法名**，让我们看一下生成的 class 文件

``` java
package class_02;
//省略...
public final class UtilsKt{
  public static final void echo(@NotNull String name){
    Intrinsics.checkParameterIsNotNull(name, "name");
    String str = "" + name;
    System.out.println(str);
  }
}

package class_02;

public class Main
{
  public static void main(String[] args)
  {
    UtilsKt.echo("knight");
  }
}

```

 - Utils.kt 文件会被编译成一个叫做 UtilsKt 的 Java 类，声明的 echo 方法则变成了一个**公有的 Fianl 修饰的静态方法**，有点像 Java 中的工具类的写法
 - 在 main 函数中直接通过调用静态方法的形式：**类型.方法名** 来调用

### 视频中的问题
能不能修改 Kotlin 文件生成的 Java 类类名？
答：当然是可以的，可以在 Kotlin 文件的 Top Level 最顶层添加注解 **@file:JvmName("你期望修改成的类名")**，我们来看看代码：
``` java
@file:JvmName("JavaEcho")
package class_02

fun echo(name: String) {
    println("$name")
}

---

package class_02;

public class Main {
    public static void main(String[] args) {
        JavaEcho.echo("knight");
    }
}

//以下是生成的 class 文件内容

package class_02;
@JvmName(name="JavaEcho")
public final class JavaEcho{
  public static final void echo(@NotNull String name){
    Intrinsics.checkParameterIsNotNull(name, "name");String str = "" + name;System.out.println(str);
  }
}

---

package class_02;

public class Main
{
  public static void main(String[] args)
  {
    JavaEcho.echo("knight");
  }
}

```

 - 可以看到在使用了 **@file:JvmName("JavaEcho")** 注解之后，Utils.kt 这个 Kotlin 文件生成的 class 文件中类名变成了 JavaEcho

同样可以使用 **@JvmName** 注解修饰 Kotlin 的函数来改变它在虚拟机中的名字，例如：
``` java
@JvmName("JvmNameEcho")
fun echo2(name2: String) {
    println(name2)
}

---

//生成的 class 文件是：
@JvmName(name="JvmNameEcho")
public static final void JvmNameEcho(@NotNull String name2){
    Intrinsics.checkParameterIsNotNull(name2,"name2");
    System.out.println(name2);
}
```

 - 可以看见方法名由 **echo2** 变为 **JvmNameEcho**

### object 关键字的使用
在 Kotlin 中可以使用 object 关键字来声明一个单例类：
``` java
package class_03

object Test {
    val value = "knight"
    fun printMessage(msg: String) {
        println("msg is $msg")
    }
}
//在 kotlin 中的调用方式
fun main(args: Array<String>) {
    Test.printMessage("knight")
}

//在 java 中的调用方式
package class_03;

public class Main {
    public static void main(String[] args) {
        Test.INSTANCE.printMessage("knight");
    }
}

```
 - 使用 **object 类名**的形式来声明一个单例类类
 - 在 Kotlin 文件中直接使用 **Test.printMessage("knight")** 的形式来调用类中的方法
 - 在 Java 中则是通过 **Test.INSTANCE.printMessage("knight")** 的形式来调用

我们来看看编译后的 class 文件，就明白上述 Java 中的调用方式了：
``` java
package class_03;

//省略...
public final class Test{
  @NotNull
  private static final String value = "knight";
  public static final Test INSTANCE;

  static{
    new Test();
  }

  @NotNull
  public final String getValue(){
    return value;
  }

  private Test(){
    INSTANCE = (Test)this;
    value = "knight";
  }

  public final void printMessage(@NotNull String msg){
    Intrinsics.checkParameterIsNotNull(msg, "msg");
    String str = "msg is " + msg;
    System.out.println(str);
  }
}

```
根据编译后的 class 文件可以得出

 - object 关键字其实就是帮我们生成了一个单例类写法中的饿汉式
 - 因为我们在 Java 中通过获取 **INSTANCE** 引用来获取该类的单例对象，从而调用对象的 **printMessage** 方法
 - object 中声明的属性，都会被编译成 **static** 类型


## 04 新手使用 Kotlin 常碰到的问题
### 包装类
首先在 Java 中声明一个 AInterface 接口
``` java
public interface AInterface {
    void putNumber(int num);
    void putNumber(Integer num);
}
```
接口中有两个重载方法，方法签名不同。
然后定义一个 Java 类 A，实现 AInterface：
``` java
public class A implements AInterface {
    public static final A a = new A();

    @Override
    public void putNumber(int num) {
        System.out.println("int");
    }

    @Override
    public void putNumber(Integer num) {
        System.out.println("Integer");
    }
}
```
以上代码如果用 Kotlin 来实现会怎么样？通过快捷操作，我直接将 Java 代码转化为 Kotlin 代码：
``` java
class KotlinA : AInterface {
    override fun putNumber(num: Int) {
        println("int")
    }
    //编译器会提示错误
    override fun putNumber(num: Int?) {
        println("Integer")
    }
    companion object {
        val a = A()
    }
}
```

 - 由于在 Kotlin 里面是没有包装类概念的，因此 KotlinA 会生成两个方法签名一样的方法，我们只需要保留一个，这是 Kotlin 语法允许的
 - 同时可以看到 **companion object** 关键字可以用来声明一个静态变量

 因为没有包装类，我们无法在 Kotlin 代码中调用 A 类中接收参数为 Integer 类型的方法，这个时候可以通过反射来调用
####**反射调用 Java 代码**
``` java
fun main(args: Array<String>) {
    val a = A()
    val aMethods = a::class.java

    val methods = aMethods.declaredMethods
    val integerMethod = methods[1]
    integerMethod.invoke(a, 1)
}
```
### 空安全
Kotlin 里很重要的特性，直接看视频中的代码：
``` java
// Java 代码
public class NullSafe {
    public static String format(String string) {
        return string.isEmpty() ? null : string;
    }
}

// Kotlin 代码
fun main(args: Array<String>) {
    function("")
}

fun function(str: String) {
    val fmt1 = format(str)
    val fmt2: String = format(str)
    val fmt3: String? = format(str)
}
```

 - fmt1 会被推导为 **String！**类型，这是在 Kotlin 代码中调用 Java 代码产生的中间类型，我们无法直接声明
 - fmt2 编译出错，format(str)代码会返回 **null**，但是 fmt2 被声明为一个不可为 null 的类型
 - 当我们不确定 Java 中的方法值是否可能为 null 的时候，一定要声明为**可空类型**如：String？


## 05 函数的嵌套
### 函数的默认参数
``` java
// Test.kt
fun sayMessage(name: String = "knight") {
    println(name)
}

fun main(args: Array<String>) {
    sayMessage("hello world")
    sayMessage()
}
```
Kotlin 提供默认参数，可以用来解决 Java 中多个参数的方法重载
``` java
public final class TestKt{
  public static final void sayMessage(@NotNull String name){
    Intrinsics.checkParameterIsNotNull(name, "name");
    System.out.println(name);
  }

  public static final void main(@NotNull String[] args){
    Intrinsics.checkParameterIsNotNull(args, "args");\
    sayMessage("hello world");
    sayMessage$default(null, 1, null);
  }
}
```
在查看上面 Test.kt 生成的 class 文件中可以发现在 main 方法中有这么一行代码 `sayMessage$default(null, 1, null)`，这个 default 方法从哪里来？

通过 IDEA 提供的 **Show Kotlin bBytecode** 功能，查看到 TestKt 的部分字节码如下：
``` java
// access flags 0x1049
  public static synthetic bridge sayMessage$default(Ljava/lang/String;ILjava/lang/Object;)V
    ILOAD 1
    ICONST_1
    IAND
    IFEQ L0
   L1
    LINENUMBER 3 L1
    LDC "knight"
    ASTORE 0
   L0
    ALOAD 0
    INVOKESTATIC class_05/default_params/TestKt.sayMessage (Ljava/lang/String;)V
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 3
```
可以看到编译器帮我们生成了一个名为`sayMessage$default`桥方法，我们可以直接通过 **Decomplie** 功能将 Kotlin Bytecode 反编译为 Java 代码：
``` java
public final class TestKt {
   public static final void sayMessage(@NotNull String name) {
      Intrinsics.checkParameterIsNotNull(name, "name");
      System.out.println(name);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public static void sayMessage$default(String var0, int var1, Object var2) {
      if ((var1 & 1) != 0) {
         var0 = "knight";
      }
      sayMessage(var0);
   }

   public static final void main(@NotNull String[] args) {
      //.....
      sayMessage$default((String)null, 1, (Object)null);
   }
}
```
这样看上去就比较直接了

### 函数的嵌套
``` java
//Test.kt
fun main(args: Array<String>) {
    function()
}

fun function() {
    val str = "hello!"

    fun say(count: Int = 10) {
        println(str)
        if (count > 0) {
            say(count - 1)
        }
    }
    say()
}
```
## 06 用扩展函数简化代码调用
``` java
//Extends.kt
package class_06

open class Animal
class Dog : Animal()

fun Animal.name() = "animal"
fun Dog.name() = "dog"

fun Animal.printName(anim: Animal) {
    println(anim.name())
}

fun main(args: Array<String>) {
    Dog().printName(Dog())
}
```

 1. 定义一个 Animal 类
 2. 定义一个 Dog 类继承自 Animal
 3. 分别 Animal 和 Dog 扩展一个 name 方法
 4. 给 Animal 类扩展一个 printName 方法
 5. Dog().printName(Dog()) 输出结果为 Animal

原因是 Kotlin 是静态的给一个类进行扩展，和多态没有关系，直接看生成的 class 文件就一目了然了:
``` java
//Animal.class
public class Animal {

}

//Dog.class
public final class Dog extends Animal {

}

//ExtendsKt.class
public final class ExtendKt{
  @NotNull
  public static final String name(@NotNull Animal $receiver){
    Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
    return "animal";
  }

  @NotNull
  public static final String name(@NotNull Dog $receiver){
    Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
    return "dog";
  }

  public static final void printName(@NotNull Animal $receiver, @NotNull Animal anim){
    Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
    Intrinsics.checkParameterIsNotNull(anim, "anim");
    String str = name(anim);
    System.out.println(str);
  }

  public static final void main(@NotNull String[] args){
    Intrinsics.checkParameterIsNotNull(args, "args");
    printName((Animal)new Dog(), (Animal)new Dog());
  }
}
```

 - 在 ExtendsKt.class 文件中生成了三个静态方法，静态方法的第一个参数类型是扩展类的类型，在调用的时候，需要将扩展类的对象作为第一个参数传入。
 - 由此可见我们的 **Dog** 对象会被强转为 **Animal** 类型，自配会和**方法签名为 Animal 类型的 name() 方法相匹配**





