package `19_inheritance`

fun main(){
    var child = Child()
    println("a: ${child.a}, b: ${child.b}")
}
open class Parent{
    var a = 10
}
class Child:Parent(){
    var b = 20
}