package `7_Constructs`

fun main(){
    var a = 1
    var section = when(a){
        1-> "Section A"
        2-> "Section B"
        3-> "Section C"
        else -> "None"
    }
    print(section)
}