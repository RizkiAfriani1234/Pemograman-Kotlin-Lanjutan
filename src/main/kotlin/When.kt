fun main(args: Array<String>) {
    var x: Int = 5
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println(" x is neither 1 or 2")
        }
    }

    x = 2
    when (x) {
        1, 2 -> println(" value of x either 1,2")
        else -> {
            println(" x is neither 1 nor 2")
        }
    }
}