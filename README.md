# SISTEM BOOKING LAPANGAN BADMINTON

## Latar Belakang
Program ini merupakan Sistem berbasis Java yang dibuat untuk memenuhi tugas Mini Project 1 Pemrograman Berorientasi Objek (PBO). Sistem ini bermaksud untuk mempermudah pengelolaan jadwal dan pemesanan lapangan badminton secara terstruktur.


## Deskripsi Singkat Program
Sistem Booking Sewa Lapangan Badminton ini adalah program berbasis CLI (Command Line Interface) yang menangani manajemen pemesanan lapangan secara dinamis. Program ini menerapkan konsep dasar PBO dengan mengelola data pelanggan, ketersediaan lapangan, dan transaksi pemesanan secara real-time dalam memori menggunakan ArrayList.


## Penjelasan Alur Program
1. **Inisialisasi Awal:**
   - Program membuat tiga ArrayList untuk menampung objek Customer, Lapangan, dan Booking.
   - Lalu sedari awal sistem mendaftarkan 4 data objek Lapangan ke dalam memori (Lapangan 1 & 2 jenis Vinyl, Lapangan 3 & 4 jenis            Wooden dengan harga Rp 60.000/jam).

2. **Menu Utama:**
   - Menggunakan perulangan while dan percabangan switch-case, program menampilkan menu interaktif (pilihan 1–5) hingga pengguna memilih menu keluar.

3. **Operasi Fitur Program & CRUD:**
   - **Tambah Customer (Pilihan 1):** Mengambil input idCustomer, namaCustomer, dan nomorHp, lalu menginstansiasi objek Customer baru ke dalam listCustomer.
   - **Tambah Booking Lapangan (Pilihan 2):** Mengambil input kodeBooking, idCustomer (penyewa), nomorLapangan, dan durasiJam, lalu menginstansiasi objek Booking ke dalam listBooking.
   - **Tampilkan Semua Data (Pilihan 3):** Menampilkan daftar lapangan yang tersedia, daftar customer yang terdaftar, serta riwayat booking beserta kalkulasi total biayanya.
   - **Hapus Booking (Pilihan 4):** Meminta input kodeBooking yang ingin dihapus, lalu menghapus objek dari listBooking jika ditemukan.
   - **Keluar (Pilihan 5):** Menghentikan perulangan program dan menutup akses Scanner.

     
## Penjelasan Letak Penerapan Nilai Tambah

Pada program ini juga diimplementasikan beberapa kode/fitur untuk nilai tambah sebagai berikut:

1. **Penerapan Access Modifier:**
   - **Letak:** Deklarasi variabel atribut dan metode pada class Booking, Customer, dan Lapangan di dalam package model, serta pada metode utama main di MiniProjectSatu.
   - **Penjelasan:** Penggunaan keyword access modifier public menentukan tingkat aksesibilitas antar kelas secara jelas, di mana            atribut dan constructor dari package model dapat diakses dari kelas utama yaitu MiniProjectSatu.

2. **Penerapan Encapsulation:**
   - **Letak:** Class Booking pada metode hitungTotalBiaya().
   - **Penjelasan:** Menerapkan encapsulation/pembungkusan data dan fungsi di mana perhitungan total biaya lapangan disembunyikan di         dalam kelas Booking. jadi di MiniProjectSatu.java hanya perlu memanggil metode b.hitungTotalBiaya() tanpa perlu tahu rumus              perhitungannya.

3. **Penerapan Validasi Input:**
   - **Letak:** Menu 3 (Tampilkan Data) dan Menu 4 (Hapus Booking) pada MiniProjectSatu.java.
   - **Penjelasan:** 
    - **Pengecekan Data Kosong:** Menggunakan .isEmpty() untuk memvalidasi apakah ArrayList berisi data atau tidak sebwelum melakukan perulangan.
    - **Pencarian Kode Booking:** Menggunakan .equalsIgnoreCase() untuk memvalidasi kesesuaian index kodeBooking yang diinput pengguna tanpa terpengaruh oleh bentuk huruf besar/kecil, serta penggunaan adaHapus untuk menampilkan pesan validasi jika kode tidak ditemukan.
