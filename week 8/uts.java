// Nama: Dimas Wahyu Ramadhani
// Kelas: TI-1D
// NIM: 264107020104

import java.util.Scanner;

public class uts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // DEKLARASI VARIABEL
        String mode = " ";
        double bonus = 0;
        int koinDasar = 0;
        int bonusKoin = 0;
        int totalKoin = 0;
        int zombie;
        boolean kondisi;

        // INPUT MODE
        System.out.println("\n=== PLANT VS ZOMBIE ===");
        System.out.print("Mode level (siang/malam): ");
        mode = sc.nextLine();

        if (mode.equalsIgnoreCase("siang")) { // MENGHITUNG KOIN MODE SIANG
            System.out.print("Jumlah zombie dikalahkan: ");
            zombie = sc.nextInt();
            int koin = 10;
            if (zombie < 0) {
                kondisi = false;
            } else if (zombie <= 10) {
                bonus = 0;
                koinDasar = koin * zombie;
                bonusKoin = (int) (koinDasar * bonus);
                totalKoin = koinDasar + bonusKoin;
                kondisi = true;
            } else if (zombie >= 11 && zombie <= 25) {
                bonus = 0.10;
                koinDasar = koin * zombie;
                bonusKoin = (int) (koinDasar * bonus);
                totalKoin = koinDasar + bonusKoin;
                kondisi = true;
            } else {
                bonus = 0.25;
                koinDasar = koin * zombie;
                bonusKoin = (int) (koinDasar * bonus);
                totalKoin = koinDasar + bonusKoin;
                kondisi = true;
            }
        } else if (mode.equalsIgnoreCase("malam")) { // MENGHITUNG KOIN MODE MALAM
            System.out.print("Jumlah zombie dikalahkan: ");
            zombie = sc.nextInt();
            int koin = 15;
            if (zombie < 0) {
                kondisi = false;
            } else if (zombie <= 10) {
                bonus = 0;
                koinDasar = koin * zombie;
                bonusKoin = (int) (koinDasar * bonus);
                totalKoin = koinDasar + bonusKoin;
                kondisi = true;
            } else if (zombie >= 11 && zombie <= 25) {
                bonus = 0.15;
                koinDasar = koin * zombie;
                bonusKoin = (int) (koinDasar * bonus);
                totalKoin = koinDasar + bonusKoin;
                kondisi = true;
            } else if (zombie >= 26 && zombie <= 40) {
                bonus = 0.30;
                koinDasar = koin * zombie;
                bonusKoin = (int) (koinDasar * bonus);
                totalKoin = koinDasar + bonusKoin;
                kondisi = true;
            } else {
                int hadiahTrofi = 100;
                bonus = 0;
                koinDasar = koin * zombie;
                bonusKoin = (int) (koinDasar * bonus);
                totalKoin = koinDasar + bonusKoin + hadiahTrofi;
                kondisi = true;
            }
        } else { // JIKA INPUT MODE SELAIN SIANG ATAU MALAM
            kondisi = false;
        }

        // MENGUBAH FORMAT BONUS
        int bonusPersen = (int) (bonus * 100);

        // OUTPUT
        if (kondisi == true) {
            System.out.println("\nKoin dasar\t: " + koinDasar);
            System.out.println("Bonus\t\t: " + bonusPersen + "% " + "(" + bonusKoin + ")");
            System.out.println("Total koin\t: " + totalKoin);
        } else {
            System.out.println("Input tidak valid! Periksa kembali data Anda.");
        }

        sc.close();
    }
}