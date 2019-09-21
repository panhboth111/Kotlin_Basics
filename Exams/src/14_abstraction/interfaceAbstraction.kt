package `14_abstraction`

fun main(){
    var John = John()
    John.intro()
    John.greet()
}
interface Person{
    var name:String
    var age:Int
    var height:Float
    fun greet(){
        println("hello!")
    }
    fun intro()
}
class John:Person{
    override var name = "John"
    override var age = 19
    override var height = 1.75f
    override fun intro() {
        println("name: $name , age: $age , height: $height")
    }
}