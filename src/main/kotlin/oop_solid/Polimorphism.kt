package oop_solid

// misalkan 2 buah function yang sama dulu !
// override : ditimpa
// method yang diwarisi dapat di-overriding
open class Buah(){
    open fun warnaBuah(warna : String){
        println("warna buah : $warna")
    }
    open fun vitaminBuah(vit : Char){
        println("Buah memiliki vitamin $vit")
    }
}

class Apel : Buah(){
    override fun warnaBuah(warna: String) {
        super.warnaBuah(warna)
//        super merujuk pada parent nya
    }

    override fun vitaminBuah(vit: Char) {
        println("Apel Memiliki vitamin : $vit")
    }
}


fun main() {
    val apel = Apel()
    apel.vitaminBuah('A')
//    -------------overloading method
    val matematika = Matematika()

    matematika.hitung(2, 3) // Output: Hasil penjumlahan dari 2 dan 3 adalah 5
    matematika.hitung(2, 3, 4) // Output: Hasil penjumlahan dari 2, 3, dan 4 adalah 9
    matematika.hitung(2.5, 3.5) // Output: Hasil perkalian dari 2.5 dan 3.5 adalah 8.75
}

//method overloading
class Matematika {
    fun hitung(a: Int, b: Int) {
        println("Hasil penjumlahan dari $a dan $b adalah ${a + b}")
    }

    fun hitung(a: Int, b: Int, c: Int) {
        println("Hasil penjumlahan dari $a, $b, dan $c adalah ${a + b + c}")
    }

    fun hitung(a: Double, b: Double) {
        println("Hasil perkalian dari $a dan $b adalah ${a * b}")
    }
}