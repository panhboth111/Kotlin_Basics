package `21_constructor`

fun main(){
    var Jim = Person("Jim",19)
    var Husky = Dog("Husky")
    var Apple = Fruit("Apple",2f)
    var Iphone = Phone("Black",1999f)
}
//primary constructor after class name without "constructor" keyword
class Person(name:String,age:Int){
    var name:String
    var age:Int
    init {
        this.name = name
        this.age = age
    }
    constructor(name:String,age:Int,hair:String):this(name,age){

    }
}
//primary constructor after class name using "constructor" keyword
class Dog constructor(breed:String){
    var breed:String
    init {
        this.breed = breed
    }
}
//
class Fruit(var name:String,var price:Float)
class Phone constructor(var brand:String,var price:Float)