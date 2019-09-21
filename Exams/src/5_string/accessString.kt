package `5_string`

fun main(){
    var S:String = "Hello world"
    //using index
    println("index 4 using indexing:"+S[4])
    //using get()
    println("index 4 using get():"+S.get(4))
    //Iterating over string
    var i = 0
    for(index in S){
        println("index $i: $index")
        i +=1
    }
}