import java.util.*

fun main(args: Array<String>)
{
//    add(4,5)
    var result = max(8,7)
    println(result)
}

//fun add(a : Int,b : Int)
//{
//    println(a+b)
//}

//fun add(a : Int,b : Int) : Int
//{
//    return a+b
//}

fun add(a : Int,b : Int) : Int = a+b

//fun max(a: Int,b: Int) : Int
//{
//    if(a>b)
//        return a
//    else
//        return b
//}

fun max(a: Int,b: Int) : Int = if (a>b) a else b