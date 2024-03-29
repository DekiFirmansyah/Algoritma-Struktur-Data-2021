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
public class BinaryTree {
    Node root;
    
    public BinaryTree(){
        root = null;
    }
    
    boolean isEmpty(){
        return root == null;
    }
    
    void add(int data){
        if(isEmpty()){
            root = new Node(data);
        }else {
            Node current = root;
            while(true){
                if(data < current.data){
                    if(current.left != null){
                        current = current.left;
                    }else {
                        current.left = new Node(data);
                        break;
                    }
                }else if(data > current.data){
                    if(current.right != null){
                        current = current.right;
                    }else {
                        current.right = new Node(data);
                        break;
                    }
                }else {
                    break;
                }
            }
        }
    }
    
    //Nomer 1 Penambahan data baru dengan rekursif
    void addData(int data){
        addRekursif(data, root);
    }
    
    void addRekursif(int n, Node node){
        if(isEmpty()){
            root = new Node(n);
            return;
        }else if(n < node.data){
            if(node.left != null){
                addRekursif(n, node.left);
            }else {
                node.left = new Node(n);
            }
        }else if(n > node.data){
            if(node.right != null){
                addRekursif(n, node.right);
            }else {
                node.right = new Node(n);
            }
        }
    }
    //Nomer 1 End
    
    boolean find(int data){
        boolean hasil = false;
        Node current = root;
        while(current != null){
            if(current.data == data){
                hasil = true;
                break;
            }else if(data < current.data){
                current = current.left;
            }else {
                current = current.right;
            }
        }
        return hasil;
    }
    
    //Nomer 2 Menampilkan nilai terkecil dan terbesar
    int findMin(Node node){
        if(node == null){
            return 0;
        }else {
            if(node.left == null){
                int hasil = node.data;
                return hasil;
            }else {
                return findMin(node.left);
            }
        }        
    }
    
    int findMax(Node node){
        if(node == null){
            return 0;
        }else {
            if(node.right == null){
                int hasil = node.data;
                return hasil;
            }else {
                return findMax(node.right);
            }
        }      
    }
    // Nomer 2 End
    
    //Nomer 3 Menampilkan data yang ada di leaf
    void leaf(Node node){
        if(node == null){
            System.out.println("Kosong!");
        }
        if(node.left != null){
            leaf(node.left);
        }
        if(node.right != null){
            leaf(node.right);
        }
        if(node.left == null && node.right == null){
            System.out.print(" " + node.data);
        }
    }
    //Nomer 3 End
    
    //Nomer 4 Menampilkan jumlah leaf
    void leafJml(Node node){
        int jml = 0;
        if(node == null){
            System.out.println("kosong!");
        }else {
            if(node.left != null){
            leafJml(node.left);
            }
            if(node.right != null){
            leafJml(node.right);
            }
            if(node.left == null && node.right == null){
                jml += 1;              
            }
        }
        System.out.println("Jumlah : " + jml);
        
    }
    //Nomer 4 End
    
    void traversePreOrder(Node node){
        if(node != null){
            System.out.print(" " +node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    void traversePostOrder(Node node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " +node.data);
        }
    }
    
    void traverseInOrder(Node node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }
    
    Node getSuccessor(Node del){
        Node successor = del.right;
        Node successorParent = del;
        while (successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    
    void delete(int data){
        if(isEmpty()){
            System.out.println("Tree is empty!");
            return;
        }
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while(current != null){
            if(current.data == data){
                break;
            }else if(data < current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if(data > current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        
        if(current == null){
            System.out.println("Couldn't find data!");
            return;
        }else {
            if(current.left == null && current.right == null){
                if(current == root){
                    root = null;
                }else {
                    if(isLeftChild){
                        parent.left = null;
                    }else {
                        parent.right = null;
                    }
                }
            }else if(current.left == null){
                if(current == root){
                    root = current.right;
                }else {
                    if(isLeftChild){
                        parent.left = current.right;
                    }else {
                        parent.right = current.right;
                    }
                }
            }else if(current.right == null){
                if(current == root){
                    root = current.left;
                }else {
                    if(isLeftChild){
                        parent.left = current.left;
                    }else {
                        parent.right = current.left;
                    }
                }
            }else {
                Node successor = getSuccessor(current);
                if(current == root){
                    root = successor;
                }else {
                    if(isLeftChild){
                        parent.left = successor;
                    }else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }

}
