/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_Nomor3;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class Barang {
    String nama;
    int jumlah, hargaSatuan;
    
    int hitungHargaTotal(){
        int total = hargaSatuan * jumlah;
        return total;
        
    }
    int hitungDiskon(){
        int total = hitungHargaTotal();
        int diskon;
        if(total > 100000){
            diskon = total * 10/100;
            return diskon;  
        }else if(total >= 50000 && total <= 100000){
            diskon = total * 5/100;
            return diskon;
        }else {
            return 0;
        }
        
    }
    int hitungHargaBayar(){
        int bayar = hitungHargaTotal() - hitungDiskon();
        return bayar;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Barang b1 = new Barang();
        
        System.out.print("Nama barang : ");
        b1.nama = sc.nextLine();
        System.out.print("Jumlah barang : ");
        b1.jumlah = sc.nextInt();
        System.out.print("Harga satuan : Rp. ");
        b1.hargaSatuan = sc.nextInt();
        
        int bayar = b1.hitungHargaBayar();
        System.out.print("harga total : Rp. " + bayar);
    }
}
