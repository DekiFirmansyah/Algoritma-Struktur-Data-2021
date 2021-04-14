# Tugas Stack
## Pertanyaan 7.2.3
1. Perhatikan class StackMain, apakah fungsi angka 5 pada potongan kode program berikut?  
<img src="7.2.3(nomor 1).png">   
jawab : angka 5 berfungsi untuk menentukan ukuran dari stack tersebut, yaitu ukuran atau batas masimal dari sebuah stack.

2. Lakukan penambahan data ke stack sebanyak dua kali, menggunakan angka 18 dan 40. Tampilkan
hasilnya!   
jawab :  
<img src="7.2.3(nomor 2.1).png">
<img src="7.2.3(nomor 2.2).png">
3. Pada soal nomor 2, mengapa data yang dimasukkan ke dalam Stack hanya angka 18, sedangkan angka 40 tidak dimasukkan? Jelaskan!   
jawab : karena ukuran maksimal stack yaitu 5, pada program tersebut hanya dilakukan proses pop atau pengelauran data satu kali. Jadi hanya angka 18 yang dimasukkan karena masih terdapat 1 tempat, dan 40 tidak dapat ditambahkah karena stack sudah penuh.

## Pertanyaan 7.3.3
1. Perhatikan class StackMain, pada saat memanggil fungsi push, parameter yang dikirimkan adalah
bk. Data apa yang tersimpan pada variabel bk tersebut?   
<img src="7.3.3(nomor 1).png">  
jawab : bk adalah nama dari proses instansiasi dari kontruktor berparameter pada class Buku. Jadi data identitas buku akan tersimpan pada konstruktor tersebut.

2. Tunjukkan potongan kode program untuk menentukan kapasitas penampungan stack!  
jawab :  
<img src="7.3.3(nomor 2).png"> 
3. Apakah fungsi penggunaan do-while yang terdapat pada class StackMain?   
jawab : fungsinya yaitu sebagai proses perulangan dengan mengacu pemenuhan kondisi yang telah ditentukan, proses do-while yaitu menjalankan program terlebih dahulu baru dilakukan pengecekan kondisi.
4. Modifikasi kode program pada class StackMain sehingga pengguna dapat memilih operasioperasi pada stack (push, pop, peek, atau print) melalui pilihan menu program!   
jawab : 
# <img src="7.3.3(nomor 4.1).png">
# <img src="7.3.3(nomor 4.2).png">

## Pertanyaan 7.4.3
1. Perhatikan class Postfix, jelaskan alur kerja method derajat!  
jawab : Method memiliki parameter yang akan mengirimkan nilai untuk dilakukan pengecekan kondisi, kemudian dilakukan seleksi pada setiap case dengan berbagai operasi matematika. Dengan urutan case awal dimulai dari operasi matematika tingkat atas yaitu pangkat(^), kemudian tingkat 2 modulu(%), kali(*), dan bagi(/), kemudian tingkat paling bawah tambah(+) dan kurang(-). Apabila tidak terdapat kondisi yang memenuhi maka akan dilakukan default yaitu tidak ada data yang akan di kembalikan. 

2. Apa fungsi kode program berikut?  
<img src="7.4.3(nomor 2).png">  
jawab : program tersebut untuk pengisian nilai pada variabel c dengan melihat nilai dari parameter Q berupa stack dengan pengisian nilai c sesuai indeks dengan mengacu i, data pada stack berisi huruf atau angka. 
3. Jalankan kembali program tersebut, masukkan ekspresi 3*5^(8-6)%3. Tampilkan hasilnya!   
jawab :  
<img src="7.4.3(nomor 3).png">
4. Pada soal nomor 2, mengapa tanda kurung tidak ditampilkan pada hasil konversi? Jelaskan!   
jawab : karena pada program di atas tanda kurung hanya di push atau ditambahkan ke dalam stack dan tidak dilakukan pop, yang dilakukan proses pop hanya operasi selain tanda kurung. Serta tanda kurung sebagai penanda untuk operasi yang terdapat di dalam kurung akan di dahulukan.
