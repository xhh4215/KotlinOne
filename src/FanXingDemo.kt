package mydemo.kotlin

fun main(args: Array<String>) {
    val bar = Bar<String>("小黑")
    println(bar.value)
  val demo =   Outer().Inner().foo()
    println("使用inner标记的内部类可以访问外部类的成员 ，内部类会带有一个应用外部类的对象的引用")
    ObjectTest.getObject("你好呀对象")
    println(Peoplel.CreateClass().name)
}

/****
 * 范型参数的使用
 */
class Bar<T>(t: T) {
    var value = t

}

class Outer {
    private val s: String = "我是外部类的参数"

    inner class Inner() {
        fun foo() = s
    }
}


object ObjectTest{
    fun getObject(string:String){
        println("我创建了一个对象"+string)
    }
}

/***
 * 伴生对象是在我们想要在一个类中创建对象的时候使用的语法
 * 使用的是 companion object 来实现的
 * 通过类名来应用伴生对象的函数
 */
class Peoplel(val name:String,val age:Int){
    companion object Factory {
        fun CreateClass():Peoplel= Peoplel("栾桂明",24)
    }

}