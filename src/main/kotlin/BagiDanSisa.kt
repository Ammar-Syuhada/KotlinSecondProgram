fun bagiDanSisa(a: Int, b: Int): Pair<Int, Int> {
    val bagi = a / b
    val sisa = a % b
    return Pair(bagi, sisa)
}

fun main() {
    val (hasilBagi, hasilSisa) = bagiDanSisa(10, 3)
    println("Bagi: $hasilBagi, Sisa: $hasilSisa")
}

//fun namaFungsi(param: Tipe): Pair<Tipe1, Tipe2> {
//    return Pair(nilai1, nilai2)
//}
