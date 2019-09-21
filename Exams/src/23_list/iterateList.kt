package `23_list`

fun main(){
    var l = listOf(1,2,3,4,5)
    println("for in loop")
    for(i in l) println(i)
    println("for until loop")
    for(i in 0 until l.size) println(l[i])
    println("forEach loop")
    l.forEach { i -> println(i) }
    println("listIterator")
    var i:ListIterator<Int> = l.listIterator()
    while (i.hasNext()){
        println(i.next())
    }
}