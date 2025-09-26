fun main(args: Array<String>) {
    var(x,y) = bigsSmall(5,3)
    println("Nilai x = $x")
    println("Nilai y = $y")
}

fun bigsSmall(a: Int, b: Int): Pair<Int, Int> {
    if (a > b) return Pair(a,b)
    else {
        return Pair(b,a)
    }
}
