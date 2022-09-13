fun main()
{
    println("Integer to double : ")
    var i:Int = 12
    var db:Double = i.toDouble()
    println(db)
    println(db::class.java.typeName)

    println("\nString to Int : ")
    var s:String = "12"
    var i1:Int = s.toInt()
    println(i1)
    println(i1::class.java.typeName)

    println("\nString to Double : ")
    var db1:Double = s.toDouble()
    println(db1)
    println(db1::class.java.typeName)
}
