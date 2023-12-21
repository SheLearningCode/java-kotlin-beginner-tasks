fun main() {
    // 4.1 a)
    (1..20).forEach { print(it) }

    println()

    var counter = 1
    while (counter <= 20) {
        print(counter)
        counter++
    }

    // 4.1 b) && 4.1 c)
    println()
    counter = 1
    for (i in 0..50 step 2) {
        print(i)
        counter++
    }
    println(" The loop makes a total of $counter pases")

    // 4.1 d)
    counter = 2
    for (i in 1..19) {
        if (i > 10) {
            print("${i - counter} ")
            counter += 2
        } else {
            print("$i ")
        }
    }

    // 4.2
    for (i in 1..100) {
        if (i % 3 == 0 && i % 4 == 0) {
            println("Number $i, is divisible by 3 and 4")
        } else if (i % 4 == 0) {
            println("Number $i, is divisible by 4")
        } else if (i % 3 == 0) {
            println("Number $i, is divisible by 3")
        } else {
            println("Number $i")
        }
    }

    // 4.3
    var chain = ""
    for (i in 1..9) {
        chain += i.toString()
        println(chain)
    }

    // 4.4 a)

    var number: Int
    counter = 0
    do {
        number = Math.floor(Math.random() * 6 + 1).toInt()
        println(number)
        counter++
    } while (number != 6)

    println("Number of tries $counter")

    // 4.4 b)

    var repeat = 0
    counter = 0
    do {
        number = Math.floor(Math.random() * 6 + 1).toInt()
        println(number)
        counter++

        if (number == 6) {
            repeat++
        } else {
            repeat = 0
        }
    } while (repeat != 2)

    println("Number of tries $counter")
}
