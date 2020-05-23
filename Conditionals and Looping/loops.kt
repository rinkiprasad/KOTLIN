//Loops in kotlin
//for loop
fun main(args: Array<String>){
   for(i in 1..10){
     println(i)    //in for loop default increment of iterator happens by 1
   } 

//while loop
   var a = 1       //initialize the value
   while(a<=10){
     println(a)    
     a++           //manually incrementing the value
   } 
 
//do-while loop
   var b = 1
   do{
     println(b)
     b++           //manually incrementing the value
     }
   while(b<=10)  
}
