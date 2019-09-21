package `7_Constructs`

fun main(){
    var type: Any = 19
    when(type){
        is Int -> println("Integer")
        is String -> println("String")
        is Float -> println("Float")
    }
}