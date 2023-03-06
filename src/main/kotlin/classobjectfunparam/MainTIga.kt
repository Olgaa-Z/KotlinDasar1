package classobjectfunparam

fun main(){

//    Pembuatan Object dari class Rumah
    val rumahB = Rumah()
    var pjRumah = rumahB.panjangRumah
    pjRumah = 200
    var fungsiSatu = rumahB.naikTurunLift()

    println("Panjang rumah B : $pjRumah meter")
    println("Fungsi Rumah 1 : $fungsiSatu")

//    Pemanggilan Primary Constructor
    val rumah = RumahB(3,2,4,100)
    println("Nama Pemilik : ${rumah.pemilikRumah}")
    println("Luas Tanah Rumah : ${rumah.luasTanah}")

//    pemanggilan secodary constructor
    val rumahC = RumahC(200, 100)
    val rumahCC = RumahC("Zelvi")
    println(rumahC.panjangRumah)
    println(rumahCC.pemilikRumah)

}
