class Dog(var name:String, var breed:String, var age:Int){

}

fun main() {



    var dog1 = Dog("Tito",breed = "Bulldog",age=5)
    println("Breed: ${dog1.breed}")
    println("Age: ${dog1.age}")

    var dog2 = Dog(name = "Shifter",breed = "Chihuahua",age=6)
    println(dog2.name)


    var dog3 = Dog(name= "Tennis",breed = "German Shephered",age=3)
}