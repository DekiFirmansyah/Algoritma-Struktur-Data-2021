/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomer4;

/**
 *
 * @author PERSONAL
 */
public class Node {
    int nim;
    String nama;
    double ipk;
    Node prev;
    Node next;
    
    public Node(Node prev, int nim, String nama, double ipk, Node next){
        this.prev = prev;
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.next = next;
    }
}
