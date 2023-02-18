class A
{
    companion object {
        fun create() : A = A()
    }

    fun show()
    {
        println("in show")
    }
}

fun main(args: Array<String>)
{
    var obj = A.create()
    obj.show()
}
