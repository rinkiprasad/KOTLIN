import java.util.*

//Array in kotlin
//In val variable elements of array can be changed one by one but size cannot change
//In var variable elements of array can be changed all together but size cannot change 

//Declaring array 
//_______________var/val nameOfArray = arrayOf<Data_type>(elements)________________
fun main(args: Array<String>) {
    var myCharArray = arrayOf<String>("Hi", "this", "is", "me")  //array containing string type elements
    val myArray = arrayOf<Int>(5, 4, 3, 2, 1)  //array containing int type elements
    var arr = arrayOf<Any>("my", 'a', 7.8, 114) //array containing all type of elements

//Using get() function which return the value/element stored at a particular index in the array 
    println(myCharArray.get(0))
//Alternate of using get() is using indexing[]
    println(myCharArray[0])  //Both line 13 and 15 returns the same value

//Changing the value of array 
    myArray[3] = 7
    println(myArray[3])  //New value at index 3 will be printed

//To check the size of an array
    println(myArray.size)  //number of elements inside the array will be printed and not the index

//To print all the elements of an array we have to import java.until.* to use the Arrays.toString() function
    println(Arrays.toString(myArray))
}


                                       
