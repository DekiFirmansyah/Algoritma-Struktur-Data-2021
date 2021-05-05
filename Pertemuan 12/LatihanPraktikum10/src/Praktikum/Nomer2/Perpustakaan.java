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
public class Perpustakaan {
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
            System.out.println("------------------------");
            System.out.println("Cetak Seluruh Judul Buku");
            System.out.println("------------------------");
            while (tmp != null){
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
            System.out.println("");
        }else {
            System.out.println("Data Buku Perpustakaan kosong!");
        }
    }
    
    public void push(String input){
        Node ndInput = new Node(null, input, null);
        System.out.println("-------------------");
        System.out.println("Masukkan Judul Buku");
        System.out.println("-------------------");
        if(isEmpty()){
            top = ndInput;
        }else {
            ndInput.data = input;
            ndInput.next = top;
            top = ndInput;
        }
    }
    
    public void pop(String input){
        Node ndInput = new Node(null, input, null);
        if(isEmpty()){
            System.out.println("Data Buku Perpustakaan masih kosong, belum bisa diambil");
        }else {
            input = top.data;
            ndInput = top;
            top = top.next;
            System.out.println("----------------------------------------");
            System.out.println("Buku pada tumpukan teratas telah diambil");
            System.out.println("----------------------------------------");
        }
    }
     public void peek(){
         Node data;
         if(isEmpty()){
            System.out.println("Data Buku Perpustakaan kosong!");
         }else {
            System.out.println("----------------"); 
            System.out.println("Cek Buku Teratas");
            System.out.println("----------------");
            System.out.println(top.data);
         }
     }
}
