package solutions.kotlin

object ISINAlgorithmKotlin {
    private const val alphabetLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    /**
     * Takes an [ISIN] and applies the ISIN-Algorithm to it.
     *
     * @param ISIN which is to be proved.
     * @return the corresponding value as Integer according to the ISIN-Algorithm.
     */
    fun proveISIN(ISIN: String): Int {
        val parsedISIN: String = parseISIN(ISIN)
        val weight: String = calculateWeight(parsedISIN)
        val weightAsIntList: List<Int> = convertStringToVector(weight)
        val parsedISINasIntList: List<Int> = convertStringToVector(parsedISIN)
        val product: List<Int> = multiplyTwoVectors(weightAsIntList, parsedISINasIntList)

        println("_________________________________________________________________")
        println("Original ISIN:         $ISIN")
        println("Parsed ISIN:           $parsedISIN")
        println("Weight:                $weight")
        println("_________________________________________________________________")
        println("Weight as Int list:    $weightAsIntList")
        println("Parsed ISIN:           $parsedISINasIntList")
        println("Product:               $product")

        val productAsString: String = convertVectorToString(product)
        val productAsVector: List<Int> = convertStringToVector(productAsString)
        val crossSum: Int = calcCrossSumOfVector(productAsVector)
        val result: Int = calculateModulo(crossSum)

        println("_________________________________________________________________")
        println("Cross sum:             $crossSum")
        println("Result:                $result")
        println("_________________________________________________________________")

        return if (result >= 10) 0 else result
    }

    /**
     * Goes through the ISIN character by character and if there is a letter, it is replaced with the specific number of the alphabetObjectList.
     *
     * @param ISIN which is to be parsed.
     * @return the parsed [ISIN] as String.
     */
    private fun parseISIN(ISIN: String): String {
        val parsedISIN = StringBuilder()
        val alphabetObjectList = createAlphabetObjectList()

        for (index in ISIN.indices) {
            val flag = Character.isDigit(ISIN[index])
            if (!flag) {
                parsedISIN.append(getAlphabeticValue(alphabetObjectList, ISIN[index]))
            } else {
                parsedISIN.append(ISIN[index])
            }
        }
        return parsedISIN.toString()
    }

    /**
     * Creates the weighting of a parsed ISIN as a String.
     *
     * @param parsedISIN from which the weighting is created.
     * @return weighting as String.
     */
    private fun calculateWeight(parsedISIN: String): String {
        val weight = StringBuilder()
        for (index in 0 until parsedISIN.length - 1) {
            if (weight.isEmpty()) {
                weight.insert(0, "Solution2.java")
            }
            weight.insert(0, if (index % 2 == 0) "Solution1.java" else "Solution2.java")
        }
        return weight.toString()
    }

    /**
     * Creates the product of two Integer lists.
     *
     * @param vectorA first Integer list.
     * @param vectorB second Integer list.
     * @return the product vector of [vectorA] and [vectorB].
     */
    private fun multiplyTwoVectors(vectorA: List<Int>, vectorB: List<Int>): List<Int> {
        val productVector = mutableListOf<Int>()
        for (index in vectorA.indices) {
            productVector.add(vectorA[index] * vectorB[index])
        }
        return productVector
    }

    /**
     * Calculates the cross sum of a vector.
     *
     * @param vector from which the cross sum is to be calculated.
     * @return the cross sum of given [vector].
     */
    private fun calcCrossSumOfVector(vector: List<Int>): Int {
        var result = 0
        for (index in vector) {
            result += index
        }
        return result
    }

    /**
     * Converts an Integer vector to String.
     *
     * @param vector to be converted into a string.
     * @return the [vector] as a String.
     */
    private fun convertVectorToString(vector: List<Int>): String {
        val vectorAsString = StringBuilder()
        for (index in vector) {
            vectorAsString.append(index)
        }
        return vectorAsString.toString()
    }

    /**
     * Converts a String to an Integer vector.
     *
     * @param string to be converted into an Integer vector.
     * @return the String as a vector.
     */
    private fun convertStringToVector(string: String): List<Int> {
        val result = mutableListOf<Int>()
        string.map { result.add(Character.getNumericValue(it)) }
        return result
    }

    /**
     * Calculates the modulo of 10 of the passing parameter and subtracts the remainder of it from 10.
     *
     * @param value to be used for the calculation.
     * @return The calculated value, but if this is greater than 10, then zero.
     */
    private fun calculateModulo(value: Int): Int {
        val modulo10 = value % 10
        val subtraction = 10 - modulo10
        return if (subtraction > 10) 0 else subtraction
    }

    /**
     * Creates a list of [AlphabetObject]s, which have a letter of the alphabet as a key and the corresponding number as a value.
     *
     * @return the created list of [AlphabetObject]s.
     */
    private fun createAlphabetObjectList(): List<AlphabetObject> {
        val alphabetObjectList = mutableListOf<AlphabetObject>()
        for (index in alphabetLetters.indices) {
            alphabetObjectList.add(AlphabetObject(alphabetLetters[index], index + 10))
        }
        return alphabetObjectList
    }

    /**
     * Goes through a list of [AlphabetObject]s and checks whether the [AlphabetObject.key] matches the passed [character].
     *
     * @param alphabetObjectList which is run through.
     * @param character which is compared with the [AlphabetObject.key]s.
     * @return the [AlphabetObject.value] of the matching [AlphabetObject]'s.
     */
    private fun getAlphabeticValue(alphabetObjectList: List<AlphabetObject>, character: Char): Int {
        var result = 0
        for (alphabetObject in alphabetObjectList) {
            if (alphabetObject.key == character) {
                result = alphabetObject.value
            }
        }
        return result
    }
}

data class AlphabetObject(val key: Char, val value: Int)

//Main class
fun main() {
        // write your code here
        val rawIsin = "DE000555750"
        ISINAlgorithmKotlin.proveISIN(rawIsin)
}