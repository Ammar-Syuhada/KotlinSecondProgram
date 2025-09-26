fun main(args: Array<String>) {
    //while loop
    var x:Int = 0
    println("Example of While Loop--")
    while (x <= 10) {
        print("$x ")
        x++
    }
    println()

    //Do-While Loop
    var y:Int = 0
    do {
        y = y +10
        println("I am inside do Block--- $y")
    } while (y <= 50)
}