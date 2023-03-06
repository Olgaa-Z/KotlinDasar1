package classobjectfunparam

//fitur untuk menambahkan sebuah function kedalam class

// Deklarasi sebuah class
class Person(val name: String, val age: Int)

// Membuat extension function untuk class Person
fun Person.isAdult(): Boolean {
    return age >= 18
}

fun String.capitalizeWords(): String = this.split(" ").joinToString(" ") { it.capitalize() }

// Menggunakan extension function pada objek Person
fun main() {
    val person1 = Person("John", 20)
    val person2 = Person("Sarah", 16)

    println(person1.isAdult()) // Output: true
    println(person2.isAdult()) // Output: false
//    ---------------------
    val sentence = "ini adalah sebuah kalimat."
    val capitalizedSentence = sentence.capitalizeWords()

    println(capitalizedSentence) // Output: Ini Adalah Sebuah Kalimat.
}