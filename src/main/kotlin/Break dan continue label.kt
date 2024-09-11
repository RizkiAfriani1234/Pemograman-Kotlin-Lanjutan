fun main(args: Array<String>) {
    println("Example of break and contiunue label")
    myLabel@ for (x in 1..10){
        if (x == 5){
            println("I am inside if block whit value"+x+"\n-- hence it will close the operatoration")
            break@myLabel
        }else{
            println("I am inside else block whit value"+x)
            continue@myLabel
        }
        println("Not Print")
    }
}