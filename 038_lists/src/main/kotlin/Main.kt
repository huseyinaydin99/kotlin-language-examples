//fun main(args: Array<String>)
//{
//    var values : List<Int> = listOf<Int>(8,9,4,2)
//
//    for(i in values)
//    {
//        println(i)
//    }
//
////    println(values.get(0))
//      println(values.indexOf(9))
//}

fun main(args: Array<String>)
{
    var values : MutableList<Int> = mutableListOf<Int>(8,9,4,2)
//  values.add(3)
    values.add(2,3)

    for(i in values)
    {
        println(i)
    }
}
