fun BMIClassification(BMI:Double):String{
    var result = ""
    if (BMI < 18.5) {
        result = "You are Underweight"
    } else if (BMI >= 18.5 && BMI <= 24.9) {
        result = "You are on Healthy Weight"
    } else if (BMI >= 25 && BMI <= 29.9) {
        result = "You have Overweight"
    } else if (BMI >= 30 && BMI < 40) {
        result = "You have Obesity"
    } else if (BMI >= 40) {
        result = "You have Class 3 Obesity"
    }
    return result
}

fun main(){
    println("Input your body weight")
    var weight = readln().toDouble()

    println("Input your height(cm)")
    var height = readln().toDouble()

    height /= 100

    var BMI = weight / Math.pow(height, 2.0)

    println("Your BMI is ${BMI}")
    println(BMIClassification(BMI))
}