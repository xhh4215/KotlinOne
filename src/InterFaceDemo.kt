package mydemo.kotlin

// 接口的实现 在接口的实现的时候遇到冲突的时候的解决方式和类的单继承是一样的
class Child : MyInterFace {
    override val pro: Int
        get() = 12

    //    实现的接口的抽象的方法 使用override关键字标记
    override fun bar() {
        println("实现一个接口的逻辑")
    }

    //     实现的接口的抽象的方法 使用override关键字标记x
    override fun foo() {
        println("接口中的属性是抽象的属性 通过实行类的自定义的set进行初始化操作")
    }

}

/***
 * 扩展函数
 * 使用的是一个被扩展的类型来作为前缀
 * 之后 '.扩展函数的名称()'之后在函数体内部写具体的
 * 函数的实现  通过this获取当前的对象
 *
 * 扩展函数调用的时候是由调用函数的表达式的数据类型决定的
 *
 * 如果一个类定义有一个成员函数和一个扩展函数，而这两个函数又有相同的接收者类型、相同的名字并且都适用给定的参数，这种情况总是取成员函数
 */
fun String.MyLength(): Int {
    return this.length
}

fun main(args: Array<String>) {
    val s: String = "this is a String"
    println(s.MyLength())
}

/***
 * 注意可以为可空的接收者类型定义扩展。这样的扩展可以在对象变量上调用， 即使其值为 null，并且可以在函数体内检测
 * this == null，这能让你在没有检测 null 的时候调用 Kotlin 中的toString()：检测发生在扩展函数的内部。
 */
fun String?.toString():String{
    if(this == null){
        return "null"
    }else{
        return this.toString()
    }
}

