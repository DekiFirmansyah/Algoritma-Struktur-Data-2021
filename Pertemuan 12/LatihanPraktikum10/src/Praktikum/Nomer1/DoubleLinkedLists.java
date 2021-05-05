/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomer1;

/**
 *
 * @author PERSONAL
 */
public class DoubleLinkedLists {
    Node head;
    int size;
    
    public DoubleLinkedLists(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addFirst(int item){
        if(isEmpty()){
            head = new Node(null, item, null);
        }else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(int item){
        if(isEmpty()){
            addFirst(item);
        }else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        } 
    }
    
    public void add(int item, int index) {
        if(isEmpty()){
            addFirst(item);
        }else if(index < 0 || index > size){
            System.out.println("Nilai indeks di luar batas");
        }else {
            Node current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            if(current.prev == null){
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            }else {
                Node newNode = new Node(current.prev, item, current);
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
        head = null;
        size = 0;
    }
    
    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            System.out.println("Cetak Data");
            while (tmp != null){
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
        }else {
            System.out.println("Linked List Kosong");
        }
    }
    
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
        }else if(size == 1){
            removeLast();
        }else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
        }else if(head.next == null){
            head = null;
            size--;
            return;
        }else { 
            Node current = head;
            while(current.next.next != null){
               current = current.next;
            }
            current.next = null;
            size--;
        }
    }
    
    public void remove(int index){
        if(isEmpty() || index >= size){
            System.out.println("Nilai indeks di luar batas");
        }else if(index == 0){
            removeFirst();
        }else {
            Node current = head;
            int i = 0;
            while(i < index){
                current = current.next;
                i++;
            }
            if(current.next == null){
                current.prev.next = null;
            }else if(current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            }else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    
    public int getData(int cari){
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != cari){
            tmp = tmp.next;
            index++;
        }
        
        if(tmp == null){
            return -1;
        }else {
            return index;
        }
    }
    
    public void sorting(){
        int temp;
        Node p1;
        Node p2;
        Node min;
        
        if(head != null){
            p1 = head;
            while (p1.next != null){
                p2 = p1;
                min = p1;
                while (p2 != null){
                    if(p2.data < min.data){
                        min = p2;
                    }else {
                        p2 = p2.next;
                    }
                }
                if(p1.data > min.data){
                    temp = p1.data;
                    p1.data = min.data;
                    min.data = temp;
                }else {
                    p1 = p1.next;
                }
            }
        }
        
    }
}
