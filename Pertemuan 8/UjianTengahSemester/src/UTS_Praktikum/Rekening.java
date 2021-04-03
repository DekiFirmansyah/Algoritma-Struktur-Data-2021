/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_Praktikum;

/**
 *
 * @author PERSONAL
 */
public class Rekening {
    public int noRekening;
    public String namaDepan;
    public String namaBelakang;
    public int phone;
    public String email;
    
    Rekening(int a, String b, String c, int d, String e){
        noRekening = a;
        namaDepan = b;
        namaBelakang = c;
        phone = d;
        email = e;
             
    }
    
    void tampil(){
        System.out.println("Nomer Rekening : " + noRekening);
        System.out.println("Nama Depan : " + namaDepan);
        System.out.println("Nama Belakang : " + namaBelakang);
        System.out.println("Nomer Hp : " + phone);
        System.out.println("Alamat email : " + email);
    }
}
