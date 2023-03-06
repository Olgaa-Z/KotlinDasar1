package classobjectfunparam

fun main(){

//    anonymous function , fun yg ga perlu di deklarasikan , ga ada nama functionnya
//    punya parameter,body, return type
//    function yg cukup sederhana
    val ucapan = {name : String -> "Hello $name"}
    val pesan = ucapan("Andika")
    println(pesan)

//    contoh tanpa lambda(anonymous)
    fun ucapan2(name : String): String{
        return "Hello $name"
    }



}