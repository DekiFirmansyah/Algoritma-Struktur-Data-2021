/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomer2;


/**
 *
 * @author PERSONAL
 */
public class Node {
    String data;
    Node prev;
    Node next;
    
    public Node(Node prev, String data, Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
