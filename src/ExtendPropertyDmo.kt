package mydemo.kotlin

fun main(args: Array<String>) {
    val string: String = "这是一个简单的字符串"
    println(string.getLast)
}

// 扩展属性
val <T> List<T>.lastIndex: Int get() = (size - 1)
// 扩展属性   注意：由于扩展没有实际的将成员插入类中，因此对扩展属性来说幕后字段是无效的
// 。这就是为什么扩展属性不能有初始化器。他们的行为只能由显式提供的 getters/setters 定义。
val String.getLast: Int get() = this.length - 1

fun max(a: Int, b: Int) = if (a > b) a else b


class People(val name: String, val age: Int)


