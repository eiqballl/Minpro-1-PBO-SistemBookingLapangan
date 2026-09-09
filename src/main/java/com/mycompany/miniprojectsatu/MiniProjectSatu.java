/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniprojectsatu;

/**
 *
 * @author Acer
 */

import model.Lapangan;
import model.Customer;
import model.Booking;
import java.util.ArrayList;
import java.util.Scanner;

public class MiniProjectSatu {
    public static void main(String[] args) {
//        ArrayList untuk menyimpan data 3 class
        ArrayList<Customer> listCustomer = new ArrayList<>();
        ArrayList<Lapangan> listLapangan = new ArrayList<>();
        ArrayList<Booking> listBooking = new ArrayList<>();

//        Inisialisasi data 4 Lapangan
        listLapangan.add(new Lapangan(1, "Vinyl", 60000));
        listLapangan.add(new Lapangan(2, "Vinyl", 60000));
        listLapangan.add(new Lapangan(3, "Wooden", 60000));
        listLapangan.add(new Lapangan(4, "Wooden", 60000));

        Scanner input = new Scanner(System.in);
        int pilihan = 0;

        while (pilihan != 6) {
            System.out.println("\n=========================================");
            System.out.println("=== SISTEM BOOKING LAPANGAN BADMINTON ===");
            System.out.println("=========================================");
            System.out.println("1. Tambah Customer ");
            System.out.println("2. Tambah Booking Lapangan ");
            System.out.println("3. Tampilkan Semua Data ");
            System.out.println("4. Hapus Booking ");
            System.out.println("5. Update Booking");
            System.out.println("6. Keluar");
            System.out.print("Pilih Menu (1-5): ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.println("\n+++++++++++++++++++++++");
                    System.out.println("+++ TAMBAH CUSTOMER +++");
                    System.out.println("+++++++++++++++++++++++");
                    System.out.print("ID Customer (contoh A1) : ");
                    String idCustomer = input.nextLine();
                    System.out.print("Nama                    : ");
                    String namaCustomer = input.nextLine();
                    System.out.print("Nomor WhatsApp          : ");
                    String nomorHp = input.nextLine();

                    listCustomer.add(new Customer(idCustomer, namaCustomer, nomorHp));
                    System.out.println("Data Customer berhasil disimpan!");
                    break;

                case 2:
                    System.out.println("\n+++++++++++++++++++++++++++++++");
                    System.out.println("+++ TAMBAH BOOKING LAPANGAN +++");
                    System.out.println("+++++++++++++++++++++++++++++++");
                    System.out.print("Kode Booking (contoh A11) : ");
                    String kodeBooking = input.nextLine();
                    System.out.print("ID Customer Penyewa      : ");
                    String idPenyewa = input.nextLine();
                    System.out.print("nomor Lapangan           : ");
                    int nomorLapangan = input.nextInt();
                    System.out.print("Durasi Main (Jam)        : ");
                    int durasiJam = input.nextInt();

                    listBooking.add(new Booking(kodeBooking, idPenyewa,nomorLapangan, durasiJam));
                    System.out.println("Data Booking berhasil disimpan!");
                    break;

                case 3:
                    System.out.println("\n============================================");
                    System.out.println("#########  DATA LAPANGAN TERSEDIA  #########");
                    System.out.println("============================================");
                    for (Lapangan l : listLapangan) {
                        System.out.println("- Lapangan: " + l.nomorLapangan + " | Karpet: " + l.jenisKarpet + " | Rp " + l.hargaPerJam + "/jam");
                    }
                    
                    System.out.println("\n=========================");
                    System.out.println("==== DAFTAR CUSTOMER ====");
                    System.out.println("=========================");
                    if (listCustomer.isEmpty()) {
                        System.out.println("(Belum ada data customer)");
                    } else {
                        for (Customer c : listCustomer) {
                            System.out.println("- [" + c.idCustomer + "] | " + c.namaCustomer + " | No HP: " + c.nomorHp);
                        }
                    }
                    
                    System.out.println("\n===============================");
                    System.out.println("=== DAFTAR BOOKING LAPANGAN ===");
                    System.out.println("===============================");
                    if (listBooking.isEmpty()) {
                        System.out.println("   (Belum ada data booking)");
                    } else {
                        for (Booking b : listBooking) {
                            System.out.println("- Kode: " + b.kodeBooking + " | ID Customer: " + b.idCustomer 
                                + " | No Lap: "+ b.nomorLapangan +" | Durasi: " + b.durasiJam + " Jam | Total Biaya: Rp " + b.hitungTotalBiaya());
                        }
                    }
                    break;

                case 4:
                    System.out.println("---------------------");
                    System.out.println("--- HAPUS BOOKING ---");
                    System.out.println("----------------------");
                    System.out.print("Masukkan Kode Booking yang dihapus: ");
                    String kodeHapus = input.nextLine();
                    boolean adaHapus = false;

                    for (int i = 0; i < listBooking.size(); i++) {
                        if (listBooking.get(i).kodeBooking.equalsIgnoreCase(kodeHapus)) {
                            listBooking.remove(i);
                            System.out.println("Data booking berhasil dihapus!");
                            adaHapus = true;
                            break;
                        }
                    }
                    if (!adaHapus) System.out.println("Kode Booking tidak ditemukan!");
                    break;
                
                case 5:
                System.out.println("\n=======================");
                    System.out.println("=== UPDATE BOOKING ===");
                    System.out.println("=======================");
                    System.out.print("Masukkan Kode Booking yang ingin diubah: ");
                    String kodeEdit = input.nextLine();
                    boolean adaEdit = false;

                    for (Booking b : listBooking) {
                        if (b.kodeBooking.equalsIgnoreCase(kodeEdit)) {
                            System.out.println("Data ditemukan! Masukkan data baru:");
                            
                            System.out.print("ID Customer Baru         : ");
                            b.idCustomer = input.nextLine();
                            
                            System.out.print("Nomor Lapangan Baru      : ");
                            b.nomorLapangan = input.nextInt();
                            
                            System.out.print("Durasi Main (Jam) Baru   : ");
                            b.durasiJam = input.nextInt();

                            System.out.println("Data booking berhasil diperbarui!");
                            adaEdit = true;
                            break;
                        }
                    }
                    if (!adaEdit) {
                        System.out.println("Kode Booking tidak ditemukan!");
                    }
                    break;
                
                case 6:
                    System.out.println("\nProgram selesaiii, terima kasih!");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid!");
                    break;
            }
        }
        input.close();
    }
}
