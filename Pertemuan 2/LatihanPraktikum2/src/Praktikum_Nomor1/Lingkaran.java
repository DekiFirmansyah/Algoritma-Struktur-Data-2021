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
public class Lingkaran {
    double phi, r;
    
    double hitungLuas(){
        double luas = phi * r * r;
        return luas;
    }
    
    double hitungKeliling(){
        double keliling = 2 * phi * r;
        return keliling;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Lingkaran l1 = new Lingkaran();
        
        l1.phi = 3.14;
        System.out.print("Jari-jari : ");
        l1.r = sc.nextDouble();
        
        double keliling = l1.hitungKeliling();
        System.out.println("Keliling Lingkaran : " + keliling);
        double luas = l1.hitungLuas();
        System.out.println("Luas Lingkaran : " + luas);
    }
}

