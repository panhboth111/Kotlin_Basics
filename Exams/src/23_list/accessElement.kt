package `23_list`

fun main(){
    var l1 = listOf(1,2,3,4,5,1)
    //indexing
    println("l1[0] = ${l1[0]}")
    //get
    println("l1.get(1) = ${l1.get(1)}")
    //indexOf
    println("l1.indexOf(1) = ${l1.indexOf(1)}")
    //lastIndexOf
    println("l1.lastIndexOf(1) = ${l1.lastIndexOf(1)}")
    //lastIndex
    println("l1.lastIndex = ${l1.lastIndex}")
    //first
    println("l1.first() = ${l1.first()}")
    //last
    println("l1.last() = ${l1.last()}")
}