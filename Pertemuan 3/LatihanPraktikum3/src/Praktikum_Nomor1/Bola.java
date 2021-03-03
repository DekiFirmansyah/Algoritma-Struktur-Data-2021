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
public class Bola {
    Scanner sc = new Scanner(System.in);
    public double jariJari, phi = 3.14;
    
    public Bola(double jariJari){
        System.out.print("Jari-jari : ");
        jariJari = sc.nextDouble();
        
        this.jariJari = jariJari;
    }
    public double volumeBola(){
        double v = 1.33 * phi * jariJari * jariJari * jariJari;
        return v;
    }
    public double luasBola(){
        double l = 4 * phi * jariJari * jariJari;
        return l;
    }
    

    
}
