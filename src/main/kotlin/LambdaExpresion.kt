fun main() {
    // [1] Deklarasi Lambda: Menyimpan fungsi tanpa nama ke dalam variabel 'kaliDua'.
    // Lambda ini mengambil satu parameter 'x' (tipe Int) dan mengembalikan hasil perkalian x * 2.
    val kaliDua = { x: Int ->
        x * 2   // logika dari fungsi lambda.
    }

    // Pemanggilan Lambda
    // Memanggil lambda 'kaliDua' dengan argumen 5.
    println(kaliDua(5))             //Output: ?

}/*
    // [2] Deklarasi Lambda Lain: Menyimpan fungsi untuk penjumlahan.
    // Lambda mengambil dua parameter: 'a' dan 'b', dan mengembalikan hasil a + b.
    val tambah = { a: Int, b: Int -> a + b
    }

    // Memanggil lambda 'tambah' dengan argumen 3 dan 4.
    println(tambah(3, 4))                //Output: ?
}
     */