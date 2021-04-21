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
public class QueueMain {
    public static void menu(){
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Daftar seluruh antrian");
        System.out.println("4. Data antrian paling depan");
        System.out.println("5. Data antrian paling belakang");
        System.out.println("6. Tampilkan posisi dari data tertentu");
        System.out.println("7. Tampilkan data dari posisi tertentu");
        System.out.println("8. Selesai");
        System.out.println("------------------------------------------");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Kapasitas maksimal antrian : ");
        int jumlah = sc.nextInt();
        Queue antrian = new Queue(jumlah);
        
        int pilih;
        do {
            System.out.println();
            menu();
            System.out.print("Pilihan menu : ");
            pilih = sc.nextInt();
            sc.nextLine();
            
            switch(pilih){
                case 1:
                    System.out.println("\n-----------------------");
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama lengkap : ");
                    String nama = sc.nextLine();
                    System.out.print("Nomer absen : ");
                    int absen = sc.nextInt();
                    System.out.print("IPK : ");
                    double ipk = sc.nextDouble();
                    System.out.println("-----------------------");
                    
                    Mahasiswa m = new Mahasiswa(nim, nama, absen, ipk);
                    sc.nextLine();
                    antrian.Enqueue(m);
                    break;
                case 2:
                    Mahasiswa data = antrian.Dequeue();
                    if(!"".equals(data.nim) && !"".equals(data.nama) && data.absen != 0 && data.ipk != 0.0){
                        System.out.println("\n--- Data antrian yang keluar ---");
                        System.out.println("NIM Mahasiswa : " + data.nim);
                        System.out.println("Nama Mahasiswa : " + data.nama);
                        System.out.println("Absen Mahasiswa : " + data.absen);
                        System.out.println("IPK Mahasiswa : " + data.ipk);
                        break;
                    }
                case 3:
                    System.out.println("\n--- Daftar antrian KRS Mahasiswa ---");
                    antrian.print();
                    break;
                case 4:
                    System.out.println("\n--- Data Mahasiswa antrian paling depan ---");
                    antrian.peek();
                    break;
                case 5:
                    System.out.println("\n--- Data Mahasiswa antrian paling belakang ---");
                    antrian.peekRear();
                    break;
                case 6:
                    System.out.print("\nNIM yang dicari : ");
                    String cari = sc.nextLine();
                    antrian.peekPosition(cari);
                    break;
                case 7:
                    System.out.print("\nPosisi yang dicari : ");
                    int posisi = sc.nextInt();
                    antrian.printMahasiswa(posisi);
                    break;
                case 8:
                    System.out.println("\n----- TERIMA KASIH -----");
            }
        }while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}
