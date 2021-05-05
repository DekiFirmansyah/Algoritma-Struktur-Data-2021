# Tugas Double Linked List
## Pertanyaan 12.2.3
1. Jelaskan perbedaan antara single linked list dengan double linked lists!      
jawab : single memiliki 1 pointer yaitu next jadi hanya bisa melakukan pengecekan dan menunjukkan pada node setelahnya. Sedangkan double memiliki 2 pointer yaitu prev untuk menunjukkan node sebelumnya dan next untuk menunjukkan node setelahnya jadi memiliki 2 arah dapat lebih mudah dan cepat dalam pengecekan untuk menunjukkan node tertentu.

2. Perhatikan class Node, didalamnya terdapat atribut next dan prev. Untuk apakah atribut tersebut?      
jawab : double linked list memiliki 2 pointer yaitu prev untuk menunjukkan pada node sebelumnya dan next untuk menunjukkan pada node setelahnya, jadi memiliki 2 arah.

3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dansize seperti pada gambar berikut ini?      
<img src="12.2.3(nomor 3).png">       
jawab : berguna untuk pembuatan tempat atau ruang pada linked list yaitu dengan head(posisi awal) = null dan size = 0 karena awal belum ada data yang ditambahkan.

4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev
dianggap sama dengan null?    
<img src="12.2.3(nomor 4).png">     
jawab : karena jika dilakukan penambahan pada posisi pertama tidak terdapat data di posisi sebelum data pertama yaitu null(kosong), jadi pada kontruktor di isikan null.

5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ?
jawab : pada posisi sebelum(prev) data head(awal) diberikan node baru untuk ditambahkan nilai baru.

6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan
parameter prev dengan current, dan next dengan null?    
<img src="12.2.3(nomor 6).png">     
jawab : current merupakan data node akhir yang didapat dari proses pengecekan perulangan pada tahap sebelumnya, jadi prev di isi dengan current karena method ini bertujuan untuk mengisi pada node terakhir. Dan next di isi dengan null karena tidak terdapat data pada setelah node terakhir.

## Pertanyaan 12.3.3
1. Apakah maksud statement berikut pada method removeFirst()?    
<img src="12.3.3(nomor 1).png">    
jawab : pertama dilakukan pengecekan untuk mendapat node pertama dengan head.next untuk berpindah ke node selanjutnya. kemudian dilakukan head,prev untuk berpindah ke node sebelumnya yaitu node pertama dan dilakukan penghapusan data dengan di samadengankan null.

2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()?   
jawab : cara mendeteksinya yaitu dengan dilakukan proses perulangan untuk dilakukan pengecekan data satu per satu pada node dengan memanfaatkan pointer next sampai ditemukan data sama dengan null, kemudian data akhir di simpan untuk dilakukan penghapusan data. Lebih jelasnya seperti kode program berikut,    
<img src="12.3.3(nomor 2).png">

3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove!    
<img src="12.3.3(nomor 3).png">      
jawab : karena pada proses inisialisasi tidak dilakukan pada posisi node pertama, jadi mengakibatkan akan ada data yang terlewat pengecekan.

4. Jelaskan fungsi kode program berikut ini pada fungsi remove!    
<img src="12.3.3(nomor 4).png">      
jawab : berguna untuk penghapusan data pada node selain node pertama dan terakhir.

## Pertanyaan 12.4.3
1. Jelaskan method size() pada class DoubleLinkedLists!     
jawab : method size() berguna untuk pengecekan ukuran data yang ada/telah di isi pada setiap node, kemudian size linked list akan dikirimkan kembali untuk dicetak.

2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke-1!     
jawab : pada proses input data posisi pertama penulisan/pengisian node head diganti dengan head.next maka akan terisi pada indeks ke 1.

3. Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists!    
jawab : terdapat atribut current yang berfungsi untuk pengecekan data. Dan pada double dapat dilakukan pengecekan pada node sebelumnya jadi lebih efektif dan cepat untuk pencarian data.

4. Jelaskan perbedaan logika dari kedua kode program di bawah ini!   
<img src="12.4.3(nomor 4).png">      
jawab : kode program (a) digunakan untuk pengecekan keadaan ruang yang memiliki batas maksimal pengisian data seperti pada program Queue. Dan kode program (b) digunakan untuk pengecekan keadaan ruang yang tidak memiliki batas maksimal pengisian data seperti pada linked list.