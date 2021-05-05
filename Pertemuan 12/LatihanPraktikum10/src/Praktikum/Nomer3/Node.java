/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomer3;

/**
 *
 * @author PERSONAL
 */
public class Node {
    int noAntri;
    String nama;
    Node prev;
    Node next;
    
    public Node(Node prev, int noAntri, String nama, Node next){
        this.prev = prev;
        this.noAntri = noAntri;
        this.nama = nama;
        this.next = next;
    }
}
