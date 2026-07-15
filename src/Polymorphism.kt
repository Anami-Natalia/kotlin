// Parent class
open class Employee {
    open fun work() {
        println("The employee is working.")
    }
}

// Child class
class Teacher : Employee() {
    override fun work() {
        println("The teacher is teaching students.")
    }
}

// Child class
class Doctor : Employee() {
    override fun work() {
        println("The doctor is treating patients.")
    }
}

fun main() {
    val employee1: Employee = Teacher()
    val employee2: Employee = Doctor()

    employee1.work()
    employee2.work()
}