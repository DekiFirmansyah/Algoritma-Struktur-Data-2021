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
public class BinaryTreeArray {
    int[] data;
    int idxLast;
    Node root;
    
    public BinaryTreeArray(){
        data = new int[10];
    }
    
    void populateData(int[] data, int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    
    public Node add(int[] data, Node root, int i){
        if(i < data.length){
            Node temp = new Node(data[i]);
            root = temp;
            root.left = add(data, root.left, 2*i+1);
            root.right = add(data, root.right, 2*i+2);
        }
        return root;
    }
    
    void traverseInOrder(Node root){
        if(root != null){
            if(root.data != 0){
                traverseInOrder(root.left);
                System.out.print(root.data + " ");
                traverseInOrder(root.right);
            }        }
    }

    void traversePreOrder(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            traverseInOrder(root.left);
            traverseInOrder(root.right);
        }
    }
    
    void traversePostOrder(Node root){
        if(root != null){
            traverseInOrder(root.left);
            traverseInOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
}
