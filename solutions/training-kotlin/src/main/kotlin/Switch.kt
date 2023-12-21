fun main(){

    //3.1

    println("Enter the number of a month")
    var month = readln().toInt()

    when(month){
        1 -> println("JANUARY")
        2 -> println("FEBRUARY")
        3 -> println("MARCH")
        4 -> println("APRIL")
        5 -> println("MAY")
        6 -> println("JUNE")
        7 -> println("JULY")
        8 -> println("AUGUST")
        9 -> println("SEPTEMBER")
        10 -> println("OCTOBER")
        11 -> println("NOVEMBER")
        12 -> println("DECEMBER")
        else -> println("That's not a Month")
    }

    //3.2

    println("Enter your grades")
    var grades = readln()

    when(grades){
        "Very Good" -> println("Grade: 1")
        "Good" -> println("Grade: 2")
        "Satisfactory" -> println("Grade: 3")
        "Suficient" -> println("Grade: 4")
        "Poor" -> println("Grade: 5")
        "Unsatisfactory" -> println("Grade: 6")
        else -> println("That's not a correct grade")
    }
}