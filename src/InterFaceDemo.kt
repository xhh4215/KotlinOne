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

fun main(args: Array<String>) {

}