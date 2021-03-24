/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomor1;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class MainTiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TiketService cek = new TiketService();
        
        Tiket tk1 = new Tiket("Garuda Indonesia", 1218000, "Surabaya", "Jakarta");
        Tiket tk2 = new Tiket("Citilink", 523000, "Surabaya", "Jakarta");
        Tiket tk3 = new Tiket("Lion Air", 674000, "Surabaya", "Jakarta");
        Tiket tk4 = new Tiket("Air Asia", 1038000, "Surabaya", "Jakarta");
        Tiket tk5 = new Tiket("Garuda Indonesia", 1140000, "Malang", "Bandung");
        Tiket tk6 = new Tiket("Citilink", 404000, "Malang", "Bandung");
        Tiket tk7 = new Tiket("Lion Air", 350000, "Malang", "Bandung");
        Tiket tk8 = new Tiket("Air Asia", 939000, "Malang", "Bandung");
        Tiket tk9 = new Tiket("Garuda Indonesia", 1060000, "Yogyakarta", "Palembang");
        Tiket tk10 = new Tiket("Citilink", 674000, "Yogyakarta", "Palembang");
        Tiket tk11 = new Tiket("Lion Air", 748000, "Yogyakarta", "Palembang");
        Tiket tk12 = new Tiket("Air Asia", 1140000, "Yogyakarta", "Palembang");
        Tiket tk13 = new Tiket("Garuda Indonesia", 1320000, "Surabaya", "Bandung");
        Tiket tk14 = new Tiket("Citilink", 428000, "Surabaya", "Bandung");
        Tiket tk15 = new Tiket("Lion Air", 321000, "Surabaya", "Bandung");
        Tiket tk16 = new Tiket("Air Asia", 765000, "Surabaya", "Bandung");
        
        System.out.println("Pilihan filter yang ingin dicari : ");
        System.out.println("1. Maskapai \n2. Asal-Tujuan");
        System.out.print("Masukkan pilihan filter : ");
        int filter = sc.nextInt();
        System.out.println();
        if(filter == 1){
            System.out.println("Daftar maskapai yang tersedia : ");
            System.out.println("1. Garuda Indonesia \n2. Citilink \n3. Lion Air \n4. Air Asia \n5. Sriwijaya Air");
            System.out.print("Masukkan pilihan maskapai : ");
            int pswt = sc.nextInt();
            System.out.println();
            if(pswt == 1){
                cek.tambah(tk1);
                cek.tambah(tk5);
                cek.tambah(tk9);
                cek.tambah(tk13);
                System.out.println("---------------------------");
                System.out.println("Sistem pengurutan dengan Bubble");
                System.out.println("---------------------------");
                cek.bubbleSort();
                cek.tampilAll();
                System.out.println();
                System.out.println("---------------------------");
                System.out.println("Sistem pengurutan dengan Selection");
                System.out.println("---------------------------");
                cek.selectionSort();
                cek.tampilAll();
            }else if(pswt == 2){
                cek.tambah(tk2);
                cek.tambah(tk6);
                cek.tambah(tk10);
                cek.tambah(tk14);
                System.out.println("---------------------------");
                System.out.println("Sistem pengurutan dengan Bubble");
                System.out.println("---------------------------");
                cek.bubbleSort();
                cek.tampilAll();
                System.out.println();
                System.out.println("---------------------------");
                System.out.println("Sistem pengurutan dengan Selection");
                System.out.println("---------------------------");
                cek.selectionSort();
                cek.tampilAll();
            }else if(pswt == 3){
                cek.tambah(tk3);
                cek.tambah(tk7);
                cek.tambah(tk11);
                cek.tambah(tk15);
               System.out.println("---------------------------");
                System.out.println("Sistem pengurutan dengan Bubble");
                System.out.println("---------------------------");
                cek.bubbleSort();
                cek.tampilAll();
                System.out.println();
                System.out.println("---------------------------");
                System.out.println("Sistem pengurutan dengan Selection");
                System.out.println("---------------------------");
                cek.selectionSort();
                cek.tampilAll();
            }else {
                cek.tambah(tk4);
                cek.tambah(tk8);
                cek.tambah(tk12);
                cek.tambah(tk16);
                System.out.println("---------------------------");
                System.out.println("Sistem pengurutan dengan Bubble");
                System.out.println("---------------------------");
                cek.bubbleSort();
                cek.tampilAll();
                System.out.println();
                System.out.println("---------------------------");
                System.out.println("Sistem pengurutan dengan Selection");
                System.out.println("---------------------------");
                cek.selectionSort();
                cek.tampilAll();
            }
        }else {
            System.out.println("Daftar tujuan yang tersedia : ");
            System.out.println("1. Surabaya -> Jakarta \n2. Malang -> Bandung \n3. Yogyakarta -> Palembang \n4. Surabaya -> Bandung");
            System.out.println("Masukkan pilihan Asal-Tujuan : ");
            int at = sc.nextInt();
            System.out.println();
            if(at == 1){
                cek.tambah(tk1);
                cek.tambah(tk2);
                cek.tambah(tk3);
                cek.tambah(tk4);
                System.out.println("---------------------------");
                System.out.println("Sistem pengurutan dengan Bubble");
                System.out.println("---------------------------");
                cek.bubbleSort();
                cek.tampilAll();
                System.out.println();
                System.out.println("---------------------------");
                System.out.println("Sistem pengurutan dengan Selection");
                System.out.println("---------------------------");
                cek.selectionSort();
                cek.tampilAll();
            }else if(at == 2){
                cek.tambah(tk5);
                cek.tambah(tk6);
                cek.tambah(tk7);
                cek.tambah(tk8);
                System.out.println("---------------------------");
                System.out.println("Sistem pengurutan dengan Bubble");
                System.out.println("---------------------------");
                cek.bubbleSort();
                cek.tampilAll();
                System.out.println();
                System.out.println("---------------------------");
                System.out.println("Sistem pengurutan dengan Selection");
                System.out.println("---------------------------");
                cek.selectionSort();
                cek.tampilAll();
            }else if(at == 3){
                cek.tambah(tk9);
                cek.tambah(tk10);
                cek.tambah(tk11);
                cek.tambah(tk12);
                System.out.println("---------------------------");
                System.out.println("Sistem pengurutan dengan Bubble");
                System.out.println("---------------------------");
                cek.bubbleSort();
                cek.tampilAll();
                System.out.println();
                System.out.println("---------------------------");
                System.out.println("Sistem pengurutan dengan Selection");
                System.out.println("---------------------------");
                cek.selectionSort();
                cek.tampilAll();
            }else {
                cek.tambah(tk13);
                cek.tambah(tk14);
                cek.tambah(tk15);
                cek.tambah(tk16);
                System.out.println("---------------------------");
                System.out.println("Sistem pengurutan dengan Bubble");
                System.out.println("---------------------------");
                cek.bubbleSort();
                cek.tampilAll();
                System.out.println();
                System.out.println("---------------------------");
                System.out.println("Sistem pengurutan dengan Selection");
                System.out.println("---------------------------");
                cek.selectionSort();
                cek.tampilAll();
            }
            
        }
        
    }
}
