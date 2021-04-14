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
public class Stack {
    int size;
    int top;
    Struk[] data;
    
    public Stack(int size){
        this.size = size;
        data = new Struk[size];
        top = -1;
    }
    
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }else {
            return false;
        }
    }
    
    public boolean isFull(){
        if(top == size - 1){
            return true;
        }else {
            return false;
        }
    }
    
    public void push(Struk sk){
        if(!isFull()){
            top++;
            data[top] = sk;
        }else {
            System.out.println("Isi stack penuh!");
        }
    }
    
    public void pop(){
        if(!isEmpty()){
            Struk x = data[top];
            top--;
            System.out.println("Nomor transaksi : " + x.noTransaksi);
            System.out.println("Tanggal pembelian : " + x.tglBeli);
            System.out.println("Jumlah barang yang dibeli : " + x.jmlBarang);
            System.out.println("Total harga bayar : " + x.totalHarga);
        }else {
            System.out.println("Stack masih kosong");
        }
    }
    
    public void print(){
        for(int i = top; i >= 0; i--){
            System.out.println("-------------------------------------");
            System.out.println("Nomor transaksi : " + data[i].noTransaksi);
            System.out.println("Tanggal pembelian : " + data[i].tglBeli);
            System.out.println("Jumlah barang yang dibeli : " + data[i].jmlBarang);
            System.out.println("Total harga bayar : " + data[i].totalHarga);
            System.out.println("-------------------------------------");
        }
    }
}
