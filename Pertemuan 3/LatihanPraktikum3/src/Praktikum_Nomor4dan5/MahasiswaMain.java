/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_Nomor4dan5;

/**
 *
 * @author PERSONAL
 */
public class MahasiswaMain {
     public static void main(String[] args) {
        
        int i;
        
        Mahasiswa[] mArr = new Mahasiswa[3];
        
        for(i = 0; i < mArr.length; i++){
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            mArr[i] = new Mahasiswa(" ",0,' ',0);
            System.out.println();
        }
        System.out.println();
        
        for(i = 0; i < mArr.length; i++){
            System.out.println("Data mahasiswa ke-" + (i+1));
            System.out.println("nama : " + mArr[i].nama);
            System.out.println("nim : " + mArr[i].nim);
            System.out.println("Jenis kelamin : " + mArr[i].jenisKelamin);
            System.out.println("Nilai IPK : " + mArr[i].ipk);
        }
        System.out.println();
        
        double[] rata = new double[3];
        for(i = 0; i < mArr.length; i++){
            rata[i] = mArr[i].ipk;
        }
        double x = mArr[0].ipkRata(rata);
        System.out.println("IPK Rata-rata seluruh mahasiswa : " + x);
    }
}
