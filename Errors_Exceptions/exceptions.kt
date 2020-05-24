//Exceptions in kotlin
fun  main(args: Array<String>){
    var arr = arrayOf<Int>(2,3,4,5,6)

    try {
        arr[7] = 44
        println(arr[7])
    }catch(e: Exception){

    }
    try{
        arr[8]=200
        println(arr[8])

    }catch(e: Exception){
        
    }
    arr[3]=55
    println(arr[3])
}
