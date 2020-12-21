fun main(){
    println("Enter a number")
    val a:Int=readLine()!!.toInt()
    if(a%5==0 && a%11==0){
        println("$a is divisible by 5 and 11")
    }
    else{
        println("$a is not divisible by 5 and 11")
    }
}
