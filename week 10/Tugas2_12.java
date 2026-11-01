import java.util.Scanner;

public class Tugas2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tot = 0;
        boolean kondisi = true;

        do {
            System.out.print("Masukkan nilai n: ");
            int n = sc.nextInt();

            if (n < 3) {
                System.out.println("Nilai n harus minimal 3!");
            } else {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        System.out.printf("%4d", (i * j));  // %4d untuk merapikan blok
                        tot += i * j;
                    }
                    System.out.println();
                }
                System.out.println("Jumlah seluruh angka: " + tot);
                kondisi = false;
            }
        } while (kondisi);
    }
}