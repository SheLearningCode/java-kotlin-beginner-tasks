fun nameArray() {
    var array = arrayOf<String>("Pedro", "Mario", "Pablo", "Marcel", "Alberto")
    println(array.contentToString())
}

fun palindrome() {
    println("Insert word--> ")
    var chain = readln().lowercase()

    var splitedChain = chain.split("")

    var reversedChain = splitedChain.reversed()

    if (splitedChain == reversedChain) {
        println("The word is a palindrome")
    } else {
        println("The word is not a palindrome")
    }
}

fun main() {
    // 8.1
    // nameArray()

    // 8.2
    palindrome()
}
