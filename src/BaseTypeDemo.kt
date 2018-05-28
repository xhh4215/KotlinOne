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
    println("这是一个关于逻辑运算符的使用" + BooleanTest1(true, true) + BooleanTest2(false, false) + BooleanTest3(true))
    ArrayTest1()
    StringTest()

}

/**
 * 逻辑  或 操作
 * 有真即真  全假为假
 */
fun BooleanTest1(a: Boolean = true, b: Boolean = false): Boolean = a || b

/***
 * 逻辑  与 操作
 * 同真为真  有假即假
 */
fun BooleanTest2(a: Boolean, b: Boolean): Boolean = a && b

/***
 * ture 取非 为false
 * false 取非 为true
 */
fun BooleanTest3(a: Boolean): Boolean = !a

/***
 * 数组的几种创建方式
 */
fun ArrayTest1() {
    /***
     * 使用arrayOf创建一个包含一定的元素的数据  其中元素的类型自定义
     */
    val array = arrayOf(1, 2, 3, 4, 5, 6)
    /***
     * arrayOfNulls
     * 创建一个大小为10  元素的类型为Int类型的 空的数组
     */
    val array2 = arrayOfNulls<Int>(10)
    /**
     * 使用Array的构造器创建   需要的参数是一个指定元素个数的整数，和一个初始化数据的lambda表达式
     */
    val array3 = Array(10, { i -> "我是使用lambad创建的数组" + i })
    for (item in array3) {
        println(item)
    }
    /***
     * 创建分装好的原生的数组数据类型  ByteArray  IntArray  。。。。
     * 数据类型无装箱的开销
     */
    val array4 = intArrayOf(1, 2, 3, 4)

}

/***
 * 获取字符长指定位置的字符
 */
fun StringTest() {
    /***
     * 使用 + 进行字符串之间的拼接
     *
     */
    val string = "我是一个字符串"
    val string2 = """
        我是一个超级厉害的字符串
        你就说吧 你想创建什么样的字符串
        输入进来就行了哈哈
        """
    for (item in string) {
        println("字符串中的字符$item")
    }
    println(string2)
}