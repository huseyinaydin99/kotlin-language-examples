fun main(args: Array<String>)
{
    var nums1 = 1..5
    for (a in nums1)
    {
        println(a)
    }

    var nums2 = 1..16
    for (a in nums2 step 2)
    {
        println(a)
    }

    var nums3 = 16 downTo 1
    for (a in nums3 step 2)
    {
        println(a)
    }

    var nums4 = 16 until 16
    for (a in nums4)
    {
        println(a)
    }

    var nums5 = 1 until 16
    for (a in nums5.reversed())
    {
        println(a)
    }
    println("Count is " + nums5.count())

    var nums6 = 'A'..'z'
    for (a in nums6)
    {
        println(a)
    }
    println("Count is " + nums6.count())
}