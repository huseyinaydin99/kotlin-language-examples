import java.lang.NumberFormatException
import java.math.BigInteger
import java.util.*

//class Human
//{
//    fun think()
//    {
//        println("Real Thinking")
//    }
//}
//
//fun main(args: Array<String>)
//{
//    var mayank = Human()
//    mayank.think()
//}

open class Human {
    open fun think()
    {
        println("Real Thinking")
    }
}

class Customer : Human() {
    override fun think()
    {
        println("Virtual Thinking")
    }
}

fun main(args: Array<String>) {
    var huso : Human = Customer()
    huso.think()
}
/*
class Alien{
    var skills : String? = null
    fun show()
    {
        println(skills)
    }
}*/