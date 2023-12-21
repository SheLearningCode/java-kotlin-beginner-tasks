class Person{
    var name=""
    var age = 0
    var weight = 0.0
    var height = 0

    constructor(name: String, age: Int, weight: Double, height: Int) {
        this.name = name
        this.age = age
        this.weight = weight
        this.height = height
    }

    fun imMajorAge(): String{
        if(this.age >= 18){
            return ("I'm on legal age")
        }else{
            return ("I'm a minor")
        }
    }

    override fun toString(): String {
        return "Person(name='$name', age=$age, weight=$weight, height=$height)"
    }
}

class Address{
    var street = ""
    var postCode = 0
    var city = ""

    constructor(street: String, postCode: Int, city: String) {
        this.street = street
        this.postCode = postCode
        this.city = city
    }

    override fun toString(): String {
        return "Address: $street, $postCode, $city"
    }


}

class Customer{
    var name = ""
    var firstName = ""
    var address: Address? = null

    constructor(name: String, firstName: String, street: String, postCode: Int, city: String) {
        this.name = name
        this.firstName = firstName
        this.address = Address(street, postCode, city)
    }

    override fun toString(): String {
        return "Customer: $name $firstName \n${address.toString()}"
    }


}

fun main(){
    /*var Pedro = Person("Pedro",23,91.1, 181)
    println(Pedro.imMajorAge())
    println(Pedro.toString())*/

    val Max = Customer("Max", "Mustermann", "Musterstr. 18", 32222, "Am See")
    val Manfred = Customer("Manfred", "Schmidt", "Hauptbahnhof. 2", 43332, "City centre")
    val Lisa = Customer("Lisa", "Lee", "Stuttgarter Weg 22", 23333, "Schlosspark")

    var customerArray = arrayOf<Customer>(Max, Manfred, Lisa)
    for(i in 1..3){
        println("___Customer No.$i ___")
        println(customerArray[i-1].toString())
        println()
    }

}