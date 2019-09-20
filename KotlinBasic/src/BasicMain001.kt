/*
1강
 */

fun main(){

    /*
    변수선언법
    var 일반변수
    val 선언시초기화 = final
    null을 사용하기위해서는 특별해야한다
     */
    var nomalVar = "helloWorld"
    var notnullVar: Int
    var nullVar: Int?=null
    val finalVar = "helloFinalWorld"
    val charVar = 'g'
    val stringVar = """ggggggg""""

    nomalVar = "helloVarWorld"
    //finalVar = "hellovalWorld"  //에러발생

    println(nomalVar)
    println(finalVar)
    //println(notnullVar)   //에러발생
    println(nullVar)
    println(stringVar)
}