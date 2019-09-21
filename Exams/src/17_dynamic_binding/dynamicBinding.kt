package `17_dynamic_binding`

fun main(){
    var a:Parent = Parent()
    var b:Parent = Child()
    a.display()
    b.display()
}
open class Parent{
    open fun display(){
        println("Parent")
    }
}
class Child:Parent(){
    override fun display() {
        println("Child")
    }
}
