/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomer5;

/**
 *
 * @author PERSONAL
 */
public class Bank {
    Nasabah head;
    Nasabah tail;

    public boolean IsEmpty(){
        return head == null;
    }

    public void print(){
        if (!IsEmpty()) {
            Nasabah temp = head;
            while (temp != null) {
                System.out.println("----------------------------------");
                System.out.println("Nama        : " + temp.nama);
                System.out.println("Alamat      : " + temp.alamat);
                System.out.println("No Rekening : " + temp.noRek);
                System.out.println("----------------------------------");
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("Data nasabah kosong");
        }
    }

   public void addFirst(String nm, String alm, int rek) {
        Nasabah ndInput = new Nasabah(nm, alm, rek, null);
        if (IsEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(String nm, String alm, int rek) {
        Nasabah ndInput = new Nasabah(nm, alm, rek, null);
        if (IsEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(int key, String nm, String alm, int rek) {
        Nasabah ndInput = new Nasabah(nm, alm, rek, null);
        Nasabah temp = head;
        do {
            if (temp.noRek == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null)
                    tail = ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, String nm, String alm, int rek) {
        if (index < 0) {
            System.out.println("Indeks tidak ditemukan");
        } else if (index == 0) {
            addFirst(nm, alm, rek);
        } else {
            Nasabah temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Nasabah(nm, alm, rek, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    public void insertBefore(int key, String nm, String alm, int rek) {
        Nasabah ndInput = new Nasabah(nm, alm, rek, null);
        Nasabah temp = head;
        do {
            if (temp.noRek == key) {
                addFirst(nm, alm, rek);
                break;
            } else if (temp.next.noRek == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void getData(int index) {
        Nasabah temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        System.out.println("----------------------------------");
        System.out.println("Nama        : " + temp.nama);
        System.out.println("Alamat      : " + temp.alamat);
        System.out.println("No Rekening : " + temp.noRek);
        System.out.println("----------------------------------");
    }

    public void getFirst() {
        Nasabah temp = head;
        System.out.println("----------------------------------");
        System.out.println("Nama        : " + temp.nama);
        System.out.println("Alamat      : " + temp.alamat);
        System.out.println("No Rekening : " + temp.noRek);
        System.out.println("----------------------------------");
    }

    public void getLast() {
        Nasabah temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.println("----------------------------------");
        System.out.println("Nama        : " + temp.nama);
        System.out.println("Alamat      : " + temp.alamat);
        System.out.println("No Rekening : " + temp.noRek);
        System.out.println("----------------------------------");
    }

    public int indexOf(int key) {
        Nasabah temp = head;
        int index = 0;
        while (temp != null && temp.noRek == key) {
            temp = temp.next;
            index++;
        }
        if (temp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        Nasabah temp = head;
        head = head.next;
        System.out.println("----------------------------------");
        System.out.println("Nama        : " + temp.nama);
        System.out.println("Alamat      : " + temp.alamat);
        System.out.println("No Rekening : " + temp.noRek);
        System.out.println("----------------------------------");
    }

    void removeLast() {
        if (IsEmpty()) {
            System.out.println("Data nasabah masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Nasabah temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(int key) {
        if (IsEmpty()) {
            System.out.println("Data nasabah masih kosong, tidak dapat dihapus!");
        } else {
            Nasabah temp = head;
            while (temp != null) {
                if ((temp.noRek == key) && (temp == head)) {
                    removeFirst();
                    break;
                } else if (temp.next.noRek == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Nasabah temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}

