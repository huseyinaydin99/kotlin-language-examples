fun main(args: Array<String>) {
    val num : Int = 2

//    when(num)
//    {
//        1 -> println("One")
//        2 -> println("Two")
//        3 -> println("Three")
//        else -> println("Give a proper input")
//    }


//    Using When as an expression

    var str = when(num)
    {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        else -> "Give a proper input"
    }
    println("Str is $str")
}