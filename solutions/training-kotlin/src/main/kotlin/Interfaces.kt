interface Flyable{
    fun currentLocation(x: Double, y: Double)
    fun speed(x: Int): Int
    fun Destination(country: String)
}

class Plane : Flyable{
    var LocationX = 0.0

    var LocationY = 0.0

    var destination = ""

    /*constructor(LocationX: Double, LocationY: Double, destination: String) {
        this.LocationX = LocationX
        this.LocationY = LocationY
        this.destination = destination
    }*/

    override fun currentLocation(x: Double, y: Double) {
        LocationX = x
        LocationY = y
    }

    override fun speed(x: Int): Int {
        return x
    }

    override fun Destination(country: String) {
        destination = country
    }

    override fun toString(): String {
        return "Plane(LocationX=$LocationX, LocationY=$LocationY, destination='$destination')"
    }
}

////////////////////////////////////////////////////////////////

interface Driveable{
    fun drive(speed: Int)
    fun brake(): String
}

class CarInterface : Driveable{
    override fun drive(speed: Int) {
        println("The car is driving about $speed km/h")
    }

    override fun brake(): String {
        return "The car is braking"
    }
}

class Train : Driveable{
    override fun drive(speed: Int) {
        println("The train is driving about $speed km/h")
    }

    override fun brake(): String {
        return "The train is braking"
    }
}

fun main(){
    //11.1

    /*var AJ13:Plane = Plane()
    AJ13.currentLocation(35.4982813, 50.2131756)
    AJ13.Destination("Spain")
    println(AJ13.toString())*/

    //11.2
    var newcar = CarInterface()
    var newtrain = Train()

    newcar.drive(120)
    newtrain.drive(360)
    println(newcar.brake())
    println(newtrain.brake())

}