fun main(args: Array<String>){
  println("Enter the height of required pyramid")
  val n:Int=readLine()!!.toInt()
  for(i in 1..n){
      for(j in 1..i){
        print("#")
      }
      println()
    }
}
 
