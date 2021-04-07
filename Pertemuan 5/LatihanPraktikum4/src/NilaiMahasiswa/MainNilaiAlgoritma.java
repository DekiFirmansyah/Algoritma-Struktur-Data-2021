/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NilaiMahasiswa;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class MainNilaiAlgoritma {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-----------------------------------------");
        System.out.print("Masukkan jumlah data Mahasiswa : ");
        int jml = sc.nextInt();
        
        // Nomor 2
        NilaiAlgoritma[] na = new NilaiAlgoritma[jml];
        
        for(int i=0; i<na.length; i++){
            System.out.println("-----------------------------------------");
            System.out.println("Masukkan Data Mahasiswa ke- :"+(i+1));
            System.out.println("-----------------------------------------");
            System.out.print("Masukkan Nama Mahasiwa:");
            String nm = sc.nextLine();
            System.out.print("Masukkan Nilai Tugas:");
            int nt = sc.nextInt();
            System.out.print("Masukkan Nilai Kuis :");
            int nk = sc.nextInt();
            System.out.print("Masukkan Nilai Uts :");
            int nuts = sc.nextInt();
            System.out.print("Masukkan Nilai Uas :");
            int nuas = sc.nextInt();
        
            na[i] = new NilaiAlgoritma(nm, nt, nk, nuts, nuas);
        }
        
        //nomor 3
        System.out.println("-----------------------------------------");
        System.out.println("Data Mahasiswa beserta Total Nilai");
        System.out.println("-----------------------------------------");
        
        double n=0;
        double total[] = new double[jml];
        
        for (int i=0; i<na.length; i++){System.out.println("Nama Mahasiswa : "+na[i].namaMhs+"Total Nilai : "+na[i].hitungTotalNilai());
            total[i] = na[i].hitungTotalNilai();
            n = na[i].NilaiRata(total);
        }
        
        System.out.println("-----------------------------------------");
        System.out.println("Rata Rata Kelas adalah : "+n);
        System.out.println("-----------------------------------------");
    }
}
