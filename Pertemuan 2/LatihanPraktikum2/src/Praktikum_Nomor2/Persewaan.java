/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_Nomor2;

/**
 *
 * @author PERSONAL
 */
public class Persewaan {
    int id, lamaPinjam, hargaSewa;
    String namaMember, namaGame;
    
    void tampilData(){
        System.out.println("ID member : " + id);
        System.out.println("Nama member : " + namaMember);
        System.out.println("Nama game : " + namaGame);
        System.out.println("Lama pinjam : " + lamaPinjam);
        System.out.println("Harga sewa/hari : " + hargaSewa);
        
    }
    int hargaTotal(){
        int total = lamaPinjam * hargaSewa;
        return total;
        
    }
    public static void main(String[] args) {
        Persewaan p1 = new Persewaan();
        
        p1.namaMember = "Deki Firmansyah";
        p1.id = 12345678;
        p1.namaGame = "PES 2021";
        p1.hargaSewa = 3000;
        p1.lamaPinjam = 7;
        
        p1.tampilData();
        int total = p1.hargaTotal();
        System.out.println("Harga total : " + total);
        
    }
}
