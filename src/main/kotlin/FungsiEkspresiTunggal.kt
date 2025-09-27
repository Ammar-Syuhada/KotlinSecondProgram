//fun namaFungsi(param: Tipe) = ekspresi
//
//fun namaFungsi(param: Tipe): Tipe {
//    return ekspresi
//}

fun fullNameBiasa(firstName: String, lastName: String) : String {
    return firstName +" " + lastName
}
fun fullNameSama(firstName: String, lastName: String) : String {
    return "$firstName $lastName"
}
fun fullName(firstName: String, lastName: String) : String = firstName +" " + lastName

fun main() {
    println("===Registrasi Akun===")
    print("Nama Depan : ")
    val namaDepan = readLine()!!
    print("Nama Belakang : ")
    val namaBelakang = readLine()!!

    println("\nSelamat datang kembali, ${fullNameBiasa(namaDepan, namaBelakang)}")
}
