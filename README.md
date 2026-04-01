# PASD_jobsheet5Sorting

5.2 Praktikum 1 – Pertanyaan
1. Jelaskan fungsi kode program berikut
if (data[j - 1] > data[j]) {
    temp = data[j];
    data[j] = data[j - 1];
    data[j - 1] = temp;
}
Jawaban: kode program tersebut berfungsi untuk menukar dua elemen yang berdekatan jika elemen kiri lebih besar dari elemen kanan. proses tukar dilakukan menggunakan variabel temp sebagai tempat penyimpanan sementara, supaya nilai data[j] tidak hilang saat ditimpa.
2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort!
Jawaban: kode program untuk mencari nilai minimum yaitu berikut ini
int min = i;
for (int j = i + 1; j < jumData; j++) {
    if (data[j] < data[min]) {
        min = j;
    }
}
kode tersebut mencari indeks nilai terkecil dari posisi i + 1 sampai akhir array. variabel min menyimpan indeks elemen terkecil yang ditemukan.
3. Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan while (j >= 0 && data[j] > temp)
Jawaban: kondisi tersebut mempunyai 2 syarat yaitu
  1) j >= 0 : memastikan index tidak keluar batas array (tidak minus)
  2) data[j] > temp : selama elemen sebelumnya masih lebih besar dari elemen yang sedang disisipkan (temp), geser terus ke kanan
perulangan berhenti ketika sudah ketemu posisi yang tepat untuk menyisipkan temp.
4. Pada Insertion sort, apakah tujuan dari perintah data[j + 1] = data[j];
Jawaban: perintah tersebut berfungsi untuk menggeser elemen data[j] satu posisi ke kanan (ke posisi j + 1), supaya ada ruang kosong untuk menyisipkan elemen temp di posisi yang tepat. jadi, data[j + 1] = data[j]; ini yang melakukan proses geser di tiap iterasi while, sampai ketemu posisi yang tepat untuk temp.

5.3 Praktikum 2 – Pertanyaan

-- BUBBLE SORT --
1. Perhatikan perulangan di dalam bubbleSort() di bawah ini:
for (int i = 0; i < listMhs.length - 1; i++) {
    for (int j = 1; j < listMhs.length - i; j++) {
        
    }
}
  a. Mengapa syarat dari perulangan i adalah i < listMhs.length - 1 ?
  Jawaban: Karena pada setiap putaran, 1 elemen terbesar sudah berpindah ke posisi akhir yang benar. Sehingga hanya perlu n-1 putaran untuk mengurutkan n elemen. Jika sampai i < listMhs.length, putaran terakhir tidak akan melakukan apapun karena hanya tersisa 1 elemen yang sudah pasti benar posisinya, jadi tidak efisien.
  b. Mengapa syarat dari perulangan j adalah j < listMhs.length - i ?
  Jawaban: Karena setiap selesai 1 putaran loop i, elemen terbesar sudah "menggelembung" ke posisi paling akhir dan tidak perlu dibandingkan lagi. Dengan mengurangi i pada batas atas j, kita menghindari perbandingan elemen yang sudah berada di posisi benar, sehingga lebih efisien.
  c. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i  akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?
  Jawaban: 
  - perulangan i berlangsung 49 kali ( i = 0, 1, 2, ..., 48)
  - jumlah tahap bubble sort = 49 tahap
  - karena rumusnya yaitu jumlah tahap = n - 1 = 50 - 1 = 49
2. Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad) yang terdiri dari nim, nama, kelas, dan ipk!

-- SELECTION SORT --
Di dalam method selection sort, terdapat baris program seperti di bawah ini:
int idxMin = i;
for (int j = i + 1; j < listMhs.length; j++) {
    if (listMhs[j].ipk < listMhs[idxMin].ipk) {
        idxMin = j;
    }
}
Mahasiswa20 tmp = listMhs[idxMin];
listMhs[idxMin] = listMhs[i];
listMhs[i] = tmp;
Untuk apakah proses tersebut, jelaskan!
Jawaban: Proses tersebut terdiri dari 2 bagian:
- Bagian pencarian → mencari indeks mahasiswa dengan IPK terkecil dari posisi i sampai akhir array, lalu disimpan di variabel idxMin
- Bagian penukaran → setelah ketemu, menukar posisi mahasiswa di index i dengan mahasiswa yang memiliki IPK terkecil di idxMin menggunakan variabel sementara tmp
Jadi setiap putaran, mahasiswa dengan IPK terkecil akan dipindahkan ke posisi paling depan yang belum terurut, sehingga array terurut secara ascending.