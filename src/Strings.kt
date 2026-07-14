fun main() {
    var greeting ="Hello"
    var firstname ="John"
    var school = "eMobilis"

    println(greeting[0])
    println(greeting.uppercase())

    //String Concatination- Joining strings
    println(greeting + "" + firstname)

    //String Interpolation
    println("$greeting, my name is $firstname.I study at $school")

}