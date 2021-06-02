# Tugas Tree
## Pertanyaan 13.2.2
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?     
jawab : karena pada BST sudah dibagi posisi penempatan datanya yaitu child node kiri untuk yang lebih kecil dan kanan lebih besar jadi pencarian lebih cepat dan efektif.

2.  Untuk apakah di class Node, kegunaan dari atribut left dan right?     
jawab : untuk pembagian penempatan data dan berperan sebagai subtree dari node, yaitu jika data lebih kecil dari root node maka akan di tempatkan di child node sebelah kiri(left) dan jika lebih besar akan ditempatkan di child node sebelah kanan(right).

3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?       
jawab : untuk pembuatan alamat yang digunakan untuk pengiriman data pada class Node untuk disimpan sesuai tempat.     
b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?      
jawab : nilai awal dari root yaitu null atau belum ada nilainya sama sekali.

4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang
akan terjadi?        
jawab :          
<img src="13.2.2(nomor 4).png">         
proses diatas dilakukan proses instansiasi pada Node dengan paramater data baru. Data awal akan ditempatkan pada posisi root.

5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut?       
<img src="13.2.2(nomor 5).png">        
jawab : Program tersebut digunakan untuk penambahan data pada child node sebelah kiri yaitu data yang lenih kecil. Urutan program yaitu awal pengecekan kondisi apakah data baru kurang dari current.data yang ada, jika memenuhi maka dilanjutkan pengecekan apakah pada child sebelah kiri dari current sama dengan null jika tidak maka di dilakukan perpindahan current ke current.left yaitu di current child kiri. Jika sama dengan null maka berati terdapat tempat kosong yang dapat sebagai tempat data baru, kemudian dilakukan instansiasi untuk penambahan data pada current.left yaitu child sebelah kiri dan dilakukan break untuk menghentikan proses.

## Pertanyaan 13.3.2
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?      
jawab : data untuk proses tempat penyimpanan data baru dalam bentuk array dan idxLast untuk mengetahui data mana yang akan berada pada root.

2. Apakah kegunaan dari method populateData()?     
jawab : sebagai method dengan parameter untuk dilakukan proses penyimpanan data pada array dan dilakukan pembuatan tree dengan idxLast sebagai root atau node awal.

3. Apakah kegunaan dari method traverseInOrder()?     
jawab : digunakan untuk proses penelusuran data dengan proses urutan dari pertama menelusuri subtree paling kiri dan dicetak, kemudian kunjungi dan cetak root, kemudian menelusuri subtree sebelah kanan dari root dan cetak. Lakukan proses tersebut secara berulang pada subtree selanjutnya.

4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan rigth child masin-masing?     
jawab : karena binary tree array proses penelusuran datanya dengan level order maka left dan right child berada pada indeks 5(left child) dan indeks 6(right child).

5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?    
jawab : digunakan untuk menentukan data mana yang akan pada posisi root node awal, pada program tersebut data 6 sebagai node awal.
