fun main() {
    //Standard library Functions- pre-defined/inbuilt functions

    var number = Math.sqrt(144.0)
    println("The squareroot number is $number")
    println()

    var result = Math.max(80,78)
    println("The maximum value is $result")
    println()
    day()
    sum(66,89,90 )
    sum(56,75,34 )

}

//user-defined functions
fun day () {

    println("Today is Wednesday")

}
//Parameters/Variables and arguement/values
fun sum(x:Int, y:Int, z:Int){
    println(x +y)
}

