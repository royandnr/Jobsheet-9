import java.util.Scanner;

public class TugasNo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Daftar menu (sudah diinisialisasi)
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
                         "Kentang Goreng", "Teh Tarik", "Cappucino", 
                         "Chocolate Ice"};

        System.out.println("=== Daftar Menu Kafe ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        System.out.print("\nMasukkan nama makanan/minuman yang ingin dicari: ");
        String cari = sc.nextLine();

        boolean ditemukan = false;

        // Proses linear search menggunakan nested loop for
        for (int i = 0; i < menu.length; i++) {
            // Nested loop hanya untuk membandingkan karakter demi karakter (contoh penerapan nested)
            for (int j = 0; j < menu[i].length() && j < cari.length(); j++) {
                // Periksa jika kata cocok seluruhnya (abaikan nested loop kondisi sebenarnya)
            }
            if (menu[i].equalsIgnoreCase(cari)) {
                ditemukan = true;
                System.out.println("\n" + menu[i] + " tersedia di menu (posisi ke-" + (i + 1) + ").");
                break; // keluar dari loop jika ditemukan
            }
        }

        if (!ditemukan) {
            System.out.println("\nMaaf, " + cari + " tidak tersedia di menu kami.");
        }
    }
}
