import java.util.Scanner;

public class ArrayRataNilai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa :");
        int jumlahmahasiswa = sc.nextInt();

        int [] nilaiMahasiswa = new int [jumlahmahasiswa];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiMahasiswa.length; i++){
        System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
        nilaiMahasiswa [i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            if (nilaiMahasiswa [i] > 70) {
                totalLulus += nilaiMahasiswa[i];
                jumlahLulus++ ;
            } else {
                totalTidakLulus += nilaiMahasiswa [i];
                jumlahTidakLulus++;
            }
         }
        double rataLulus = (jumlahLulus > 0) ? (totalLulus / jumlahLulus) : 0;
        double rataTidakLulus = (jumlahTidakLulus > 0) ? (totalTidakLulus / jumlahTidakLulus) : 0;
        
        System.out.println("Rata- rata nilai lulus = " + rataLulus);
        System.out.println("Rata- rata nilai tidak lulus = " + rataTidakLulus );
        System.out.println("Jumlah Mahasiswa yang lulus = " + jumlahLulus);
    }
    
}
