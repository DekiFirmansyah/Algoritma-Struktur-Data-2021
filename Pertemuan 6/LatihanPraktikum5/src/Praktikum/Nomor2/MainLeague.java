/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomor2;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class MainLeague {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PremierLeagueService list = new PremierLeagueService();
        
        PremierLeague pl1 = new PremierLeague("Liverpool", 29, 45, 82);
        PremierLeague pl2 = new PremierLeague("Manchester City", 27, 39, 57);
        PremierLeague pl3 = new PremierLeague("Leicester", 28, 26, 48);
        PremierLeague pl4 = new PremierLeague("Chelsea", 29, 9, 50);
        PremierLeague pl5 = new PremierLeague("Wolverhampton Wanderers", 29, 7, 43);
        PremierLeague pl6 = new PremierLeague("Sheffield United", 28, 5, 43);
        PremierLeague pl7 = new PremierLeague("Manchester United", 28, 12, 42);
        PremierLeague pl8 = new PremierLeague("Tottenham Hotspur", 29, 7, 41);
        PremierLeague pl9 = new PremierLeague("Arsenal", 28, 4, 40);
        PremierLeague pl10 = new PremierLeague("Burnley", 29, -6, 39);
        PremierLeague pl11 = new PremierLeague("Crystal Palace", 29, -6, 39);
        PremierLeague pl12 = new PremierLeague("Everton", 29, -6, 37);
        PremierLeague pl13 = new PremierLeague("Newcastle United", 29, -16, 35);
        PremierLeague pl14 = new PremierLeague("Southampton", 29, -17, 34);
        PremierLeague pl15 = new PremierLeague("Brighton & Hove Albion", 29, -8, 29);
        PremierLeague pl16 = new PremierLeague("West Ham United", 29, -15, 27);
        PremierLeague pl17 = new PremierLeague("Watford", 29, -17, 27);
        PremierLeague pl18 = new PremierLeague("AFC Bournemouth", 29, -18, 27);
        PremierLeague pl19 = new PremierLeague("Aston Villa", 27, -18, 25);
        PremierLeague pl20 = new PremierLeague("Norwich City", 29, -27, 21);
        
        list.tambah(pl1);
        list.tambah(pl2);
        list.tambah(pl3);
        list.tambah(pl4);
        list.tambah(pl5);
        list.tambah(pl6);
        list.tambah(pl7);
        list.tambah(pl8);
        list.tambah(pl9);
        list.tambah(pl10);
        list.tambah(pl11);
        list.tambah(pl12);
        list.tambah(pl13);
        list.tambah(pl14);
        list.tambah(pl15);
        list.tambah(pl16);
        list.tambah(pl17);
        list.tambah(pl18);
        list.tambah(pl19);
        list.tambah(pl20);
        
        System.out.println("Mengurutkan kelasmen dari terkecil atau terbersar");
        System.out.print("Masukkan urut kelasmen(kecil/besar) : ");
        String urut = sc.nextLine();
        System.out.println("---------------------------");
        if(urut.equalsIgnoreCase("kecil")){
            System.out.println("Kelasmen Premier League");
            list.insertionSort(true);
        }else {
            System.out.println("Kelasmen Premier League");
            list.insertionSort(false);
        }
        
        list.tampilAll();
    }
}
