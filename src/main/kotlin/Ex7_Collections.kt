fun printAll(strings: Collection<String>) {
    for (s in strings) print("$s ")
    println()
}

fun main(args: Array<String>) {
    val stringlist = listOf("one", "two", "one")
    printAll(stringlist)

    val stringset = setOf("one", "two", "three")
    printAll(stringset)
}