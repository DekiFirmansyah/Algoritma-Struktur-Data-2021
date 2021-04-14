/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomor2;

/**
 *
 * @author PERSONAL
 */
public class Struk {
    int noTransaksi, totalHarga, jmlBarang;
    String tglBeli;
    
    public Struk(int nt, String tb, int jb, int th){
        noTransaksi = nt;
        tglBeli = tb;
        jmlBarang = jb;
        totalHarga = th;
    }
}
