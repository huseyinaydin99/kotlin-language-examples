abstract class Human
{
    abstract fun think()

    fun talk()
    {
        println("talking...")
    }


}

class Doctor : Human()
{
    override fun think()
    {
        println("Critical Thinking")
    }
}

class Customer : Human()
{
    override fun think()
    {
        println("Virtual Thinking")
    }
}

fun main(args: Array<String>)
{
    var huso : Human = Customer()
    huso.talk()
    huso.think()
}
