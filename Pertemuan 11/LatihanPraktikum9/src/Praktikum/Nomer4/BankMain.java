/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomer4;

/**
 *
 * @author PERSONAL
 */
public class BankMain {
    public static void main(String[] args) {
        Bank bk1 = new Bank();
        
        bk1.addFirst("Andri Simorongkir", "Jl. Gedangmas No. 34 Tulungagung", 123987456);
        bk1.print();
        bk1.addLast("Bambang Saptaji", "Jl. Baru No. 2 Bekasi", 789123654);
        bk1.print();
        bk1.insertBefore(123987456, "Galuh Vinka", "Jl. Bayeman No. 56 Pacitan", 456987303);
        bk1.print();
        bk1.insertAfter(789123654, "Hendra Suyadi", "Jl. Semar No. 21 Cangar", 345789102);
        bk1.print();
        bk1.insertAt(2, "Ziza Candragista", "Jl. Manyar No. 14 Buduran", 101203345);
        bk1.print();
        
        System.out.println("Data pada indeks ke-2 : ");
        bk1.getData(2);
        System.out.println("\nData 1 berada pada indeks ke-" + bk1.indexOf(123987456));
        System.out.println();
        
        bk1.remove(101203345);
        bk1.print();
        bk1.removeAt(1);
        bk1.print();
        bk1.removeFirst();
        bk1.print();
        bk1.removeLast();
        bk1.print();
    }
}
