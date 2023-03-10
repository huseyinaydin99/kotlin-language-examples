import java.util.function.Consumer


data class Customer(var name:String, var points:Int)

fun main(args: Array<String>)
{
    var values = listOf<Int>(4,8,3,9,2,1)

    var evens = values.filter { it%2 == 0 }
    var doubleValue = evens.map { it * 2 }

    doubleValue.forEach({println(it)})
    var results = values
        .filter { it%2==0 }
        .map { it * 2 }
    results.forEach({ println(it)})
}