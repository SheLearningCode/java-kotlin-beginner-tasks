open class Vehicle {
    var motorLord = "Pedro Pelegrina"

    override fun toString(): String {
        return "Owner(motorLord='$motorLord')"
    }
}

class Motorcycle(colour: String, numberPlate: String) : Vehicle() {
    var colour = colour
    var numberPlate = numberPlate

    override fun toString(): String {
        return "Motorcycle(colour='$colour', numberPlate='$numberPlate')\n${super.toString()}"
    }
}

class Car(colour: String, numberPlate: String) : Vehicle() {
    var colour = colour
    var numberPlate = numberPlate

    override fun toString(): String {
        return "Car(colour='$colour', numberPlate='$numberPlate')\n${super.toString()}"
    }
}

class Truck(colour: String, numberPlate: String) : Vehicle() {
    var colour = colour
    var numberPlate = numberPlate

    override fun toString(): String {
        return "Motorcycle(colour='$colour', numberPlate='$numberPlate')\n${super.toString()}"
    }
}

fun main() {
    var yamaha = Motorcycle("Red", "3425TFG")
    var mazda = Car("Yellow", "8798PKL")
    var hummer = Truck("Green", "7821RDR")

    println(yamaha.toString())
    println()
    println(mazda.toString())
    println()
    println(hummer.toString())
}
