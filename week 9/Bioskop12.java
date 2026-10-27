import java.util.Scanner;

public class Bioskop12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jmlTiket;
        double diskon = 0;

        do {
            System.out.println("\n--- TIKET BIOSKOP ---");
            System.out.print("Masukkan jumlah tiket: ");
            jmlTiket = sc.nextInt();
        } while (jmlTiket < 0);

        if (jmlTiket > 10) {
            diskon = 0.15;
        } else if (jmlTiket > 4) {
            diskon = 0.10;
        } else {
            diskon = 0;
        }

        int totHarga = (int) ((hargaTiket * jmlTiket) - ((hargaTiket * jmlTiket) * diskon));

        System.out.println("\n-----------------------------");
        System.out.println("Total tiket yang dibeli: " + jmlTiket);
        System.out.println("Total harga tiket: Rp " + totHarga);
        System.out.println();
        sc.close();
    }
}