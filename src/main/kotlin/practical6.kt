import java.util.Scanner

fun main()
{
    val reader=Scanner(System.`in`)

    println("What do you want to perform\n1: Addition\n2: Subtraction\n3: Multiplication\n4: Division")
    var ch=Integer.valueOf(readLine())
    println("Enter 2 numbers:")
    val num1=reader.nextFloat()
    val num2=reader.nextFloat()
    println("Answer: " + when(ch)
    {
        1-> add(num1,num2)
        2-> sub(num1,num2)
        3-> mul(num1,num2)
        4-> div(num1,num2)
        else-> println("Wrong choice!!")
    })
}

fun add(num1: Float, num2: Float) : Float
{
    return  num1+num2
}

fun sub(num1: Float, num2: Float) : Float
{
    return  num1-num2
}

fun mul(num1: Float, num2: Float) : Float
{
    return  num1*num2
}

fun div(num1: Float, num2: Float) : Float
{
    return  num1/num2
}