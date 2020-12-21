fun main(args: Array<String>){
  println("Enter a number")
  val number:Int=readLine()!!.toInt()
  var originalNum:Int
  var result=0
  var remainder:Int
  var n=0
 
  originalNum=number

  while (originalNum != 0) {
    originalNum=originalNum/10
    ++n
  }

  originalNum=number

  while(originalNum!=0){
    remainder=originalNum%10;
    result=result+Math.pow(remainder.toDouble(),n.toDouble()).toInt()
    originalNum=originalNum/10
  }

  if(result==number)
    println("Given number $number is a Amstrong number")
  else
    println("Given number $number is not a Amstrong number")
 }
