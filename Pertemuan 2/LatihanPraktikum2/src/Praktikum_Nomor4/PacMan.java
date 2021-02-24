/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_Nomor4;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class PacMan {
    int x, y, width, height;
    
    void moveLeft(){
        Scanner sc = new Scanner(System.in);
        System.out.print("geser kiri berapa satuan (max " + (width - x) + ") : ");
        int kiri = sc.nextInt();
        x -= kiri;
    }
    void moveRight(){
        Scanner sc = new Scanner(System.in);
        System.out.print("geser kanan berapa satuan (max " + (width - x) + ") : ");
        int kanan = sc.nextInt();
        x += kanan;
    }
    void moveUp(){
        Scanner sc = new Scanner(System.in);
        System.out.print("geser atas berapa satuan (max " + (height - y) + ") : ");
        int atas = sc.nextInt();
        y -= atas;
    }
    void moveDown(){
        Scanner sc = new Scanner(System.in);
        System.out.print("geser bawah berapa satuan (max " + (height - y) + ") : ");
        int bawah = sc.nextInt();
        y += bawah;
    }
    void printPosition(){
        System.out.println("----Posisi koordinat PacMan----");
        System.out.println("Pada koornidat x = " + x + " dan koordinat y = " + y);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        PacMan pm1 = new PacMan();
        
        System.out.print("Lebar area permainan : ");
        pm1.width = sc.nextInt();
        System.out.print("Panjang area permainan : ");
        pm1.height = sc.nextInt();
        System.out.print("Koordinat x (0 <= x <= lebar): ");
        pm1.x = sc.nextInt();
        System.out.print("koordinat y (0 <= y <= panjang): ");
        pm1.y = sc.nextInt();
        
        pm1.moveLeft();
        pm1.moveRight();
        pm1.moveUp();
        pm1.moveDown();
        System.out.println();
        pm1.printPosition();
    }
}
