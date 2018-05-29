package mydemo.kotlin

const val fristperproty = "this is a const property"
/***
 * 下边的这段代码会报错 因为属性的初始化的时候的getter  setter 方法是默认包含的 这里没有属性的
 * 初始化器，所以会报错
 */
// var alldefault :Int?
/***
 * 数据的可以默认的推断出来
 */
var initialized = 1

/***
 * 一个只读属性的语法和一个可变的属性的语法有两方面的不同：1、只读属性的用 val开始代替var 2、只读属性不允许 setter
 */

class Demo1() {
    val simple: Int?

    init {
        simple = 1
    }
}
@Deprecated(fristperproty) fun foo():String{
    println("打印自定义的编译期常量"+ fristperproty)
    return fristperproty
}
val inferredType = 1
// 自定义get方法
val string: String get() = string.toString()

//自定义的getter和setter方法
var string2: String
    get() = "初始化字符串"
    set(value) {
        string2 = value
    }
// 幕后字段的使用
var simple:Int = 0
set(value){
    if(value>0)
        field = value
}
fun main(args: Array<String>) {
   foo()
}