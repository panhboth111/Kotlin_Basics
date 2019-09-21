package `15_Polymorphism`

fun main(){

}
open class Parent{
    open fun display(){
        println("Method of parent class")
    }
}
class Child : Parent(){
    override fun display(){
        println("Method of child class")
    }
}