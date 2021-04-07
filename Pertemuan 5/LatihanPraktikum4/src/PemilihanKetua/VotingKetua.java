/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PemilihanKetua;

/**
 *
 * @author PERSONAL
 */
public class VotingKetua {
    
    public int VotingKetua(int[] pilih, int low, int high){
        if((high - low) == 1){
            if(pilih[low] == pilih[high]){
                return pilih[low];
            }else {
                return 0;
            }
        }else if(high > low){
            int mid = ((high - low) / 2) + low;
            int left = VotingKetua(pilih, low, mid);
            int right = VotingKetua(pilih, mid + 1, high);
            
            if(left != 0){
                return left;
            }else if(right != 0){
                return right;
            }else {
                return 0;
            }
        }else {
            return 0;
        }
        
    }
}
