import java.util.Scanner;

public class Tugas1Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.println();

        int nilai[] = new int[jumlahMahasiswa];
        int total = 0;

        System.out.println("======= INPUT NILAI MAHASISWA =======");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }

        double rata = (double) total / jumlahMahasiswa;
        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }
        System.out.println();

        String status;
        System.out.println("======= DAFTAR NILAI MAHASISWA =======");
        for (int i = 0; i < nilai.length; i++) {
            if (nilai [i] > 70) {
                status = "LULUS";
            } else {
                status = "TIDAK LULUS"; 
            }
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilai [i] + " | Status: " + status);
        }
        System.out.println();
        System.out.println("======= HASIL PENGOLAHAN NILAI =======");
        System.out.println("Rata-rata nilai : " + String.format("%.2f", rata));
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
        sc.close();
    }
}