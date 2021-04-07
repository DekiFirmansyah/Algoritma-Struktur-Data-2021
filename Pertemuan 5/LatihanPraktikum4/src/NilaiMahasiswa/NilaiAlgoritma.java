/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NilaiMahasiswa;

// Nomor 1
public class NilaiAlgoritma {
    public String namaMhs;
    public int nilaiTugas;
    public int nilaiKuis;
    public int nilaiUts;
    public int nilaiUAs;

    public NilaiAlgoritma (String m, int nt, int nk, int nuts, int nuas){
        namaMhs = m;
        nilaiTugas = nt;
        nilaiKuis = nk;
        nilaiUts = nuts;
        nilaiUAs = nuas;
        
    }
    // Nomor 1
    public double hitungTotalNilai(){
        double total;
        
        total = ((nilaiTugas * 0.3)+(nilaiKuis * 0.2)+(nilaiUts * 0.2)+(nilaiUAs * 0.3));
        return total;
    }
    
    // nomor 3
    public double NilaiRata(double arr[]){
        double jumlah = arr.length, total = 0, rerata;
    
        for(int i =0; i<jumlah; i++){
        total +=arr[i];
        }
    
        rerata = total/jumlah;
        return rerata;
    }
    
}

