/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomor1;

/**
 *
 * @author PERSONAL
 */
public class TiketService {
    Tiket[] tkArr = new Tiket[4];
    int tt;
    
    void tambah(Tiket t){
        if (tt < tkArr.length){
            tkArr[tt] = t;
            tt++;
        }
    }
    
    void tampilAll(){
        for(Tiket t : tkArr){
            t.tampil();
        }
    }
    
    void bubbleSort(){
        for(int x = 0; x < (tkArr.length - 1); x++){
            for(int y = 1; y < (tkArr.length - x); y++){
                if(tkArr[y].harga < tkArr[y-1].harga){
                    Tiket tmp = tkArr[y];
                    tkArr[y] = tkArr[y-1];
                    tkArr[y-1] = tmp;
                }
            }
        }
    }
    
    void selectionSort(){
        for(int x = 0; x < (tkArr.length - 1); x++){
            int hrgMin = x;
            for(int y = (x + 1); y < tkArr.length; y++){
                if(tkArr[y].harga < tkArr[hrgMin].harga){
                    hrgMin = y;
                }
            }
            Tiket tmp = tkArr[hrgMin];
            tkArr[hrgMin] = tkArr[x];
            tkArr[x] = tmp;
        }
    }
}
