package oop_solid

//ga bisa dibikinkan objeknya, cuman bisa diturunkan
// method abstract harus diimplementasikan oleh child class
// ga perlu kata kunci "open" untuk inheritance
abstract class Hewan(val nama: String) {

    abstract fun bersuara()

    fun tidur() {
        println("$nama sedang tidur")
    }
}

class Kucing(nama: String): Hewan(nama) {
    override fun bersuara() {
        println("$nama: meong-meong")
    }
}

class Anjing(nama: String): Hewan(nama) {
    override fun bersuara() {
        println("$nama: gug-gug")
    }
}
// contoh 2
abstract class Shape {
    abstract fun area(): Double
}

class Rectangle(private val width: Double, private val height: Double) : Shape() {
    override fun area(): Double {
        return width * height
    }
}

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}


fun main() {
    val kucing = Kucing("pyu")
    kucing.bersuara()
//
    val rectangle = Rectangle(5.0, 6.0)
    println("Rectangle area: ${rectangle.area()}")

    val circle = Circle(2.0)
    println("Circle area: ${circle.area()}")
}