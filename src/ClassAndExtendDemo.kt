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
 */
class Personal constructor(fristname: String) {
    //声明一个变量    属性可以在类体 和属性初始化器中使用
    var fristname: String = "this is the fristname" + fristname

    // 属性初始化的操作必须在这个init初始化块中进行
    init {
//        这里执行的是属性初始化的操作
        println("当前的数据是 $fristname")
    }
}
// 创建对象的简单的语法  在创建的同时声明属性 同时进行初始化
class Personal1 constructor(val name: String, val age: Int, val gender: String)
/***
 * 次要构造器的创建和使用
 **/