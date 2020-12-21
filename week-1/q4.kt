fun main(){
    println("Enter the sides of the triangle")
    val side1 =readLine()
    val side2 =readLine()
    val side3 =readLine()
    
    if(side1==side2 && side2==side3){
        println("It is an Equileteral triangle")
    }
    
    else if(side1== side2 || side2 == side3 || side3==side1){
        println("It is an Isosceles triangle")
    }
    
    else{
        println("It is a Scalene triangle")
    }
   }
