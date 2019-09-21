package `18_encapsulation`
fun main(){
    var John = Person()
    println(John.Name)

}
class Person{
    private var name = "John"
    var Name:String
        get() = name
        set(value) {
            name = value
        }
}