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
public class StackLinkedList {
    Node top;
    
    public void create(){
        top = null;
    }
    
    public boolean isEmpty(){
        return top == null;
    }
    
    public void print(){
        if(!isEmpty()){
            Node tmp = top;
            System.out.print("Isi Linked List :\t");
            while (tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else {
            System.out.println("Linked List kosong");
        }
    }
    
    public void push(String input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            top = ndInput;
        }else {
            ndInput.data = input;
            ndInput.next = top;
            top = ndInput;
        }
    }
    
    public void pop(String input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
        }else {
            input = top.data;
            ndInput = top;
            top = top.next;
            System.out.println("Data yang terhapus : " + input);
        }
    }
    
    public void clear(){
        String x = "";
        while(!isEmpty())pop(x);
    }
}
