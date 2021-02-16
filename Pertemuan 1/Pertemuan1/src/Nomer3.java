
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PERSONAL
 */
import java.util.Scanner;
public class Nomer3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, x = 0;
        
        System.out.print("Masukkan nilai n : ");
        n = sc.nextInt();
        System.out.println();
        for(int i = 1; i < ((n * 3) + x); i++){
            if(i % 4 == 0){
                x += 1;
            }else {
                if(i % 2 == 0){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
