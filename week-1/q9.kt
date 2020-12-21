fun main(args: Array<String>){
  println("Enter a number")
  val n:Int=readLine()!!.toInt()
  var sum:Long=0
  for(i in 1..n){
    if(i%2==0){
      sum=sum+i
    }
    }
    println("Sum of all even numbers till $n is $sum")
}
