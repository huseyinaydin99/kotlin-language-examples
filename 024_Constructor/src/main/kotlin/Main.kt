import java.lang.NumberFormatException
import java.math.BigInteger
import java.util.*

//    class  Human
//    {
//        fun think()
//        {
//            println("Kotlin is Awesome..")
//        }
//
//    }
//    fun main(args: Array<String>)
//    {
//        var huseyin = Human();
//        navin.think()
//    }


//class  Human constructor(var n : String)
class Human (var n : String)
{
    var name : String = n
    fun think()
    {
        println("Kotlin is Awesome..$name")
    }

}
fun main(args: Array<String>)
{
    var huseyin = Human("Hüseyin");
    huseyin.think()
}