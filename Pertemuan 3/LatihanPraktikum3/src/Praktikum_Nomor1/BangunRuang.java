/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_Nomor1;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class BangunRuang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Terdapat beberapa bangun ruang : ");
        System.out.println("1. Bola \n2. Kerucut \n3. Tabung");
        System.out.println();
        
        System.out.print("Berapa kali hitung bola : ");
        int bKali = sc.nextInt();
        System.out.print("Berapa kali hitung kerucut : ");
        int kKali = sc.nextInt();
        System.out.print("Berapa kali hitung tabung : ");
        int tKali = sc.nextInt();
        System.out.println();
        Bola[] baArr = new Bola[bKali];
        Kerucut[] ktArr = new Kerucut[kKali];
        Tabung[] tgArr = new Tabung[tKali];
        
        System.out.println("<<< Input Data >>>");
        for(i = 0; i < baArr.length; i++){
            System.out.println("- BOLA " + (i+1) + " -");
            baArr[i] = new Bola(0);
        }
        for(i = 0; i < ktArr.length; i++){
            System.out.println("- KERUCUT " + (i+1) + " -");
            ktArr[i] = new Kerucut(0,0,0);
        }
        for(i = 0; i < tgArr.length; i++){
            System.out.println("- TABUNG " + (i+1) + " -");
            tgArr[i] = new Tabung(0,0);
        }
        System.out.println();
        System.out.println("<<< Output Hasil >>>");
        for(i = 0; i < baArr.length; i++){
            System.out.println("*********************");
            System.out.println("- BOLA " + (i+1) + " -");
            System.out.println("Jari-jari      : " + baArr[i].jariJari);
            System.out.println("Luas Permukaan : " + baArr[i].luasBola());
            System.out.println("Volume Bangun  : " + baArr[i].volumeBola());
        }
        for(i = 0; i < ktArr.length; i++){
            System.out.println("*********************");
            System.out.println("- KERUCUT " + (i+1) + " -");
            System.out.println("Jari-jari      : " + ktArr[i].jariJari);
            System.out.println("Tinggi         : " + ktArr[i].tinggi);
            System.out.println("Garis pelukis  : " + ktArr[i].garisPelukis);
            System.out.println("Luas Permukaan : " + ktArr[i].luasKerucut());
            System.out.println("Volume Bangun  : " + ktArr[i].volumeKerucut());
        }
        for(i = 0; i < tgArr.length; i++){
            System.out.println("*********************");
            System.out.println("- TABUNG " + (i+1) + " -");
            System.out.println("Jari-jari     : " + tgArr[i].jariJari);
            System.out.println("Tinggi        : " + tgArr[i].tinggi);
            System.out.println("Luas Permukaan : " + tgArr[i].luasTabung());
            System.out.println("Volume Bangun  : " + tgArr[i].volumeTabung());
        }
    }
}
