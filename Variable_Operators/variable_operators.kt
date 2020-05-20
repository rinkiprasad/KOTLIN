//Variable_Operators in kotlin
//Declaring of MAIN FUNCTION
fun main(args: Array<String>){


//VARIABLE in kotlin
//(literals can be changed in var type)
var myName : String = "Nikhil Kumar Prasad"
println(myName)

//(literals cannot be changed in val type)
val myBirthDate : Int = 14
println(myBirthDate)


//OPERATORS in kotlin
//(Arithmetic operators)
val myFirstNum: Double = 12.5
val mySecondNum: Double = 4.5
var result : Double
 result = myFirstNum + mySecondNum
 println("Addition result is $result")  /* $ sign is used to concatenate values of variables with a piece of strings 
                                           to print a meaningful output*/
 result = myFirstNum - mySecondNum   
 println("Subtraction result is $result")
 result = myFirstNum * mySecondNum
 println("Multiplication result is $result")
 result = myFirstNum / mySecondNum
 println("Division result is $result")
 result = myFirstNum % mySecondNum
 println("Modulus result is $result")

//(Comparison operators)
//For comparison operators output can only be Boolean  
val myFirst: Double = 4.5
val mySecond: Double = 3.8
var results : Boolean
 results = myFirst == mySecond
 println(results)
 results = myFirst != mySecond
 println(results)
 results = myFirst <= mySecond
 println(results)
 results = myFirst >= mySecond
 println(results)

 //(Assignment operators)
var numOne = 22  //Type inference, compiler can automatically identify the data type of variable by its literal value
var numTwo = 4   // Here the literal value is Int type which is automatically identified, hence we dont need to mention 
var numThree = 100
var numFour = 6
 numOne += numTwo
 println(numOne)
 numThree -= numTwo
 println(numThree)
 numTwo *= numFour
 println(numTwo)
 numThree /= numFour
 println(numThree)
 numOne %= numFour
 println(numOne)

 //(Increment & Decrement operators)
 var num_one = 14
 var num_two = 5
 num_one++ //postfix
 println(num_one)
 num_two--
 println(num_two)
 ++num_one
 println(num_one) //prefix
}
