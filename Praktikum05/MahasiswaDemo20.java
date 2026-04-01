import java.util.Scanner;

public class MahasiswaDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi20 list = new MahasiswaBerprestasi20();

        for (int i = 0; i < 5; i++) {
            System.out.println("=== Input Mahasiswa ke-" + (i + 1) + " ===");
            System.out.print("NIM   : "); 
            String nim = sc.nextLine();
            System.out.print("Nama  : "); 
            String nama = sc.nextLine();
            System.out.print("Kelas : "); 
            String kelas = sc.nextLine();
            System.out.print("IPK   : "); 
            double ipk = sc.nextDouble();
            sc.nextLine(); // buat flush sisa newline

            list.tambah(new Mahasiswa20(nim, nama, kelas, ipk));
        }

        System.out.println("\nData mahasiswa sebelum sorting: ");
        list.tampil();

        list.bubbleSort();
        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.tampil();

        sc.close();
    }
}