public class DataDosen20 {
    Dosen20[] dataDosen = new Dosen20[10];
    int idx;

    void tambah(Dosen20 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.print("Data sudah penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
            System.out.println("----------------------------");
        }
    }

    // Bubble Sort ASC berdasarkan usia (termuda ke tertua)
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                    Dosen20 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = tmp;
                }
            }
        }
    }

    // Selection Sort DSC berdasarkan usia (tertua ke termuda)
    void SortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen20 tmp = dataDosen[i];
            dataDosen[i] = dataDosen[idxMax];
            dataDosen[idxMax] = tmp;
        }
    }

    // Insertion Sort ASC berdasarkan usia
    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen20 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia > temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}