# Tugas Searching
## Pertanyaan 6.2.3
1. Jelaskan perbedaan metod TampilData dan Tampilposisi pada class PencarianMhs!  
jawab : Keduanya sama-sama menampilkan posisi dari data yang di cari, tapi yang beda yaitu method tampilPosisi hanya untuk menampilkan posisi dari nim yang dicari pada indeks berapa. Sedangkan method tampilData menampilkan keseluruhan data yang terkait dengan nim yang dicari.

2. Jelaskan fungsi break pada kode program dibawah ini!
<img src="6.2.3(nomor 2).png">   
jawab : berguna untuk menghentikan proses perulangan ketika pengecekan kondisi pencarian data yang sama telah terpenuhi.
3. Jika Data Nim yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih dapat
berjalan? Apakah hasil yang dikeluarkan benar? Mengapa demikian!    
jawab : Masih bisa berjalan, karena pencarian menggunakan sequential search itu mencari data secara terurut dari indeks ke 0 sampai dimana data tersebut ditemukan dan tidak tergantung dengan data yang urut. 

## Pertanyaan 6.3.3
1. Tunjukkan pada kode program yang mana proses divide dijalankan!  
jawab :   
<img src="6.3.3(nomor 1).png">

2. Tunjukkan pada kode program yang mana proses conquer dijalankan!   
jawab : 
<img src="6.3.3(nomor 2).png">
3. Jika data Nim yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa
demikian!  
jawab : Program masih bisa berjalan dengan menghasilkan output data bernilai benar sesuai yang dicari. Akan tetapi pada pencarian menggunakan binary search output bagian data tidak ditemukan pada posisi berapa.
4. Jika Nim yang dimasukkan dari NIM terbesar ke terkecil (missal : 20215, 20214, 20212, 20211, 20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai!   
jawab : hasil tidak sesuai, kode program yang benar yaitu,
<img src="6.3.3(nomor 4).png"> 
5. Modifikasilah program diatas yang mana jumlah mahasiswa yang di inputkan sesuai dengan masukan dari keyboard.    
jawab : 
<img src="6.3.3(nomor 5).png">