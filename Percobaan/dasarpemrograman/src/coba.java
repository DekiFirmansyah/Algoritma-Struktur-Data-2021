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
public class coba {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nilai[][] = new int[4][4];
        int i, j, pancake = 0, puding = 0, rainbow = 0, bakpao = 0;
        
        for (i = 0; i < nilai.length; i++){
            for (j = 0; j < nilai[0].length; j++){
                System.out.print("Masukkan nilai ke [" + i + "][" + j + "] : ");
                nilai[i][j] = input.nextInt();
                if (j == 0){
                pancake += nilai[i][j];
                }else if (j == 1){
                puding += nilai[i][j];
                }else if (j == 2){
                rainbow += nilai[i][j];
                }else{
                bakpao += nilai[i][j];
                }
            }
            System.out.println("-----------------");
        }
        System.out.println(pancake);
        System.out.println(puding);
        System.out.println(rainbow);
        System.out.println(bakpao);
    }
}
