package `15_Polymorphism`

fun main(){
    //method overloading
    var addition = Addition()
    println(addition.add(10,20))
    println(addition.add(10,20,30))
    println(addition.add("hello","world"))
    println(addition.add("hello",20))
    println(addition.add(20,"hello"))
}
//method overloading
class Addition{
    fun add(a:Int,b:Int):Int{
        return a+b
    }
    fun add(a:Int,b:Int,c:Int):Int{
        return a+b+c
    }
    fun add(a:String,b:String):String{
        return a+b
    }
    fun add(a:String,b:Int):String{
        return a + b.toString()
    }
    fun add(a:Int,b:String):String{
        return a.toString() + b
    }
}