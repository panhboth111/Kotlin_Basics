package `7_Constructs`

fun main(){
    // 1,2,3,4,5,6,7,8,9,10
    println("looping from 1 to 10: ")
    for(i in 1..10) println(i)
    //1 3 5 7 9
    println("looping from 1 to 10 (step 2): ")
    for(i in 1..10 step 2) println(i)
    //10,9,8,7,6,5,4,3,2,1
    println("looping from 10 to 1: ")
    for(i in 10 downTo 1) println(i)
    //10,8,6,4,2
    println("looping from 10 to 1 (step2): ")
    for(i in 10 downTo 1 step 2) println(i)
    //looping through collection
    println("Looping through collection: ")
    var l1 = arrayListOf<Int>(1,2,3,4,5,6)
    for(i in l1) println(i)
}