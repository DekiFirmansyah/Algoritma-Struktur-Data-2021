/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author PERSONAL
 */
public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        
        bt.addData(6);
        bt.addData(4);
        bt.addData(8);
        bt.addData(3);
        bt.addData(5);
        bt.addData(7);
        bt.addData(9);
        bt.addData(10);
        bt.addData(15);
        
        System.out.println("Traversal Pre Order");
        bt.traversePreOrder(bt.root);
        System.out.println("\n-------------------");
        
        System.out.println("Traversal In Order");
        bt.traverseInOrder(bt.root);
        System.out.println("\n-------------------");
        
        System.out.println("Traversal Post Order");
        bt.traversePostOrder(bt.root);
        System.out.println("\n-------------------");
        
        System.out.println("Pencarian data = 5");
        System.out.println("Find " + bt.find(5));
        System.out.println("-------------------");
        
        bt.delete(8);
        System.out.println("Menghapus data = 8");
        bt.traversePreOrder(bt.root);
        System.out.println("\n-------------------");
        
        System.out.println("Data paling kecil dan besar");
        System.out.println("Min : " + bt.findMin(bt.root));
        System.out.println("Max : " + bt.findMax(bt.root));
        System.out.println("-------------------");
        
        System.out.println("Data yang ada di leaf");
        bt.leaf(bt.root);
        System.out.println("");
        bt.leafJml(bt.root);
    }
}
