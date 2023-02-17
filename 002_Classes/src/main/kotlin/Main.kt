fun main(args: Array<String>) {
    println("Hello World!")
    var customer = Customer();
    customer.name = "Ömer"
    println(customer.name)
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

class Customer
{
    var name : String = "";
}