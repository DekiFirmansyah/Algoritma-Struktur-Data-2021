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
public class Kerucut {
    Scanner sc = new Scanner(System.in);
    public double jariJari, tinggi, garisPelukis, phi = 3.14;
    
    public Kerucut(double jariJari, double tinggi, double garisPelukis){
        
        System.out.print("Jari-jari : ");
        jariJari = sc.nextDouble();
        System.out.print("Tinggi : ");
        tinggi = sc.nextDouble(); 
        System.out.print("Panjang garis pelukis : ");
        garisPelukis = sc.nextDouble();
            
        this.jariJari = jariJari;
        this.tinggi = tinggi;
        this.garisPelukis = garisPelukis;
        
    }
    
    
    double luasKerucut(){
        double l = luasAlas() + luasSelimut();
        return l;
    }
    
    double luasAlas(){
        return phi * jariJari * jariJari;
    }
    
    double luasSelimut(){
        return  phi * jariJari * garisPelukis;
    }
    
    double volumeKerucut(){
        double v = 0.33 * phi * jariJari * jariJari * tinggi;
        return v;
    }
    
}
