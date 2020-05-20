//Function in kotlin
//function with return type
 fun main(args: Array<String>){
        println("The result of Addition is ${addition(22,88)}")
        println("The result of Subtraction is ${subtraction(20,10)}")
        println("The result of Multiplication is ${multiplication(5,6)}")
        println("The result of Division is ${division(40.5,10.8)}")
        newDivision(20.5,5.5)
        newFunction()
    }
    fun addition(numOne: Int, numTwo: Int): Int{    // New function cannot be created within a existing function
        return  numOne + numTwo
    }
    fun subtraction(numOne: Int, numTwo: Int): Int{
        return (numOne - numTwo)
    }
    fun multiplication(numOne: Int, numTwo: Int): Int{
        return (numOne * numTwo)
    }
    fun division(numOne: Double, numTwo: Double): Double {
        return numOne / numTwo
    }
    fun newDivision(numOne: Double, numTwo: Double): Double{
        val result = numOne / numTwo
        println("The result of Another Division is $result")  //Printing the output withtin the body of user defined function 
        return result
    }

//function without any argument and wihtout return type
    fun newFunction(){
        println("I am your new Function")
    }

//expression body function
    fun newFunction() = println("I am your new Function")
    
