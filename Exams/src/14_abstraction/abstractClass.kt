package `14_abstraction`

fun main(){
    var Iphone1 = Iphone()
    Iphone1.description()
    Iphone1.phoneDescription()
}

abstract class Phone{
    open var Color = ""
    open var Brand = ""
    open fun description(){
        println("This is a phone")
    }
    abstract fun phoneDescription()
}


class Iphone : Phone(){
    override var Color = "Black"
    override var Brand = "Iphone"
    override fun description() {
        println("This is an Iphone")
    }

    override fun phoneDescription() {
        println("This is a $Color $Brand")
    }

}