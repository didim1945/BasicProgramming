import java.util.Scanner;

public class Tugas3_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko harus > 0.");
            }
        } while (jumlahToko < 1);

        int totalBarangToko = 0;
        int maxBarang = -1;
        int tokoTerbanyak = 1;

        for (int toko = 1; toko <= jumlahToko; toko++) {
            System.out.println("\n---------- TOKO " + toko + " ----------");
            int jumlahPelanggan;
            do {
                System.out.print("Masukkan jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan harus >= 0.");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangPerToko = 0;
            for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {
                int jumlahBarang;
                do {
                    System.out.print("Masukkan jumlah barang pelanggan ke-" + pelanggan + ": ");
                    jumlahBarang = sc.nextInt();
                    if (jumlahBarang < 0) {
                        System.out.println("Jumlah barang harus >= 0.");
                    }
                } while (jumlahBarang < 0);
                totalBarangPerToko += jumlahBarang;
            }
            System.out.println("Toko " + toko + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangPerToko);
            totalBarangToko += totalBarangPerToko;
            if (totalBarangPerToko > maxBarang) {
                maxBarang = totalBarangPerToko;
                tokoTerbanyak = toko;
            }
        }
        System.out.println("\n=================================");
        System.out.println("Total barang seluruh toko    : " + totalBarangToko);
        System.out.println("Toko dengan barang terbanyak : " + tokoTerbanyak);
        sc.close();
    }
}