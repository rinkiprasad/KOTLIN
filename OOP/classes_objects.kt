//Class in kotlin
data class Dog(var breed: String, var colour: String, var age:Int) {          //Primary constructor
   
    fun bark(){
        println(" ${breed}s bark")      //Created member function
    }
    fun eat(){
        println(" ${breed}s eat food ")
    }
}


fun main(args: Array<String>){
    var dogA = Dog("German Shepherd","Black and tan",4)           //Creaating object of a class Dog
    println(dogA)
    dogA.bark()
    dogA.eat()

    var dogB = Dog("Bulldog","White",2)
    println(dogB)
    dogB.bark()                                                   //Using dot operator to print the memeber function
    dogB.eat()
}
