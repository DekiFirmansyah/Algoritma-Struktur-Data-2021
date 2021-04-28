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
public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList singLL = new LinkedList();
        singLL.print();
        singLL.addFirst('a');
        singLL.print();
        singLL.addLast('e');
        singLL.print();
        singLL.insertAfter('a', 'c');
        singLL.print();
        singLL.insertBefore('e', 'd');
        singLL.print();
        singLL.insertAt(1, 'b');
        singLL.print();
    }
}
