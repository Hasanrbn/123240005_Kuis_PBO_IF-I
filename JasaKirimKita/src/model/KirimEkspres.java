/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public class KirimEkspres extends PaketKiriman implements DiskonOngkir{
    public KirimEkspres(double ongkirDasar, double hargaPaket) throws DataKirimTidakValidException{
        super("Paket Kirim Ekspres", ongkirDasar, hargaPaket);
    }
    
    // override
    @Override
    public double hitungTotalHarga(){
        if (ongkirDasar >= 30000){
            return getOngkirDasar() - ongkirDasar + 5000;
        }
        return getOngkirDasar() + 5000;
    }

    @Override
    public void cetakInfoDiskon() {
        System.out.println("Dapet diskon...");
    }
    
}
