package mydemo.kotlin

/***
 * @author 栾桂明
 * @time 2018 年 5月 28日
 * @github git@github.com:xhh4215/KotlinOne.git
 * 这是一个关于kotlin的基本的数据类型的使用的Demo
 */
private val param1: Int = 10
private val param3: Int = 0x123
private val param2: Long = 12L
private val param4: Double = 123.4
private val param5: Float = 123.5f
fun main(args: Array<String>) {
    println("在kotlin 较小的数据类型不是较大的数据类型的之类 因此不存在类型的隐私转化")
//    在kotlin中数据类型的转化使用的是一个ToXXX转化为指定类型的数据
    println("$param1 是一个十进制数的字面值")
    println("$param3 是一个十六进制数的字面值")
    println("$param2 是一个Longl类型的数字的字面值")
    println("$param4 是一个Double类型的数字的字面值")
    println("$param5 是一个Float类型的数字的字面值")


}

