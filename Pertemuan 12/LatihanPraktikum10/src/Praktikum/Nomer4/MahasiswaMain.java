/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomer4;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class MahasiswaMain {
    public static void menu() {
        System.out.println("================================");
        System.out.println("SISTEM PENGOLAHAN DATA MAHASISWA");
        System.out.println("================================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari NIM");
        System.out.println("9. Urut Data IPK-DESC");
        System.out.println("10. Keluar");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();
        int nim;
        String nama;
        double ipk;
        int pilih;
        
        do {
            System.out.println();
            menu();
            System.out.print("Pilihan menu : ");
            pilih = sc.nextInt();
           
            switch (pilih) {
            case 1 :
                System.out.println("----------------------------------");
                System.out.println("Masukkan Data Mahasiswa posisi awal");
                System.out.println("----------------------------------");
                System.out.print("NIM  : ");
                nim = sc.nextInt();
                sc.nextLine();
                System.out.print("Nama : ");
                nama = sc.nextLine();
                System.out.print("IPK  : ");
                ipk = sc.nextDouble();
                System.out.println("----------------------------------");
                
                mhs.addFirst(nim, nama, ipk);
                break;
            case 2:
                System.out.println("----------------------------------");
                System.out.println("Masukkan Data Mahasiswa posisi akhir");
                System.out.println("----------------------------------");
                System.out.print("NIM  : ");
                nim = sc.nextInt();
                sc.nextLine();
                System.out.print("Nama : ");
                nama = sc.nextLine();
                System.out.print("IPK  : ");
                ipk = sc.nextDouble();
                System.out.println("----------------------------------");
                
                mhs.addLast(nim, nama, ipk);
                break;
            case 3:
                System.out.println("----------------------------------");
                System.out.println("Masukkan Data Mahasiswa posisi akhir");
                System.out.println("----------------------------------");
                System.out.print("NIM  : ");
                nim = sc.nextInt();
                sc.nextLine();
                System.out.print("Nama : ");
                nama = sc.nextLine();
                System.out.print("IPK  : ");
                ipk = sc.nextDouble();
                System.out.println("----------------------------------");
                System.out.print("Data mahasiswa ini akan dimasukkan di urutan ke- ");
                int urutan = sc.nextInt();
                mhs.add(nim, nama, ipk, urutan);
                break;
            case 4:
                mhs.removeFirst();
                System.out.println("Data Mahasiswa pertama berhasil dihapus");
                break;
            case 5:
                mhs.removeLast();
                System.out.println("Data Mahasiswa terakhir berhasil dihapus");
                break;
            case 6:
                System.out.print("Masukkan NIM mahasiswa yang akan dihapus :");
                int hapus = sc.nextInt();
                mhs.remove(hapus);
                System.out.println("Data Mahasiswa dengan NIM " + hapus + " berhasil dihapus");
                break;
            case 7:
                mhs.print();
                break;
            case 8:
                System.out.print("Masukkan NIM yang dicari : ");
                int cari = sc.nextInt();
                System.out.println("Data mahasiswa dengan NIM " + cari + " berada pada indeks ke " + mhs.getData(cari));
                break;
            case 9:
                mhs.sorting();
                System.out.println("Data Mahasiswa berhasil di urutkan dari IPK terbesar");
                break;
            default:
                System.out.println("\n--- TERIMA KASIH ---");
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8 || pilih == 9);
    }
}
