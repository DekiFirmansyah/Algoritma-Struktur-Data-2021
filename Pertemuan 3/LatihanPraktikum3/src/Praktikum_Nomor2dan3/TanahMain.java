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
public class TanahMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        
        System.out.print("Jumlah tanah : ");
        int jumlah = sc.nextInt();
        System.out.println();
        
        Tanah[] tArray = new Tanah[jumlah];
        
        for(i = 0; i < tArray.length; i++){
            System.out.println("Tanah " + (i+1));
            tArray[i] = new Tanah(0,0);
        }
        System.out.println();
        
        for(i = 0; i < tArray.length; i++){
            System.out.println("Luas Tanah " + (i+1) + " : " + tArray[i].luasTanah());
        }
        System.out.println();
        int a = 0;
        int luas[] = new int[jumlah];
        for(i = 0; i < tArray.length; i++){
            luas[i] = tArray[i].luasTanah();
        }
        a = tArray[0].tanahTerluas(luas);
        System.out.println("Tanah terluas : Tanah " + a);
    }
}
