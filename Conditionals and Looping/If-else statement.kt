//If-else statement in kotlin
fun main(args: Array<String>){
    var a= 10
    var b=  0
    if(b==0){
        println("The division cannot be performed")
    }
    else{
        println(a/b)
    }

    //Problem statement: Declare two integer variable and tell which of them is the greatest number.
    var c = 44
    var d = 24
    if(c>d){
        println("The integer c is greater than d ")
    }
    else{
        println("The Integer d is greater than c")
    }

    //Nested if-else in kotlin
    /*Considering the same problem statemenet mentioned above but what if we have to print an statement where
      both the integer are equal in such cases nested if-else can be used*/
    var e = 4
    var f = 6
    if(e>f){
        println("The integer e is greater")
    }
    else if(f>e){
        println("The integer f is greater")
    }
    else
        println("The integer e and f are equal")


    //When expression in kotlin
    //Are especially used when there are so many conditions
    //Problem statement: Declare an integer variable and use the 'when'expression to print the integers in words.
    val num = 2
    when(num){
        0 -> println("Zero")
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        else -> println("None of the above")
    }
/*Problem statement: Declare a integer variable and print 'positive' if the number is greater than zero,
  'negative' if the number is less than zero, and 'zero' if the number is zero.*/
  var newNum = 2
  when{
    newNum > 0 -> println("positive")
    newNum < 0 -> println("negative")
    else -> println("zero")
  }
}
    
