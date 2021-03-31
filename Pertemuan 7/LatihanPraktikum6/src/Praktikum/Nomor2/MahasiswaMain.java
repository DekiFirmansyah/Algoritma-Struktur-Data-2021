/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomor2;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class MahasiswaMain {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumMhs = s.nextInt();
        PencarianMhs data = new PencarianMhs(jumMhs);
        
        System.out.println("-------------------------------");
        System.out.println("Masukkan data mahasiswa secara terurut dari NIM terkecil : ");
        for(int i=0; i<jumMhs; i++){
            System.out.println("---------------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t  : ");
            String nama = s1.nextLine();
            System.out.print("Umur\t  : ");
            int umur = s.nextInt();
            System.out.print("IPK\t  : ");
            double ipk = s.nextDouble();
            
            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Data keseluruhan mahasiswa : ");
        System.out.println("----------------------------------------------------------------");
        data.tampil();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Pencarian Data :");
        System.out.println("Masukkan Nama ");
        System.out.print("NAMA : ");
        String cari=s1.nextLine();
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
        System.out.println("----------------------------------------------------------------");
   }

}
