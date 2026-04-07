import java.util.Scanner;

public class DataDosenMain20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen20 data = new DataDosen20();
        int pilihan;

        do {
            System.out.println("\n============ MENU ============");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Termuda ke Tertua) - Bubble Sort");
            System.out.println("4. Sorting DSC (Tertua ke Termuda) - Selection Sort");
            System.out.println("5. Insertion Sort (ASC)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                System.out.print("Kode Dosen          : ");
                String kode = sc.nextLine();
                System.out.print("Nama                : ");
                String nama = sc.nextLine();
                System.out.print("Jenis Kelamin (L/P) : ");
                String jk = sc.nextLine();
                boolean jenisKelamin = jk.equalsIgnoreCase("L");
                System.out.print("Usia                : ");
                int usia = sc.nextInt();
                sc.nextLine();

                data.tambah(new Dosen20(kode, nama, jenisKelamin, usia));
                System.out.println("Data berhasil ditambahkan!");
                break;

            case 2:
                System.out.println("\n===== DATA DOSEN =====");
                data.tampil();
                break;

            case 3:
                data.sortingASC();
                System.out.println("Data berhasil diurutkan ASC (Termuda ke Tertua)!");
                data.tampil();
                break;

            case 4:
                data.SortingDSC();
                System.out.println("Data berhasil diurutkan DSC (Tertua ke Termuda)!");
                data.tampil();
                break;

            case 5:
                data.insertionSort();
                System.out.println("Data berhasil diurutkan dengan Insertion Sort (ASC)!");
                data.tampil();
                break;

            case 0:
                System.out.println("Keluar dari program. Terimakasih!");
                break;

            default:
                System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
