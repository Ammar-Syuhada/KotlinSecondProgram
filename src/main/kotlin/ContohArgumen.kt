fun sapa(nama: String, waktu: String = "Pagi") {
    println("Halo, $nama! Selamat $waktu.")
}

fun main() {
    // Memanggil tanpa memberikan argumen 'waktu'. Nilai default digunakan.
    sapa("Aldi")

    // Memanggil dengan memberikan argumen 'waktu'. Nilai default ditimpa.
    sapa("Budi","Sore")
}