fun main(){

//    tipe variable namavaraiable : TipeData
    val nama : String
    nama = "Rio"
    println(nama)

    val namaDua : String = "Rizki"
    println(namaDua)
    var namaTiga : String = " Riki"
    namaTiga = "Jihan"
    println(namaTiga)

    val a : Byte = 123
    val b :Short = 32767
    val c : Int = 12
    val d : Long = 62145164
   val e : Float = 3.14f
    val f : Double = 3.14
    val g : Char = 'E'

    var firstName = "Zelvi"
    var lastName : String = "Olga"
    println("Nama Mahasiswa : " + firstName + lastName)
    println("Nama Mahasiswa : $firstName $lastName")

    var alamat : String = """ Sleman,
        |DI Yogyakarta
        |Indonesia
    """.trimMargin()
    println(alamat)

//    var namaStudent : String = "jihan, axel, dheva"

//    ARRAY
    val namaStudent = Array(3){""}
    namaStudent[0] = "Jihan"
    namaStudent[1] = "Axel"
    namaStudent[2] = "Dheva"
    println(namaStudent.contentToString())
    println("Nama Student :${namaStudent[1]}")

    val umurStudent = arrayOf(21,20,19)
    val statusStudent = booleanArrayOf(true, false,true,false,false)
    val umurStudent2 = intArrayOf(21,20,22)
    umurStudent2[1] = 19
    println(umurStudent2[1])
    val umurStudent3= intArrayOf(12,12,34)
//    umurStudent2 = umurStudent3

    println(umurStudent2.contentToString())

    val booA : Boolean = true
    val booB : Boolean = false

    val arrayBoo = booleanArrayOf(false, false,false,false,true)

//    LIST
    val fruits = mutableListOf("apel","jeruk","anggur","durian")
    fruits.add("salak")
    fruits.remove("apel")
    println(fruits.sorted())
    val aa = fruits.sortedDescending()
    println(aa)
    println(fruits.size)
    println(fruits)

    val fruits2 = fruits.toMutableList()
    println("Copy dari fruits :$fruits2")

    val letter = listOf('A','B','C','D')
    val randomIsi = listOf('A',12,"andi",false)
    println(randomIsi)


















}