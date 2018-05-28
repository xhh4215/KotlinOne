/***
 *  @Author 栾桂明
 *  @Create 2018 年 5月 29日
 *  @Github git@github.com:xhh4215/KotlinOne.git
 *  这是一个关于kotlin这门编程语言的基础的语法的学习使用
 */
// 定义一个包
package mydemo.kotlin

fun main(args: Array<String>) {

}

/***
 * 使用val关键字定义的是不可变的变量
 * 使用var关键字定义的是可变的变量
 */
val a:Int = 1
var b:Int = 2
/***
 * 定义函数使用的是fun关键字是定义一种逻辑处理的实现
 * 返回值通过  ：数据类型 指定返回的数据的类型
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}
// 在kotlin中的注释是和java中一样的
fun printlnSum(a: Int, b: Int): Unit {
    println("sum $a+$b  is ${a + b}")
}

/***
 * 这里相当于java 的创建的javabean  包含属性的get和set方法  和toString() equal() copy() hashCode()等
 */
data class Person(val name:String,val age:Int)
/**
 * 这是一个练习函数的默认值的函数
 * */
  fun Default(value:String="函数的默认值的练习和使用"):Unit{
       println(value)
  }