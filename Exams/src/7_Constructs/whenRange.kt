package `7_Constructs`

fun main(){
    var age = 19
    when(age){
        in 1..17 -> println("you are under-aged")
        in 18..100 -> println("you are allowed to drink")
    }
}