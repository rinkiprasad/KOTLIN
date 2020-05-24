//Array list in kotlin same as mutable list in kotlin 
//Is used to add elements and alter the existing elements
//Declaring array list 
//_____________var/val listName = arrayListOf<Data_type>(list_of_elements)__________
fun main(args: Array<String>){
  var list = arrayListOf<Int>()
  var arr = arrayOf<Int>(2,3,4,5)
  list.addAll(arr)                   //Adding array elements to list 
  println(list)
  list.add(4)                        //Adding new elements to the list
  println(list)
  list.add(2,10)                     //Adding a new element at a particular index
  println(list)
}  
