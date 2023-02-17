import java.util.*

fun main(args: Array<String>)
{
//   var finalAmt = calcAmount(50, 0.03)
    var finalAmt = calcAmount(interest = 0.03,amt =50)       //Named Para.
    println(finalAmt)
}

//fun calcAmount(amt : Int) : Int
//{
//    return (amt + amt * 0.04).toInt();
//}

//fun calcAmount(amt : Int, interest : Double) : Int
//{
//    return (amt + amt*interest).toInt();
//}

@JvmOverloads
fun calcAmount(amt : Int, interest : Double = 0.04) : Int
{
    return (amt + amt*interest).toInt();
}