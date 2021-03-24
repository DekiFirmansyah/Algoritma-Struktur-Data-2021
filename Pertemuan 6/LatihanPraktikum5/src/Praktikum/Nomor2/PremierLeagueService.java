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
public class PremierLeagueService {
    PremierLeague[] leagues = new PremierLeague[20];
    int tm;
    
    void tambah(PremierLeague pl){
        if(tm < leagues.length){
            leagues[tm] = pl;
            tm++;
        }
    }
    void tampilAll(){
        for(PremierLeague pl : leagues){
            pl.tampil();
        }
    }
    void insertionSort(boolean asc){
        for(int i = 1; i < leagues.length; i++){
            PremierLeague temp = leagues[i];
            int j = i;
            if (asc){
                while(j > 0 && leagues[j - 1].point > temp.point){
                    leagues[j] = leagues[j - 1];
                    j--;
                }
            }else {
                while(j > 0 && leagues[j - 1].point < temp.point){
                leagues[j] = leagues[j - 1];
                j--;
                }
            }            
            leagues[j] = temp;
        }
        
    }
}
