import java.util.function.Consumer

//data class Customer(var name:String, var points:Int)
//
//fun main(args: Array<String>)
//{
//    var values = listOf<Int>(4,8,3,9,2,1)
//
////    for(i in values)
////    {
////        println(i)
////    }
//
////    values.forEach({ println(it)})
//
//    var con : Consumer<Int> = object : Consumer<Int>
//    {
//        override fun accept(t: Int) {
//           println(t)
//        }
//
//    }
//
//    values.forEach(con)
//
//}

data class Customer(var name:String, var points:Int)

fun main(args: Array<String>)
{
    var values = listOf<Int>(4,8,3,9,2,1)

//    values.forEach({n -> println(n)})
//    values.forEach({println(it)})
    values.forEach(::println)
}