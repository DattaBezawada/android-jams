fun main(args: Array<String>){
  println("Enter any three numbers")
  val x:Int=readLine()!!.toInt()
  val y:Int=readLine()!!.toInt()
  val z:Int=readLine()!!.toInt()
  var factx:Long=1
  var facty:Long=1
  var factz:Long=1
  var fact:Long
  for(i in 1..x){
    factx=factx*i
  }
  for(i in 1..y){
    facty=facty*i
  }
  for(i in 1..z){
    factz=factz*i
  }

  fact=factx+facty+factz
  println("Sum of Factorials of given numbers $x,$y,$z are $fact")
} 
