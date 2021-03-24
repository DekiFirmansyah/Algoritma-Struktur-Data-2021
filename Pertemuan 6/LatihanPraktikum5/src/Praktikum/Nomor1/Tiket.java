/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomor1;

/**
 *
 * @author PERSONAL
 */
public class Tiket {
    public String maskapai, asal, tujuan;
    public int harga;
    
    public Tiket(String m, int h, String a, String t){
        maskapai = m;
        harga = h;
        asal = a;
        tujuan = t;
    }
    
    void tampil(){
        System.out.println("Nama maskapai : " + maskapai);
        System.out.println("Harga maskapai : " + harga);
        System.out.println("Asal penerbangan : " + asal);
        System.out.println("Tujuan penerbangan : " + tujuan);
        
    }
}
