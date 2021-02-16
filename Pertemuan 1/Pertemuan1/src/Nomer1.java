/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PERSONAL
 */
public class Nomer1 {
    
    public static void main(String[] args) {
        
        // harga tarif per kg
        int tarif = 4500, total = 0, jumlah; 
        double diskon = 0.05;
        String[] customer = {"Ani", "Budi", "Bina", "Cita"};
        int[] beratPakaian = {4, 15, 6, 11}; 
        
        System.out.println("--- Smile Loundry ---");
        for(int i = 0; i < customer.length; i++){
            if(beratPakaian[i] > 10){
                jumlah = (int) ((tarif * beratPakaian[i]) - (diskon * tarif * beratPakaian[i]));
                total += jumlah;
            }else {
                total += tarif * beratPakaian[i];
            }
        }
        System.out.println("Total pendapatan : " + total);
    }
    
}
