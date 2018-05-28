package mydemo.kotlin

/***
 * @author 栾桂明
 * @use 这是一个关于kotlin的类和继承的知识的学习
 * @time  2018 年 5 月 28 日
 *
 */
fun main(args: Array<String>) {
    var person = Personal("小黑")
    println(person.fristname)
}

/**
 * 1 类
 * 创建类使用的是class 关键字
 * 类包含的是 类的类名  类头 类体
 * 2 构造函数
 * kotlin中一个类可以包含一个主构造函数 和多个次构造函数 主构造函数是类头的一部分
 *
 */
class Invocies {}

class Empty
// 如果主构造函数没有任何注解或者可见性ih修饰符，可以省略这个 constructor 关键字。
/***
 * fristname 相当于是一个属性是在创建当前的这个对象的时候使用的属性
 * kotlin 中的类默认是final的是禁止被继承的  如果想要被继承 必须显示的添加 open 字段
 * 如果派生类有一个主构造函数，其基类型可以（并且必须） 用基类的主构造函数参数就地初始化。
 * 如果类没有主构造函数，那么每个次构造函数必须使用 super 关键字初始化其基类型，或委托给另一个构造函数做到这一点。 注意，在这种情况下，不同的次构造函数可以调用基类型的不同的构造函数：
 */
open class Personal constructor(fristname: String) {
    //声明一个变量    属性可以在类体 和属性初始化器中使用
    var fristname: String = "this is the fristname" + fristname

    // 属性初始化的操作必须在这个init初始化块中进行
    init {
//        这里执行的是属性初始化的操作
        println("当前的数据是 $fristname")
    }

    /***
     * 父类中的函数没有添加 open 字段是不可以在之类中定义相同的名称的函数的
     */
    open fun getName(): String {
        return "this is my name @$fristname"
    }

}

// 创建对象的简单的语法  在创建的同时声明属性 同时进行初始化
class Personal1 constructor(val name: String, val age: Int, val gender: String)

/***
 * kotlin 中类的继承
 **/

class dataClass(fristname: String) : Personal(fristname) {
    // 子类重写父类的方法必须添加override关键字 否则会报错  如果不想让你的子类覆盖
//   你可以在添加 final 关键字
    override fun getName(): String {
        return super.getName()
    }
}

open class Foo {
    //    open 关键字标识的字段是可以被覆盖的
    open val x: Int get() = 12

    open fun f(){
        println("Foo.f()")
    }
}

/***
 * 在之类中调用父类的实现
 * 在一个内部类中访问外部类的超类 可以通过  super@Outer实现
 */
class Bar1 : Foo() {
    //    通过override关键字对父类的字段进行覆盖
    override val x: Int = 23

     override fun f() {
        super.f()
         println("Bar.f()")
    }
}

