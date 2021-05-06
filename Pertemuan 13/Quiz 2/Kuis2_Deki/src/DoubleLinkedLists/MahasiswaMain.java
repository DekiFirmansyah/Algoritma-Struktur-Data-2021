/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleLinkedLists;

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
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Tambah Data Mahasiswa Posisi Akhir");
        System.out.println("3. Tambah Data Mahasiswa Posisi Awal");
        System.out.println("4. Hapus Data Mahasiswa");
        System.out.println("5. Hapus Data Mahasiswa Awal");
        System.out.println("6. Hapus Data Mahasiswa Akhir");
        System.out.println("7. Cetak Data Mahasiswa");
        System.out.println("8. Temukan Data Mahasiswa Urutan Pertama");
        System.out.println("9. Cari Data Mahasiswa (melalui NIM)");
        System.out.println("10. Urut Data Mahasiswa (melalui IPK)");
        System.out.println("11. Keluar");
        System.out.println("===============================");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();
        int nim;
        String nama;
        String jurusan;
        String prodi;
        double ipk;
        int pilih;
        
        do {
            System.out.println();
            menu();
            System.out.print("Pilihan menu : ");
            pilih = sc.nextInt();
           
            switch (pilih) {
            case 1 :
                System.out.println("---------------------------------------");
                System.out.println("Masukkan Data Mahasiswa Posisi Tertentu");
                System.out.println("---------------------------------------");
                System.out.print("NIM  : ");
                nim = sc.nextInt();
                sc.nextLine();
                System.out.print("Nama : ");
                nama = sc.nextLine();
                System.out.print("Jurusan : ");
                jurusan = sc.nextLine();
                System.out.print("Prodi : ");
                prodi = sc.nextLine();
                System.out.print("IPK  : ");
                ipk = sc.nextDouble();
                System.out.println("---------------------------------------");
                
                System.out.print("Masukkan posisi indeks : ");
                int urutan = sc.nextInt();
                mhs.add(nim, nama, jurusan, prodi, ipk, urutan);
                break;
            case 2:
                System.out.println("------------------------------------");
                System.out.println("Masukkan Data Mahasiswa Posisi Akhir");
                System.out.println("------------------------------------");
                System.out.print("NIM  : ");
                nim = sc.nextInt();
                sc.nextLine();
                System.out.print("Nama : ");
                nama = sc.nextLine();
                System.out.print("Jurusan : ");
                jurusan = sc.nextLine();
                System.out.print("Prodi : ");
                prodi = sc.nextLine();
                System.out.print("IPK  : ");
                ipk = sc.nextDouble();
                System.out.println("------------------------------------");
                
                mhs.addLast(nim, nama, jurusan, prodi, ipk);
                break;
            case 3:
                System.out.println("----------------------------------");
                System.out.println("Masukkan Data Mahasiswa Posisi Awal");
                System.out.println("----------------------------------");
                System.out.print("NIM  : ");
                nim = sc.nextInt();
                sc.nextLine();
                System.out.print("Nama : ");
                nama = sc.nextLine();
                System.out.print("Jurusan : ");
                jurusan = sc.nextLine();
                System.out.print("Prodi : ");
                prodi = sc.nextLine();
                System.out.print("IPK  : ");
                ipk = sc.nextDouble();
                System.out.println("----------------------------------");
                
                mhs.addFirst(nim, nama, jurusan, prodi, ipk);
                break;
            case 4:
                System.out.print("Masukkan NIM mahasiswa yang akan dihapus : ");
                int hapus = sc.nextInt();
                mhs.remove(hapus);
                System.out.println("Data Mahasiswa dengan NIM " + hapus + " berhasil dihapus");
                break;
            case 5:
                mhs.removeFirst();
                System.out.println("Data Mahasiswa pertama berhasil dihapus");
                break;
            case 6:
                mhs.removeLast();
                System.out.println("Data Mahasiswa terakhir berhasil dihapus");
                break;
            case 7:
                mhs.print();
                break;
            case 8:
                mhs.getFirst();
                break;
            case 9:
                System.out.print("Masukkan NIM yang dicari : ");
                int cari = sc.nextInt();
                System.out.println("Data mahasiswa dengan NIM " + cari + " berada pada indeks ke " + mhs.getData(cari));
                break;
            case 10:
                mhs.sorting();
                System.out.println("Data Mahasiswa berhasil di urutkan berdasarkan IPK");
                break;
            default:
                System.out.println("********************");
                System.out.println("--- TERIMA KASIH ---");
                System.out.println("********************");
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8 || pilih == 9 || pilih == 10);
    }
}
