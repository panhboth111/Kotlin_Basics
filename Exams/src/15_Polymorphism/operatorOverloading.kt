package `15_Polymorphism`

class Person {
    var skill = ""
    operator infix fun plus(obj:Person):Person{
        var newObj = Person()
        newObj.skill = this.skill + " and " + obj.skill
        return newObj
    }
}
fun main(){
    var John = Person()
    John.skill = "Swimming"
    var Jim = Person()
    Jim.skill = "Boxing"
    var Tom = John + Jim
    println(Tom.skill)
}