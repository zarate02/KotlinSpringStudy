/*
함수
 */

fun main(){
    println(add(1,2))   //단일표현식 지원
    println(add2(1,2))  //일반함수
}

fun add(a: Int, b: Int) = a + b


fun add2(a: Int, b: Int): Int{
    return a + b
}