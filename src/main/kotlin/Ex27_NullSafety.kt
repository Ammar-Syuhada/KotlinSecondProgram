fun main(args: Array<String>) {
    //The null value concept
    //this code won't work
    var maybeNumber: Int? = 15
    maybeNumber = null
    println("maybeNumber: $maybeNumber ${maybeNumber?.hashCode()}")
}