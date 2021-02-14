/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PERSONAL
 */
public class ProgramKu {
    
    static void tampilHingga(int i){
        for (int j = 1; j <= i; j++){
            if(j % 2 == 0){
                System.out.print(j);
            }
        }
    }
//    static int jumlah(int bil1, int bil2){
//        return(bil1 + bil2);
//    }
//    static void tampilJumlah(int bil1, int bil2){
//        tampilHingga(jumlah(bil1, bil2));
//    }
    
    public static void main(String[] args) {
//        int temp = jumlah(1, 1);
//        tampilJumlah(temp, 5);
        tampilHingga(100);
    }
}


