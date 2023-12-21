package Algorithms

fun ISINAlgorithm(chain: String): Int {
    val OFFSET = 55

    var splitedChain = chain.split("").toMutableList()
    splitedChain.removeAt(0)
    splitedChain.removeAt(splitedChain.size - 1)
    println(splitedChain)

    var weight: MutableList<Int> = mutableListOf()
    var valueOfSplitedChain: MutableList<Int> = mutableListOf()
    var init = 2

    for (element: String in splitedChain) {
        var letter = element.first()
        if (letter >= 'A') {
            var charValue: String = (letter.code - OFFSET).toString()
            if (charValue.toInt() >= 10) {
                valueOfSplitedChain.add(charValue[0].toString().toInt())
                valueOfSplitedChain.add(charValue[1].toString().toInt())

                if (init == 2) {
                    weight.add(0, init)
                    weight.add(0, 1)
                } else {
                    weight.add(0, init)
                    weight.add(0, 2)
                }
            }
        } else {
            valueOfSplitedChain.add(element.toInt())

            if (init == 2) {
                weight.add(0, init)
                init = 1
            } else {
                weight.add(0, init)
                init = 2
            }
        }
    }

    println(valueOfSplitedChain)
    println(weight)

    var product: MutableList<Int> = mutableListOf()

    for (i in 0..valueOfSplitedChain.size - 1) {
        var value = valueOfSplitedChain.get(i) * weight.get(i)

        if (value >= 10) {
            product.add(value.toString().toCharArray().get(0).toString().toInt())
            product.add(value.toString().toCharArray().get(1).toString().toInt())
        } else {
            product.add(value)
        }
    }

    println(product)

    var substract = product.sum() % 10

    var result = 10 - substract

    if (result == 10) {
        return 0
    } else {
        return result
    }
}

fun main() {
    println("Welcome to ISIN calculator, please introduce your text")
    var isinChain = readln().uppercase()

    println(ISINAlgorithm(isinChain))
}
