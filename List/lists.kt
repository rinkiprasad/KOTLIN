//List in kotlin
//Immutable list
//Declaring immutable list
//________________val/var listName = listOf<Data_type>(list_of_items)_________________
fun main(args: Array<String>){
  val newList = listOf<String>("Hello","world")
  println(newList)           //Immutable lists have fixed size and fixed values
                             //newList. (press: Ctrl+Space) to see the function which can be used in lists

//Mutable list
//Declaring mutable list
//________________val/var listName = mutableListOf<Data_type>(list_of_items)________________
  var list = mutableListOf<String>("My","name","is","Nikhil")
  println(list)             //In mutable lists elements can be added as well as altered in mutable lists
  list[3] = "Neil"
  println(list)
  list.add("Kumar")         //Adding element in the list 
  println(list)
  list.add(1, "nick")       //Addig element at a particullar index of the list
  println(list)
  list.removeAt(5)          //For removing the element from the list at a particular index
  println(list)
  val arr = arrayOf<String>("I","love","coding")
  list.addAll(arr)          //Adding an array to the list
  println(list)
}  
