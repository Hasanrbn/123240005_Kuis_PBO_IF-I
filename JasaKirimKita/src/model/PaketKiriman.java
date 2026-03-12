/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public abstract class PaketKiriman {
    private String namaPaket;
    double ongkirDasar;
    double hargaPaket;
    
    public PaketKiriman(String namaPaket, double ongkirDasar, double hargaPaket) throws DataKirimTidakValidException{
        if (ongkirDasar <= 0) throw new DataKirimTidakValidException("Harga ongkir dasar tidak boleh kurang dari sama dengan 0!...");
        
        this.namaPaket = namaPaket;
        this.ongkirDasar = ongkirDasar;
        this.hargaPaket = hargaPaket;
    }
    
    public String getNamaPaket(){
        return namaPaket;
    }
    
    public double getOngkirDasar(){
        return ongkirDasar;
    }
    
    public double getHargaPaket(){
        return hargaPaket;
    }
    
    public abstract double hitungTotalHarga();
}
