package `4_Arrays`
fun main(){
    var a = arrayOf(1,2,3,4,5,6)
    var b = Array(10){p->p}
    println(a[0]) //accessing array's element
    a[2] = 5 //modifying array
    println(a[2])
    for (i in b){
        println("el:"+i)

    }
    var c = a.map {i -> i+1  }
    print(c)

}