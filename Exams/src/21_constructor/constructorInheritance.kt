package `21_constructor`

fun main(){

}
//primary constructor in inheritance
open class P1(a:String,b:Int){

}
class C1(a:String,b:Int,c:Float):P1(a,b){

}
//secondary constructor in inheritance
open class P2{
    constructor(a:String){

    }
}
class C2:P2{
    constructor(a:String,b:Int):super(a){

    }
}