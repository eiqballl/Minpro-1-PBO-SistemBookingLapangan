/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Acer
 */
public class Booking {
    public String kodeBooking;
    public String idCustomer; 
    public int nomorLapangan;
    public int durasiJam;

    // Constructor
    public Booking(String kodeBooking, String idCustomer, int nomorLapangan, int durasiJam) {
        this.kodeBooking = kodeBooking;
        this.idCustomer = idCustomer;
        this.nomorLapangan = nomorLapangan;
        this.durasiJam = durasiJam;
    }

    // Method hitung total biaya 
    public double hitungTotalBiaya() {
        return durasiJam * 60000;
    }
}
