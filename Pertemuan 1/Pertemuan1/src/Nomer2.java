/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PERSONAL
 */
public class Nomer2 {
    
    public static void main(String[] args) {
        
        int saldo = 1000000,n = 1;
        double bunga = 0.02;
        
        for(int i = 0; i < n; i++){
            int jumlahSaldo = (int)(saldo + (saldo * bunga));
            saldo = jumlahSaldo;
            if(jumlahSaldo < 1500000){
                n++;
            }
        }
        System.out.println("Pada Bulan ke " + n + " saldo nasabah 1,5 Juta");
    }
}
