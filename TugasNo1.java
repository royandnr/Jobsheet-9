import java.util.Scanner;

public class TugasNo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Memasukkan banyaknya nilai mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();

        int[] nilai = new int[jumlah];
        int total = 0;
        int tertinggi = Integer.MIN_VALUE;
        int terendah = Integer.MAX_VALUE;

        // Nested loop: outer loop untuk input per mahasiswa,
        // inner loop bisa digunakan untuk validasi atau menampilkan hasil sementara
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();

            total += nilai[i];

            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }

        }

        double rata2 = (double) total / jumlah;

        // Menampilkan hasil akhir
        System.out.println("\n===== HASIL =====");
        System.out.println("Daftar nilai mahasiswa:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + nilai[i]);
        }

        System.out.printf("Nilai rata-rata : %.2f\n", rata2);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);

    }
}
