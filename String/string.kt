//String Functions in kotlin
//length function in string returns the length of string
fun main(args: Array<String>){
var myName = "Nikhil Kumar Prasad"
println("The length of the string is ${myName.length}") //(variablename.length) is used

 //index function returns the character at the index specified within the brackets  
println("The character is ${myName.get(4)}")   //(variablname.get(index) is used 
                                               //{} after $ sign is used for expression and functions

//subSequence function returns the substring between the start index and end index, excluding the endindex character
println(myName.subSequence(0,7))  // variablename.subSequence(start index,end index)

}
