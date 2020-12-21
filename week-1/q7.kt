fun main(args: Array<String>){
     println("Enter a number")
     val x:Int=readLine()!!.toInt()
     var fact:Long=1
     for(i in 1..x){
       fact=fact*i
     }
     println("Factorial of given number $x is $fact")
   }
