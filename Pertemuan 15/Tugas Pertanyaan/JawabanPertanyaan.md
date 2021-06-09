# Tugas Graph
## Pertanyaan 14.2.2
1. Sebutkan beberapa jenis (minimal 3) algoritma yang menggunakan dasar Graph, dan apakah kegunaan algoritma-algoritma tersebut?     
jawab :      
    - Algoritma Prim       
    digunakan untuk mencari pohon rentang minimum untuk sebuah graf berbobot yang saling terhubung.
    - Algoritma Dijkstra       
    digunakan untuk menentukan lintasan terpendek pada graf berarah.
    - Algoritma Kruskal       
    digunakan untuk menentukan pohon perentang terbobot minimum.

2. Pada class Graph terdapat array bertipe LinkedList, yaitu LinkedList list[]. Apakah tujuan
pembuatan variabel tersebut ?     
jawab : untuk dilakukan penyimpanan data yaitu dalam bentuk linked list, penggunaan array untuk menyimpan jumlah vertex.

3. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add jenis lain pada linked list ketika digunakan pada method addEdge pada class Graph?     
jawab : karena berguna untuk mepresentasikan arah hubungan vertex, jadi nilai harus urut, nilai baru berada di depan.

4. Bagaimana cara mendeteksi prev pointer pada saat akan melakukan penghapusan suatu edge pada graph ?      
jawab : dengan perulangan pengecekan kondisi sampai data yang akan dihapus sama dengan data yang telah dicari pada pencarian method get yaitu sesuai indeks.

5. Kenapa pada praktikum 12.2 langkah ke-12 untuk menghapus path yang bukan merupakan lintasan pertama kali menghasilkan output yang salah ? Bagaimana solusinya ?    
<img src="14.2.2(nomor 5).png">     
jawab : karena pada method removeEdge data yang dikirimkan ke method remove adalah nilai datanya tapi seharusnya yaitu indeks dari nilai. Jadi sebelumnya harus dilakukan pencarian nilai tersebut berada pada indeks ke berapa, baru indeks tersebut yang dikirimkan sebagai parameter ke method remove.

## Pertanyaan 14.3.2
1. Apakah perbedaan degree/derajat pada directed dan undirected graph?    
jawab : perbedaannya yaitu pada directed, degree masuk(in) dan keluar(out) belum tentu sama nilainya karena tergantung arah panah yang masuk dan keluar. Dan jika pada undirected, degree masuk(in) dan keluar(out) nilainya pasti sama karena jenis ini garis antar titiknya tidak memiliki arah. 

2. Pada implementasi graph menggunakan adjacency matriks. Kenapa jumlah vertices harus ditambahkan dengan 1 pada indeks array berikut?    
<img src="14.3.2(nomor 2).png">     
jawab : karena digunakan untuk penyimpan vertex dan ditambah satu yaitu edge atau garis tepi.

3. Apakah kegunaan method getEdge() ?    
jawab : untuk mencari nilai data pada array sesuai parameter yaitu indeks luar dan indeks dalam, dan kemudian nilai akan dikembalikan. 

4. Termasuk jenis graph apakah uji coba pada praktikum 12.3 ?      
jawab : termasuk jenis adjecency matriks for directed graph, karena termasuk graph berarah yaitu hanya setiap vertix memiliki satu tujuan.

5. Mengapa pada method main harus menggunakan try-catch Exception ?    
jawab : digunakan untuk menangani terjadinya error pada program, jadi statement tersebut digunakan untuk mengurung eksekusi yang dapat menampilkan error dan dapat membuat program tetap berjalan tanpa dihentikan secara langsung.
