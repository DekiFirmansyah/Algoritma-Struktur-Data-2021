/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomer5;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class AntrianBankMain {
    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Daftar seluruh antrian");
        System.out.println("4. Data antrian paling depan");
        System.out.println("5. Data antrian paling belakang");
        System.out.println("6. Tampilkan posisi dari data tertentu");
        System.out.println("7. Tampilkan data dari posisi tertentu");
        System.out.println("8. Hapus semua data antrian");
        System.out.println("9. selesai");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kapasitas maksimal antrian : ");
        int jumlah = sc.nextInt();
        QueueLinkedList qll = new QueueLinkedList(jumlah);

        int pilih;
        do {
            System.out.println();
            menu();
            System.out.print("Pilihan menu : ");
            pilih = sc.nextInt();
           
            switch (pilih) {
            case 1:
                System.out.println("\n-----------------------");
                sc.nextLine();
                System.out.print("Nama           : ");
                String nama = sc.nextLine();
                System.out.print("Alamat         : ");
                String alamat = sc.nextLine();
                System.out.print("Nomor Rekening : ");
                int noRek = sc.nextInt();
                System.out.println("-------------------------");
                
                qll.Enqueue(nama, alamat, noRek);
                break;
            case 2:
                System.out.println("\n--- Data antrian yang keluar ---");
                qll.Dequeue();
                break;
            case 3:
                System.out.println("\n--- Daftar antrian Nasabah ---");
                qll.print();
                break;
            case 4:
                System.out.println("\n--- Data Nasabah antrian paling depan ---");
                qll.peek();
                break;
            case 5:
                System.out.println("\n--- Data Nasabah antrian paling belakang ---");
                qll.peekRear();
                break;
            case 6:
                System.out.print("\nNomer rekening yang dicari : ");
                int rek = sc.nextInt();
                qll.peekPosition(rek);
                break;
            case 7:
                System.out.print("\nPosisi yang dicari : ");
                int posisi = sc.nextInt();
                qll.printNasabah(posisi);
                break;
            case 8:
                qll.clear();
                System.out.println("------------------------------");
                break;
            default:
                System.out.println("\n--- TERIMA KASIH ---");
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8);
    }
}
