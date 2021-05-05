/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomer2;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class PerpustakaanMain {
    public static void menu() {
        System.out.println("**********************");
        System.out.println("Data Buku Perpustakaan");
        System.out.println("**********************");
        System.out.println("\n1. Entry Judul Buku");
        System.out.println("2. Ambil Buku Teratas");
        System.out.println("3. Cek Judul Buku Teratas");
        System.out.println("4. Info Semua Judul Buku");
        System.out.println("5. Keluar");
        System.out.println("\n**********************");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Perpustakaan p1 = new Perpustakaan();
        
        int pilih;
        do {
            System.out.println();
            menu();
            System.out.print("Pilihan menu : ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
            case 1:
                System.out.println("-------------------");
                System.out.println("Masukkan Judul Buku");
                System.out.println("-------------------");
                String judul = sc.nextLine();
                
                p1.push(judul);
                break;
            case 2:
                p1.pop("");
                break;
            case 3:
                p1.peek();
                break;
            case 4:
                p1.print();
                break;
            default:
                System.out.println("\n--- TERIMA KASIH ---");
            }
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
   
}
