//for loop in array is used to traverse through the array and print the elements.

fun main(args: Array<String>){
  var arr = arrayOf<Int>(2,3,4,5,6)
  for(i in 0 until arr.size){          //until keyword is used to exclude the upper limit from the range
    println("${arr[i]}")               //until is alternate of this -for(i in 0 .. arr.size-1) 
  }
}  
