fun main()
{
    val obj = ArrayList<Student> (6)
    obj.add(Student())

    obj.add(Student("20012021073","IT","D","AB15","Anjan","Soni",21))
    obj.add(Student("20012011009","CE","C","AB11","Kumkum","Barot", 20))
    obj.add(Student("20012021045","CE","B","AB09","Keyuri","Rabadiya",19))
    obj.add(Student("20012021032","IT","A","AB08","Karm","Patel", 20))
    obj.add(Student("20012021059","IT","C","AB15","Aryan","Soni",21))
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
