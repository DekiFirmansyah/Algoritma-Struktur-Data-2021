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
public class Vaksinasi {
    int size;
    Node data;
    
    public Vaksinasi(){
        data = null;
        size = 0;
        
    }
    
    public boolean isEmpty() {
        return data == null;
    }
    
    public void enqueue(int na, String n){
        if(isEmpty()){
            data = new Node(null, na, n, null);
            size++;
        }else {
            Node current = data;
            while(current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, na, n, null);
            current.next = newNode;
            size++;
        }
    }
    
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Daftar antrian vaksinasi masih kosong!");
        }else if(data.next == null){
            System.out.println(data.nama + " telah selesai divaksinasi");
            data = null;
            size--;
            return;
        }else {
            System.out.println(data.nama + " telah selesai divaksinasi");
            data = data.next;
            data.prev = null;
            size--;
        }
        print();
    }
    
    public void print(){
        if (!isEmpty()) {
            Node temp = data;
            System.out.println("+++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("+++++++++++++++++++++++");
            while (temp != null) {
                System.out.println("----------------------------------");
                System.out.println("No antrian  : " + temp.noAntri);
                System.out.println("Nama        : " + temp.nama);
                System.out.println("----------------------------------");
                temp = temp.next;
            }
            System.out.println("Sisa antrian : " + size);
            System.out.println();
        } else {
            System.out.println("Data nasabah kosong");
        }
    }
}
