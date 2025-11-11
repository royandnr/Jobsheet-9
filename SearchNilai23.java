import java.util.Scanner;

public class SearchNilai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input banyaknya elemen array
        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        int jumlah = sc.nextInt();

        int[] nilaiMahasiswa = new int[jumlah];
        int hasil = -1; // Ubah nilai awal hasil menjadi -1 untuk menandakan belum ditemukan

        // 2. Input isi array
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMahasiswa[i] = sc.nextInt();
        }

        // 3. Input nilai (key) yang ingin dicari
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        
        // 4. Proses pencarian (Linear Search)
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            // Perhatikan, pencarian sekarang menggunakan array nilaiMahasiswa
            if (key == nilaiMahasiswa[i]) {
                hasil = i; // Simpan indeks posisi ditemukan
                break; // Hentikan pencarian karena sudah ketemu
            }
        }
        // 5. Cetak output
        System.out.println();
        
        if (hasil != -1) {
            // Jika nilai 'hasil' bukan -1, berarti nilai ditemukan
            // Tampilkan indeks posisi (hasil + 1) karena array dimulai dari 0
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            // Jika nilai 'hasil' tetap -1, berarti nilai tidak ditemukan
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }
        
        
    }
}