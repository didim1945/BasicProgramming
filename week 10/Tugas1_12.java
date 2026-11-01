import java.util.Scanner;

public class Tugas1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        int i = 1;
        int tot = 0;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                tot++;
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("Total angka tercetak: " + tot);
        sc.close();
    }
}