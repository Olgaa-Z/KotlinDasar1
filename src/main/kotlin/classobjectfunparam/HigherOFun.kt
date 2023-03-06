package classobjectfunparam

//Hiigher-order function : fun yang menerima parameter berupa function
//mengembalikan function sebagai parameter atau return value
//kode lebih modular,reusable,ekspresif

fun calculate(x:Int, y:Int, operation:(Int,Int)->Int):Int{
    return operation(x,y)
}

fun main(){
    val sum = {a :Int, b:Int-> a+b}
    val sub = {a:Int,b:Int -> a-b}
    val times = {a:Int,b:Int-> a*b}

    val result1 = calculate(12,9, sum)
    val result2 = calculate(13,34,sub)

    println("Hasil Penjumlahan : $result1")
    println("Hasil pengurangan : $result2")

}