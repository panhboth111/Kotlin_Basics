package `7_Constructs`

fun main(){
    var day = "Monday"
    when(day){
        "Monday","Wednesday" -> println("We open in the morning.")
        "Tuesday","Thursday" -> println("We open in the afternoon")
        "Friday","Saturday","Sunday" -> println("We open at night")
    }
}