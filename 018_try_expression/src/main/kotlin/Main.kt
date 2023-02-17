import java.lang.NumberFormatException
import java.util.*

fun main(args: Array<String>)
{
    var str : String = "4a";

//    var num : Int = 0;
//
//    try {
//        num = str.toInt()
//    }
    var num : Int = try {
        str.toInt()
    }
    catch (e : NumberFormatException)
    {
        -1
    }
    num++
    println(num)
}