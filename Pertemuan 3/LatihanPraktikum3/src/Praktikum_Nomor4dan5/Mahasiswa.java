/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_Nomor4dan5;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class Mahasiswa {
    Scanner sc = new Scanner(System.in);
    public String  nama;
    public char jenisKelamin;
    public int nim;
    public double ipk;
    
    public Mahasiswa(String nama, int nim, char jenisKelamin, double ipk){
        System.out.print("Masukkan nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan nim : ");
        nim = sc.nextInt();
        System.out.print("Masukkan jenis kelamin(L/P) : ");
        jenisKelamin = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("Masukkan IPK : ");
        ipk = sc.nextDouble();
        
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }
    
    double ipkRata(double[] r){
        double x = (r[0] + r[1] + r[2]) / 3;
        return x;
    }
  
}
