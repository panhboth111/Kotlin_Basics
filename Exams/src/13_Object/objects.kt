package `13_Object`

fun main(){
    var John = Person()
    John.name = "John"
    John.age = 19
    John.greet()
}
class Person{
    var name:String = ""
    var age:Int = 0
    fun greet(){
        print("Good morning!")
    }
}