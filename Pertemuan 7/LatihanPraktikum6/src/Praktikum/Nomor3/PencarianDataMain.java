/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomor3;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class PencarianDataMain {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int angka [] [] ={
            {45, 78, 7, 200, 80},
            {90, 1, 17, 100, 50},
            {21, 2, 40, 18,  65}
        };
        
        PencarianData data = new PencarianData ();
        System.out.println("Data Array ");
        System.out.println("------------------------------");
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(angka [i][j] + " ");
            } 
          System.out.println();
        }
        System.out.println("------------------------------");
        
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Menggunakan Sequensial Serch");
        System.out.print("Masukkan angka : ");
        int cari = sc.nextInt();
        data.FindSeqSearch(angka, cari);
        System.out.println("------------------------------");
    }

}
