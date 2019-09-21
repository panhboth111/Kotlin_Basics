package `22_Exception`

fun main(){
    var a = 10
    try{
        println(a/0)
    }catch (e:Exception){
        println(e)
    }
}