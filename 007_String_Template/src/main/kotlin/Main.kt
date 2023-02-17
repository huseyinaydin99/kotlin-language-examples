fun main(args: Array<String>) {
    var num1 : Int = 4;
    var num2 : Int = 7;

    var result = num1 + num2;

    //println("The addition of num1 and num2 is result")

    println("The addition of $num1 and $num2 is $result")

    var customer = Customer()
    customer.name = "Hüseyin Aydın";

    //println("Alien name is : $navin.name")

    println("Customer name is : ${customer.name}")
}

class Customer {

    var name : String? = null
}