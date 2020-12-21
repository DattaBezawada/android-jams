fun main(args: Array<String>){
  println("Enter a three digit number")
  val number:Int=readLine()!!.toInt()
  var originalNum:Int
  var result=0
  var remainder:Int

  originalNum=number

  while(originalNum!=0){
    remainder=originalNum%10;
    result=result+Math.pow(remainder.toDouble(),3.0).toInt()
    originalNum=originalNum/10
  }

  if(result==number)
    println("Given number $number is a Amstrong number")
  else
    println("Given number $number is not a Amstrong number")
 }
