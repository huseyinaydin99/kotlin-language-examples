//fun main(args: Array<String>)
//{
//    A.show()
//}

class A
{
    companion object
    {
        @JvmStatic
        fun show()
        {
            println("Hello")
        }
    }
}

fun main(args: Array<String>)
{
    A.show()
}