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
public class PencarianMhs {
    Mahasiswa ListMhs[] = new Mahasiswa[5];
    int idx;
    
    PencarianMhs (int jumMhs){
        ListMhs = new Mahasiswa[jumMhs];
    }
    
    void tambah(Mahasiswa m){
        if(idx<ListMhs.length){
            ListMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh !!");
        }
    }
    
    void tampil(){
        for(Mahasiswa m : ListMhs){
            m.tampil();
            System.out.println("------------------------------------");
        }
    }
    
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for(int j=0; j<ListMhs.length; j++){
            if(ListMhs[j].nim == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    public void TampilPosisi(int x, int pos){
        if(pos!= -1){
        System.out.println("Data : " + x + "ditemukan pada indeks " + pos);
        }else{
            System.out.println("Data " + x + " tidak ditemukan");       
        }
    }
    
    public void TampilData(int x, int pos){
        if(pos!= -1){
            System.out.println("Nim\t : " + x);
            System.out.println("Nama\t : " + ListMhs[pos].nama);
            System.out.println("Nim\t : " + ListMhs[pos].umur);
            System.out.println("Nim\t : " + ListMhs[pos].ipk);   
        } else{
            System.out.println("Data " + x + "tidak di temukan");
        }
        
    }
    
    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left + right) / 2;
            if(cari == ListMhs[mid].nim){
                return (mid);
            }else if(ListMhs[mid].nim < cari){
                return FindBinarySearch(cari, left, mid-1);
            }else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
    
    void Nim(boolean asc){
        for(int i = 1; i < ListMhs.length; i++){
            Mahasiswa temp = ListMhs[i];
            int j = i;
            if(asc){
                while(j > 0 && ListMhs[j-1].nim > temp.nim){
                    ListMhs[j] = ListMhs[j-1];
                    j--;
                }
            }else{
                while (j > 0 && ListMhs[j-1].nim < temp.nim){
                    ListMhs[j] = ListMhs[j-1];
                    j--;
                }
            }
            ListMhs[j] = temp;
        }
    }

}
