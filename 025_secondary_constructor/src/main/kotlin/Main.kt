import java.lang.NumberFormatException
import java.math.BigInteger
import java.util.*

//class Human (var n : String)
//{
//    var name : String = ""
//    init {
//        name = n
//        println("Human is Here...")
//    }
//    fun think()
//    {
//        println("Kotlin is Awesome..$name")
//    }
//
//}
//fun main(args: Array<String>)
//{
//    var navin = Human("huseyin");
//    navin.think()
//}


class Human (var n : String)
{
    var age : Int = 0
    var name : String = n

    constructor(age : Int,name : String) : this(name)
    {
        this.age = age
    }

    fun think()
    {
        println("Kotlin is Awesome..$name : $age")
    }

}
fun main(args: Array<String>)
{
    var huseyin = Human(20,"Hüseyin");
    huseyin.think()
}