/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buah;

import java.text.DecimalFormat;



public final class Buah {
    private final String nama;
    private double harga;
    
    public Buah(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    public String getNama() {
        return nama;
    }
    
    public double getHarga(){
        return harga;
    }
    
    
    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat ("#,##0.00");
        String formattedHarga = decimalFormat.format(harga);
        
        return "Nama: " + nama + ",Harga: Rp " + formattedHarga;
  
    }
    public final void setHarga(double harga){
        this.harga = harga;
    }
}