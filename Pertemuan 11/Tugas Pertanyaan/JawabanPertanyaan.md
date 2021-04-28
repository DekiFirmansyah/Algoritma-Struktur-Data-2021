# Tugas Single Linked List
## Pertanyaan 9.2.3
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?       
jawab :      
karena pertama belum dilakukan operasi program penambahan data pada linked list, jadi pada pengecekan terjadi hasil (head = tail = null) yaitu tidak ada data yang disimpan. 

2. Pada step 10, jelaskan kegunaan kode berikut    
<img src="9.2.3(nomor 2).png">      
jawab :       
sebagai kode program penambahan data pada setelah data yang di inginkan. yaitu memberi ruang untuk data baru pada tempat setelah data yang sama dengan key dengan kode .next untuk penanda tempat. Kemudian ruang baru di sama dengankan dengan data baru untuk dilakukan penambahan data.

3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut     
<img src="9.2.3(nomor 3).png">        
jawab :       
jika ruang penempatan sesuai indeks yang dicari tidak ditemukan atau tidak ada data(null) maka data baru akan ditambahkan pada posisi terakhir dari linked list yaitu dengan disama dengankan dengan tail.

## Pertanyaan 9.3.3
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!       
jawab :       
karena pada fungsi remove terdapat proses perulangan, jika tidak dilakukan break maka akan terjadi proses perulangan terus menerus dan akan terjadi error pada program saat dijalankan.

2. Jelaskan kegunaan kode dibawah pada method remove      
<img src="9.3.3(nomor 2).png">       
jawab :       
pertama dilakukan pengecekan kondisi data yang ada dengan yang dicari sama atau tidak, jika tidak akan dilakukan perulangan pengecekan kondisi sampai benar dengan data berjalan secara berurut dengan batuan kode next. Jika data sama maka dilakukan pembaruan atau penambahan data baru pada tempat sesuai data kondisi yang benar tadi.

3. Apa saja nilai kembalian yang dapat dikembalikan pada method indexOf? Jelaskan maksud masing-masing kembalian tersebut!    
jawab : 

   - Nilai kembalian -1, yaitu jika pada pengecekan kondisi tidak ditemukan data/kosong (null) pada linked list maka akan diberi nilai kembalian kosong(tidak ada nilai).
   - Nilai kembalian index, yaitu jika pada pengecekan kondisi ditemukan nilai yang sesuai dicari maka akan diberi nilai kembalian sesuai indeks posisi dari data yang telah dicari pada linked list.  