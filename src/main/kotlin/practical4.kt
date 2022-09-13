import kotlin.reflect.typeOf

fun main()
{
    print("Enter the number : ")
    var n = readLine()

    var temp = Integer.valueOf(n)%2

    when(temp)
    {
        0-> println("Even number.")
        1-> println("Odd number.")
    }
}