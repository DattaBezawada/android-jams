fun main(args: Array<String>){
    val x=readLine()?.single()
    when{
    (x in 'a'..'z' || x in 'A'..'Z')->println("$x is a alphabet")
    
    else->println("$x is not a alphabet")
    }   
}
