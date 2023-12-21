class PersonCollection(name: String, age: Int, employeeNo: Int){
    var name = name
    var age = age
    var employeeNo = employeeNo

    override fun toString(): String {
        return "PersonData(name='$name', age=$age, employeeNo=$employeeNo)"
    }
}

fun main() {
    // 12.1

    var people = listOf("Pedro", "Mario", "Pablo", "Juan", "Maria")

    people.forEach { println(it) }

    var persons = listOf(
        PersonCollection("Pedro", 23, 2312313),
        PersonCollection("Mario", 20, 1232345),
        PersonCollection("Pablo", 25, 8462786),
        PersonCollection("Maria", 18, 7987978),
        PersonCollection("Luis", 32, 2343214),
    )

    persons.forEach { println(it.toString()) }

    // 12.2

    var map = hashMapOf<Int, String>()
    map.put(1, "It follows")
    map.put(2, "HP and the philosophal stone")
    map.put(3, "Run")
    map.put(4, "MistBorn")
    map.put(5, "Science for dummies")

    map.forEach { println("${it.key} --> ${it.value}") }

    // 12.3
    var set = setOf("Welcome", "To", "The", "Internet", "Welcome")
    set.forEach { println(it) }
}
