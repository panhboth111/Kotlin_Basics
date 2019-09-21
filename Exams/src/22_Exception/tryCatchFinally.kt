package `22_Exception`

fun main(){
    try{
        println(10/0)
    }catch (e:Exception){
        println(e)
    }finally {
        println("This block always executes")
    }
}