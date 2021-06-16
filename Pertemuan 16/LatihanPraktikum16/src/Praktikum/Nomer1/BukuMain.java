/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomer1;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author PERSONAL
 */
public class BukuMain {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        Stack<Buku> buku = new Stack<>();
         
        int pilih;

        do {
            System.out.println("*********");
            System.out.println("Data Buku Perpusatakaan");
            System.out.println("*********");
            System.out.println("1. Entry Judul Buku");
            System.out.println("2. Ambil Buku Teratas");
            System.out.println("3. Cek Buku Teratas");
            System.out.println("4. Info Semua Judul Buku");
            System.out.println("5. Keluar");
            System.out.println("********");
            System.out.print("Pilihn: ");

            pilih = input.nextInt();
            input.nextLine();
            
            if (pilih == 1){
                System.out.print("Isbn\t : ");
                String isbn = input.nextLine();
                System.out.print("Judul\t : ");
                String judul = input.nextLine();
                System.out.print("Terbit\t : ");
                String terbit = input.nextLine();
                System.out.print("Penerbit : ");
                String penerbit = input.nextLine();
                Buku b = new Buku();
                buku.push(b = new Buku(isbn,judul,terbit,penerbit));
            }
            if (pilih == 2) {
                buku.pop();
            }
            if (pilih == 3){
                System.out.print("Buku{" + "isbn=" + (buku.get(buku.size() -1).isbn) + ", " + "judul=" + (buku.get(buku.size() - 1).judul) + ", " + "Terbit=" + (buku.get(buku.size() - 1).terbit) + ", " +  "Penerbit=" + (buku.get(buku.size() - 1).penerbit) + '}');
            }
            if (pilih == 4){
                buku.stream().forEach(b -> {System.out.println("Buku{" + "isbn=" + b.isbn + ", " + "judul=" + b.judul + ", " + "terbit=" + b.terbit + ", " + "penerbit=" + b.penerbit + '}'); }); }
            } while (pilih >= 1 && pilih <= 4);
    }
}
