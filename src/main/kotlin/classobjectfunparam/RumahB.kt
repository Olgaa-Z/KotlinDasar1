package classobjectfunparam

class RumahB(
    var jumlahKamar : Int,
    var jumlahWc : Int,
    var JumlahJendela : Int,
    var luasTanah :Int,
    var pemilikRumah:String ="Laras"
) {

//    dijalakan setiap object  dibuat
    init {
        println("Luas Rumah Init = $luasTanah")
    }
}