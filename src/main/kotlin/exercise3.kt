fun main()
{
    val obj = ArrayList<Laptop> (6)
    obj.add(Laptop())
    obj.add(Laptop("Core i5",8,512,"HP Laptop",1,50000))
    obj.add(Laptop("Core i7",16,1000,"Lenovo Laptop",1,65000))
    obj.add(Laptop("Core i9",16,1000,"Sony Laptop",1,75000))
    obj.add(Laptop("Ryzen 7",8,1000,"Dell Laptop",1,85000))
    obj.add(Laptop("Ryzen 5",8,1000,"Asus Laptop",1,60000))
    for (i in obj)
    {
        i.laptop()
        println("-------------")
    }
}
open class Product(private var name: String, private var qty:
Int, private var amt: Int)
{
    fun product()
    {
        println("\n Laptop Details : \n")
        println("Name : $name")
        println("Qty : $qty")
        println("Amount : $amt")
    }
}
class Laptop(
    private var cpu: String, private var ram: Int, private var
    hdd: Int,
    name: String, qty: Int, amt: Int
) : Product(name, qty, amt)
{
    constructor() : this("None", 0, 0, "None", 0, 0)
    {
        println("Secondary Constructor")
    }
    fun laptop()
    {
        product()
        println("CPU Name : $cpu")
        println("RAM Size : $ram GB")
        println("HDD Size : $hdd GB")
    }
}
