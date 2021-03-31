/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomor3;


/**
 *
 * @author PERSONAL
 */
public class PencarianData {
    public int FindSeqSearch(int[][] data, int cari){
       for(int i=0; i < data.length; i++){
           for(int j=0; j<data[i].length; j++){
               if(data[i][j]==cari){
                   System.out.println("Angka " + cari + " berada pada baris ke " + (i+1) + " dan kolom ke " + (j+1));
                   break;
               }
           }
       }
        return 0;
    }

}
