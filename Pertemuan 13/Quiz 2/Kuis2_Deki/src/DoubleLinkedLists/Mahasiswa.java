/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleLinkedLists;

/**
 *
 * @author PERSONAL
 */
public class Mahasiswa {
    Node data;
    int size;
    
    public Mahasiswa(){
        data = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return data == null;
    }
    
    public void addFirst(int nim, String nama, String jurusan, String prodi, double ipk){
        if(isEmpty()){
            data = new Node(null, nim, nama, jurusan, prodi, ipk, null);
        }else {
            Node newMhs = new Node(null, nim, nama, jurusan, prodi, ipk, data);
            data.prev = newMhs;
            data = newMhs;
        }
        size++;
    }
    
    public void addLast(int nim, String nama, String jurusan, String prodi, double ipk){
        if(isEmpty()){
            addFirst(nim, nama, jurusan, prodi, ipk);
        }else {
            Node current = data;
            while(current.next != null){
                current = current.next;
            }
            Node newMhs = new Node(current, nim, nama, jurusan, prodi, ipk, null);
            current.next = newMhs;
            size++;
        } 
    }
    
    public void add(int nim, String nama, String jurusan, String prodi, double ipk, int index) {
        if(isEmpty()){
            addFirst(nim, nama, jurusan, prodi, ipk);
        }else if(index < 0 || index > size){
            System.out.println("Nilai indeks di luar batas");
        }else {
            Node current = data;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            if(current.prev == null){
                Node newMhs = new Node(null, nim, nama, jurusan, prodi, ipk, current);
                current.prev = newMhs;
                data = newMhs;
            }else {
                Node newNode = new Node(current.prev, nim, nama, jurusan, prodi, ipk, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
    public int size(){
        return size;
    }
    
    public void clear(){
        data = null;
        size = 0;
    }
    
    public void print(){
        if(!isEmpty()){
            Node temp = data;
            System.out.println("====================");
            System.out.println("Cetak Data Mahasiswa");
            System.out.println("====================");
            while (temp != null){
                System.out.println("----------------------------------");
                System.out.println("NIM     : " + temp.nim);
                System.out.println("Nama    : " + temp.nama);
                System.out.println("Jurusan : " + temp.jurusan);
                System.out.println("Prodi   : " + temp.prodi);
                System.out.println("IPK     : " + temp.ipk);
                System.out.println("----------------------------------");
                temp = temp.next;
            }
            System.out.println("\nSemua data berhasil dicetak");
        }else {
            System.out.println("Data Mahasiswa kosong");
        }
    }
    
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Data Mahasiswa kosong, tidak dapat dihapus!");
        }else if(size == 1){
            removeLast();
        }else {
            data = data.next;
            data.prev = null;
            size--;
        }
    }
    
    public void removeLast(){
        if(isEmpty()){
            System.out.println("Data Mahasiswa kosong, tidak dapat dihapus!");
        }else if(data.next == null){
            data = null;
            size--;
            return;
        }else { 
            Node current = data;
            while(current.next.next != null){
               current = current.next;
            }
            current.next = null;
            size--;
        }
    }
    
    public void remove(int nim){
        if(isEmpty()){
            System.out.println("Data Mahasiswa kosong, tidak dapat dihapus!");
        }else {
            Node current = data;
            
            while(current.nim != nim){
                current = current.next;
            }
            if(current.next == null){
                current.prev.next = null;
            }else if(current.prev == null){
                current = current.next;
                current.prev = null;
                data = current;
            }else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    
    public void getFirst(){
        if(isEmpty()){
            System.out.println("Data Mahasiswa kosong, tidak dapat dihapus!");
        }else {
            Node temp = data;
            System.out.println("=============================");
            System.out.println("Data Mahasiswa Urutan Pertama");
            System.out.println("=============================");
            if(temp.prev == null){
                System.out.println("----------------------------------");
                System.out.println("NIM     : " + temp.nim);
                System.out.println("Nama    : " + temp.nama);
                System.out.println("Jurusan : " + temp.jurusan);
                System.out.println("Prodi   : " + temp.prodi);
                System.out.println("IPK     : " + temp.ipk);
                System.out.println("----------------------------------");
            }
        }
    }
    
    public int getData(int cari){
        Node temp = data;
        int index = 0;
        while (temp != null && temp.nim != cari){
            temp = temp.next;
            index++;
        }
        
        if(temp == null){
            return -1;
        }else {
            return index;
        }
    }
    
    public void sorting(){
        int swap, i;
        Node p1;
        Node p2 = null;
        
        if(isEmpty()){
            System.out.println("Data Mahasiswa kosong!");
        }
        do {
            swap = 0;
            p1 = data;
            while (p1.next != p2){
                if(p1.ipk > p1.next.ipk){
                    double t = p1.ipk;
                    p1.ipk = p1.next.ipk;
                    p1.next.ipk = t;
                    swap = 1;
                }
                p1 = p1.next;
            }
            p2 = p1;
        }
        while (swap != 0);
    }
}
