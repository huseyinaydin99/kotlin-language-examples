fun main(args: Array<String>) {
    println("Hello World!")
    val sabitDeger= 10
    var degiskenDeger = 20
    degiskenDeger = 19
    sabitDeger = 9 //hata verir sabit değişmez.
    val customer = Customer()
    customer = Customer() //hata verir değişmez
    var customer2 = Customer()
    customer2 = Customer()
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

class Customer
{
    var name : String = "";
}