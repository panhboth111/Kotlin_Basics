package `10_functional_programming`

fun main(){
    var result = higherOrderFunc(10,20,{a:Int,b:Int->a+b})
    print(result)
}
fun higherOrderFunc(a:Int,b:Int,add:(Int,Int)->Int):Int{
    return add(a,b)
}