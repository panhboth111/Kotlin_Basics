package `19_inheritance`

fun main(){
    var son = Son()
    println("a: ${son.a} , b: ${son.b} c: ${son.c}")
}
open class Grandpa{
    var a = 10
}
open class Dad:Grandpa(){
    var b = 20
}
open class Son:Dad(){
    var c = 30
}