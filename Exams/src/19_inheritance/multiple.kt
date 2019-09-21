package `19_inheritance`

fun main(){

}
interface X{
    var a:Int
}
interface Y{
    var b:Int
}
interface Z{
    var c:Int
}
class J: X,Y,Z{
    override var a = 10
    override var b = 20
    override var c = 30
}

