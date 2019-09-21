package `2_History_and_Features`

fun main(){
    var Apple = Book("Apple", "John")
    print(Apple.author)
}
data class Book(var title:String,var author:String)