/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomor4;

/**
 *
 * @author PERSONAL
 */
public class DataArrayMain {
    public static void main(String[] args){
         int[] angka = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};
         
         DataArray dataArr = new DataArray();
         System.out.println("Data array awal : ");
         for(int i=0; i <angka.length; i++){
            System.out.print(angka[i] + " "); 
        }
         
        System.out.println("\n");
        System.out.println("Data Setelah di urutkan : ");
        int[] array = dataArr.bubbleSort(angka);
        for(int i = 0; i < angka.length; i++){
            System.out.print(array[i] + " ");
        }
        
        System.out.println("\n");
        System.out.println("Pencarian data dengan Binary Search");
        int terbesar = array[array.length-1];
        int jml = 2;
        int jumlah = dataArr.JmlBinarySearch(array, terbesar, 0, array.length-1, jml);
        System.out.println("Data angka terbesar : " + terbesar);
        System.out.println("Terdapat " + jumlah + " data");
        int[] idx = new int[terbesar];
        int[] posisi = new int[jumlah];
        int indeks = 0;
        for(int i = 0; i < jumlah; i++){
        posisi = dataArr.IdxBinarySearch(array, terbesar, 0, array.length-1, idx, indeks);
            
        } 
        for(int j=0; j < jumlah; j++){
            System.out.println("Data " + terbesar + " terdapat pada indeks ke " + posisi[j]);
        }
    }

}
