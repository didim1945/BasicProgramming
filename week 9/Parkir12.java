import java.util.Scanner;

public class Parkir12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.println("\n--- PARKIR KENDARAAN ---");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Keluar");
            System.out.print("Masukkan jenis: ");
            jenis = sc.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi: ");
                durasi = sc.nextInt();
                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            }
        } while (jenis != 0);

        System.out.println("Total pendapatan parkir: Rp " + total);
        sc.close();
    }
}