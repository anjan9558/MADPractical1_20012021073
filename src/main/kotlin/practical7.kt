fun fact(n:Int):Int{
    var f=1
    for (i in 1..n) {
        f *= i
    }
    return f
}
tailrec fun factTail(n:Int):Int {
    return if (n==1) 1 else n * factTail(n-1)
}
fun main() {
    val n : Int = readLine()!!.toInt()
    println("Factorial of 5 : ${fact(n)}")
    println("Tail-rec Keyword->Factorial of 5 : ${factTail(n)}")
}
