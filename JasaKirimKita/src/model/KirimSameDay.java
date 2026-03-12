/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public class KirimSameDay extends PaketKiriman{
    public KirimSameDay(double ongkirDasar, double hargaPaket) throws DataKirimTidakValidException{
        super("Paket Kirim SameDay", ongkirDasar, hargaPaket);
    }
    
    // override
    @Override
    public double hitungTotalHarga(){
        return getOngkirDasar();
    }
}
