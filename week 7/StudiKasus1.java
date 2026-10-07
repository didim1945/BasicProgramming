import java.util.Scanner;

public class StudiKasus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18_000;
        int jumlahCup;
        int uangBayar;
        int totalHarga;
        int diskon;
        int totalBayar;
        int kembalian;
        int kurang;

        System.out.println("\n=== KEDAI KOPI SENJA ===");
        System.out.print("Masukkan jumlah cup : ");
        jumlahCup = sc.nextInt();
        // System.out.print("Masukkan uang yang dibayar: Rp ");
        // uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100_000) {
            diskon = totalHarga * 10/100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("\n=== RINCIAN PEMBAYARAN ===");
        System.out.println("Harga per cup\t\t : Rp " + hargaPerCup);
        System.out.println("Jumlah cup\t\t : " + jumlahCup);
        System.out.println("Total harga\t\t : Rp " + totalHarga);
        System.out.println("Total diskon\t\t : Rp " + diskon);
        System.out.println("Total yang dibayar\t : Rp " + totalBayar);

        System.out.print("\nMasukkan uang yang dibayar : Rp ");
        uangBayar = sc.nextInt();
        System.out.println();

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian\t : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang : Rp " + kurang);
        }

        System.out.println("\n=== TERIMA KASIH ===\n");
        sc.close();
    }
}
