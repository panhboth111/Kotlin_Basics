package `22_Exception`

fun main(){
    try{
        println("Outer try")
        try {
            println("Nested try")
            println(10/0)
        }catch (e:Exception){
            println("Nested catch")
        }
        println(10/0)
    }catch (e:Exception){
        println("Outer catch")
    }
}