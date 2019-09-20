/*
형변환
배열
 */
fun main(){
    /*형변환*/
    var StringVar  = "1"
    var IntVar = StringVar.toInt() + 1

    println(IntVar)

    /*배열*/
    var intArr = arrayOf(1,2,3,4,5)
    var nullArr = arrayOfNulls<Int>(5)

    println(intArr[2])
}