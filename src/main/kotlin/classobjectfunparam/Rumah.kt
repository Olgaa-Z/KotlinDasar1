package classobjectfunparam

class Rumah {
    var jumlahKamar : Int = 3
    var jumlahJendela :Int = 4
    var luasTanah : Int = 1000
    var panjangRumah : Int = 100
    var lebarRumah : Int = 80
    var jumlahWc : Int = 2
    fun bersih() = "Sangat Bersih"   //bisa, jika body function hanya 1 statement saja

    fun bersih2():String{
        return "Sangat Bersih"
    }

    fun bukaPintu():String{
        return "Rumah ini bisa membuka semua pintu"
    }

    fun naikTurunLift():String{
        return "Rumah ini menyediakan lift untuk naik dan turun lantai"
    }

}

//