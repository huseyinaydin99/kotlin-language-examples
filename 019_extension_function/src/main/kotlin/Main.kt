import java.lang.NumberFormatException
import java.util.*

fun main(args: Array<String>)
{
    var a1 = Human()
    a1.skills = "Java"
    a1.show()

    var a2 = Human()
    a2.skills = "SQL"
    a2.show()

    var a3 = a1.plus(a2)
    a3.show()
}

fun Human.plus(a : Human) : Human
{
    var customer = Human()
    customer.skills = this.skills + " " + a.skills
    return customer
}

class Human
{
    var skills : String? = null
    fun show()
    {
        println(skills)
    }
}