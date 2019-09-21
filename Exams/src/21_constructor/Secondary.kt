package `21_constructor`

fun main(){

}
class Car{
    var brand:String = ""
    var color:String = ""
    var speed:Float = 0f
    var price:Float = 0f
    constructor(brand:String,color:String,speed:Float,price:Float){
        this.color = color
        this.speed = speed
        this.brand = brand
        this.price = price
    }
    constructor(brand:String){
        this.brand = brand
    }
    constructor(brand:String,color:String){
        this.brand = brand
        this.color = color
    }
    constructor(brand:String,color:String,speed: Float):this(brand,color,speed,19999f){
        this.color = color
        this.speed = speed
        this.brand = brand
        this.price = price
    }
}