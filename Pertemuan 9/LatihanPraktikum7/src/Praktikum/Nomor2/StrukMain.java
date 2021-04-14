
package Praktikum.Nomor2;

import java.util.Scanner;

public class StrukMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Berapa data struk yang akan di simpan : ");
        int simpan = sc.nextInt();
        System.out.println();
        
        Stack sk = new Stack(simpan);
        
        for(int i = 0; i < simpan; i++){
            System.out.println("-------------------------------");
            System.out.println("Struk belanja ke " + (i + 1));
            System.out.print("Nomer transaksi : ");
            int noTransaksi = sc.nextInt();
            sc.nextLine();
            System.out.print("Tanggal pembelian : ");
            String tglBeli = sc.nextLine();
            System.out.print("Jumlah barang : ");
            int jmlBarang = sc.nextInt();
            System.out.print("Total harga : ");
            int total = sc.nextInt();
            System.out.println("-------------------------------");
            
            Struk sr = new Struk(noTransaksi, tglBeli, jmlBarang, total);
            sk.push(sr);
        }
        System.out.println();
        System.out.println("Maksimal struk yang dapat diambil : " + simpan);
        System.out.print("Berapa struk yang akan di ambil : ");
        int jumlah = sc.nextInt();
        System.out.println();
        
        System.out.println("----Data Struk yang diambil----");
        for(int i = 0; i < jumlah; i++){
            System.out.println("-------------------------------------");
            System.out.println("Struk ke " + (i + 1));
            sk.pop();
            System.out.println("-------------------------------------");
        }
        
        System.out.println();
        System.out.println("---Data Struk yang masih ada di laci---");
        sk.print();            
    }
}
