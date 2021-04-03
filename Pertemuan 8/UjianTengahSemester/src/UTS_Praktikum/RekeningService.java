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
public class RekeningService {
    Rekening[] listRek = new Rekening[5];
    int rk;
    
    void tambah(Rekening r){
        if(rk < listRek.length){
            listRek[rk] = r;
            rk++;
        }
    }
    
    void tampilAll(){
        for(Rekening r : listRek){
            r.tampil();
        }
    }
    
     void sorting(){
        int banyak = listRek.length;
        for(int i = 0; i<banyak-1; i++) {
            for (int j = i+1; j<listRek.length; j++) {
                if(listRek[i].namaDepan.compareToIgnoreCase(listRek[j].namaDepan)>0) {
                    String temp = listRek[i].namaDepan;
                    listRek[i].namaDepan = listRek[j].namaDepan;
                    listRek[j].namaDepan = temp;
                }
            }
        }
    }
    
    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left + right) / 2;
            if(cari == listRek[mid].noRekening){
                return (mid);
            }else if(listRek[mid].noRekening < cari){
                return FindBinarySearch(cari, left, mid-1);
            }else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
