import java.util.Scanner;

public class KonsultanPajak12 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int nilai;
    double pajak;

    System.out.println("\n=== Konsultan Pajak: Kalkulator PPh 21 Progresif ===");
    System.out.print("Masukkan nilai PKP: ");
    nilai = sc.nextInt();
    
    if (nilai <= 0) {
        pajak = 0;
    } else if (nilai <= 60000000) {
        pajak = 0.05 * nilai;
    } else if (nilai <= 250000000)  {
        pajak = ((0.05 * 60000000) + (0.15 * (nilai - 60000000)));
    } else if (nilai <= 500000000) {
        pajak = ((0.05 * 60000000) + (0.15 * 190000000) + (0.25 * (nilai - 250000000)));
    } else {
        pajak = ((0.05 * 60000000) + (0.15 * 190000000) + (0.25 * 250000000) + (0.30 * (nilai - 500000000)));
    }
    System.out.println("\n=== Hasil ===");
    System.out.println("PKP\t: Rp " + nilai);
    System.out.println("Pajak\t: Rp " + pajak);
    sc.close();
    }
}
