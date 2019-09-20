fun main(){
    var a = 1

    if(a>10){
        println("a는 10보다 크다")
    }
    else if(a<10) {
        println("a는 10보다 작다")
    }

    if (a is Int){
        println("자료형 호환")
    }

    dowhen(2)

}

fun dowhen(a:Any){
    when(a){
        1 -> print("echi")
        2 -> print("ni")
    }
}