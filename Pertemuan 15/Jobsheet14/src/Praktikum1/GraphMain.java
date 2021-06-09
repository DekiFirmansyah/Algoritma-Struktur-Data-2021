/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class GraphMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph(6);
        
        System.out.println("1. Directid graph \n2. Undirectid graph");
        System.out.print("Pilih tipe graph : ");
        int pilih = sc.nextInt();
        
        System.out.print("Berapa jumlah lintasan : ");
        int lintasan = sc.nextInt();
        
        int i = 0;
        System.out.println("Masukkan edge : <source> <destination>");
        while(i < lintasan){
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph.addEdge(x, y, pilih);
            i++;
        }
        
        graph.printGraph();
        graph.degree(2);
        graph.removeEdge(1, 3);
        graph.printGraph();
    }
}
