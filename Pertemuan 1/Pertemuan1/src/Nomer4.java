
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PERSONAL
 */
import java.util.Scanner;
public class Nomer4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        menu();
        
        
    }
    static void menu(){
        Scanner sc = new Scanner(System.in);
        int alasSegitiga, tinggiSegitiga, pjgPersegiPanjang, lbrPersegiPanjang;
        int n = 1, menu;
        double jariJari;
        String ulang;
        
        for(int i = 0; i < n; i++){
            System.out.println("Menu : " + "\n1. Luas Segitiga" + "\n2. Luas Persegi Panjang" + "\n3. Luas Lingkaran");
            System.out.print("Masukkan pilihan menu : ");
            menu = sc.nextInt();
            
            if(menu == 1){
                System.out.print("Masukkan alas : ");
                alasSegitiga = sc.nextInt();
                System.out.print("Masukkan Tinggi : ");
                tinggiSegitiga = sc.nextInt();
                double luas1 = luasSegitiga(alasSegitiga, tinggiSegitiga);
                System.out.println("Luas Segitiga : " + luas1);
            }else if(menu == 2){
                System.out.print("Masukkan panjang : ");
                pjgPersegiPanjang = sc.nextInt();
                System.out.print("Masukkan lebar : ");
                lbrPersegiPanjang = sc.nextInt();
                int luas2 = luasPersegiPanjang(pjgPersegiPanjang, lbrPersegiPanjang);
                System.out.println("Luas Persegi Panjang : " + luas2);
            }else {
                System.out.print("Masukkan jari-jari : ");
                jariJari = sc.nextDouble();
                double luas3 = luasLingkaran(jariJari);
                System.out.println("Luas Lingkaran : " + luas3);
            }
            sc.nextLine();
            System.out.print("Apakah ingin menghitung lagi (ya/tidak)? ");
            ulang = sc.nextLine();
            if(ulang.equalsIgnoreCase("ya")){
                n += 1;
            } 
        }
    }
    static double luasSegitiga(int a, int t){
        double luas = 0.5 * a * t;
        return luas; 
    }
    static int luasPersegiPanjang(int p, int l){
        int luas = p * l;
        return luas;
    }
    static double luasLingkaran(double r){
        double phi = 3.14;
        double luas = phi * r * r;
        return luas;
    }
}
