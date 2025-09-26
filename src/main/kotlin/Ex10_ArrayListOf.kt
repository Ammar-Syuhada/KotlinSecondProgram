fun main(args: Array<String>) {
    //Array lists (mutable) bisa diubah

    /*
    Method:
        clear(), contains(), size(), get(), add() or +=, remove or -=,
        removeAt(), toTypedArray(), LastIndexOf(), removeAll, reverse()
     */
    val arrayList = arrayListOf(1, 2, 3)
    print("ArrayList array : ")
    for (item in arrayList) {
        print("$item ")
    }
    print('\n')

    arrayList += 9
    print("Tambahkan elemen 9 dalam arrayList: ")
    println(arrayList)

    arrayList.reverse()
    print("Reverse arrayList: ")
    println(arrayList)

    arrayList -= 1 //we can delete!
    print("Remove last elemen in arrayList : ")
    println(arrayList)

    arrayList += (1..5)
    print("Add range in arrayList : ")
    println(arrayList)
}