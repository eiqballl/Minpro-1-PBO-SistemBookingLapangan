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
   - Menggunakan perulangan while dan percabangan switch-case, program menampilkan menu interaktif (pilihan 1–6) hingga pengguna memilih menu keluar.

      <img width="310" height="184" alt="image" src="https://github.com/user-attachments/assets/7c024424-0ac0-4589-8934-8b274dd9c8c5" />

3. **Operasi Fitur Program & CRUD:**
   - **Tambah Customer (Pilihan 1):** Mengambil input idCustomer, namaCustomer, dan nomorHp, lalu menginstansiasi objek Customer baru ke dalam listCustomer.
  
     <img width="290" height="133" alt="image" src="https://github.com/user-attachments/assets/f6338049-4fa9-450d-bad5-ee09abf84c2b" />

   - **Tambah Booking Lapangan (Pilihan 2):** Mengambil input kodeBooking, idCustomer (penyewa), nomorLapangan, dan durasiJam, lalu menginstansiasi objek Booking ke dalam listBooking.
     
      <img width="242" height="145" alt="image" src="https://github.com/user-attachments/assets/4728a518-e28b-47a9-8e08-62d3bbc0c104" />

   
   - **Tampilkan Semua Data (Pilihan 3):** Menampilkan daftar lapangan yang tersedia, daftar customer yang terdaftar, serta riwayat booking beserta kalkulasi total biayanya.

     <img width="603" height="338" alt="image" src="https://github.com/user-attachments/assets/1288368b-2849-4221-874d-e46cacdf6ae2" />

   - **Hapus Booking (Pilihan 4):** Meminta input kodeBooking yang ingin dihapus, lalu menghapus objek dari listBooking jika ditemukan.
     
     <img width="611" height="350" alt="image" src="https://github.com/user-attachments/assets/6d32da6b-982f-493f-a7f3-b2a77523a9d7" />
     
     daftar booking setelah dihapus :
     
     <img width="243" height="76" alt="image" src="https://github.com/user-attachments/assets/fb38147a-aa4f-43f0-8aa9-7259c83f3ddb" />

     
   - **Keluar (Pilihan 5):** Meminta input kode booking yang ingin diubah, lalu meminta seluruh data sekaligus tanpa menanyakan data mana yang ingin diubah agar menyederhanakan sistem di kode.

      <img width="615" height="437" alt="image" src="https://github.com/user-attachments/assets/c40282c4-b781-42f8-8b6f-e2d95d2e6044" />

      Hasil setelah diganti:

      <img width="609" height="90" alt="image" src="https://github.com/user-attachments/assets/d4ff9693-e36c-49a8-9571-82e186919fd1" />

   - **Keluar (Pilihan 6):** Menghentikan perulangan program dan menutup akses Scanner.
  
     <img width="526" height="312" alt="image" src="https://github.com/user-attachments/assets/2ba62046-dbf4-424e-8983-e55466ac0658" />


     
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
