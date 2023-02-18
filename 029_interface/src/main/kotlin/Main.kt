import java.lang.NumberFormatException
import java.math.BigInteger
import java.util.*

//interface A
//{
//    fun show()
//}
//interface B
//{
//    fun display()
//}
//
//class C : A , B
//{
//    override fun show()
//    {
//        println("in show")
//    }
//    override fun display()
//    {
//        println("in display")
//    }
//}
//fun main(args: Array<String>)
//{
//    var obj = C()
//
//    obj.show()
//    obj.display()
//}


interface A
{
    fun show()
    fun abc()
    {
        println("in abc A")
    }
}
interface B
{
    fun display()
    fun abc()
    {
        println("in abc B")
    }
}

class C : A , B
{
    override fun show()
    {
        println("in show")
    }
    override fun display()
    {
        println("in display")
    }
    override fun abc()
    {
        super<A>.abc()
    }
}
fun main(args: Array<String>)
{
    var obj = C()

    obj.show()
    obj.display()
    obj.abc()
}