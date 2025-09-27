fun main() {
    cetakNama("Izul", 3)
}
fun cetakNama(nama: String, jumlah: Int) {
    var i = 1
    while (i <= jumlah) {
        println("Halo $nama ke-$i")
        i++
    }
}


