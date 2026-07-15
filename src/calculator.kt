//A simple calculator program using a when statement
fun main() {

    var num1 = 60
    var num2 = 20
    var operators = ("+,-,*,/")

    when (operators) {
        "+" -> println("Result: ${num1 + num2}")
        "-" -> println("Result: ${num1 - num2}")
        "*" -> println("Result: ${num1 * num2}")
        "/" -> println("Result: ${num1 / num2}")
        else -> println("Invalid Operator")

    }
    println("Result: ${num1 * num2}")
    println("Result: ${num1 % num2}")
    println("Result: ${num1 - num2}")
    println("Result: ${num1 + num2}")
    println("Result: ${num1 / num2}")
}