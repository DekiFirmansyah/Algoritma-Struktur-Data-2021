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
public class PremierLeague {
    public int play, goal, point;
    public String team;
    
    public PremierLeague(String t, int p, int g, int pt){
        team = t;
        play = p;
        goal = g;
        point = pt;
    }
    void tampil(){
        System.out.println("Nama team : " + team);
        System.out.println("Jumlah main : " + play);
        System.out.println("Jumlah goal : " + goal);
        System.out.println("Jumlah Point : " + point);
    }
}
