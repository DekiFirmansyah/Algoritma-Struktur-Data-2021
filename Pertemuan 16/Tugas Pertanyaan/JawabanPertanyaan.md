# Tugas Collection
## Pertanyaan 16.2.3

1. Perhatikan baris kode 25-36, mengapa semua jenis data bisa ditampung ke dalam sebuah Arraylist?     
jawab : karena pada proses instance pada List tidak diberikan suatu tipe data yang generic yang spesifik, yaitu contoh penulisannya tipe data ditulis pada antara kurung siku.

2. Modifikasi baris kode 25-36 seingga data yang ditampung hanya satu jenis atau spesifik tipe tertentu!      
jawab :      
<img src="16.2.3(nomor 2).png">

3. Ubah kode pada baris kode 38 menjadi seperti ini    
<img src="16.2.3(nomor 3).png">

4. Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya    
<img src="16.2.3(nomor 4).png">

5. Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan!      
jawab :       
<img src="16.2.3(nomor 5).png">       
karena instance diganti dengan linkedlist maka proses pencarian data depan menggunakan getFirst() dan untuk data akhir yaitu dengan getLast().

## Pertanyaan 16.3.3
1.  Apakah perbedaan fungsi push() dan add() pada objek fruits?       
jawab : fungsi push() proses penambahan datanya dari posisi belakang karena berupa stack yaitu tumpukan. Dan untuk fungsi add() proses penambahan datanya mengikuti urutan indeks.

2. Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian?       
jawab : data setelah program tersebut tidak ada yang tampil. Karena terdapat proses iterator dengan membuat instance baru jadi menyembabkan tidak ada data yang dicetak.

3. Jelaskan fungsi dari baris 46-49?      
jawab : pada baris tersebut dilakukan proses iterator yaitu proses mengembalikan iterator untuk mengakses elemen-elemen yang ada dengan instance iterator dengan tipe data string, proses ini akan membuat ketika pencetakan data kebalikan dari proses input karena pada sebelumnya dilakukan fungsi pop().

4. Silakan ganti baris kode 25, Stack<String> menjadi List<String> dan apakah yang terjadi? Mengapa bisa demikian?
jawab : terjadi error di bagian pemanggilan method yang berhubungan dengan stack, hal ini karena interface diganti dengan List. method-method stack hanya ada ketika menggunakan interface stack.

5. Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”!    
jawab :      
<img src="16.3.3(nomor 5).png">       

6. Tambahkan 3 buah seperti “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting!       
jawab :       
<img src="16.3.3(nomor 6).png">