// Nama: Dimas Wahyu Ramadhani
// Kelas: TI-1D
// NIM: 264107020104

import java.util.Scanner;

public class Quiz212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama = "Dimas Wahyu Ramadhani";
        int noAbsen = 12;
        int k = noAbsen % 5;
        int i = 1;
        int paketBesar = 0;
        int tertinggi = 0;
        int kurirTerbaik = 1;
        float rataPerPaket = 0f;
        
        System.out.println("Nama : " + nama);
        System.out.println("Kode personal K = " + k);

        System.out.print("Jumlah kurir : ");
        int jumlahKurir = sc.nextInt();

        while (jumlahKurir >= i && jumlahKurir <= jumlahKurir) {

            System.out.println("Kurir " + i);
            System.out.print("  Jumlah paket: ");
            int jumlahPaket = sc.nextInt();
            int ongkir;
            int admin;
            int hargaPerPaket;
            int totalHargaPaketKurir = 0;
            for (int j = 1; j <= jumlahPaket; j++) {
                System.out.print("      Berat paket " + j + " (kg): ");
                double beratPaket = sc.nextDouble();
                
                if (beratPaket >= 0 && beratPaket <= 1) {
                    ongkir = 8000;
                } else if (beratPaket > 1 && beratPaket <= 10) {
                    ongkir = 20_000;
                } else {
                    ongkir = 40_000;
                    paketBesar++;
                }
                admin = k * 500;
                hargaPerPaket = admin + ongkir;
                totalHargaPaketKurir += hargaPerPaket;
                rataPerPaket = totalHargaPaketKurir / jumlahPaket;
            }
            System.out.println(String.format("    Total: %s | Rata per paket: %.2f", totalHargaPaketKurir, rataPerPaket));
            if (totalHargaPaketKurir > tertinggi) {
                tertinggi = totalHargaPaketKurir;
                kurirTerbaik = i;
            }
            i++;
        }
        System.out.println("=============================");
        System.out.println("Kurir terbaik\t\t: " + kurirTerbaik);
        System.out.println("Ongkir tertinggi\t: " + tertinggi);
        System.out.println("Jumlah paket besar\t: " + paketBesar);
        sc.close();
    }
}