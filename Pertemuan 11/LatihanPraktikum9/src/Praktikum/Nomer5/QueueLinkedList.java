/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomer5;

/**
 *
 * @author PERSONAL
 */
public class QueueLinkedList {
    int max, size, front, rear;
    Bank data;

    QueueLinkedList(int mx) {
        max = mx;
        Create();
    }

    public void Create() {
        data = new Bank();
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
public void Enqueue(String nm, String alm, int rek) {
        if (IsFull()) {
            System.out.println("Daftar antrian sudah penuh");
        } else {
            data.addLast(nm, alm, rek);
            size++;
        }
    }

    public void Dequeue() {
        size--;
        data.removeFirst();
    }
    
    public void peek() {
        if (!IsEmpty()) {
            data.getFirst();
        } else {
            System.out.println("Daftar antrian masih kosong");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            data.getLast();
        } else {
            System.out.println("Daftar antrian masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Daftar antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                data.print();
                i = (i + 1) % max;
                System.out.println();
            }
            data.print();
            System.out.println("Jumlah antrian : " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            data = new Bank();
            size = 0;
            System.out.println("Data antrian berhasil dikosongkan");
        } else {
            System.out.println("Daftar antrian masih kosong");
        }
    }

    public void peekPosition(int rek){
        if(IsEmpty()){
            System.out.println("Daftar antrian masih kosong");
        }else {
            System.out.println("Dengan NIM Mahasiswa " + rek + " berada pada antrian ke " + data.indexOf(rek));
        }
    }
    
    public void printNasabah(int posisi){
        if(IsEmpty()){
            System.out.println("Daftar antrian masih kosong");
        }else {
            System.out.println("Data pada indeks ke " + posisi);
            data.getData(posisi);
        }
    }
}
