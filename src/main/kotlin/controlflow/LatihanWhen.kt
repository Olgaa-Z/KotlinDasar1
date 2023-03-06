package controlflow

fun main(){
//    1 : satu
    //2 : dua

    val angka : Int = 6
    val result = when(angka){
        1  -> "Satu"
        2 -> "Dua"
        3 -> "Tiga"
        else -> "Tidak ada"
    }

    println(" angka : $result")

//    bulan
    val bulan : Int = 3
    val hasilBulan = when(bulan){
        1 -> "Januari"
        2 -> "Februari"
        else -> "Tidak ada"
    }
    println(hasilBulan)

//    ngecek apakah angka itu positiif atau negatif
    val numb : Int = 3
    val hasilNumb = when{
        numb < 0 -> println("angka negatif")
        numb > 0 -> println("angka positif")
        else -> println("angka 0")
    }
    println(hasilNumb)

//    Range
    val nilaiStudent : Int = 45
    val hasilNilai = when(nilaiStudent){
        in 90 until 100  -> 'A'
        in 79 until 89 -> 'B'
        else -> "TIdak ada"
    }

    val  nilaiTurun = 90 downTo 80
    println(nilaiTurun)

//    While do
    var i = 2
    while(i <= 20){
        print(i)
        i += 2
    }






}