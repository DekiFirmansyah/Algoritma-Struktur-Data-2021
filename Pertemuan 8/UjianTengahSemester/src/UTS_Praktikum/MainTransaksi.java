/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_Praktikum;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class MainTransaksi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RekeningService list1 = new RekeningService();
        TransaksiService list2 = new TransaksiService();
        
        Rekening r1 = new Rekening(161006170573, "Ariffin", "bin Abdul Salam", 13578430547, "nec@lectusjusto.org");
        Rekening r2 = new Rekening(162404012243, "Ismail", "bin Mail", 5717062, "convallis@Vestibulumanteipsum.org");
        
        int n = 1;
        for(int i = 0; i < n; i++){
            System.out.println("Pilih menu : ");
            System.out.println("1. Tampil Rekening \n2. Tampil Transaksi \n3. Cari nama");
            System.out.println("masukkan pilihan : ");
            int tambah = sc.nextInt();
            if(tambah == 1){
                list1.tampilAll();
            }else if(tambah == 2){
                list2.tampilAll();
            }
            
        }
    }
}
