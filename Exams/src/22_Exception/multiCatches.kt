package `22_Exception`

import java.lang.ArithmeticException
import java.lang.Exception

fun main(){
 try {
     println(10/0)
 }catch (e:ArrayIndexOutOfBoundsException){
     println("Array out of bound catch block")
 }catch (e:ArithmeticException){
     println("ArithmeticException catch block")
 }
}