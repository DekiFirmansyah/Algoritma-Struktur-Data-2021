# Tugas Brute Force And Divide Conquer
## Pertanyaan 4.2.3

1. Jelaskan mengenai base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial!    
jawab : divide conquer sama seperti fungsi rekursif yaitu akan dilakukan pemanggilan fungsi tersbut sendiri dengan paramater (n - 1), dan akan berhenti sampai n = 1.

2. Pada implementasi Algoritma Divide and Conquer Faktorial apakah lengkap terdiri dari 3 tahapan divide, conquer, combine? Jelaskan masing-masing bagiannya pada kode program!     
jawab : 
    - Divide = pada penggunaan kondisi pemilihin (if/else), yaitu terjadi pembagian pada setiap nilai sesuai pemenuhan kondisi.
    - Conquer = pada proses pengolahan nilai, saat perkalian dengan fungsi itu sendiri.
    - Combine = pada bagian penggambungan hasil conquer dengan return

3. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan for?Buktikan!    
jawab : ya mungkin, contohnya yaitu,
<img src="4.2.3(nomor 3).png">
4. Tambahkan pegecekan waktu eksekusi kedua jenis method tersebut!    
jawab : 
# <img src="4.2.3(Nomor 4).png">
5. Buktikan dengan inputan elemen yang di atas 20 angka, apakah ada perbedaan waktu eksekusi?     
jawab :    
data input awal :
<img src="4.2.3(Nomor 5.1).png">
brute force :
<img src="4.2.3(nomor 5.2).png">   
divide conquer :   
<img src="4.2.3(Nomor 5.3).png">    
waktu eksekusi :   
<img src="4.2.3(Nomor 5.4).png">
## Pertanyaan 4.3.3
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!   
jawab : 
    - method pangkatBF() menggunakan fungsi iterative yaitu proses didalamnya menggunakan perulangan untuk menentukan hasil. 
    - method pangkatDC menggunakan fungsi rekrusif yaitu proses didalamnya menggunakan pemilihan if else yaitu pengecekan awal sebagai base case untuk batas dan jika tidak memenuhi kondisi awal maka akan dilakukan proses perhitungan dengan memanggil fungsi itu sendiri.
2. Pada method PangkatDC() terdapat potongan program sebagai berikut:
<img src="4.3.3(Nomor 2).png">
Jelaskan arti potongan kode tersebut  
jawab :    
Terdapat kondisi pemilihan if else,dimana jika nilai n(pangkat) dimodulus 2 dengan hasil 1 maka akan menghasilkan nilai ganjil sehingga akan dikalikan dengan bilangan pangkat yang sudah dibagi 2 dan bilangan itu sendiri yang akhirnya mengembalikan nilai itu sendiri. Dan jika pangkat selain itu akan
menghasilkan nilai pangkat bilangan genap yang akan dikalikan dengan bilangan pokok pangkat yang sudah dibagi 2.

3. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!   
jawab :  Sudah termasuk. Terdapat di method PangkatBF dan PangkatDC bagian return yang akan menggabungkan nilai tersebut.
<img src="4.3.3(Nomor 3).png">
4. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan konstruktor.   
jawab :    
Kontruktor :  
<img src="4.3.3(Nomor 4.1).png">   
Main :   
<img src="4.3.3(Nomor 4.2).png">
5. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan!
jawab :
# <img src="4.3.3(Nomor 5).png">

## Pertanyaan 4.4.3
1. Berikan ilustrasi perbedaan perhitungan keuntungan dengan method TotalBF() ataupun TotalDC()   
jawab : 
    - TotalBF() menggunakan perulangan yang nilai total akan diganti dengan total ditambahkan dengan nilai dari array parameter dengan indeks sesuai setiap perulangan.
    - TotalDC() yaitu panjang array dibagi oleh 2 dan akan dihitung disetiap bagian yang selanjutnya akan bergabung pada akhir.
2. Perhatikan output dari kedua jenis algoritma tersebut bisa jadi memiliki hasil berbeda di belakang koma. Bagaimana membatasi output di belakang koma agar menjadi standar untuk kedua jenis algoritma tersebut.  
jawab :
    - programnya yaitu :  
      System.out.println(“%.2f,x);
    - x = nilai yang akan dibatasi
    - 2f = untuk membatasi 2 angka dibelakang koma
3. Mengapa terdapat formulasi return value berikut?Jelaskan
<img src="4.4.3(Nomor 3).png">  
jawab : Digunakan untuk mengabungkan nilai yang telah dilakukan perhitungan sebeleumnya.

4. Kenapa dibutuhkan variable mid pada method TotalDC()?   
jawab : Digunakan untuk mencari nilai tengah yang selanjutnya memisahkan data setelah dan sesudah nilai tengah.
5. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu
perusahaan saja. Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa perusahaan. (Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda) ? Buktikan dengan program!  
jawab :     
# <img src="4.4.3(Nomor 5).png">