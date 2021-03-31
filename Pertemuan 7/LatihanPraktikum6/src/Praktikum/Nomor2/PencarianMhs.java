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
public class PencarianMhs {
    Mahasiswa[] ListMhs;
    int idx;
    
    PencarianMhs(int jumMhs){
        ListMhs = new Mahasiswa[jumMhs];
    }
    
    void tambah(Mahasiswa m){
        if(idx < ListMhs.length){
            ListMhs[idx]= m;
            idx++;
        }else{
        System.out.println("Data sudah penuh!!");
    }
    }
    void tampil(){
        for (Mahasiswa m:ListMhs){
        m.tampil();
        System.out.println("-----------------------");
    }
    }
    public int FindSeqSearch(String cari){
       int posisi= -1;
       for(int j=0; j<ListMhs.length;j++){
           if(ListMhs[j].nama.equalsIgnoreCase(cari)){
               posisi=j;
               break;
           }
       }
       return posisi;
    }
    public void TampilPosisi(String x, int pos){
        if(pos!=-1){
            System.out.println("Data : "+ x +" ditemukan pada indeks "+pos);
        }else{
            System.out.println("Data "+ x + " tidak ditemukan");
        }
    }
    public void TampilData(String x,int pos){
        if(pos!=-1){
            System.out.println("Nim\t : "+ListMhs[pos].nim);
            System.out.println("Nama\t : "+ListMhs[pos].nama);
            System.out.println("Umur\t : "+ListMhs[pos].umur);
            System.out.println("Ipk\t  : "+ListMhs[pos].ipk);
        }else{
            System.out.println("Data "+ x + " tidak ditemukan ");
        }
    }

}
