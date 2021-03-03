/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_Nomor2dan3;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class Tanah {
    Scanner sc = new Scanner(System.in);
    int p, l, luas, max = 0, n = 1;
    
    
    Tanah(int p, int l){
        System.out.print("Panjang : ");
        p = sc.nextInt();
        System.out.print("Lebar : ");
        l = sc.nextInt();
        this.p = p;
        this.l = l;
    }
    int luasTanah(){
        return p * l;
    }
    
    int tanahTerluas(int[] l){
       int terluas = 0, n = 0;
       
       for(int i = 0; i < l.length; i++){
           if(terluas < l[i]){
               terluas = l[i];
               n = i + 1;
           }
       }
       return n;
    }
}
