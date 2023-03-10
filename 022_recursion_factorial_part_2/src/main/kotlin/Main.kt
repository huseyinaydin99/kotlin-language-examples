import java.lang.NumberFormatException
import java.math.BigInteger
import java.util.*

fun main(args: Array<String>)
{
    var num = BigInteger("70000")

//    var fact = 1
//    for (i in 1..num)
//    {
//        fact = fact * i
//    }
//    println(fact)

    println(fact(num))
}

//fun fact(num : Int) : Int
fun fact(num : BigInteger) : BigInteger
{
    if (num == BigInteger.ZERO)
        return BigInteger.ONE;
    else{
        println("Hello " + num)
        return num * fact(num-BigInteger.ONE)
    }    // 5 * 4! -> 4*3
}