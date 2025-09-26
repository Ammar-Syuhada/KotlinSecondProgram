fun main(args: Array<String>) {
    //Continue & Break Label
    println("Example of Break and Continue Label")
    mylabel@ for (x in 1..10) { //appling the custom label
        if (x==5) {
            println("I am inside if block with value" +x+"\n-- hence it will close the operation")
            break@mylabel
        } else {
            println("I am inside else block with value $x")
            continue@mylabel
        }
        println("Not Print")
    }
}