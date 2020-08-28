import java.util.*
import kotlin.math.PI

val input = Scanner(System.`in`)

fun main() {
    println("==========Masukkan Data Diri Anda===========")
    print("Nama : ")
    val nama: String? = input.nextLine()
    if (nama.isNullOrEmpty()) {
        println("Mohon Isi Nama Anda!")
        main()
    }
    print("Kelas : ")
    val kelas = input.nextLine()
    print("Nomor Absen : ")
    val noabs = input.nextInt()

    print(
        """============================================
Anda ingin menghitung apa
1. Volume Kerucut
2. Volume Tabung
3. Batal
============================================

    """.trimIndent()
    )
    val input = Scanner(System.`in`)
    print("Pilihan Anda : ")
    val inputPilihan = input.nextInt()
    val pilih = if (inputPilihan == 1) {
        println("===============Masukkan Angka===============")
        print("Jari-jari Kerucut : ")
        val jari2 = input.nextDouble()
        print("Tinggi Kerucut : ")
        val tinggi = input.nextDouble()
        volumeKerucut(jari2, tinggi)

    } else if (inputPilihan == 2) {
        println("===============Masukkan Angka===============")
        print("Jari-jari Tabung : ")
        val jari2 = input.nextDouble()
        print("Tinggi Tabung : ")
        val tinggi = input.nextDouble()
        volumeTabung(jari2, tinggi)
    } else if (inputPilihan == 3) {
        print("Dadahh!!")
    } else
        println("Menu Tidak Tersedia")
}

fun volumeKerucut(jari2: Double, tinggi: Double): Double {
    val vk = PI * jari2 * jari2 * tinggi /3
    println("============================================")
    System.out.printf("Jadi volume Kerucut = %.2f",vk)
    return jari2
}

fun volumeTabung(jari2: Double, tinggi: Double): Double{
    val vt = PI * jari2 * jari2 * tinggi
    println("============================================")
    System.out.printf("Jadi volume Tabung = %.2f",vt)
    return jari2
}

















