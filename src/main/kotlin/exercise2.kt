fun main()
{
    val obj = ArrayList<Student> (6)
    obj.add(Student())

    obj.add(Student("20012021066","CE","D","AB8","Smit","Patel",20))

    obj.add(Student("20012021053","IT","F","AB11","Hari","Changecha",
        21))

    obj.add(Student("20012021034","CE","B","AB15","Ankit","Vasoya",18
    ))
    obj.add(Student("20012021010","IT","A","AB6","Ram","Thakkar",
        17))
    obj.add(Student("20012021059","CE- AI","C","AB9","Rohit","Patel",19))
        for (i in obj)
        {
            i.details()
            i.studentinfo()
        }
}
open class Person(private val fname: String, private val lname:
String, private val age: Int)
{
    fun details() {
        println("First Name = $fname")
        println("Last Name = $lname")
        println("Age = $age")
    }
}
class Student(private val enroll: String,private val branch:
String,private val Class: String,private val batch: String,fname:
              String,lname: String,age: Int) : Person(fname, lname, age)
{
    constructor() : this("NaN", "NaN", "NaN", "NaN", "NaN",
        "NaN", 0)
    {
        println("Secondary Constructor")
    }
    fun studentinfo()
    {
        println("Enrollment Number : $enroll")
        println("Branch : $branch")
        println("Class : $Class")
        println("Batch : $batch")
    }
}
