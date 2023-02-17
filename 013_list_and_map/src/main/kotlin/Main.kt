import java.util.*

fun main(args: Array<String>)
{
    var nums = listOf(1,2,3,4)

//    for (i in nums)
//    {
//        println(i)
//    }

//    for ((i,e) in nums.withIndex())
//    {
//        println("$i : $e")
//    }

    var customers = TreeMap<String,Int>()
    customers["Hüseyin"] = 543
    customers["Aydın"] = 409

    for ((name,age) in customers)
    {
        println("$name : $age")
    }
}