# Tugas Queue
## Pertanyaan 8.2.3

1. Pada method Create, mengapa atribut front dan rear diinisialisasi dengan nilai -1, tidak 0?    
jawab :     
karena untuk menunjukan  data dalam queue masih kosong, sebab indeks array pertama diawali oleh angka 0.

2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!    
<img src="8.2.3(nomor 2).png">      
jawab :      
sebuah kondisi yang digunakan ketika data paling belakang dari queue(rear) berada di indeks terakhir array. Jadi data baru akan menempati posisi indeks ke 0 artinya pada rear = 0.

3. Perhatikan kembali method Enqueue, baris kode program manakah yang menunjukkan bahwa data baru disimpan pada posisi terakhir di dalam queue?      
jawab :    
<img src="8.2.3(nomor 3).png"> 

4. Perhatikan kembali method Dequeue, baris kode program manakah yang menunjukkan bahwa data yang dikeluarkan adalah data pada posisi paling depan di dalam queue?      
jawab :        
<img src="8.2.3(nomor 4).png"> 

5. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!      
<img src="8.2.3(nomor 5).png">      
jawab :      
sebuah kondisi yang digunakan ketika data paling depan dari queue(front) berada di indeks terakhir array. Jadi data yang terambil adalah data pada indeks terakhir dan posisi front akan bergeser ke indeks ke 0.

6. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front?     
jawab :     
karena proses print dimulai dari data antrian pertama yaitu front, front merupakan data urutan pertama dari queue. Jika dimulai dari 0 maka akan terdapat data null pada beberapa indeks yang belum ditambahkan data atau telah dikeluarkan datanya.

7. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!        
<img src="8.2.3(nomor 7).png">      
jawab :     
kode program tersebut digunakan untuk melakukan pembaruan dan pengecekan kondisi dari i, jadi untuk perhitungan nilai (i + 1) di modulu dengan max yang hasilnya akan di cek pada kondisi i != rear.

## Pertanyaan 8.3.3

1. Perhatikan class Queue, apa fungsi kode program berikut pada method Dequeue?     
<img src="8.3.3(nomor 1).png">      
jawab :      
kode program tersebut untuk proses instansiasi untuk mengakses objek berparameter pada class Penumpang, untuk mengakses data yang berada dan ditampung di class Penumpang.

2. Pada soal nomor 1, apabila kode program tersebut diganti dengan kode berikut:    
<img src="8.3.3(nomor 2.1).png">    
Apakah yang terjadi? Mengapa demikian?     
jawab :         
<img src="8.3.3(nomor 2.2).png">      
kode program tersebut akan error, karena pada class Penumpang menggunakan objek yang berparameter sedangkan kode tersebut tidak memiliki parameter jadi tidak dapat mengakses data.

3. Tunjukkan kode program yang digunakan untuk menampilkan data yang dikeluarkan dari queue!      
jawab :        
<img src="8.3.3(nomor 3).png"> 

4. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear dapat dipanggil!       
jawab :         
<img src="8.3.3(nomor 4).png">       
<img src="8.3.3(nomor 4.1).png">


