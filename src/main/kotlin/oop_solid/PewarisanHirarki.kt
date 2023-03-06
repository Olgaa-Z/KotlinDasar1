package oop_solid

//hirarki inheritance
// Parent class
open class Vehicle {
    open fun drive() {
        println("Driving vehicle...")
    }
}

// Child class inheriting from Vehicle
open class Car : Vehicle() {
    override fun drive() {
        println("Driving car...")
    }
}

// Child class inheriting from Car
class SportsCar : Car() {
    override fun drive() {
        println("Driving sports car...")
    }
}