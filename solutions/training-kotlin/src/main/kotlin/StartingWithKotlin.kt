fun main(){
    //1.5
    println("Hello, I'm starting with Kotlin");

    //1.6 a)
    var variableShort:Short = 32;
    println(variableShort);

    //1.6 b)

    variableShort = 356;
    println(variableShort);

    //1.6 c)
    //variableShort = 400000; You exceed the capacity of the data. being 32767 the max number to be stored in Short

    //1.7

    var normalVariable = 10;
    val constantVariable = 10;

    println(normalVariable);
    println(constantVariable);

    normalVariable = 100;
    //constantVariable = 100;  Because it's val, we are declaring a constant and due to that, we can't reassign other value

    //1.8

    val PI:Double = 3.1416;
    var radius: Double = 5.9650;

    var area: Double = PI * Math.pow(radius, 2.0);
    var circunference: Double = PI * radius * 2;

    println(area);
    println(circunference);

    //1.9

    var valueOne: Int = "234234".toInt();
    println(valueOne);
}