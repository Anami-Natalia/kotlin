class Person{

    var name= "Chantell"
    var gender = "Female"

    fun drink(){
        println("Doctor is drinking")
    }
}

fun main() {

    var doctor = Person()
    println(doctor.name)
    var farmer = Person()
    println(farmer.name)

}