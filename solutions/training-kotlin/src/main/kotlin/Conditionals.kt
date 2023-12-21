fun main() {
    // 2.1 a)
    var number1 = 10
    var number2 = 10

    if (number1 == number2) {
        println("The number $number1 was entered twice")
    } else {
        println("The numbers $number1 and $number2 are not equal")
    }

    // 2.1 b)
    /*
    a.i is greater than number2
	    if( number1 > number2 )
    a.ii is less than number2
        if( number1 < number2 )
    a.iii is greater than or equal to number2
        if( number1 >= number2 )
    a.iv is less than or equal to number2
        if( number1 <= number2 )
    a.v is not number2
        if( number1 != number2 )
    * */

    // 2.2
    var age = 18

    if (age >= 18) {
        println("You are of legal age")
    } else {
        println("You are not of legal age")
    }

    // 2.3

    if (age < 15) {
        println("You are only allowed to ride a bike")
    } else if (age == 15) {
        println("You may ride a moped")
    } else if (age >= 16 && age < 18) {
        println("You may ride a scooter")
    } else {
        println("You may drive a car")
    }

    // 2.4

    var month = 10

    if (month < 1 || month > 12) {
        println("This month does not exist. Months go from 1-12")
    } else {
        if (month in 3..5) {
            println("It's spring")
        } else if (month in 6..8) {
            println("It's summer")
        } else if (month in 9..11) {
            println("It's autumn")
        } else {
            println("It's winter")
        }
    }

    // 2.5
    var randomNumber = Math.floor(Math.random() * 100 + 1)
    var firstNumber: Int
    var secondNumber: Int

    println("Think a number between 1-100. Whichever gets closer wins")
    println("Player1, your number")
    firstNumber = readln().toInt()

    println("Player2, your number")
    secondNumber = readln().toInt()

    println("Thank you very much! I will now compare your numbers with mine.")

    var diference1 = Math.abs(firstNumber - randomNumber)
    var diference2 = Math.abs(secondNumber - randomNumber)

    if (diference1 < diference2) {
        println("Since my number was $randomNumber, player 1 wins")
    } else {
        println("Since my number was $randomNumber, player 2 wins")
    }
}
