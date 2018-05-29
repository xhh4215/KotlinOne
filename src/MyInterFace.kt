package mydemo.kotlin

/***
 * 在接口中既可以包含抽象的方法 也可以包含方法的实现
 * 但是不可以保存状态 内部的属性必须是抽象的属性或者提供访问器的实现
 */
interface MyInterFace {
    //    接口中声明的抽象的属性
    val pro: Int
    val mypro: String get() = "this is property"
    fun bar()
    fun foo()
}