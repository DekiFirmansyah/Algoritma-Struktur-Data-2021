# Tugas Objek 2
## Pertanyaan 2.2.3
1. Sebutkan 2 karakteristik class/objek?  
jawab : Atribut dan Method

2. Kata kunci apakah yang digunakan untuk mendeklarasikan class?  
jawab : kata kuncinya adalah "class"

3. Perhatikan class Barang yang ada di praktikum di atas, ada berapa atribut yang dimiliki oleh class tersebut? sebutkan! Dan pada baris berapa saja deklarasi atribut dilakukan?  
jawab : 
   - String namaBarang, jenisBarang; (baris 3)
   - int stok, hargaSatuan; (baris 4)

4. Ada berapa method yang dimiliki oleh class tersebut? sebutkan! Dan pada baris berapa saja deklarasi method dilakukan?  
jawab : 
   - void tampilBarang() => (baris 6)
   - void tambahStok(int n) => (baris 12)
   - void kurangiStok(int n) => (baris 15)
   - int hitungHargaTotal(int jumlah) => (baris 18)

5. Perhatikan method kurangiStok() yang ada di class Barang, modifikasi isi method tersebut sehingga proses pengurangan hanya dilakukan jika stok masih ada (masih lebih besar dari 0)!  
jawab :  
<img src="2.2.3(nomor 5).png">

6. Menurut anda, mengapa method tambahStok() dibuat dengan memiliki parameter berupa bilangan int?  
jawab : menggunakan tipe data int karena dalam perhitungan menambah stok menggunakan tipe data int, karena jika tipe data berbeda dengan tipe data stok maka diperlukan casting.

7. Menurut anda mengapa method hitungHargaTotal() memiliki tipe data int?  
jawab : karena digunakan untuk mengembalikan nilai hasil perkalian (jumlah * hargaSatuan) yang memiliki tipe data int, dalam program berupa kode return.

8. Menurut anda, mengapa method tambahStok() memiliki tipe data void?  
jawab : karena method tambahStok() tidak memiliki nilai yang akan dikembalikan untuk di proses, hanya digunakan untuk mengganti nilai dari atribut.

### Pertanyaan 2.3.3 
1. Pada class BarangMain, pada baris berapakah proses instansiasi dilakukan? dan apa nama objek yang dihasilkan?  
jawab : pada baris ke 15, nama objeknya yaitu (b1)

2. Bagaimana cara mengakses atribut dan method dari suatu objek?  
jawab : yaitu dengan cara menulis nama objek diawal dan titik lalu nama atribut atau method, yaitu sebagai berikut :
   - namaObjek.namaAtribut = nilaiAtribut;
   - namaObjek.namaMethod();

### Pertanyaan 2.4.3
1. Perhatikan class Barang yang ada di praktikum 2.4.1, pada baris berapakah deklarasi konstruktor berparameter dilakukan?     
jawab : pada baris ke 18, method Barang dengan memiliki 4 parameter.

2. Perhatikan class BarangMain di praktikum 2.4.1, apa sebenarnya yang dilakukan pada baris program dibawah ini?  
<img src="2.4.3(nomor 2).png">
jawab :
kode tersebut yaitu untuk instansiasi nilai yang akan dikirim dan diproses pada method Barang.

3. Coba buat objek dengan nama b3 dengan menggunakan konstruktor berparameter dari class Barang!  
Jawab :    
<img src="2.4.3(nomor 3).png">
