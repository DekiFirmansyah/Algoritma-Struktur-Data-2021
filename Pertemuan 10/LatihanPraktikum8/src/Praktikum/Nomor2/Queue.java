/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomor2;

/**
 *
 * @author PERSONAL
 */
public class Queue {
    int max;
    int size;
    int front;
    int rear;
    Mahasiswa[] antrian;
    
    public Queue(int max){
        this.max = max;
        Create();
    }
    
    public void Create(){
        antrian = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }
    
    public boolean IsEmpty(){
        if(size == 0){
            return true;
        }else {
            return false;
        }
    }
    
    public boolean IsFull(){
        if(size == max){
            return true;
        }else {
            return false;
        }
    }
    
    public void Enqueue(Mahasiswa data){
        if(IsFull()){
            System.out.println("Daftar antrian sudah penuh");
        }else { 
            if(IsEmpty()){
                front = rear = 0;
            }else {
                if(rear == max - 1){
                    rear = 0;
                }else {
                    rear++;
                }
            }
            antrian[rear] = data;
            size++;
        }
    }
    
    public Mahasiswa Dequeue(){
        Mahasiswa data = new Mahasiswa("", "", 0, 0.0);
        
        if(IsEmpty()){
            System.out.println("Daftar antrian masih kosong");
        }else {
            data = antrian[front];
            size--;
            if(IsEmpty()){
                front = rear = -1;
            }else {
                if(front == max - 1){
                    front = 0;
                }else {
                    front++;
                }
            }
        }
        return data;
    }
    
    public void print(){
        if(IsEmpty()){
            System.out.println("Daftar antrian masih kosong");
        }else {
            int i = front;
            System.out.println("-------------------------------");
            while (i != rear){
                System.out.println("NIM Mahasiswa : " + antrian[i].nim);
                System.out.println("Nama Mahasiswa : " + antrian[i].nama);
                System.out.println("Absen Mahasiswa : " + antrian[i].absen);
                System.out.println("IPK Mahasiswa : " + antrian[i].ipk);
                i = (i + 1) % max;
                System.out.println("-------------------------------");
            }
            System.out.println("NIM Mahasiswa : " + antrian[i].nim);
            System.out.println("Nama Mahasiswa : " + antrian[i].nama);
            System.out.println("Absen Mahasiswa : " + antrian[i].absen);
            System.out.println("IPK Mahasiswa : " + antrian[i].ipk);
            System.out.println("-----------------------------------");
            System.out.println("\nJumlah elemen = " + size);
        }
    }
    
    public void clear(){
        if(!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Daftar antrian berhasil dikosongkan");
        }else {
            System.out.println("Daftar antrian masih kosong");
        }
    }
    
    public void peek(){
        if(!IsEmpty()){
            System.out.println("-----------------------------------");
            System.out.println("NIM Mahasiswa : " + antrian[front].nim);
            System.out.println("Nama Mahasiswa : " + antrian[front].nama);
            System.out.println("Absen Mahasiswa : " + antrian[front].absen);
            System.out.println("IPK Mahasiswa : " + antrian[front].ipk);
            System.out.println("-----------------------------------");
        }else {
            System.out.println("Daftar antrian masih kosong");
        }
    }
    
    public void peekRear(){
        if(!IsEmpty()){
            System.out.println("-----------------------------------");
            System.out.println("NIM Mahasiswa : " + antrian[rear].nim);
            System.out.println("Nama Mahasiswa : " + antrian[rear].nama);
            System.out.println("Absen Mahasiswa : " + antrian[rear].absen);
            System.out.println("IPK Mahasiswa : " + antrian[rear].ipk);
            System.out.println("-----------------------------------");
        }else {
            System.out.println("Daftar antrian masih kosong");
        }
    }
    
    public void peekPosition(String nim){
        if(IsEmpty()){
            System.out.println("Daftar antrian masih kosong");
        }else {
            for(int i = 0; i < max; i++){
                if(antrian[i].nim.equalsIgnoreCase(nim)){ 
                    System.out.println("Dengan NIM Mahasiswa " + nim + " berada pada antrian ke " + (i + 1));
                    break;
                }
            }
        }
    }
    
    public void printMahasiswa(int posisi){
        if(IsEmpty()){
            System.out.println("Daftar antrian masih kosong");
        }else {
            for(int i = 0; i < max; i++){
                if(i == (posisi - 1)){
                    System.out.println("Data Mahasiswa pada antrian ke " + posisi);
                    System.out.println("NIM Mahasiswa : " + antrian[i].nim);
                    System.out.println("Nama Mahasiswa : " + antrian[i].nama);
                    System.out.println("Absen Mahasiswa : " + antrian[i].absen);
                    System.out.println("IPK Mahasiswa : " + antrian[i].ipk);
                }
            }
        }
    }
}
