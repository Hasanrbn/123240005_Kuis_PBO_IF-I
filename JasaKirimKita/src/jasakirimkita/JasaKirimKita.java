/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jasakirimkita;
import model.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lab Informatika
 */
public class JasaKirimKita {
    static ArrayList<Pengirim> daftarPengirim = new ArrayList<>();
    static ArrayList<PaketKiriman> daftarPaket = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Scanner sc = new Scanner(System.in)){
            int pilihan = 0;
                do{
                // tampilkan menu
                    System.out.println("1.Tambah Pengiriman");
                    System.out.println("2. Keluar");
                    System.out.print("Pilih Menu : ");
                    try {
                        pilihan = Integer.parseInt(sc.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("ERROR...");
                        continue;
                      } if (pilihan == 1) tambahPesanan(sc);
                } while (pilihan != 2);
                  tampilkanRekap();
            }
        }
        static void tambahPesanan(Scanner sc){
            System.out.println("---- DATA PENGIRIM ----");
            System.out.print("Nama : ");
            String nama = sc.nextLine().trim();
            
            System.out.println("---- DATA PAKET ----");
            System.out.print("Harga paket/barang : ");
            double hd;
            try{
                hd = Double.parseDouble(sc.nextLine().trim());
            } catch(NumberFormatException e){
                return;
            }
            System.out.println("Ongkos kirim dasar: ");
            double okd;
            try{
                okd = Double.parseDouble(sc.nextLine().trim());
            } catch(NumberFormatException e){
                return;
            }
            daftarPengirim.add(new Pengirim(nama));
            System.out.println("OK, Berhasil");
            
        }
    }
    static void tampilkanRekap(){
        for (int i=0; i < daftarPengirim.size(); i++){
            Pengirim pg = JasaKirimKita.daftarPaketget(i);
            System.out.println("Pengirim : ", Pengirim);
            System.out.println("Paket : ", namaPaket);
            System.out.println("Total : Rp 0f%n", pk.hitungTotalHarga());
            if (pk instanceof cetakInfoDiskon()) {
                
            }
        }
    }
}
