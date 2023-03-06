package oop_solid

//init adalah blok kode yang digunakan untuk melakukan inisialisasi pada sebuah kelas di Kotlin.
//Blok kode init dieksekusi secara otomatis ketika kelas tersebut dibuat.

class Manusia(val nama: String, val umur: Int) {
    init {
        println("Sebuah objek manusia dengan nama $nama dan umur $umur telah dibuat.")
    }
}

fun main() {
    val manusia = Manusia("John Doe", 25) // Output: Sebuah objek manusia dengan nama John Doe dan umur 25 telah dibuat.
}

