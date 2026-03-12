/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public class Pengirim {
    private String idPengirim;
    private String nama;
    
    //auto increment IdPengirim
    private static int counter = 1;
    
    //constructor
    public Pengirim(String nama){
        this.nama = nama;
        this.idPengirim = String.format("P%03d", counter++);
    }
    
    //getter
    public String getNama(){
        return nama;
    }
    
    public String getIdPengirim(){
        return idPengirim;
    }
    
}
