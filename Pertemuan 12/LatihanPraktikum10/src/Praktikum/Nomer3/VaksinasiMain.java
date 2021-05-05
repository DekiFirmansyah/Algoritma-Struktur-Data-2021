/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomer3;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class VaksinasiMain {
    public static void menu() {
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN ENXTRAVAGANZA");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Penerima Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vaksinasi v1 = new Vaksinasi();
        
        int pilih;
        do {
            System.out.println();
            menu();
            System.out.print("Pilihan menu : ");
            pilih = sc.nextInt();
           
            switch (pilih) {
            case 1:
                System.out.println("-----------------------------");
                System.out.println("Masukkan Data Penerima Vaksin");
                System.out.println("-----------------------------");
                System.out.print("Nomer antrian : ");
                int noAntri = sc.nextInt();
                sc.nextLine();
                System.out.print("Nama penerima : ");
                String nama = sc.nextLine();
                
                v1.enqueue(noAntri, nama);
                break;
            case 2:
                v1.dequeue();
                break;
            case 3:
                v1.print();
                break;
            default:
                System.out.println("\n--- TERIMA KASIH ---");
            }
        }while (pilih == 1 || pilih == 2 || pilih == 3);
    }
}
