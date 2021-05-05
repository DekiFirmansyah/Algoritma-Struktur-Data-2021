/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomer1;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class DoubleLinkedListsMain {
    public static void menu() {
        System.out.println("==================================================");
        System.out.println("PROGRAM PENGOLAHAN ANGKA DENGAN DOUBLY LINKED LIST");
        System.out.println("==================================================");
        System.out.println("1. Tambah head");
        System.out.println("2. Tambah tail");
        System.out.println("3. Tambah Data");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari");
        System.out.println("9. Urut Data");
        System.out.println("10. Keluar");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedLists dll = new DoubleLinkedLists();
        
        int pilih, input;
        do {
            System.out.println();
            menu();
            System.out.print("Pilihan menu : ");
            pilih = sc.nextInt();
           
            switch (pilih) {
            case 1 :
                System.out.println("Masukkan Data posisi head");
                input = sc.nextInt();
                System.out.println();
                dll.addFirst(input);
                break;
            case 2:
                System.out.println("Masukkan Data posisi tail");
                input = sc.nextInt();
                System.out.println();
                dll.addFirst(input);
                break;
            case 3:
                System.out.println("Masukkan Data");
                System.out.print("Data Node : ");
                input = sc.nextInt();
                System.out.print("Alamat pointer :");
                int urutan = sc.nextInt();
                dll.add(input, urutan);
                break;
            case 4:
                dll.removeFirst();
                System.out.println("Data pertama berhasil dihapus");
                break;
            case 5:
                dll.removeLast();
                System.out.println("Data terakhir berhasil dihapus");
                break;
            case 6:
                System.out.print("Masukkan data indeks yang akan dihapus :");
                int hapus = sc.nextInt();
                dll.remove(hapus);
                System.out.println("Data pada indeks ke " + hapus + " berhasil dihapus");
                break;
            case 7:
                dll.print();
                break;
            case 8:
                System.out.println("Cari Data");
                System.out.print("Masukkan nilai yang dicari : ");
                int cari = sc.nextInt();
                System.out.println("Data " + cari + " berada di node ke " + dll.getData(cari));
                break;
            case 9:
                dll.sorting();
                System.out.println("Data berhasil di urutkan");
                break;
            default:
                System.out.println("\n--- TERIMA KASIH ---");
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8 || pilih == 9);
    } 
}
