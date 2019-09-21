package `23_list`

fun main(){
    var l = listOf(2,5,6,3,9)
    var asc = l.sorted()
    println("ascending: $asc")
    var desc = l.sortedDescending()
    println("descening $desc")
}