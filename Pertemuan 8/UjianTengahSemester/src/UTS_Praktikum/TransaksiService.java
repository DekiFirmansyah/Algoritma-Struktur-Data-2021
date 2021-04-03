/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_Praktikum;

/**
 *
 * @author PERSONAL
 */
public class TransaksiService {
    Transaksi[] listTs = new Transaksi[5];
    int ts;
    
    void tambah(Transaksi t){
        if(ts < listTs.length){
            listTs[ts] = t;
            ts++;
        }
    }
    
    void tampilAll(){
        for(Transaksi t : listTs){
            t.tampil();
        }
    }

     void FindSeqSearch(int cari){
        System.out.println("---------------------------------");
        for(int i=0;i<listTs.length;i++){
            if(listTs[i].saldo > cari){
 
            }
        }
        System.out.println("----------------------------------");
    }
    }
}
