package oop_solid

open class Mahasiswa(){
    var name : String = "Andika"  // public- bisa diakses dimana saja
    private var age : Int = 20 //hanya isa diakses oleh class yang sama
    protected var address: String = "Depok" //hanya bisa diakses oleh class dan subclass
    internal var nim: String = "365723" //dalam 1 modul (kelas yang sama, paket yang sama)

}
class AndroidClass():Mahasiswa(){
    fun showAdress(){
        println("Student adress : $address")
    }
    fun showNim(){
        println("Student Nim : $nim")
    }
}

fun main() {
    val and1 = AndroidClass()
    and1.showAdress()
    and1.showNim()
    and1.nim
    val mhs = Mahasiswa()

//    pemanggilan method access modifier
    val fsw = FswClass()
    fsw.myPublicMethod()
    fsw.myInternalMethod()
//    pemanggilan class yang ada akses modifier
    val class1 = MyClass()
    val class2 = MyClass4()
}
//---------------------------
//Enkapsulation method and class
class FswClass(){
    public fun myPublicMethod() {
        println("ini method public : dapat diakses dari mana saja")
    }

    private fun myPrivateMethod() {
        println("ini method Private : Hanya bisa diakses oleh class yang sama")
    }

    protected fun myProtectedMethod() {
        println("ini method protected : dapat diakses oleh class yang sama, child class")
    }
    internal fun myInternalMethod() {
        println("ini method Internal : dapat diakses dari dalam kelas yang sama dan dari paket yang sama.")
    }
}
//Akses modifier untuk class
public class MyClass {
    // anggota kelas
}

private class MyClass2 {
    // ga ada yang bisa akses
}
//open protected class MyClass3 {
////    Kata kunci "protected" hanya dapat digunakan pada anggota kelas seperti variabel, metode, atau konstruktor.
//}
internal class MyClass4 {
    // kelas yang sama &  paket yang sama
}