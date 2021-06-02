/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author PERSONAL
 */
public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        //int idxLast = 6;
        //bta.populateData(data, idxLast);
        bta.root = bta.add(data, bta.root, 0);
        
        System.out.println("Traversal In Order");
        bta.traverseInOrder(bta.root);
        System.out.println("\n-------------------");
        
        System.out.println("Traversal Pre Order");
        bta.traversePreOrder(bta.root);
        System.out.println("\n-------------------");
        
        System.out.println("Traversal Post Order");
        bta.traversePostOrder(bta.root);
    }
}
