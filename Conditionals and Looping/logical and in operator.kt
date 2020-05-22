//Logical operators in kotlin
//Using logical OR(||)
//Problem statement: Take an integer and check whether it is non-zero(could be positive or negative) or zero.
fun main(args: Array<String>) {
    var num = 0
    if (num > 0 || num < 0) {
        println("The integer is non zero")
    } else {
        println("The integer is zero")
    }
//Using logical AND(&&)
/*Problem statement: Declare an integer variable and check if the value is greater than or equal to zero
  and less than or equal to five.*/
    var newNum = 4
    if (newNum >= 0 && newNum <= 5) {
        println("The value is between 0-5")
    } else {
        println("The value is not between 0-5")
    }
//Using logical NOT(!(condition))
    //if(!(newNum >= 0 && newNum <=5)
    //println("The value is not between")

//Using in operator (in)
//Problem statement: Declare a variable and check whether if it lies within a specific range
    var a = 10
    when(a){
        in 1..10 -> println("Lies between 1 and 10")
        in 11..20 -> println("Lies between 11 and 20")
        in 21..30 -> println("Lies between 21 and 30")
        else -> println("Does not lies in the specific range")
    }
}
