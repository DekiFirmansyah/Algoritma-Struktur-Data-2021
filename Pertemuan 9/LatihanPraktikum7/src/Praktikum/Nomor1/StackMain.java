/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomor1;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan kalimat : ");
        String kalimat = sc.nextLine();
        
        Stack myStack = new Stack(1000);
        for(char c:kalimat.toCharArray()){
            myStack.push("" + c);
        }
        
        System.out.print("Kalimat setelah dibalik : ");
        while (!myStack.isEmpty()){
            System.out.print(myStack.pop()); 
        }
        
    }
}
