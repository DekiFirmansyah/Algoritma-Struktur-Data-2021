/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomer5;

/**
 *
 * @author PERSONAL
 */
public class Nasabah {
    String nama;
    String alamat;
    int noRek;
    Nasabah next;
    
    public Nasabah(String nama, String alamat, int noRek, Nasabah next){
        this.nama = nama;
        this.alamat = alamat;
        this.noRek = noRek;
        this.next = next;
    }
}
