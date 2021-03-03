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
public class Tabung {
    Scanner sc = new Scanner(System.in);
    double jariJari, tinggi, phi = 3.14;
    
    Tabung(double jariJari, double tinggi){
        System.out.print("Jari-jari : ");
        jariJari = sc.nextDouble();
        System.out.print("Tinggi : ");
        tinggi = sc.nextDouble(); 
        
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }
    
    double volumeTabung(){
        double v = phi * jariJari * jariJari * tinggi;
        return v;
    }
    
    double luasTabung(){
        double l = 2 * phi * jariJari * (jariJari + tinggi);
        return l;
    }
    
    
}
