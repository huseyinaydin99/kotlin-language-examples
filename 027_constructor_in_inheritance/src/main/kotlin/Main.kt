import java.lang.NumberFormatException
import java.math.BigInteger
import java.util.*

//open class Human()
//{
//    init
//    {
//        println("in human")
//    }
//    open fun think()
//    {
//        println("Real Thinking")
//    }
//}
//
//class Customer : Human()
//{
//    init {
//        println("in customer")
//    }
//    override fun think()
//    {
//        println("Virtual Thinking")
//    }
//}
//
//fun main(args: Array<String>)
//{
//    var huso : Human = Customer()
////    huso.think()
//}



open class Human(age : Int)
{
    init
    {
        println("in human " + age)
    }
    open fun think()
    {
        println("Real Thinking")
    }
}

class Customer(age: Int) : Human(20)
{
    init {
        println("in customer")
    }
    override fun think()
    {
        println("Virtual Thinking")
    }
}

fun main(args: Array<String>)
{
    var huso : Human = Customer(20)
//    mayank.think()
}