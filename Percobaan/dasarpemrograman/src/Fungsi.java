
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
public class Fungsi {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i;
        for(i = 0; i < 20; i++){
            if(i % 2 == 1){
                if(i != 11 && i != 17){
                    System.out.print(i + " ");
                }
            } 
        }
        System.out.println();
        char[] kata = {'S','E','L','A','M','A','T'};
           
        for(i = kata.length; i > 0; i--){
            System.out.print(kata[i - 1]);
        }
        System.out.println();
        
        int waktu;
        int satuHari = 86400, satuJam = 3600, satuMenit = 60;
        System.out.print("masukkan waktu : ");
        waktu = sc.nextInt();
        
        
            if(waktu > satuHari){
                konversiHari(waktu, satuHari, satuJam, satuMenit);
            }else if(waktu > satuJam){
                konversiJam(waktu, satuJam, satuMenit);
            }else if(waktu > satuMenit){
                konversiMenit(waktu, satuMenit);
            }else {
                System.out.println(waktu + " detik");
            }   
    }
    static void konversiHari(int a, int x, int y, int z){
        int hari = a / x;
        a -= (hari * x);
        int jam = a / y;
        a -= (jam * y);
        int menit = a / z;
        a -= (menit * z);
        System.out.println(hari + " hari " + jam + " jam " + menit + " menit " + a + " detik");
    }
    static void konversiJam(int a, int y, int z){
        int jam = a / y;
        a -= (jam * y);
        int menit = a / z;
        a -= (menit * z);
        System.out.println(jam + " jam " + menit + " menit " + a + " detik");
    } 
    static void konversiMenit(int a, int z){
        int menit = a / z;
        a -= (menit * z);
        System.out.println(menit + " menit " + a + " detik");
        
    }
}
