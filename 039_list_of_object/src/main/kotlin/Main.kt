data class Customer(var name:String, var points:Int)

fun main(args: Array<String>)
{
//  var customers = listOf<Customer>(Customer("Hüseyin",70),Customer("Aydın",80))
    var customers : List<Customer> = listOf<Customer>(Customer("Hüseyin",70),Customer("Aydın",80))

    for(customer in customers)
    {
//      println(alien)
        println(customer.name)
    }
}