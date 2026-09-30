import java.util.Scanner;

public class TugasParkir12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Tarif Parkir ===");
        System.out.print("Masukkan lama parkir: ");
        int lamaParkir = sc.nextInt();

        if (lamaParkir <= 2) {
            System.out.println("Tarif Rp. 2000");
        } else {
            int tarif = (lamaParkir - 2) * 1000 + 2000;
            System.out.println("Tarif Rp. " + tarif);
        }
        sc.close();
    }
}