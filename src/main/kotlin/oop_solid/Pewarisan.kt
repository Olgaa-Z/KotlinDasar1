package oop_solid

open class Animal(val name : String){
    open fun eat(){
        println("$name is eating")
    }
    open fun makeSound(){
        println("$name makes a sound.")
    }
}

class  Cat(name:String): Animal(name){
    fun eating() {
        println("$name eat Tuna")
    }
}

open class Dog(name:String):Animal(name){
    override fun makeSound() {
        super.makeSound()
//        super : merujuk ke superclass / parent
    }
}



fun main() {
    val cat = Cat("Anggora")
    cat.eating()

    val  dog = Dog("Husky")
    dog.makeSound()


}