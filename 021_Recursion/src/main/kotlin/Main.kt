import java.lang.NumberFormatException
import java.util.*

fun main(args: Array<String>)
{
    var num = 5

//    var fact = 1
//    for (i in 1..num)
//    {
//        fact = fact * i
//    }
//    println(fact)

    println(fact(num))
}

fun fact(num : Int) : Int
{
    if (num == 0)
        return 1;
    else
        return num * fact(num-1)      // 5 * 4! -> 4*3
}