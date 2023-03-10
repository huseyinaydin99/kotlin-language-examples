import java.lang.NumberFormatException
import java.math.BigInteger
import java.util.*

fun main(args: Array<String>)
{
    var num = BigInteger("70000")
//    println(fact(num))
    println(fact(num,BigInteger.ONE))
}

//fun fact(num : BigInteger) : BigInteger
tailrec fun fact(num : BigInteger , result : BigInteger) : BigInteger
{
    if (num == BigInteger.ZERO)
//        return BigInteger.ONE;
        return result;

    else{
//       return num * fact(num-BigInteger.ONE)
        return fact(num-BigInteger.ONE, num * result)
    }    // 5 * 4! -> 4*3
}
