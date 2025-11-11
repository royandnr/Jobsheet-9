import java.util.Scanner;

public class TugasNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); // membersihkan buffer

        // Deklarasi array 1 dimensi
        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        // Input data pesanan
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            System.out.print("Masukkan nama makanan/minuman: ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga: ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine(); // membersihkan buffer
        }

        // Proses menghitung total dan menampilkan daftar pesanan
        double totalBiaya = 0;

        System.out.println("\n=== Daftar Pesanan ===");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
            // gunakan nested loop sederhana (contohnya untuk menghitung total)
            for (int j = i; j <= i; j++) {
                totalBiaya += hargaPesanan[j];
            }
        }

        System.out.printf("\nTotal biaya semua pesanan: Rp %.2f\n", totalBiaya);
    }
}
                                                                                                   