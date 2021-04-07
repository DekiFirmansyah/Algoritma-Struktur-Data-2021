/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PemilihanKetua;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class VotingKetuaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        VotingKetua vk = new VotingKetua();
        int[] pilih = new int[8];
        String calon = "";
        
        System.out.println("********* PEMILIHAN KETUA BEM *********");
        System.out.println();
        System.out.println("----- Daftar Calon Ketua -----");
        System.out.println("1. Haris \n2. Dian \n3. Rani \n4. Bisma");
        System.out.println("\nPilih calon ketua dengan memasukkan nomer urutan calon");
        
        for(int i = 0; i < pilih.length; i++){
            System.out.print("Pemilih " + (i + 1) + ", pilihan calon : ");
            pilih[i] = sc.nextInt();
        }
        
        int vote = vk.VotingKetua(pilih, 0, pilih.length);
        if(vote == 1){
            calon = "Haris";
        }else if(vote == 2){
            calon = "Dian";
        }else if(vote == 3){
            calon = "Rani";
        }else if(vote == 4){
            calon = "Bisma";
        }else {
            System.out.println("Pilihan yang anda masukkan salah!");
        }
        
        System.out.println("*****************************************************************************************");
        System.out.println("Ketua terpilih dengan suara terbanyak adalah " + calon + " dengan nomer urut " + vote);
        System.out.println("*****************************************************************************************");
    }
}
