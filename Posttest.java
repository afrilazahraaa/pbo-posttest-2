/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest;
import buah.Buah;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
/**
 *
 * @author ASUS
 */
public class Posttest {

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> daftarbuah = new ArrayList<>();
        
        
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Tambah buah");
            System.out.println("2. Lihat Daftar buah");
            System.out.println("3. Cari buah");
            System.out.println("4. Update buah");
            System.out.println("5. Hapus buah");
            System.out.println("6. Keluar");
            System.out.print("Pilihan Anda");
            
            String pilihan = scanner.nextLine();
            
            
            switch (pilihan) {
                case "1":
                    System.out.print("Masukkan Nama buah: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Harga buah: ");
                    double harga = Double.parseDouble(scanner.nextLine());
                    
                    Buah buah = new Buah(nama, harga);
                    daftarbuah.add(buah);
                    System.out.println("buah berhasil ditambahkan");
                    break;
                    
                case "2":
                    if (daftarbuah.isEmpty()) {
                        System.out.println("Daftar buah tidak ada");
                    } else {
                        System.out.println("Daftar buah: ");
                        for (Buah p : daftarbuah) {
                            System.out.println(p);
                        }
                    }
                    break;
                    
                case "3":
                    System.out.print("Masukan Nama buah yang dicari: ");
                    String namaCari = scanner.nextLine();
                    boolean ditemukan = false;
                    
                    for (Buah p : daftarbuah) {
                        if (p.getNama().equalsIgnoreCase(namaCari)) {
                            System.out.println("buah ditemukan:");
                            System.out.println(p);
                            ditemukan = true;
                            break;
                        }
                    }
                    
                    if (!ditemukan) {
                        System.out.println("buah tidak ditemukan");
                    }
                    break;
                    
                    
                case "4":
                    System.out.print("Masukan nama buah yang akan diupdate: ");
                    String namaUpdate = scanner.nextLine();
                    boolean ditemukanUpdate = false;
                    
                    for (int i = 0; i< daftarbuah.size(); i++) {
                        Buah s = daftarbuah.get(i);
                        if (s.getNama().equalsIgnoreCase(namaUpdate)) {
                            System.out.print("Masukkan Nama Baru: ");
                            String namaBaru = scanner.nextLine();
                            
                            System.out.print("Masukkan Harga Baru: ");
                            double hargaBaru = scanner.nextDouble();
                            
                            
                            buah BungaBaru = new buah(namaBaru, hargaBaru);
                            
                            
                            daftarbuah.set(i,BungaBaru);
                            
                            System.out.println("bunga berhasil diupdate");
                            ditemukanUpdate = true;
                            break;
                        }
                    }
                    
                    if (!ditemukanUpdate) {
                        System.out.println("bunga tidak ditemukan.");
                    }
                    break;
             
                    
                    
                case "5":
                    System.out.print("Masukan nama bunga yg ingin dihapus:");
                    String namabungaHapus = scanner.nextLine();

                    
                    Iterator<String> iterator = daftarbuah.iterator();
                    while (iterator.hasNext()) {
                        Buah objekbunga = iterator.next();
                        if (objekbunga.getNama().equalsIgnoreCase(namabungaHapus)) {
                            iterator.remove(); 
                        }
                    }
                    break;  
                    
                    
                    
                
                 case "6":
                    System.out.println("Terima kasih!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");     
            }
        }
 
    }
    
}
