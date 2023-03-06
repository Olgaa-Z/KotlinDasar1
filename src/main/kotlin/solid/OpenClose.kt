package solid

interface Hewab{
    fun sound(): String{
       return "halo interface"
    }
}
class Kucin : Hewab{
   init {
       print("haloo")
   }
}
open class Konsumen(){
   open fun dataKonsumen(nama : String):String{
        return nama
    }
}
class TrxKonsumen : Konsumen(){
    fun getTransaksi(){
        //
    }
}
fun main() {
Kucin()
}