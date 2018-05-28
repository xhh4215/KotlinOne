package mydemo.kotlin

import javafx.beans.binding.When
import org.omg.CORBA.INTERNAL

/***
 * @author 栾桂明
 * @time 2018  年 5月 28日
 */
fun main(args: Array<String>) {
    IfTest1()
    IfTest2(12, 23)
    IfTest3()
    WhenTest1(12)
    WhenTest2("string 字符串")
}

/***
 * if 基本的使用
 * 1 if 是一个表达式 他会返回一个数字
 * 2 if 的分支可以是代码块
 */
fun IfTest1(a: Int = 1, b: Int = 4): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun IfTest2(a: Int, b: Int) {
    if (a < b) {
        println("数字$a 小于 数字 $b")
    }
}

/***
 * 在if当作表达式使用的使用必须要有else 语句
 * 因为 一定要返回一个数值
 */
fun IfTest3(a: Int = 3, b: Int = 5) = if (a > b) a else b

/***
 * when 关键字和if是相同是一个表达式 结果会返回一个数值
 * 1 当作表达式使用的使用必须包含else 语句块  符合分支的数值就是整个表达式的数值
 * 2 当作语句使用 最后的数值就是符合条件的语句块返回的数值
 */
fun WhenTest1(x: Int) {
    when (x) {
        1, 2 -> {
            println("当前的数值是 $x")
        }
        in 1..10 -> {
            println("x 是1 到10 之间的一个数值")
        }

        else -> {
            println("else 分支的处理")
        }
    }
}

fun WhenTest2(x: Any) = when (x) {
    x is String -> {
        println("x 是一个字符串a")
    }
    else -> {
        false
    }
}
