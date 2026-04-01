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